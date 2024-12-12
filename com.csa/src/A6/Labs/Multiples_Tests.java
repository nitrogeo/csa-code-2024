package A6.Labs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class Multiples_Tests {
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
        String input =  "5\n" +
                "0\n" +
                "-1\n" +
                "7";

        String expected =   "Enter a number:\n" +
                "Enter the number of multiples you would like to see for the number 5:\n" +
                "You must enter a positive number for the number of multiples.\n" +
                "Enter the number of multiples you would like to see for the number 5:\n" +
                "You must enter a positive number for the number of multiples.\n" +
                "Enter the number of multiples you would like to see for the number 5:\n" +
                "\n" +
                "The first 7 multiples of 5 are: 5, 10, 15, 20, 25, 30, 35";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("Multiples"));
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
        String input =  "3\n" +
                "-8\n" +
                "-1\n" +
                "-6\n" +
                "14";

        String expected =   "Enter a number:\n" +
                "Enter the number of multiples you would like to see for the number 3:\n" +
                "You must enter a positive number for the number of multiples.\n" +
                "Enter the number of multiples you would like to see for the number 3:\n" +
                "You must enter a positive number for the number of multiples.\n" +
                "Enter the number of multiples you would like to see for the number 3:\n" +
                "You must enter a positive number for the number of multiples.\n" +
                "Enter the number of multiples you would like to see for the number 3:\n" +
                "\n" +
                "The first 14 multiples of 3 are: 3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36, 39, 42";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("Multiples"));
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
        String input =  "9\n" +
                "9";

        String expected =   "Enter a number:\n" +
                "Enter the number of multiples you would like to see for the number 9:\n" +
                "\n" +
                "The first 9 multiples of 9 are: 9, 18, 27, 36, 45, 54, 63, 72, 81";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("Multiples"));
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
        String input =  "-1\n" +
                "-1\n" +
                "2";

        String expected =   "Enter a number:\n" +
                "Enter the number of multiples you would like to see for the number -1:\n" +
                "You must enter a positive number for the number of multiples.\n" +
                "Enter the number of multiples you would like to see for the number -1:\n" +
                "\n" +
                "The first 2 multiples of -1 are: -1, -2";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("Multiples"));
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
        String input =  "18\n" +
                "62";

        String expected =   "Enter a number:\n" +
                "Enter the number of multiples you would like to see for the number 18:\n" +
                "\n" +
                "The first 62 multiples of 18 are: 18, 36, 54, 72, 90, 108, 126, 144, 162, 180, 198, 216, 234, 252, 270, 288, 306, 324, 342, 360, 378, 396, 414, 432, 450, 468, 486, 504, 522, 540, 558, 576, 594, 612, 630, 648, 666, 684, 702, 720, 738, 756, 774, 792, 810, 828, 846, 864, 882, 900, 918, 936, 954, 972, 990, 1008, 1026, 1044, 1062, 1080, 1098, 1116";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("Multiples"));
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
