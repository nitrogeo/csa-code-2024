package A6.Labs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;

public class SignCounter_Tests {
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
        String input = "0";

        String expected = "Enter a whole number (0 to quit): \n" +
                "\n" +
                "You entered 0 positive numbers and 0 negative numbers.";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("SignCounter"));
        Object classObject = classRef.getConstructor().newInstance();

        Method main = classRef.getMethod("main", String[].class);
        try {
            main.invoke(classObject, (Object) null);
        } catch (InvocationTargetException e) {
            throw (Exception) e.getCause();
        }

        expected = unifyLineSeperators(expected);

        TestingOutputStream o = (TestingOutputStream) System.out;
        Assert.assertEquals(expected, unifyLineSeperators(o.toString()));
    }

    @Test(timeout = 250)
    public void test2() throws Exception {
        String input = "1\n" +
                "2\n" +
                "3\n" +
                "4\n" +
                "0";

        String expected = "Enter a whole number (0 to quit): \n" +
                "Enter a whole number (0 to quit): \n" +
                "Enter a whole number (0 to quit): \n" +
                "Enter a whole number (0 to quit): \n" +
                "Enter a whole number (0 to quit): \n" +
                "\n" +
                "You entered 4 positive numbers and 0 negative numbers.";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("SignCounter"));
        Object classObject = classRef.getConstructor().newInstance();

        Method main = classRef.getMethod("main", String[].class);
        try {
            main.invoke(classObject, (Object) null);
        } catch (InvocationTargetException e) {
            throw (Exception) e.getCause();
        }

        expected = unifyLineSeperators(expected);

        TestingOutputStream o = (TestingOutputStream) System.out;
        Assert.assertEquals(expected, unifyLineSeperators(o.toString()));
    }

    @Test(timeout = 250)
    public void test3() throws Exception {
        String input = "-1\n" +
                "-2\n" +
                "0";

        String expected = "Enter a whole number (0 to quit): \n" +
                "Enter a whole number (0 to quit): \n" +
                "Enter a whole number (0 to quit): \n" +
                "\n" +
                "You entered 0 positive numbers and 2 negative numbers.";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("SignCounter"));
        Object classObject = classRef.getConstructor().newInstance();

        Method main = classRef.getMethod("main", String[].class);
        try {
            main.invoke(classObject, (Object) null);
        } catch (InvocationTargetException e) {
            throw (Exception) e.getCause();
        }

        expected = unifyLineSeperators(expected);

        TestingOutputStream o = (TestingOutputStream) System.out;
        Assert.assertEquals(expected, unifyLineSeperators(o.toString()));
    }

    @Test(timeout = 250)
    public void test4() throws Exception {
        String input = "19\n" +
                "-4\n" +
                "29\n" +
                "-1\n" +
                "-8\n" +
                "7\n" +
                "0";

        String expected = "Enter a whole number (0 to quit): \n" +
                "Enter a whole number (0 to quit): \n" +
                "Enter a whole number (0 to quit): \n" +
                "Enter a whole number (0 to quit): \n" +
                "Enter a whole number (0 to quit): \n" +
                "Enter a whole number (0 to quit): \n" +
                "Enter a whole number (0 to quit): \n" +
                "\n" +
                "You entered 3 positive numbers and 3 negative numbers.";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("SignCounter"));
        Object classObject = classRef.getConstructor().newInstance();

        Method main = classRef.getMethod("main", String[].class);
        try {
            main.invoke(classObject, (Object) null);
        } catch (InvocationTargetException e) {
            throw (Exception) e.getCause();
        }

        expected = unifyLineSeperators(expected);

        TestingOutputStream o = (TestingOutputStream) System.out;
        Assert.assertEquals(expected, unifyLineSeperators(o.toString()));
    }

    @Test(timeout = 250)
    public void test5() throws Exception {
        String input = "-5\n" +
                "7\n" +
                "-4\n" +
                "-7\n" +
                "8\n" +
                "8\n" +
                "-5\n" +
                "-9\n" +
                "-14\n" +
                "0";

        String expected = "Enter a whole number (0 to quit): \n" +
                "Enter a whole number (0 to quit): \n" +
                "Enter a whole number (0 to quit): \n" +
                "Enter a whole number (0 to quit): \n" +
                "Enter a whole number (0 to quit): \n" +
                "Enter a whole number (0 to quit): \n" +
                "Enter a whole number (0 to quit): \n" +
                "Enter a whole number (0 to quit): \n" +
                "Enter a whole number (0 to quit): \n" +
                "Enter a whole number (0 to quit): \n" +
                "\n" +
                "You entered 3 positive numbers and 6 negative numbers.";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("SignCounter"));
        Object classObject = classRef.getConstructor().newInstance();

        Method main = classRef.getMethod("main", String[].class);
        try {
            main.invoke(classObject, (Object) null);
        } catch (InvocationTargetException e) {
            throw (Exception) e.getCause();
        }

        expected = unifyLineSeperators(expected);

        TestingOutputStream o = (TestingOutputStream) System.out;
        Assert.assertEquals(expected, unifyLineSeperators(o.toString()));
    }

    @Test(timeout = 250)
    public void test6() throws Exception {
        String input = "-5\n" +
                "7\n" +
                "8\n" +
                "7\n" +
                "0";

        String expected = "Enter a whole number (0 to quit): \n" +
                "Enter a whole number (0 to quit): \n" +
                "Enter a whole number (0 to quit): \n" +
                "Enter a whole number (0 to quit): \n" +
                "Enter a whole number (0 to quit): \n" +
                "\n" +
                "You entered 3 positive numbers and 1 negative number.";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("SignCounter"));
        Object classObject = classRef.getConstructor().newInstance();

        Method main = classRef.getMethod("main", String[].class);
        try {
            main.invoke(classObject, (Object) null);
        } catch (InvocationTargetException e) {
            throw (Exception) e.getCause();
        }

        expected = unifyLineSeperators(expected);

        TestingOutputStream o = (TestingOutputStream) System.out;
        Assert.assertEquals(expected, unifyLineSeperators(o.toString()));
    }
}
