package A3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;

public class MixedNumber_Tests
{
    TestingOutputStream testingOutputStream = new TestingOutputStream();
    @Before
    public void setOutput()
    {
        System.setOut(testingOutputStream);
    }

    public String unifyLineSeperators(String line)
    {
        return line.replaceAll("\\n|\\r\\n", System.getProperty("line.separator")).trim();
    }

    public String generateClassName(String name)
    {
        if(getClass().toString().contains("."))
        {
            return getClass().toString().substring(6,getClass().toString().lastIndexOf(".")+1)+name;
        }
        return name;
    }


    @Test(timeout = 2000)
    public void test1() throws Exception{
        String input =  "4\n" +
                        "6";

        String expected =   "Enter the numerator of the fraction:\n" +
                            "Enter the denominator of the fraction:\n" +
                            "\n" +
                            "The mixed number derived from the fraction 4/6 is 0 4/6.";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("MixedNumber"));
        Object helloUserObject = classRef.getConstructor().newInstance();

        Method main = classRef.getMethod("main",String[].class);
        try
        {
            main.invoke(helloUserObject,(Object)null);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }

        expected = unifyLineSeperators(expected);

        TestingOutputStream o = (TestingOutputStream)System.out;
        Assert.assertEquals(expected, unifyLineSeperators(o.toString()));
    }

    @Test(timeout = 2000)
    public void test2() throws Exception{
        String input =  "8\n" +
                        "8";

        String expected =   "Enter the numerator of the fraction:\n" +
                            "Enter the denominator of the fraction:\n" +
                            "\n" +
                            "The mixed number derived from the fraction 8/8 is 1 0/8.";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("MixedNumber"));
        Object helloUserObject = classRef.getConstructor().newInstance();

        Method main = classRef.getMethod("main",String[].class);
        try
        {
            main.invoke(helloUserObject,(Object)null);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }

        expected = unifyLineSeperators(expected);

        TestingOutputStream o = (TestingOutputStream)System.out;
        Assert.assertEquals(expected, unifyLineSeperators(o.toString()));
    }

    @Test(timeout = 2000)
    public void test3() throws Exception{
        String input =  "7\n" +
                        "3";

        String expected =   "Enter the numerator of the fraction:\n" +
                            "Enter the denominator of the fraction:\n" +
                            "\n" +
                            "The mixed number derived from the fraction 7/3 is 2 1/3.";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("MixedNumber"));
        Object helloUserObject = classRef.getConstructor().newInstance();

        Method main = classRef.getMethod("main",String[].class);
        try
        {
            main.invoke(helloUserObject,(Object)null);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }

        expected = unifyLineSeperators(expected);

        TestingOutputStream o = (TestingOutputStream)System.out;
        Assert.assertEquals(expected, unifyLineSeperators(o.toString()));
    }

    @Test(timeout = 2000)
    public void test4() throws Exception{
        String input =  "9\n" +
                        "2";

        String expected =   "Enter the numerator of the fraction:\n" +
                            "Enter the denominator of the fraction:\n" +
                            "\n" +
                            "The mixed number derived from the fraction 9/2 is 4 1/2.";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("MixedNumber"));
        Object helloUserObject = classRef.getConstructor().newInstance();

        Method main = classRef.getMethod("main",String[].class);
        try
        {
            main.invoke(helloUserObject,(Object)null);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }

        expected = unifyLineSeperators(expected);

        TestingOutputStream o = (TestingOutputStream)System.out;
        Assert.assertEquals(expected, unifyLineSeperators(o.toString()));
    }

    @Test(timeout = 2000)
    public void test5() throws Exception{
        String input =  "77\n" +
                        "85";

        String expected =   "Enter the numerator of the fraction:\n" +
                            "Enter the denominator of the fraction:\n" +
                            "\n" +
                            "The mixed number derived from the fraction 77/85 is 0 77/85.";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("MixedNumber"));
        Object helloUserObject = classRef.getConstructor().newInstance();

        Method main = classRef.getMethod("main",String[].class);
        try
        {
            main.invoke(helloUserObject,(Object)null);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }

        expected = unifyLineSeperators(expected);

        TestingOutputStream o = (TestingOutputStream)System.out;
        Assert.assertEquals(expected, unifyLineSeperators(o.toString()));
    }
}
