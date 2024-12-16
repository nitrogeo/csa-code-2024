package A9.CG1;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class A9_CH3_Tests
{
    public String generateClassName(String name)
    {
        if(getClass().toString().contains("."))
        {
            return getClass().toString().substring(6,getClass().toString().lastIndexOf(".")+1)+name;
        }
        return name;
    }

    @Test(timeout = 250)
    public void test1() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("A9_CH3"));
            Method totalLength = classRef.getMethod("totalLength", String[].class);
            Object check = classRef.getConstructor().newInstance();

            String[][] inputs = {{},{"8","a"},{"Bob is","cool"},{"apples","oranges","grapes"},
                    {"snake","abc"},{"The turtles are ninjas!"},{"12"},{"snakes can bite","bats like the night","car"}};
            int[] answers = {0,2,10,19,
                    8,23,2,37};
            for(int x=0; x<inputs.length; x++)
            {


                Assert.assertEquals("totalLength("+ Arrays.toString(inputs[x])+") failed to produce the correct result."
                        ,answers[x],totalLength.invoke(check,(Object)inputs[x]));
            }
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }
}
