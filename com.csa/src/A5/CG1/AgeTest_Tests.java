package A5.CG1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AgeTest_Tests {
    public String generateClassName(String name)
    {
        if(getClass().toString().contains("."))
        {
            return getClass().toString().substring(6,getClass().toString().lastIndexOf(".")+1)+name;
        }
        return name;
    }

    @Before
    public void setup()
    {
    }



    @Test(timeout = 250)
    public void test1() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("AgeTest"));
        Method method = classRef.getMethod("canIDrive", int.class);

        String actual;
        try
        {
            actual = (String)method.invoke(method, 0);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        String expected = "You can drive in 16 year(s).";
        Assert.assertEquals("canIDrive(0)",expected,actual);
    }

    @Test(timeout = 250)
    public void test2() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("AgeTest"));
        Method method = classRef.getMethod("canIDrive", int.class);

        String actual;
        try
        {
            actual = (String)method.invoke(method, 5);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        String expected = "You can drive in 11 year(s).";
        Assert.assertEquals("canIDrive(5)",expected,actual);
    }

    @Test(timeout = 250)
    public void test3() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("AgeTest"));
        Method method = classRef.getMethod("canIDrive", int.class);


        String actual;
        try
        {
            actual = (String)method.invoke(method, 15);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        String expected = "You can drive in 1 year(s).";
        Assert.assertEquals("canIDrive(15)",expected,actual);
    }

    @Test(timeout = 250)
    public void test4() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("AgeTest"));
        Method method = classRef.getMethod("canIDrive", int.class);


        String actual;
        try
        {
            actual = (String)method.invoke(method, 7);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        String expected = "You can drive in 9 year(s).";
        Assert.assertEquals("canIDrive(7)",expected,actual);
    }

    @Test(timeout = 250)
    public void test5() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("AgeTest"));
        Method method = classRef.getMethod("canIDrive", int.class);


        String actual;
        try
        {
            actual = (String)method.invoke(method, 16);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        String expected = "You are old enough to drive.";
        Assert.assertEquals("canIDrive(16)",expected,actual);
    }

    @Test(timeout = 250)
    public void test6() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("AgeTest"));
        Method method = classRef.getMethod("canIDrive", int.class);


        String actual;
        try
        {
            actual = (String)method.invoke(method, 17);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        String expected = "You are old enough to drive.";
        Assert.assertEquals("canIDrive(17)",expected,actual);
    }

    @Test(timeout = 250)
    public void test7() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("AgeTest"));
        Method method = classRef.getMethod("canIDrive", int.class);


        String actual;
        try
        {
            actual = (String)method.invoke(method, 42);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        String expected = "You are old enough to drive.";
        Assert.assertEquals("canIDrive(42)",expected,actual);
    }

    @Test(timeout = 250)
    public void test8() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("AgeTest"));
        Method method = classRef.getMethod("canIDrive", int.class);


        String actual;
        try
        {
            actual = (String)method.invoke(method, 99);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        String expected = "You are old enough to drive.";
        Assert.assertEquals("canIDrive(99)",expected,actual);
    }

    @Test(timeout = 250)
    public void test9() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("AgeTest"));
        Method method = classRef.getMethod("canIDrive", int.class);


        String actual;
        try
        {
            actual = (String)method.invoke(method, 37);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        String expected = "You are old enough to drive.";
        Assert.assertEquals("canIDrive(37)",expected,actual);
    }

    @Test(timeout = 250)
    public void test10() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("AgeTest"));
        Method method = classRef.getMethod("canIDrive", int.class);


        String actual;
        try
        {
            actual = (String)method.invoke(method, 65);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        String expected = "You are old enough to drive.";
        Assert.assertEquals("canIDrive(65)",expected,actual);
    }

}