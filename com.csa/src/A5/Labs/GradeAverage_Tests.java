package A5.Labs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;

public class GradeAverage_Tests {
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
        Class<?> classRef = Class.forName(generateClassName("GradeAverage"));
        Method method = classRef.getMethod("average", double.class, double.class, double.class, double.class);

        double actual;
        try
        {
            actual = (double)method.invoke(method, 35.6,78.8,90.65,88.88);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        double expected = 73.4825;
        Assert.assertEquals("average(35.6,78.8,90.65,88.88)",expected,actual,.001);
    }

    @Test(timeout = 250)
    public void test2() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("GradeAverage"));
        Method method = classRef.getMethod("average", double.class, double.class, double.class, double.class);

        double actual;
        try
        {
            actual = (double)method.invoke(method, 10,10,10,10);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        double expected = 10;
        Assert.assertEquals("average(10,10,10,10)",expected,actual,.001);
    }

    @Test(timeout = 250)
    public void test3() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("GradeAverage"));
        Method method = classRef.getMethod("average", double.class, double.class, double.class, double.class);

        double actual;
        try
        {
            actual = (double)method.invoke(method, 90.5,99.3,78.8,86.6);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        double expected = 88.80000000000001;
        Assert.assertEquals("average(90.5,99.3,78.8,86.6)",expected,actual,.001);
    }

    @Test(timeout = 250)
    public void test4() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("GradeAverage"));
        Method method = classRef.getMethod("average", double.class, double.class, double.class, double.class);

        double actual;
        try
        {
            actual = (double)method.invoke(method, 55.5,69.2,23.88,100);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        double expected = 62.145;
        Assert.assertEquals("average(55.5,69.2,23.88,100)",expected,actual,.001);
    }

    @Test(timeout = 250)
    public void test5() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("GradeAverage"));
        Method method = classRef.getMethod("average", double.class, double.class, double.class, double.class);

        double actual;
        try
        {
            actual = (double)method.invoke(method, 56.9,83.2,98.4,77.3);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        double expected = 78.95;
        Assert.assertEquals("average(56.9,83.2,98.4,77.3)",expected,actual,.001);
    }

    @Test(timeout = 250)
    public void test6() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("GradeAverage"));
        Method method = classRef.getMethod("gradeLetter", double.class, double.class, double.class, double.class);

        char actual;
        try
        {
            actual = (char)method.invoke(method, 35.6,78.8,90.65,68.88);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        char expected = 'F';
        Assert.assertEquals("gradeLetter(35.6,78.8,90.65,68.88)",expected+"",actual+"");
    }

    @Test(timeout = 250)
    public void test7() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("GradeAverage"));
        Method method = classRef.getMethod("gradeLetter", double.class, double.class, double.class, double.class);

        char actual;
        try
        {
            actual = (char)method.invoke(method, 70,78.8,71,70.1);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        char expected = 'D';
        Assert.assertEquals("gradeLetter(70,78.8,71,70.1)",expected+"",actual+"");
    }

    @Test(timeout = 250)
    public void test8() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("GradeAverage"));
        Method method = classRef.getMethod("gradeLetter", double.class, double.class, double.class, double.class);

        char actual;
        try
        {
            actual = (char)method.invoke(method, 75.6,78.8,74.65,78.88);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        char expected = 'C';
        Assert.assertEquals("gradeLetter(75.6,78.8,74.65,78.88)",expected+"",actual+"");
    }

    @Test(timeout = 250)
    public void test9() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("GradeAverage"));
        Method method = classRef.getMethod("gradeLetter", double.class, double.class, double.class, double.class);

        char actual;
        try
        {
            actual = (char)method.invoke(method, 75.6,78.8,90.65,88.88);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        char expected = 'B';
        Assert.assertEquals("gradeLetter(75.6,78.8,90.65,88.88)",expected+"",actual+"");
    }

    @Test(timeout = 250)
    public void test10() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("GradeAverage"));
        Method method = classRef.getMethod("gradeLetter", double.class, double.class, double.class, double.class);

        char actual;
        try
        {
            actual = (char)method.invoke(method, 99.6,98.8,90.65,88.88);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        char expected = 'A';
        Assert.assertEquals("gradeLetter(99.6,98.8,90.65,88.88)",expected+"",actual+"");
    }

    @Test(timeout = 250)
    public void test11() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("GradeAverage"));
        Method method = classRef.getMethod("gradeLetter", double.class);

        char actual;
        try
        {
            actual = (char)method.invoke(method, 25.2);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        char expected = 'F';
        Assert.assertEquals("gradeLetter(25.2)",expected+"",actual+"");
    }

    @Test(timeout = 250)
    public void test12() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("GradeAverage"));
        Method method = classRef.getMethod("gradeLetter", double.class);

        char actual;
        try
        {
            actual = (char)method.invoke(method, 73.5);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        char expected = 'D';
        Assert.assertEquals("gradeLetter(73.5)",expected+"",actual+"");
    }

    @Test(timeout = 250)
    public void test13() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("GradeAverage"));
        Method method = classRef.getMethod("gradeLetter", double.class);

        char actual;
        try
        {
            actual = (char)method.invoke(method, 77.7);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        char expected = 'C';
        Assert.assertEquals("gradeLetter(77.7)",expected+"",actual+"");
    }

    @Test(timeout = 250)
    public void test14() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("GradeAverage"));
        Method method = classRef.getMethod("gradeLetter", double.class);

        char actual;
        try
        {
            actual = (char)method.invoke(method, 81);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        char expected = 'B';
        Assert.assertEquals("gradeLetter(81)",expected+"",actual+"");
    }

    @Test(timeout = 250)
    public void test15() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("GradeAverage"));
        Method method = classRef.getMethod("gradeLetter", double.class);

        char actual;
        try
        {
            actual = (char)method.invoke(method, 94.6);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        char expected = 'A';
        Assert.assertEquals("gradeLetter(94.6)",expected+"",actual+"");
    }

    @Test(timeout = 250)
    public void test16() throws Exception{
        String input =  "2.2\n" +
                "68.2\n" +
                "91.2\n" +
                "90";

        String expected =   "Enter grade one:\n" +
                "Enter grade two:\n" +
                "Enter grade three:\n" +
                "Enter grade four:\n" +
                "\n" +
                "Your average is 62.90.\n" +
                "You have a(n) F.";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("GradeAverage"));
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
        String input =  "72.2\n" +
                "68.2\n" +
                "71.2\n" +
                "78.34";

        String expected =   "Enter grade one:\n" +
                "Enter grade two:\n" +
                "Enter grade three:\n" +
                "Enter grade four:\n" +
                "\n" +
                "Your average is 72.49.\n" +
                "You have a(n) D.";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("GradeAverage"));
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
        String input =  "81.2\n" +
                "78.2\n" +
                "71.2\n" +
                "77";

        String expected =   "Enter grade one:\n" +
                "Enter grade two:\n" +
                "Enter grade three:\n" +
                "Enter grade four:\n" +
                "\n" +
                "Your average is 76.90.\n" +
                "You have a(n) C.";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("GradeAverage"));
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
        String input =  "87.5\n" +
                "88.67\n" +
                "81.23\n" +
                "77.8";

        String expected =   "Enter grade one:\n" +
                "Enter grade two:\n" +
                "Enter grade three:\n" +
                "Enter grade four:\n" +
                "\n" +
                "Your average is 83.80.\n" +
                "You have a(n) B.";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("GradeAverage"));
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
        String input =  "98.7\n" +
                "86\n" +
                "93\n" +
                "86.3";

        String expected =   "Enter grade one:\n" +
                "Enter grade two:\n" +
                "Enter grade three:\n" +
                "Enter grade four:\n" +
                "\n" +
                "Your average is 91.00.\n" +
                "You have a(n) A.";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("GradeAverage"));
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
