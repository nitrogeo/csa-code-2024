package A7.Labs.L1Lines;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;

public class LineLab_Tests {
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
        String input =  "3\n" +
                "4\n" +
                "8\n" +
                "2\n" +
                "4\n" +
                "1\n" +
                "77\n" +
                "-4\n" +
                "88\n" +
                "99\n" +
                "4\n" +
                "5";

        String expected =   "Enter point one...\n" +
                "Enter the x value:\n" +
                "Enter the y value:\n" +
                "\n" +
                "Enter point two...\n" +
                "Enter the x value:\n" +
                "Enter the y value:\n" +
                "\n" +
                "-Zom Menu-\n" +
                "1. Replace Line\n" +
                "2. Change Point 1\n" +
                "3. Change Point 2\n" +
                "4. View line Information\n" +
                "5. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "Line Data:\n" +
                "Points: [(3.000,4.000),(8.000,2.000)]\n" +
                "Slope: -0.400\n" +
                "X Intercept: 13.000\n" +
                "Y Intercept: 5.200\n" +
                "Equation: y = -0.400x + 5.200\n" +
                "\n" +
                "-Zom Menu-\n" +
                "1. Replace Line\n" +
                "2. Change Point 1\n" +
                "3. Change Point 2\n" +
                "4. View line Information\n" +
                "5. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "Enter point one...\n" +
                "Enter the x value:\n" +
                "Enter the y value:\n" +
                "\n" +
                "Enter point two...\n" +
                "Enter the x value:\n" +
                "Enter the y value:\n" +
                "\n" +
                "-Zom Menu-\n" +
                "1. Replace Line\n" +
                "2. Change Point 1\n" +
                "3. Change Point 2\n" +
                "4. View line Information\n" +
                "5. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "Line Data:\n" +
                "Points: [(77.000,-4.000),(88.000,99.000)]\n" +
                "Slope: 9.364\n" +
                "X Intercept: 77.427\n" +
                "Y Intercept: -725.000\n" +
                "Equation: y = 9.364x + -725.000\n" +
                "\n" +
                "-Zom Menu-\n" +
                "1. Replace Line\n" +
                "2. Change Point 1\n" +
                "3. Change Point 2\n" +
                "4. View line Information\n" +
                "5. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "Goodbye.";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("LineLab"));
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
        Assert.assertEquals(unifyLineSeperators(expected), unifyLineSeperators(o.toString()));
    }

    @Test(timeout = 250)
    public void test2() throws Exception{
        String input =  "1\n" +
                "2\n" +
                "5\n" +
                "5\n" +
                "4\n" +
                "2\n" +
                "-12\n" +
                "-2\n" +
                "4\n" +
                "5";

        String expected =   "Enter point one...\n" +
                "Enter the x value:\n" +
                "Enter the y value:\n" +
                "\n" +
                "Enter point two...\n" +
                "Enter the x value:\n" +
                "Enter the y value:\n" +
                "\n" +
                "-Zom Menu-\n" +
                "1. Replace Line\n" +
                "2. Change Point 1\n" +
                "3. Change Point 2\n" +
                "4. View line Information\n" +
                "5. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "Line Data:\n" +
                "Points: [(1.000,2.000),(5.000,5.000)]\n" +
                "Slope: 0.750\n" +
                "X Intercept: -1.667\n" +
                "Y Intercept: 1.250\n" +
                "Equation: y = 0.750x + 1.250\n" +
                "\n" +
                "-Zom Menu-\n" +
                "1. Replace Line\n" +
                "2. Change Point 1\n" +
                "3. Change Point 2\n" +
                "4. View line Information\n" +
                "5. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "Enter the new point one...\n" +
                "Enter the x value:\n" +
                "Enter the y value:\n" +
                "\n" +
                "-Zom Menu-\n" +
                "1. Replace Line\n" +
                "2. Change Point 1\n" +
                "3. Change Point 2\n" +
                "4. View line Information\n" +
                "5. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "Line Data:\n" +
                "Points: [(-12.000,-2.000),(5.000,5.000)]\n" +
                "Slope: 0.412\n" +
                "X Intercept: -7.143\n" +
                "Y Intercept: 2.941\n" +
                "Equation: y = 0.412x + 2.941\n" +
                "\n" +
                "-Zom Menu-\n" +
                "1. Replace Line\n" +
                "2. Change Point 1\n" +
                "3. Change Point 2\n" +
                "4. View line Information\n" +
                "5. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "Goodbye.";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("LineLab"));
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
        Assert.assertEquals(unifyLineSeperators(expected), unifyLineSeperators(o.toString()));
    }

    @Test(timeout = 250)
    public void test3() throws Exception{
        String input =  "4\n" +
                "11\n" +
                "3\n" +
                "7\n" +
                "4\n" +
                "3\n" +
                "11\n" +
                "47\n" +
                "4\n" +
                "5";

        String expected =   "Enter point one...\n" +
                "Enter the x value:\n" +
                "Enter the y value:\n" +
                "\n" +
                "Enter point two...\n" +
                "Enter the x value:\n" +
                "Enter the y value:\n" +
                "\n" +
                "-Zom Menu-\n" +
                "1. Replace Line\n" +
                "2. Change Point 1\n" +
                "3. Change Point 2\n" +
                "4. View line Information\n" +
                "5. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "Line Data:\n" +
                "Points: [(4.000,11.000),(3.000,7.000)]\n" +
                "Slope: 4.000\n" +
                "X Intercept: 1.250\n" +
                "Y Intercept: -5.000\n" +
                "Equation: y = 4.000x + -5.000\n" +
                "\n" +
                "-Zom Menu-\n" +
                "1. Replace Line\n" +
                "2. Change Point 1\n" +
                "3. Change Point 2\n" +
                "4. View line Information\n" +
                "5. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "Enter the new point two...\n" +
                "Enter the x value:\n" +
                "Enter the y value:\n" +
                "\n" +
                "-Zom Menu-\n" +
                "1. Replace Line\n" +
                "2. Change Point 1\n" +
                "3. Change Point 2\n" +
                "4. View line Information\n" +
                "5. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "Line Data:\n" +
                "Points: [(4.000,11.000),(11.000,47.000)]\n" +
                "Slope: 5.143\n" +
                "X Intercept: 1.861\n" +
                "Y Intercept: -9.571\n" +
                "Equation: y = 5.143x + -9.571\n" +
                "\n" +
                "-Zom Menu-\n" +
                "1. Replace Line\n" +
                "2. Change Point 1\n" +
                "3. Change Point 2\n" +
                "4. View line Information\n" +
                "5. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "Goodbye.";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("LineLab"));
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
        Assert.assertEquals(unifyLineSeperators(expected), unifyLineSeperators(o.toString()));
    }
}
