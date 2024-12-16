package A9.CG2;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class A9_CH5_Tests
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
            Class<?> classRef = Class.forName(generateClassName("A9_CH5"));
            Method substitutions = classRef.getMethod("substitutions", String.class);
            Object check = classRef.getConstructor().newInstance();

            String[] inputs = {"","abcde","7 apples","1a2b3c","I love the 3 little pigs",
                    "3o3","I have to grade 3 tests","333"};
            String[] answers = {"","*bcd*","- *ppl*s","-*-b-c","* l*v* th* - l*ttl* p*gs",
                    "-*-","* h*v* t* gr*d* - t*sts","---"};

            for(int x=0; x<inputs.length; x++)
                Assert.assertEquals("substitutions ("+inputs[x]+") failed to produce the correct result."
                        ,answers[x],substitutions.invoke(check,inputs[x]));

        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }
}
