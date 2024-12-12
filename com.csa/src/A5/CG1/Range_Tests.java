package A5.CG1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Range_Tests {
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
        Class<?> classRef = Class.forName(generateClassName("Range"));
        Method method = classRef.getMethod("inRange", int.class, int.class, int.class);

        boolean actual;
        try
        {
            actual =(boolean)method.invoke(method, 5,3,2);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        boolean expected = true;
        Assert.assertEquals("inRange(5,3,2)",expected,actual);
    }

    @Test(timeout = 250)
    public void test2() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Range"));
        Method method = classRef.getMethod("inRange", int.class, int.class, int.class);

        boolean actual;
        try
        {
            actual =(boolean)method.invoke(method, 1,1,0);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        boolean expected = true;
        Assert.assertEquals("inRange(1,1,0)",expected,actual);
    }

    @Test(timeout = 250)
    public void test3() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Range"));
        Method method = classRef.getMethod("inRange", int.class, int.class, int.class);

        boolean actual;
        try
        {
            actual =(boolean)method.invoke(method, 100,50,60);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        boolean expected = true;
        Assert.assertEquals("inRange(100,50,60)",expected,actual);
    }

    @Test(timeout = 250)
    public void test4() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Range"));
        Method method = classRef.getMethod("inRange", int.class, int.class, int.class);

        boolean actual;
        try
        {
            actual =(boolean)method.invoke(method, 50,100,50);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        boolean expected = true;
        Assert.assertEquals("inRange(50,100,50)",expected,actual);
    }

    @Test(timeout = 250)
    public void test5() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Range"));
        Method method = classRef.getMethod("inRange", int.class, int.class, int.class);

        boolean actual;
        try
        {
            actual =(boolean)method.invoke(method, 5,10,12);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        boolean expected = true;
        Assert.assertEquals("inRange(5,10,12)",expected,actual);
    }

    @Test(timeout = 250)
    public void test6() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Range"));
        Method method = classRef.getMethod("inRange", int.class, int.class, int.class);

        boolean actual;
        try
        {
            actual =(boolean)method.invoke(method, 5,3,1);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        boolean expected = false;
        Assert.assertEquals("inRange(5,3,1)",expected,actual);
    }

    @Test(timeout = 250)
    public void test7() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Range"));
        Method method = classRef.getMethod("inRange", int.class, int.class, int.class);

        boolean actual;
        try
        {
            actual =(boolean)method.invoke(method, 1,5,3);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        boolean expected = false;
        Assert.assertEquals("inRange(1,5,3)",expected,actual);
    }

    @Test(timeout = 250)
    public void test8() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Range"));
        Method method = classRef.getMethod("inRange", int.class, int.class, int.class);

        boolean actual;
        try
        {
            actual =(boolean)method.invoke(method, 1,10,8);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        boolean expected = false;
        Assert.assertEquals("inRange(1,10,8)",expected,actual);
    }

    @Test(timeout = 250)
    public void test9() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Range"));
        Method method = classRef.getMethod("inRange", int.class, int.class, int.class);

        boolean actual;
        try
        {
            actual =(boolean)method.invoke(method, 18,30,4);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        boolean expected = false;
        Assert.assertEquals("inRange(18,30,4)",expected,actual);
    }

    @Test(timeout = 250)
    public void test10() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Range"));
        Method method = classRef.getMethod("inRange", int.class, int.class, int.class);

        boolean actual;
        try
        {
            actual =(boolean)method.invoke(method, 33,66,31);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        boolean expected = false;
        Assert.assertEquals("inRange(33,66,31)",expected,actual);
    }

}


