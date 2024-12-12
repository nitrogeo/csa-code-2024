
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Scanner;

public class MathSum_Tests {
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
        Class<?> classRef = Class.forName(generateClassName("MathSum"));
        Method method = classRef.getMethod("summation", int.class, int.class);

        int actual;
        try
        {
            actual = (int)method.invoke(method, 3,3);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        int expected = 3;
        Assert.assertEquals("summation(3,3)",expected,actual);
    }

    @Test(timeout = 250)
    public void test2() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("MathSum"));
        Method method = classRef.getMethod("summation", int.class, int.class);

        int actual;
        try
        {
            actual = (int)method.invoke(method, 3,8);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        int expected = 33;
        Assert.assertEquals("summation(3,8)",expected,actual);
    }

    @Test(timeout = 250)
    public void test3() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("MathSum"));
        Method method = classRef.getMethod("summation", int.class, int.class);

        int actual;
        try
        {
            actual = (int)method.invoke(method, 1,10);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        int expected = 55;
        Assert.assertEquals("summation(1,10)",expected,actual);
    }

    @Test(timeout = 250)
    public void test4() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("MathSum"));
        Method method = classRef.getMethod("summation", int.class, int.class);

        int actual;
        try
        {
            actual = (int)method.invoke(method, 215,267);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        int expected = 12773;
        Assert.assertEquals("summation(215,267)",expected,actual);
    }

    @Test(timeout = 250)
    public void test5() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("MathSum"));
        Method method = classRef.getMethod("summation", int.class, int.class);

        int actual;
        try
        {
            actual = (int)method.invoke(method, 5,6);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        int expected = 11;
        Assert.assertEquals("summation(3,3)",expected,actual);
    }

    @Test(timeout = 250)
    public void test6() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("MathSum"));
        Method method = classRef.getMethod("summation", int.class, int.class);

        int actual;
        try
        {
            actual = (int)method.invoke(method, 87,99);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        int expected = 1209;
        Assert.assertEquals("summation(87,99)",expected,actual);
    }

    @Test(timeout = 250)
    public void test7() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("MathSum"));
        Method method = classRef.getMethod("summation", int.class, int.class);

        int actual;
        try
        {
            actual = (int)method.invoke(method, 9,17);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        int expected = 117;
        Assert.assertEquals("summation(9,17)",expected,actual);
    }

    @Test(timeout = 250)
    public void test8() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("MathSum"));
        Method method = classRef.getMethod("summation", int.class, int.class);

        int actual;
        try
        {
            actual = (int)method.invoke(method, 44,55);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        int expected = 594;
        Assert.assertEquals("summation(44,55)",expected,actual);
    }

    @Test(timeout = 250)
    public void test9() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("MathSum"));
        Method method = classRef.getMethod("summation", int.class, int.class);

        int actual;
        try
        {
            actual = (int)method.invoke(method, 123,500);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        int expected = 117747;
        Assert.assertEquals("summation(123,500)",expected,actual);
    }

    @Test(timeout = 250)
    public void test10() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("MathSum"));
        Method method = classRef.getMethod("summation", int.class, int.class);

        int actual;
        try
        {
            actual = (int)method.invoke(method, 124,222);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        int expected = 17127;
        Assert.assertEquals("summation(124,222)",expected,actual);
    }


}

