package A3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;

public class DistanceBetweenTwoPoints_Tests
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
                        "6\n" +
                        "10\n" +
                        "10";

        String expected =   "Enter the x value of your first point (Whole Number):\n" +
                            "Enter the y value of your first point (Whole Number):\n" +
                            "Enter the x value of your second point (Whole Number):\n" +
                            "Enter the y value of your second point (Whole Number):\n" +
                            "\n" +
                            "The distance between (4.00,6.00) and (10.00,10.00) is 7.21.";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("DistanceBetweenTwoPoints"));
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
        String input =  "1\n" +
                        "8\n" +
                        "-2\n" +
                        "5";

        String expected =   "Enter the x value of your first point (Whole Number):\n" +
                            "Enter the y value of your first point (Whole Number):\n" +
                            "Enter the x value of your second point (Whole Number):\n" +
                            "Enter the y value of your second point (Whole Number):\n" +
                            "\n" +
                            "The distance between (1.00,8.00) and (-2.00,5.00) is 4.24.";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("DistanceBetweenTwoPoints"));
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
        String input =  "4\n" +
                        "4\n" +
                        "10\n" +
                        "10";

        String expected =   "Enter the x value of your first point (Whole Number):\n" +
                            "Enter the y value of your first point (Whole Number):\n" +
                            "Enter the x value of your second point (Whole Number):\n" +
                            "Enter the y value of your second point (Whole Number):\n" +
                            "\n" +
                            "The distance between (4.00,4.00) and (10.00,10.00) is 8.49.";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("DistanceBetweenTwoPoints"));
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
        String input =  "1\n" +
                        "3\n" +
                        "8\n" +
                        "4";

        String expected =   "Enter the x value of your first point (Whole Number):\n" +
                            "Enter the y value of your first point (Whole Number):\n" +
                            "Enter the x value of your second point (Whole Number):\n" +
                            "Enter the y value of your second point (Whole Number):\n" +
                            "\n" +
                            "The distance between (1.00,3.00) and (8.00,4.00) is 7.07.";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("DistanceBetweenTwoPoints"));
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
                        "85\n" +
                        "126\n" +
                        "14";

        String expected =   "Enter the x value of your first point (Whole Number):\n" +
                            "Enter the y value of your first point (Whole Number):\n" +
                            "Enter the x value of your second point (Whole Number):\n" +
                            "Enter the y value of your second point (Whole Number):\n" +
                            "\n" +
                            "The distance between (77.00,85.00) and (126.00,14.00) is 86.27.";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("DistanceBetweenTwoPoints"));
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
