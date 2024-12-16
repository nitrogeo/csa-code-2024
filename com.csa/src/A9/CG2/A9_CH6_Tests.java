package A9.CG2;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class A9_CH6_Tests
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
            Class<?> classRef = Class.forName(generateClassName("A9_CH6"));
            Method middleValue = classRef.getMethod("middleValue", String.class);
            Object check = classRef.getConstructor().newInstance();

            String[] inputs1 = {"000","XaaaX","cars","XaaaaX","I like to chop wood",
                    "Bob likes Jane","turtles are the best","This is fun"};
            String[] answers = {"000","aaa","cars","aaaa","o c",
                    "ikes","are "," is"};

            for(int x=0; x<inputs1.length; x++)
            {


                Assert.assertEquals("middle("+inputs1[x]+") failed to produce the correct result."
                        ,answers[x], middleValue.invoke(check,inputs1[x]));
            }
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }
}
