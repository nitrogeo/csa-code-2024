
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Scanner;

public class Merge_Tests {
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
        Class<?> classRef = Class.forName(generateClassName("Merge"));
        Method method = classRef.getMethod("digitsTotal", int.class);

        int actual;
        try
        {
            actual = (int)method.invoke(method, 4);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        int expected = 4;
        Assert.assertEquals("digitsTotal(4)",expected,actual);
    }

    @Test(timeout = 250)
    public void test2() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Merge"));
        Method method = classRef.getMethod("digitsTotal", int.class);

        int actual;
        try
        {
            actual = (int)method.invoke(method, 1);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        int expected = 1;
        Assert.assertEquals("digitsTotal(1)",expected,actual);
    }

    @Test(timeout = 250)
    public void test3() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Merge"));
        Method method = classRef.getMethod("digitsTotal", int.class);

        int actual;
        try
        {
            actual = (int)method.invoke(method, 0);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        int expected = 0;
        Assert.assertEquals("digitsTotal(0)",expected,actual);
    }

    @Test(timeout = 250)
    public void test4() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Merge"));
        Method method = classRef.getMethod("digitsTotal", int.class);

        int actual;
        try
        {
            actual = (int)method.invoke(method, 123);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        int expected = 6;
        Assert.assertEquals("digitsTotal(123)",expected,actual);
    }

    @Test(timeout = 250)
    public void test5() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Merge"));
        Method method = classRef.getMethod("digitsTotal", int.class);

        int actual;
        try
        {
            actual = (int)method.invoke(method, 87245);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        int expected = 26;
        Assert.assertEquals("digitsTotal(87245)",expected,actual);
    }

    @Test(timeout = 250)
    public void test6() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Merge"));
        Method method = classRef.getMethod("digitsTotal", int.class);

        int actual;
        try
        {
            actual = (int)method.invoke(method, 4578);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        int expected = 24;
        Assert.assertEquals("digitsTotal(4578)",expected,actual);
    }

    @Test(timeout = 250)
    public void test7() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Merge"));
        Method method = classRef.getMethod("digitsTotal", int.class);

        int actual;
        try
        {
            actual = (int)method.invoke(method, 111);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        int expected = 3;
        Assert.assertEquals("digitsTotal(1111)",expected,actual);
    }

    @Test(timeout = 250)
    public void test8() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Merge"));
        Method method = classRef.getMethod("digitsTotal", int.class);

        int actual;
        try
        {
            actual = (int)method.invoke(method, 569865);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        int expected = 39;
        Assert.assertEquals("digitsTotal(569865)",expected,actual);
    }


    @Test(timeout = 250)
    public void test9() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Merge"));
        Method method = classRef.getMethod("digitsTotal", int.class);

        int actual;
        try
        {
            actual = (int)method.invoke(method, 4532);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        int expected = 14;
        Assert.assertEquals("digitsTotal(4532)",expected,actual);
    }

    @Test(timeout = 250)
    public void test10() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Merge"));
        Method method = classRef.getMethod("digitsTotal", int.class);

        int actual;
        try
        {
            actual = (int)method.invoke(method, 99883);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        int expected = 37;
        Assert.assertEquals("digitsTotal(99883)",expected,actual);
    }
}
