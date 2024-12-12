package A5.Labs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;

public class Time_Tests {
    public TestingOutputStream testingOutputStream = new TestingOutputStream();


    @Before
    public void setup()
    {
        System.setOut(testingOutputStream);

    }

    public String unifyLineSeperators(String line) {
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

    @Test(timeout = 250)
    public void test1() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Time"));
        Method method = classRef.getMethod("isLeapYear", int.class);

        boolean actual;
        try
        {
            actual = (boolean)method.invoke(method, 1900);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        boolean expected = false;
        Assert.assertEquals("isLeapYear(1900)", expected,actual);
    }

    @Test(timeout = 250)
    public void test2() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Time"));
        Method method = classRef.getMethod("isLeapYear", int.class);

        boolean actual;
        try
        {
            actual = (boolean)method.invoke(method, 1901);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        boolean expected = false;
        Assert.assertEquals("isLeapYear(1901)", expected,actual);
    }

    @Test(timeout = 250)
    public void test3() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Time"));
        Method method = classRef.getMethod("isLeapYear", int.class);

        boolean actual;
        try
        {
            actual = (boolean)method.invoke(method, 1904);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        boolean expected = true;
        Assert.assertEquals("isLeapYear(1904)", expected,actual);
    }

    @Test(timeout = 250)
    public void test4() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Time"));
        Method method = classRef.getMethod("isLeapYear", int.class);

        boolean actual;
        try
        {
            actual = (boolean)method.invoke(method, 1905);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        boolean expected = false;
        Assert.assertEquals("isLeapYear(1905)", expected,actual);
    }

    @Test(timeout = 250)
    public void test5() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Time"));
        Method method = classRef.getMethod("isLeapYear", int.class);

        boolean actual;
        try
        {
            actual = (boolean)method.invoke(method, 1981);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        boolean expected = false;
        Assert.assertEquals("isLeapYear(1981)", expected,actual);
    }

    @Test(timeout = 250)
    public void test6() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Time"));
        Method method = classRef.getMethod("isLeapYear", int.class);

        boolean actual;
        try
        {
            actual = (boolean)method.invoke(method, 1984);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        boolean expected = true;
        Assert.assertEquals("isLeapYear(1984)", expected,actual);
    }

    @Test(timeout = 250)
    public void test7() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Time"));
        Method method = classRef.getMethod("isLeapYear", int.class);

        boolean actual;
        try
        {
            actual = (boolean)method.invoke(method, 2000);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        boolean expected = true;
        Assert.assertEquals("isLeapYear(2000)", expected,actual);
    }

    @Test(timeout = 250)
    public void test8() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Time"));
        Method method = classRef.getMethod("isLeapYear", int.class);

        boolean actual;
        try
        {
            actual = (boolean)method.invoke(method, 2300);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        boolean expected = false;
        Assert.assertEquals("isLeapYear(2300)", expected,actual);
    }

    @Test(timeout = 250)
    public void test9() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Time"));
        Method method = classRef.getMethod("isLeapYear", int.class);

        boolean actual;
        try
        {
            actual = (boolean)method.invoke(method, 3200);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        boolean expected = true;
        Assert.assertEquals("isLeapYear(3200)", expected,actual);
    }

    @Test(timeout = 250)
    public void test10() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Time"));
        Method method = classRef.getMethod("isLeapYear", int.class);

        boolean actual;
        try
        {
            actual = (boolean)method.invoke(method, 2345);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        boolean expected = false;
        Assert.assertEquals("isLeapYear(2345)", expected,actual);
    }

    @Test(timeout = 250)
    public void test11() throws Exception {
        String input = "245";

        String expected = "Enter a year (whole number):\n" +
                "\n" +
                "245 is not a leap year.";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("Time"));
        Object classObject = classRef.getConstructor().newInstance();

        Method main = classRef.getMethod("main", String[].class);
        try
        {
            main.invoke(classObject, (Object) null);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        expected = unifyLineSeperators(expected);

        TestingOutputStream o = (TestingOutputStream) System.out;
        Assert.assertEquals(expected, unifyLineSeperators(o.toString()));
    }

    @Test(timeout = 250)
    public void test12() throws Exception {
        String input = "1933";

        String expected = "Enter a year (whole number):\n" +
                "\n" +
                "1933 is not a leap year.";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("Time"));
        Object classObject = classRef.getConstructor().newInstance();

        Method main = classRef.getMethod("main", String[].class);
        try
        {
            main.invoke(classObject, (Object) null);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        expected = unifyLineSeperators(expected);

        TestingOutputStream o = (TestingOutputStream) System.out;
        Assert.assertEquals(expected, unifyLineSeperators(o.toString()));
    }

    @Test(timeout = 250)
    public void test13() throws Exception {
        String input = "1724";

        String expected = "Enter a year (whole number):\n" +
                "\n" +
                "1724 is a leap year.";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("Time"));
        Object classObject = classRef.getConstructor().newInstance();

        Method main = classRef.getMethod("main", String[].class);
        try
        {
            main.invoke(classObject, (Object) null);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        expected = unifyLineSeperators(expected);

        TestingOutputStream o = (TestingOutputStream) System.out;
        Assert.assertEquals(expected, unifyLineSeperators(o.toString()));
    }

    @Test(timeout = 250)
    public void test14() throws Exception {
        String input = "2264";

        String expected = "Enter a year (whole number):\n" +
                "\n" +
                "2264 is a leap year.";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("Time"));
        Object classObject = classRef.getConstructor().newInstance();

        Method main = classRef.getMethod("main", String[].class);
        try
        {
            main.invoke(classObject, (Object) null);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        expected = unifyLineSeperators(expected);

        TestingOutputStream o = (TestingOutputStream) System.out;
        Assert.assertEquals(expected, unifyLineSeperators(o.toString()));
    }
}
