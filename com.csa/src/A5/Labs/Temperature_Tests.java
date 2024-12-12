package A5.Labs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;

public class Temperature_Tests {
    public String generateClassName(String name) {
        if (getClass().toString().contains(".")) {
            return getClass().toString().substring(6, getClass().toString().lastIndexOf(".") + 1) + name;
        }
        return name;
    }

    public TestingOutputStream testingOutputStream = new TestingOutputStream();

    @Before
    public void setup()
    {
        System.setOut(testingOutputStream);
    }



    public String unifyLineSeperators(String line) {
        return line.replaceAll("\\n|\\r\\n", System.getProperty("line.separator")).trim();
    }

    @Test(timeout = 250)
    public void test1() throws Exception {
        Class<?> classRef = Class.forName(generateClassName("Temperature"));
        Method method = classRef.getMethod("fahToCel", double.class);

        double actual;
        try
        {
            actual = (double) method.invoke(method, 32);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        double expected = 0;
        Assert.assertEquals("fahToCel(32)", expected, actual, .001);
    }

    @Test(timeout = 250)
    public void test2() throws Exception {
        Class<?> classRef = Class.forName(generateClassName("Temperature"));
        Method method = classRef.getMethod("fahToCel", double.class);

        double actual;
        try
        {
            actual = (double) method.invoke(method, 212);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        double expected = 100;
        Assert.assertEquals("fahToCel(212)", expected, actual, .001);
    }

    @Test(timeout = 250)
    public void test3() throws Exception {
        Class<?> classRef = Class.forName(generateClassName("Temperature"));
        Method method = classRef.getMethod("fahToCel", double.class);

        double actual;
        try
        {
            actual = (double) method.invoke(method, 13);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        double expected = -10.555555555555555;
        Assert.assertEquals("fahToCel(13)", expected, actual, .001);
    }

    @Test(timeout = 250)
    public void test4() throws Exception {
        Class<?> classRef = Class.forName(generateClassName("Temperature"));
        Method method = classRef.getMethod("fahToCel", double.class);

        double actual;
        try
        {
            actual = (double) method.invoke(method, 237.87);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        double expected = 114.3722222222222;
        Assert.assertEquals("fahToCel(237.87)", expected, actual, .001);
    }

    @Test(timeout = 250)
    public void test5() throws Exception {
        Class<?> classRef = Class.forName(generateClassName("Temperature"));
        Method method = classRef.getMethod("fahToCel", double.class);

        double actual;
        try
        {
            actual = (double) method.invoke(method, 111.98);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        double expected = 44.43333333333334;
        Assert.assertEquals("fahToCel(111.98)", expected, actual, .001);
    }

    @Test(timeout = 250)
    public void test6() throws Exception {
        Class<?> classRef = Class.forName(generateClassName("Temperature"));
        Method method = classRef.getMethod("celToFah", double.class);

        double actual;
        try
        {
            actual = (double) method.invoke(method, 0);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        double expected = 32;
        Assert.assertEquals("celToFah(0)", expected, actual, .001);
    }

    @Test(timeout = 250)
    public void test7() throws Exception {
        Class<?> classRef = Class.forName(generateClassName("Temperature"));
        Method method = classRef.getMethod("fahToCel", double.class);

        double actual;
        try
        {
            actual = (double) method.invoke(method, 100);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        double expected = 37.77777777777778;
        Assert.assertEquals("celToFah(100)", expected, actual, .001);
    }

    @Test(timeout = 250)
    public void test8() throws Exception {
        Class<?> classRef = Class.forName(generateClassName("Temperature"));
        Method method = classRef.getMethod("fahToCel", double.class);

        double actual;
        try
        {
            actual = (double) method.invoke(method, 231);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        double expected = 110.55555555555556;
        Assert.assertEquals("celToFah(231)", expected, actual, .001);
    }

    @Test(timeout = 250)
    public void test9() throws Exception {
        Class<?> classRef = Class.forName(generateClassName("Temperature"));
        Method method = classRef.getMethod("fahToCel", double.class);

        double actual;
        try
        {
            actual = (double) method.invoke(method, 47.65);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        double expected = 8.694444444444445;
        Assert.assertEquals("celToFah(47.65)", expected, actual, .001);
    }

    @Test(timeout = 250)
    public void test10() throws Exception {
        Class<?> classRef = Class.forName(generateClassName("Temperature"));
        Method method = classRef.getMethod("fahToCel", double.class);

        double actual;
        try
        {
            actual = (double) method.invoke(method, 87.93);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        double expected = 31.072222222222226;
        Assert.assertEquals("celToFah(87.93)", expected, actual, .001);
    }

    @Test(timeout = 250)
    public void test11() throws Exception {
        String input = "1\n" +
                "55";

        String expected = "---Menu---\n" +
                "1. Celsius to Fahrenheit\n" +
                "2. Fahrenheit to Celsius\n" +
                "Enter your selection:\n" +
                "\n" +
                "Enter your temperature in Celsius:\n" +
                "\n" +
                "55.00 degrees in Celsius is 131.00 degrees in Fahrenheit.";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("Temperature"));
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
        String input = "1\n" +
                "432";

        String expected = "---Menu---\n" +
                "1. Celsius to Fahrenheit\n" +
                "2. Fahrenheit to Celsius\n" +
                "Enter your selection:\n" +
                "\n" +
                "Enter your temperature in Celsius:\n" +
                "\n" +
                "432.00 degrees in Celsius is 809.60 degrees in Fahrenheit.";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("Temperature"));
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
        String input = "1\n" +
                "34";

        String expected = "---Menu---\n" +
                "1. Celsius to Fahrenheit\n" +
                "2. Fahrenheit to Celsius\n" +
                "Enter your selection:\n" +
                "\n" +
                "Enter your temperature in Celsius:\n" +
                "\n" +
                "34.00 degrees in Celsius is 93.20 degrees in Fahrenheit.";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("Temperature"));
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
        String input = "2\n" +
                "321";

        String expected = "---Menu---\n" +
                "1. Celsius to Fahrenheit\n" +
                "2. Fahrenheit to Celsius\n" +
                "Enter your selection:\n" +
                "\n" +
                "Enter your temperature in Fahrenheit:\n" +
                "\n" +
                "321.00 degrees in Fahrenheit is 160.56 degrees in Celsius.";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("Temperature"));
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
    public void test15() throws Exception {
        String input = "2\n" +
                "35";

        String expected = "---Menu---\n" +
                "1. Celsius to Fahrenheit\n" +
                "2. Fahrenheit to Celsius\n" +
                "Enter your selection:\n" +
                "\n" +
                "Enter your temperature in Fahrenheit:\n" +
                "\n" +
                "35.00 degrees in Fahrenheit is 1.67 degrees in Celsius.";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("Temperature"));
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
