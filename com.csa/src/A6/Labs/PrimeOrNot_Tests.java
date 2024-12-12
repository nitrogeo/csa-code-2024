package A6.Labs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;

public class PrimeOrNot_Tests {
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
                "1\n" +
                "47";

        String expected =   "Enter a number (larger than 1): \n" +
                "Enter a number (larger than 1): \n" +
                "Enter a number (larger than 1): \n" +
                "\n" +
                "47 is a prime number.";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("PrimeOrNot"));
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
        String input =  "-1\n" +
                "55";

        String expected =   "Enter a number (larger than 1): \n" +
                "Enter a number (larger than 1): \n" +
                "\n" +
                "55 is not a prime number.";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("PrimeOrNot"));
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
        String input =  "77";

        String expected =   "Enter a number (larger than 1): \n" +
                "\n" +
                "77 is not a prime number.";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("PrimeOrNot"));
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
        String input =  "103";

        String expected =   "Enter a number (larger than 1): \n" +
                "\n" +
                "103 is a prime number.";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("PrimeOrNot"));
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
        String input =  "105";

        String expected =   "Enter a number (larger than 1): \n" +
                "\n" +
                "105 is not a prime number.";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("PrimeOrNot"));
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
        Class<?> classRef = Class.forName(generateClassName("PrimeOrNot"));
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
        Class<?> classRef = Class.forName(generateClassName("PrimeOrNot"));
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
        Class<?> classRef = Class.forName(generateClassName("PrimeOrNot"));
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
        Class<?> classRef = Class.forName(generateClassName("PrimeOrNot"));
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
        Class<?> classRef = Class.forName(generateClassName("PrimeOrNot"));
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
        Class<?> classRef = Class.forName(generateClassName("PrimeOrNot"));
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
        Class<?> classRef = Class.forName(generateClassName("PrimeOrNot"));
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
        Class<?> classRef = Class.forName(generateClassName("PrimeOrNot"));
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
        Class<?> classRef = Class.forName(generateClassName("PrimeOrNot"));
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
        Class<?> classRef = Class.forName(generateClassName("PrimeOrNot"));
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

    @Test(timeout = 250)
    public void test16() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("PrimeOrNot"));
        Method method = classRef.getMethod("isPrime", int.class);

        boolean actual;
        try
        {
            actual = (boolean)method.invoke(method, 44);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        boolean expected = false;
        Assert.assertEquals("isPrime(44)",expected,actual);
    }

    @Test(timeout = 250)
    public void test17() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("PrimeOrNot"));
        Method method = classRef.getMethod("isPrime", int.class);

        boolean actual;
        try
        {
            actual = (boolean)method.invoke(method, 13);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        boolean expected = true;
        Assert.assertEquals("isPrime(13)",expected,actual);
    }

    @Test(timeout = 250)
    public void test18() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("PrimeOrNot"));
        Method method = classRef.getMethod("isPrime", int.class);

        boolean actual;
        try
        {
            actual = (boolean)method.invoke(method, 11);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        boolean expected = true;
        Assert.assertEquals("isPrime(11)",expected,actual);
    }

    @Test(timeout = 250)
    public void test19() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("PrimeOrNot"));
        Method method = classRef.getMethod("isPrime", int.class);

        boolean actual;
        try
        {
            actual = (boolean)method.invoke(method, 10);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        boolean expected = false;
        Assert.assertEquals("isPrime(10)",expected,actual);
    }

    @Test(timeout = 250)
    public void test20() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("PrimeOrNot"));
        Method method = classRef.getMethod("isPrime", int.class);

        boolean actual;
        try
        {
            actual = (boolean)method.invoke(method, 18);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        boolean expected = false;
        Assert.assertEquals("isPrime(18)",expected,actual);
    }

    @Test(timeout = 250)
    public void test21() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("PrimeOrNot"));
        Method method = classRef.getMethod("isPrime", int.class);

        boolean actual;
        try
        {
            actual = (boolean)method.invoke(method, 23);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        boolean expected = true;
        Assert.assertEquals("isPrime(23)",expected,actual);
    }

    @Test(timeout = 250)
    public void test22() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("PrimeOrNot"));
        Method method = classRef.getMethod("isPrime", int.class);

        boolean actual;
        try
        {
            actual = (boolean)method.invoke(method, 197);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        boolean expected = true;
        Assert.assertEquals("isPrime(197)",expected,actual);
    }

    @Test(timeout = 250)
    public void test23() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("PrimeOrNot"));
        Method method = classRef.getMethod("isPrime", int.class);

        boolean actual;
        try
        {
            actual = (boolean)method.invoke(method, 198);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        boolean expected = false;
        Assert.assertEquals("isPrime(198)",expected,actual);
    }

    @Test(timeout = 250)
    public void test24() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("PrimeOrNot"));
        Method method = classRef.getMethod("isPrime", int.class);

        boolean actual;
        try
        {
            actual = (boolean)method.invoke(method, 203);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        boolean expected = false;
        Assert.assertEquals("isPrime(203)",expected,actual);
    }

    @Test(timeout = 250)
    public void test25() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("PrimeOrNot"));
        Method method = classRef.getMethod("isPrime", int.class);

        boolean actual;
        try
        {
            actual = (boolean)method.invoke(method, 133);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        boolean expected = false;
        Assert.assertEquals("isPrime(133)",expected,actual);
    }

}
