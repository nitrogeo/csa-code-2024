package A3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;

public class Rectangle_Tests
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

        String expected =   "Enter the length (whole number):\n" +
                            "Enter the width (whole number):\n" +
                            "\n" +
                            "Rectangle properties:\n" +
                            "Length    - 4\n" +
                            "Width     - 6\n" +
                            "Perimeter - 20\n" +
                            "Area      - 24";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("Rectangle"));
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

        String expected =   "Enter the length (whole number):\n" +
                            "Enter the width (whole number):\n" +
                            "\n" +
                            "Rectangle properties:\n" +
                            "Length    - 8\n" +
                            "Width     - 8\n" +
                            "Perimeter - 32\n" +
                            "Area      - 64";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("Rectangle"));
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

        String expected =   "Enter the length (whole number):\n" +
                            "Enter the width (whole number):\n" +
                            "\n" +
                            "Rectangle properties:\n" +
                            "Length    - 7\n" +
                            "Width     - 3\n" +
                            "Perimeter - 20\n" +
                            "Area      - 21";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("Rectangle"));
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

        String expected =   "Enter the length (whole number):\n" +
                            "Enter the width (whole number):\n" +
                            "\n" +
                            "Rectangle properties:\n" +
                            "Length    - 9\n" +
                            "Width     - 2\n" +
                            "Perimeter - 22\n" +
                            "Area      - 18";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("Rectangle"));
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

        String expected =   "Enter the length (whole number):\n" +
                            "Enter the width (whole number):\n" +
                            "\n" +
                            "Rectangle properties:\n" +
                            "Length    - 77\n" +
                            "Width     - 85\n" +
                            "Perimeter - 324\n" +
                            "Area      - 6545";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("Rectangle"));
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
