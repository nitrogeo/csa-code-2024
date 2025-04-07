package A13;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Scanner;

public class Factorial_Tests {
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
        try
        {
            Class<?> classRef = Class.forName(generateClassName("Factorial"));
            Method method = classRef.getMethod("factorial", long.class);

            long actual = (Long) method.invoke(method, 1);

            Assert.assertEquals(1,actual);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test2() throws Exception
    {
        try
        {

            Class<?> classRef = Class.forName(generateClassName("Factorial"));
            Method method = classRef.getMethod("factorial", long.class);

            long actual = (Long) method.invoke(method, 3);

            Assert.assertEquals(6,actual);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test3() throws Exception
    {
        try
        {

            Class<?> classRef = Class.forName(generateClassName("Factorial"));
            Method method = classRef.getMethod("factorial", long.class);

            long actual = (Long) method.invoke(method, 7);

            Assert.assertEquals(5040,actual);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test4() throws Exception
    {
        try
        {

            Class<?> classRef = Class.forName(generateClassName("Factorial"));
            Method method = classRef.getMethod("factorial", long.class);

            long actual = (Long) method.invoke(method, 31);

            Assert.assertEquals(Long.parseLong("4999213071378415616"),actual);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test5() throws Exception
    {
        try
        {

            Class<?> classRef = Class.forName(generateClassName("Factorial"));
            Method method = classRef.getMethod("factorial", long.class);

            long actual = (Long) method.invoke(method, 16);

            Assert.assertEquals(Long.parseLong("20922789888000"),actual);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test6() throws Exception
    {
        try
        {

            Class<?> classRef = Class.forName(generateClassName("Factorial"));
            Method method = classRef.getMethod("factorial", long.class);

            long actual = (Long) method.invoke(method, 14);

            Assert.assertEquals(Long.parseLong("87178291200"),actual);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test7() throws Exception
    {
        try
        {

            Class<?> classRef = Class.forName(generateClassName("Factorial"));
            Method method = classRef.getMethod("factorial", long.class);

            long actual = (Long) method.invoke(method, 11);

            Assert.assertEquals(39916800,actual);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test8() throws Exception
    {
        try
        {

            Class<?> classRef = Class.forName(generateClassName("Factorial"));
            Method method = classRef.getMethod("factorial", long.class);

            long actual = (Long) method.invoke(method, 2);

            Assert.assertEquals(2,actual);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test9() throws Exception
    {
        try
        {

            Class<?> classRef = Class.forName(generateClassName("Factorial"));
            Method method = classRef.getMethod("factorial", long.class);

            long actual = (Long) method.invoke(method, 19);

            Assert.assertEquals(Long.parseLong("121645100408832000"),actual);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test10() throws Exception
    {
        try
        {

            Class<?> classRef = Class.forName(generateClassName("Factorial"));
            Method method = classRef.getMethod("factorial", long.class);

            long actual = (Long) method.invoke(method, 8);

            Assert.assertEquals(40320,actual);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }
}
