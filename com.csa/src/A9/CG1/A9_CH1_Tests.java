package A9.CG1;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class A9_CH1_Tests
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
            Class<?> classRef = Class.forName(generateClassName("A9_CH1"));
            Method contains = classRef.getMethod("contains", String.class,String.class);
            Object check = classRef.getConstructor().newInstance();

            String[] inputs1 = {"time","StRiNG","dog","This is fun","Apple",
                    "Snake","TesTer","String problem"};
            String[] inputs2 = {"me","ring","cat","un","E","bake","tests","blem"};
            boolean[] answers = {true,true,false,true,true,false,false,true};
            for(int x=0; x<inputs1.length; x++)
            {
                if(answers[x])
                    Assert.assertTrue("contains("+inputs1[x]+","+inputs2[x]+") failed to produce true."
                            ,(Boolean)contains.invoke(classRef,inputs1[x], inputs2[x]));
                else
                    Assert.assertFalse("contains("+inputs1[x]+","+inputs2[x]+") failed to produce false."
                            ,(Boolean)contains.invoke(classRef,inputs1[x], inputs2[x]));
            }
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }
}
