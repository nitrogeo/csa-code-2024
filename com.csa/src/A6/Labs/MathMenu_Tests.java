package A6.Labs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;

public class MathMenu_Tests {
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
        String input = "4";

        String expected = "Menu\n" +
                "1. Power\n" +
                "2. Square\n" +
                "3. Square root\n" +
                "4. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "Good Bye.";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("MathMenu"));
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
        String input = "8\n" +
                "4";

        String expected = "Menu\n" +
                "1. Power\n" +
                "2. Square\n" +
                "3. Square root\n" +
                "4. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "Invalid input\n" +
                "\n" +
                "Menu\n" +
                "1. Power\n" +
                "2. Square\n" +
                "3. Square root\n" +
                "4. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "Good Bye.";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("MathMenu"));
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
        String input = "1\n" +
                "8\n" +
                "4\n" +
                "1\n" +
                "3\n" +
                "7\n" +
                "4";

        String expected = "Menu\n" +
                "1. Power\n" +
                "2. Square\n" +
                "3. Square root\n" +
                "4. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "Enter the base of the power:\n" +
                "Enter the exponent of the power:\n" +
                "8.00^4.00 = 4096.00\n" +
                "\n" +
                "Menu\n" +
                "1. Power\n" +
                "2. Square\n" +
                "3. Square root\n" +
                "4. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "Enter the base of the power:\n" +
                "Enter the exponent of the power:\n" +
                "3.00^7.00 = 2187.00\n" +
                "\n" +
                "Menu\n" +
                "1. Power\n" +
                "2. Square\n" +
                "3. Square root\n" +
                "4. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "Good Bye.";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("MathMenu"));
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
        String input = "2\n" +
                "5\n" +
                "31\n" +
                "4";

        String expected = "Menu\n" +
                "1. Power\n" +
                "2. Square\n" +
                "3. Square root\n" +
                "4. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "Enter the value to be squared:\n" +
                "5.00^2 = 25.00\n" +
                "\n" +
                "Menu\n" +
                "1. Power\n" +
                "2. Square\n" +
                "3. Square root\n" +
                "4. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "Invalid input\n" +
                "\n" +
                "Menu\n" +
                "1. Power\n" +
                "2. Square\n" +
                "3. Square root\n" +
                "4. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "Good Bye.";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("MathMenu"));
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
        String input = "3\n" +
                "9\n" +
                "3\n" +
                "41\n" +
                "4";

        String expected = "Menu\n" +
                "1. Power\n" +
                "2. Square\n" +
                "3. Square root\n" +
                "4. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "Enter the value for the square root:\n" +
                "9.00^.5 = 3.00\n" +
                "\n" +
                "Menu\n" +
                "1. Power\n" +
                "2. Square\n" +
                "3. Square root\n" +
                "4. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "Enter the value for the square root:\n" +
                "41.00^.5 = 6.40\n" +
                "\n" +
                "Menu\n" +
                "1. Power\n" +
                "2. Square\n" +
                "3. Square root\n" +
                "4. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "Good Bye.";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("MathMenu"));
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
        String input = "8\n" +
                "2\n" +
                "2\n" +
                "2\n" +
                "5\n" +
                "3\n" +
                "76\n" +
                "4";

        String expected = "Menu\n" +
                "1. Power\n" +
                "2. Square\n" +
                "3. Square root\n" +
                "4. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "Invalid input\n" +
                "\n" +
                "Menu\n" +
                "1. Power\n" +
                "2. Square\n" +
                "3. Square root\n" +
                "4. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "Enter the value to be squared:\n" +
                "2.00^2 = 4.00\n" +
                "\n" +
                "Menu\n" +
                "1. Power\n" +
                "2. Square\n" +
                "3. Square root\n" +
                "4. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "Enter the value to be squared:\n" +
                "5.00^2 = 25.00\n" +
                "\n" +
                "Menu\n" +
                "1. Power\n" +
                "2. Square\n" +
                "3. Square root\n" +
                "4. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "Enter the value for the square root:\n" +
                "76.00^.5 = 8.72\n" +
                "\n" +
                "Menu\n" +
                "1. Power\n" +
                "2. Square\n" +
                "3. Square root\n" +
                "4. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "Good Bye.";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("MathMenu"));
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
    public void test7() throws Exception {
        String input = "3\n" +
                "34\n" +
                "1\n" +
                "7\n" +
                "5\n" +
                "2\n" +
                "99\n" +
                "4";

        String expected = "Menu\n" +
                "1. Power\n" +
                "2. Square\n" +
                "3. Square root\n" +
                "4. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "Enter the value for the square root:\n" +
                "34.00^.5 = 5.83\n" +
                "\n" +
                "Menu\n" +
                "1. Power\n" +
                "2. Square\n" +
                "3. Square root\n" +
                "4. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "Enter the base of the power:\n" +
                "Enter the exponent of the power:\n" +
                "7.00^5.00 = 16807.00\n" +
                "\n" +
                "Menu\n" +
                "1. Power\n" +
                "2. Square\n" +
                "3. Square root\n" +
                "4. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "Enter the value to be squared:\n" +
                "99.00^2 = 9801.00\n" +
                "\n" +
                "Menu\n" +
                "1. Power\n" +
                "2. Square\n" +
                "3. Square root\n" +
                "4. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "Good Bye.";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("MathMenu"));
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
    public void test8() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("MathMenu"));
        Method method = classRef.getMethod("printMenu");


        String input = "3\n" +
                "34\n" +
                "1\n" +
                "7\n" +
                "5\n" +
                "2\n" +
                "99\n" +
                "4";

        String expected = "Menu\n" +
                "1. Power\n" +
                "2. Square\n" +
                "3. Square root\n" +
                "4. Exit\n" +
                "Enter selection:";

        try {
            method.invoke(classRef);
        } catch (InvocationTargetException e) {
            throw (Exception) e.getCause();
        }

        expected = unifyLineSeperators(expected);

        TestingOutputStream o = (TestingOutputStream) System.out;
        Assert.assertEquals(expected, unifyLineSeperators(o.toString()));
    }
}
