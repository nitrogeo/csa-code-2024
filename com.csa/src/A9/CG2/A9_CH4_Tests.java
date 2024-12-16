package A9.CG2;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class A9_CH4_Tests
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
            Class<?> classRef = Class.forName(generateClassName("A9_CH4"));
            Method startAndEndMatch = classRef.getMethod("startAndEndMatch", String.class);
            Object check = classRef.getConstructor().newInstance();

            String[] inputs1 = {"abc","abcd","vvvsnakevvv","","ab","poopoo","napyounap","a"};
            boolean[] answers = {true,false,true,false,false,true,true,false};

            for(int x=0; x<inputs1.length; x++)
            {

                if(answers[x])
                    Assert.assertTrue("startAndEndMatch("+inputs1[x]+") failed to produce true."
                            ,(Boolean) startAndEndMatch.invoke(check,inputs1[x]));
                else
                    Assert.assertFalse("startAndEndMatch("+inputs1[x]+") failed to produce false."
                            ,(Boolean) startAndEndMatch.invoke(check,inputs1[x]));
            }
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }
}
