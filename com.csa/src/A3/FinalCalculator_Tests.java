package A3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;

public class FinalCalculator_Tests
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
        String input =  "75\n" +
                "85\n" +
                "97\n" +
                "90";

        String expected =   "Enter the grade you got for the first six weeks:\n" +
                            "Enter the grade you got for the second six weeks:\n" +
                            "Enter the grade you got for the third six weeks:\n" +
                            "Enter the average you want for the semester:\n" +
                            "\n" +
                            "You would need to get a 114.56 on your final to have a 90.00 for the semester.";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("FinalCalculator"));
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
        String input =  "70\n" +
                "70\n" +
                "70\n" +
                "70";

        String expected =   "Enter the grade you got for the first six weeks:\n" +
                            "Enter the grade you got for the second six weeks:\n" +
                            "Enter the grade you got for the third six weeks:\n" +
                            "Enter the average you want for the semester:\n" +
                            "\n" +
                            "You would need to get a 70.00 on your final to have a 70.00 for the semester.";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("FinalCalculator"));
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
        String input =  "70\n" +
                "35\n" +
                "68\n" +
                "70";

        String expected =   "Enter the grade you got for the first six weeks:\n" +
                            "Enter the grade you got for the second six weeks:\n" +
                            "Enter the grade you got for the third six weeks:\n" +
                            "Enter the average you want for the semester:\n" +
                            "\n" +
                            "You would need to get a 139.89 on your final to have a 70.00 for the semester.";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("FinalCalculator"));
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
        String input =  "75\n" +
                "75\n" +
                "93\n" +
                "82";

        String expected =   "Enter the grade you got for the first six weeks:\n" +
                            "Enter the grade you got for the second six weeks:\n" +
                            "Enter the grade you got for the third six weeks:\n" +
                            "Enter the average you want for the semester:\n" +
                            "\n" +
                            "You would need to get a 87.67 on your final to have a 82.00 for the semester.";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("FinalCalculator"));
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
        String input =  "85\n" +
                "76\n" +
                "83\n" +
                "81";

        String expected =   "Enter the grade you got for the first six weeks:\n" +
                            "Enter the grade you got for the second six weeks:\n" +
                            "Enter the grade you got for the third six weeks:\n" +
                            "Enter the average you want for the semester:\n" +
                            "\n" +
                            "You would need to get a 79.11 on your final to have a 81.00 for the semester.";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("FinalCalculator"));
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
