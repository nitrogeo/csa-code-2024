
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Scanner;

public class OddFun_Tests {
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
        Class<?> classRef = Class.forName(generateClassName("OddFun"));
        Method method = classRef.getMethod("oddTotal", int.class);

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
        Assert.assertEquals("oddsTotal(1)",expected,actual);
    }

    @Test(timeout = 250)
    public void test2() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("OddFun"));
        Method method = classRef.getMethod("oddTotal", int.class);

        int actual;
        try
        {
            actual = (int)method.invoke(method, 3);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        int expected = 4;
        Assert.assertEquals("oddsTotal(3)",expected,actual);
    }

    @Test(timeout = 250)
    public void test3() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("OddFun"));
        Method method = classRef.getMethod("oddTotal", int.class);

        int actual;
        try
        {
            actual = (int)method.invoke(method, 16);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        int expected = 64;
        Assert.assertEquals("oddsTotal(16)",expected,actual);
    }

    @Test(timeout = 250)
    public void test4() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("OddFun"));
        Method method = classRef.getMethod("oddTotal", int.class);

        int actual;
        try
        {
            actual = (int)method.invoke(method, 900);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        int expected = 202500;
        Assert.assertEquals("oddsTotal(900)",expected,actual);
    }

    @Test(timeout = 250)
    public void test5() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("OddFun"));
        Method method = classRef.getMethod("oddTotal", int.class);

        int actual;
        try
        {
            actual = (int)method.invoke(method, 75);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        int expected = 1444;
        Assert.assertEquals("oddsTotal(75)",expected,actual);
    }

    @Test(timeout = 250)
    public void test6() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("OddFun"));
        Method method = classRef.getMethod("oddTotal", int.class);

        int actual;
        try
        {
            actual = (int)method.invoke(method, 9001);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        int expected = 20259001;
        Assert.assertEquals("oddsTotal(9001)",expected,actual);
    }

    @Test(timeout = 250)
    public void test7() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("OddFun"));
        Method method = classRef.getMethod("oddTotal", int.class);

        int actual;
        try
        {
            actual = (int)method.invoke(method, 12356);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        int expected = 38167684;
        Assert.assertEquals("oddsTotal(12356)",expected,actual);
    }

    @Test(timeout = 250)
    public void test8() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("OddFun"));
        Method method = classRef.getMethod("oddTotal", int.class);

        int actual;
        try
        {
            actual = (int)method.invoke(method, 43578);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        int expected = 474760521;
        Assert.assertEquals("oddsTotal(43578)",expected,actual);
    }

    @Test(timeout = 250)
    public void test9() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("OddFun"));
        Method method = classRef.getMethod("oddTotal", int.class);

        int actual;
        try
        {
            actual = (int)method.invoke(method, 77);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        int expected = 1521;
        Assert.assertEquals("oddsTotal(77)",expected,actual);
    }

    @Test(timeout = 250)
    public void test10() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("OddFun"));
        Method method = classRef.getMethod("oddTotal", int.class);

        int actual;
        try
        {
            actual = (int)method.invoke(method, 13);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        int expected = 49;
        Assert.assertEquals("oddsTotal(13)",expected,actual);
    }

}
