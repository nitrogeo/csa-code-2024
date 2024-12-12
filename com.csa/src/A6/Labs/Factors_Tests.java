package A6.Labs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;

public class Factors_Tests {
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
    public void test1() throws Exception{
        String input =  "0\n" +
                "0\n" +
                "-1\n" +
                "7";

        String expected =   "What number do you want to see the factors of (Positive Number)?\n" +
                "What number do you want to see the factors of (Positive Number)?\n" +
                "What number do you want to see the factors of (Positive Number)?\n" +
                "What number do you want to see the factors of (Positive Number)?\n" +
                "\n" +
                "The factors of 7 are: 1, 7.";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("Factors"));
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
    public void test2() throws Exception{
        String input =  "66";

        String expected =   "What number do you want to see the factors of (Positive Number)?\n" +
                "\n" +
                "The factors of 66 are: 1, 2, 3, 6, 11, 22, 33, 66.";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("Factors"));
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
    public void test3() throws Exception{
        String input =  "-98\n" +
                "98";

        String expected =   "What number do you want to see the factors of (Positive Number)?\n" +
                "What number do you want to see the factors of (Positive Number)?\n" +
                "\n" +
                "The factors of 98 are: 1, 2, 7, 14, 49, 98.";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("Factors"));
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
    public void test4() throws Exception{
        String input =  "24587";

        String expected =   "What number do you want to see the factors of (Positive Number)?\n" +
                "\n" +
                "The factors of 24587 are: 1, 23, 1069, 24587.";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("Factors"));
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
    public void test5() throws Exception{
        String input =  "33";

        String expected =   "What number do you want to see the factors of (Positive Number)?\n" +
                "\n" +
                "The factors of 33 are: 1, 3, 11, 33.";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("Factors"));
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
    public void test6() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Factors"));
        Method method = classRef.getMethod("isFactor", int.class, int.class);

        boolean actual;
        try
        {
            actual = (boolean)method.invoke(method, 1,1);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        boolean expected = true;
        Assert.assertEquals("isFactor(1,1)",expected,actual);
    }

    @Test(timeout = 250)
    public void test7() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Factors"));
        Method method = classRef.getMethod("isFactor", int.class, int.class);

        boolean actual;
        try
        {
            actual = (boolean)method.invoke(method, 11,9);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        boolean expected = false;
        Assert.assertEquals("isFactor(11,9)",expected,actual);
    }
    @Test(timeout = 250)
    public void test8() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Factors"));
        Method method = classRef.getMethod("isFactor", int.class, int.class);

        boolean actual;
        try
        {
            actual = (boolean)method.invoke(method, 55,5);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        boolean expected = true;
        Assert.assertEquals("isFactor(55,5)",expected,actual);
    }

    @Test(timeout = 250)
    public void test9() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Factors"));
        Method method = classRef.getMethod("isFactor", int.class, int.class);

        boolean actual;
        try
        {
            actual = (boolean)method.invoke(method, 6,12);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        boolean expected = false;
        Assert.assertEquals("isFactor(6,12)",expected,actual);
    }

    @Test(timeout = 250)
    public void test10() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Factors"));
        Method method = classRef.getMethod("isFactor", int.class, int.class);

        boolean actual;
        try
        {
            actual = (boolean)method.invoke(method, 19,13);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        boolean expected = false;
        Assert.assertEquals("isFactor(19,13)",expected,actual);
    }

    @Test(timeout = 250)
    public void test11() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Factors"));
        Method method = classRef.getMethod("isFactor", int.class, int.class);

        boolean actual;
        try
        {
            actual = (boolean)method.invoke(method, 21,3);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        boolean expected = true;
        Assert.assertEquals("isFactor(21,3)",expected,actual);
    }

    @Test(timeout = 250)
    public void test12() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Factors"));
        Method method = classRef.getMethod("isFactor", int.class, int.class);

        boolean actual;
        try
        {
            actual = (boolean)method.invoke(method, 19,2);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        boolean expected = false;
        Assert.assertEquals("isFactor(19,2)",expected,actual);
    }

    @Test(timeout = 250)
    public void test13() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Factors"));
        Method method = classRef.getMethod("isFactor", int.class, int.class);

        boolean actual;
        try
        {
            actual = (boolean)method.invoke(method, 77,1);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        boolean expected = true;
        Assert.assertEquals("isFactor(77,1)",expected,actual);
    }

    @Test(timeout = 250)
    public void test14() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Factors"));
        Method method = classRef.getMethod("isFactor", int.class, int.class);

        boolean actual;
        try
        {
            actual = (boolean)method.invoke(method, 44,3);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        boolean expected = false;
        Assert.assertEquals("isFactor(44,3)",expected,actual);
    }

    @Test(timeout = 250)
    public void test15() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Factors"));
        Method method = classRef.getMethod("isFactor", int.class, int.class);

        boolean actual;
        try
        {
            actual = (boolean)method.invoke(method, 44,4);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        boolean expected = true;
        Assert.assertEquals("isFactor(44,4)",expected,actual);
    }

}
