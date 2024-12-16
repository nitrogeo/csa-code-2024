package A9.CG1;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class A9_CH2_Tests
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
            Class<?> classRef = Class.forName(generateClassName("A9_CH2"));
            Method everyThirdLetter = classRef.getMethod("everyThirdLetter", String.class);
            Object check = classRef.getConstructor().newInstance();

            String[] inputs1 = {"cat","cats","This is fun","Run from the bear!",
                    "Snakes like to slither","I am cool","The squares are stacked","It is hammer time"};
            String[] answers = {"c","cs","Tssu","R ot a",
                    "Sk ktstr","Imo","T uea ae","Iihm m"};
            for(int x=0; x<inputs1.length; x++)
            {
                Assert.assertEquals("everyThirdLetter("+inputs1[x]+") failed to produce the correct result."
                        ,answers[x],everyThirdLetter.invoke(check,inputs1[x]));
            }
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }
}
