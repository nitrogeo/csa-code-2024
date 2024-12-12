package A5.Labs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;

public class MixedNumberV2_Tests {
    public String generateClassName(String name)
    {
        if(getClass().toString().contains("."))
        {
            return getClass().toString().substring(6,getClass().toString().lastIndexOf(".")+1)+name;
        }
        return name;
    }

    public TestingOutputStream testingOutputStream = new TestingOutputStream();

    @Before
    public void setup()
    {
        System.setOut(testingOutputStream);
    }

    public String unifyLineSeperators(String line)
    {
        return line.replaceAll("\\n|\\r\\n", System.getProperty("line.separator")).trim();
    }

    @Test(timeout = 250)
    public void test1() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("MixedNumberV2"));
        Method method = classRef.getMethod("wholeNumber", int.class,int.class);

        int actual;
        try
        {
            actual = (int)method.invoke(method, 8,2);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        int expected = 4;
        Assert.assertEquals("wholeNumber(8,2)",expected,actual);
    }

    @Test(timeout = 250)
    public void test2() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("MixedNumberV2"));
        Method method = classRef.getMethod("wholeNumber", int.class, int.class);

        int actual;
        try
        {
            actual = (int)method.invoke(method, 1,1);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        int expected = 1;
        Assert.assertEquals("wholeNumber(1,1)",expected,actual);
    }

    @Test(timeout = 250)
    public void test3() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("MixedNumberV2"));
        Method method = classRef.getMethod("wholeNumber", int.class, int.class);

        int actual;
        try
        {
            actual = (int)method.invoke(method, 1,2);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        int expected = 0;
        Assert.assertEquals("wholeNumber(1,2)",expected,actual);
    }

    @Test(timeout = 250)
    public void test4() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("MixedNumberV2"));
        Method method = classRef.getMethod("wholeNumber", int.class, int.class);

        int actual;
        try
        {
            actual = (int)method.invoke(method, 6,4);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        int expected = 1;
        Assert.assertEquals("wholeNumber(6,4)",expected,actual);
    }

    @Test(timeout = 250)
    public void test5() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("MixedNumberV2"));
        Method method = classRef.getMethod("wholeNumber", int.class, int.class);

        int actual;
        try
        {
            actual = (int)method.invoke(method, 47,8);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        int expected = 5;
        Assert.assertEquals("wholeNumber(47,8)",expected,actual);
    }

    @Test(timeout = 250)
    public void test6() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("MixedNumberV2"));
        Method method = classRef.getMethod("remainder", int.class, int.class);

        int actual;
        try
        {
            actual = (int)method.invoke(method, 1,1);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        int expected = 0;
        Assert.assertEquals("remainder(1,1)",expected,actual);
    }

    @Test(timeout = 250)
    public void test7() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("MixedNumberV2"));
        Method method = classRef.getMethod("remainder", int.class, int.class);

        int actual;
        try
        {
            actual = (int)method.invoke(method, 2,1);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        int expected = 0;
        Assert.assertEquals("remainder(2,1)",expected,actual);
    }

    @Test(timeout = 250)
    public void test8() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("MixedNumberV2"));
        Method method = classRef.getMethod("remainder", int.class, int.class);

        int actual;
        try
        {
            actual = (int)method.invoke(method, 1,2);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        int expected = 1;
        Assert.assertEquals("remainder(1,2)",expected,actual);
    }

    @Test(timeout = 250)
    public void test9() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("MixedNumberV2"));
        Method method = classRef.getMethod("remainder", int.class, int.class);

        int actual;
        try
        {
            actual = (int)method.invoke(method, 26,10);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        int expected = 6;
        Assert.assertEquals("remainder(26,10)",expected,actual);
    }

    @Test(timeout = 250)
    public void test10() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("MixedNumberV2"));
        Method method = classRef.getMethod("remainder", int.class, int.class);

        int actual;
        try
        {
            actual = (int)method.invoke(method, 14,7);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        int expected = 0;
        Assert.assertEquals("remainder(14,7)",expected,actual);
    }

    @Test(timeout = 250)
    public void test11() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("MixedNumberV2"));
        Method method = classRef.getMethod("fraction", int.class, int.class);

        String actual;
        try
        {
            actual = (String)method.invoke(method, 25,2);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        String expected = "1/2";
        Assert.assertEquals("fraction(25,2)",expected,actual);
    }

    @Test(timeout = 250)
    public void test12() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("MixedNumberV2"));
        Method method = classRef.getMethod("fraction", int.class, int.class);

        String actual;
        try
        {
            actual = (String)method.invoke(method, 74,5);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        String expected = "4/5";
        Assert.assertEquals("fraction(74,5)",expected,actual);
    }

    @Test(timeout = 250)
    public void test13() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("MixedNumberV2"));
        Method method = classRef.getMethod("fraction", int.class, int.class);

        String actual;
        try
        {
            actual = (String)method.invoke(method, 100,10);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        String expected = "0/10";
        Assert.assertEquals("fraction(100,10)",expected,actual);
    }

    @Test(timeout = 250)
    public void test14() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("MixedNumberV2"));
        Method method = classRef.getMethod("fraction", int.class, int.class);

        String actual;
        try
        {
            actual = (String)method.invoke(method, 81,50);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        String expected = "31/50";
        Assert.assertEquals("fraction(81,50)",expected,actual);
    }

    @Test(timeout = 250)
    public void test15() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("MixedNumberV2"));
        Method method = classRef.getMethod("fraction", int.class, int.class);

        String actual;
        try
        {
            actual = (String)method.invoke(method, 70,14);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        String expected = "0/14";
        Assert.assertEquals("fraction(70,14)",expected,actual);
    }

    @Test(timeout = 250)
    public void test16() throws Exception{

        String input =  "14\n" +
                "8";

        String expected =   "Enter the numerator of your fraction (Whole Number):\n" +
                "Enter the denominator of your fraction (Whole Number):\n" +
                "\n" +
                "The mixed number derived from the fraction 14/8 is 1 6/8.";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("MixedNumberV2"));
        Object classObject = classRef.getConstructor().newInstance();


        Method main = classRef.getMethod("main",String[].class);
        try
        {
            main.invoke(classObject,(Object)null);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }

        expected = unifyLineSeperators(expected);

        TestingOutputStream o = (TestingOutputStream)System.out;
        Assert.assertEquals(expected, unifyLineSeperators(o.toString()));
    }

    @Test(timeout = 250)
    public void test17() throws Exception{
        String input =  "14\n" +
                "2";

        String expected =   "Enter the numerator of your fraction (Whole Number):\n" +
                "Enter the denominator of your fraction (Whole Number):\n" +
                "\n" +
                "The whole number derived from the fraction 14/2 is 7.";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("MixedNumberV2"));
        Object classObject = classRef.getConstructor().newInstance();

        Method main = classRef.getMethod("main",String[].class);
        try
        {
            main.invoke(classObject,(Object)null);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        expected = unifyLineSeperators(expected);

        TestingOutputStream o = (TestingOutputStream)System.out;
        Assert.assertEquals(expected, unifyLineSeperators(o.toString()));
    }

    @Test(timeout = 250)
    public void test18() throws Exception{
        String input =  "147\n" +
                "19";

        String expected =   "Enter the numerator of your fraction (Whole Number):\n" +
                "Enter the denominator of your fraction (Whole Number):\n" +
                "\n" +
                "The mixed number derived from the fraction 147/19 is 7 14/19.";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("MixedNumberV2"));
        Object classObject = classRef.getConstructor().newInstance();

        Method main = classRef.getMethod("main",String[].class);
        try
        {
            main.invoke(classObject,(Object)null);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }

        expected = unifyLineSeperators(expected);

        TestingOutputStream o = (TestingOutputStream)System.out;
        Assert.assertEquals(expected, unifyLineSeperators(o.toString()));
    }

    @Test(timeout = 250)
    public void test19() throws Exception{
        String input =  "211\n" +
                "211";

        String expected =   "Enter the numerator of your fraction (Whole Number):\n" +
                "Enter the denominator of your fraction (Whole Number):\n" +
                "\n" +
                "The whole number derived from the fraction 211/211 is 1.";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("MixedNumberV2"));
        Object classObject = classRef.getConstructor().newInstance();

        Method main = classRef.getMethod("main",String[].class);
        try
        {
            main.invoke(classObject,(Object)null);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }

        expected = unifyLineSeperators(expected);

        TestingOutputStream o = (TestingOutputStream)System.out;
        Assert.assertEquals(expected, unifyLineSeperators(o.toString()));
    }

    @Test(timeout = 250)
    public void test20() throws Exception{
        String input =  "15\n" +
                "4";

        String expected =   "Enter the numerator of your fraction (Whole Number):\n" +
                "Enter the denominator of your fraction (Whole Number):\n" +
                "\n" +
                "The mixed number derived from the fraction 15/4 is 3 3/4.";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("MixedNumberV2"));
        Object classObject = classRef.getConstructor().newInstance();

        Method main = classRef.getMethod("main",String[].class);
        try
        {
            main.invoke(classObject,(Object)null);
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
