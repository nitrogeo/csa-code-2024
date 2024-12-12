package A5.CG2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Planner_Tests {
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
        Class<?> classRef = Class.forName(generateClassName("Planner"));
        Method method = classRef.getMethod("canParty", int.class, int.class, int.class);

        boolean actual;
        try
        {
            actual = (boolean)method.invoke(method, 0,0,0);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        boolean expected = true;
        Assert.assertEquals("canParty(0,0,0)",expected,actual);
    }

    @Test(timeout = 250)
    public void test2() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Planner"));
        Method method = classRef.getMethod("canParty", int.class, int.class, int.class);

        boolean actual;
        try
        {
            actual = (boolean)method.invoke(method, 18,17,35);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        boolean expected = true;
        Assert.assertEquals("canParty(18,17,35)",expected,actual);
    }

    @Test(timeout = 250)
    public void test3() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Planner"));
        Method method = classRef.getMethod("canParty", int.class, int.class, int.class);

        boolean actual;
        try
        {
            actual = (boolean)method.invoke(method, 2,2,4);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        boolean expected = true;
        Assert.assertEquals("canParty(2,2,4)",expected,actual);
    }

    @Test(timeout = 250)
    public void test4() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Planner"));
        Method method = classRef.getMethod("canParty", int.class, int.class, int.class);

        boolean actual;
        try
        {
            actual = (boolean)method.invoke(method, 165,122,300);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        boolean expected = true;
        Assert.assertEquals("canParty(165,122,300)",expected,actual);
    }

    @Test(timeout = 250)
    public void test5() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Planner"));
        Method method = classRef.getMethod("canParty", int.class, int.class, int.class);

        boolean actual;
        try
        {
            actual = (boolean)method.invoke(method, 543,1123,2000);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        boolean expected = true;
        Assert.assertEquals("canParty(543,1123,2000)",expected,actual);
    }

    @Test(timeout = 250)
    public void test6() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Planner"));
        Method method = classRef.getMethod("canParty", int.class, int.class, int.class);

        boolean actual;
        try
        {
            actual = (boolean)method.invoke(method, 1,1,0);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        boolean expected = false;
        Assert.assertEquals("canParty(1,1,0)",expected,actual);
    }

    @Test(timeout = 250)
    public void test7() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Planner"));
        Method method = classRef.getMethod("canParty", int.class, int.class, int.class);

        boolean actual;
        try
        {
            actual = (boolean)method.invoke(method, 2,1,2);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        boolean expected = false;
        Assert.assertEquals("canParty(2,1,2)",expected,actual);
    }

    @Test(timeout = 250)
    public void test8() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Planner"));
        Method method = classRef.getMethod("canParty", int.class, int.class, int.class);

        boolean actual;
        try
        {
            actual = (boolean)method.invoke(method, 100,92,191);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        boolean expected = false;
        Assert.assertEquals("canParty(100,92,191)",expected,actual);
    }

    @Test(timeout = 250)
    public void test9() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Planner"));
        Method method = classRef.getMethod("canParty", int.class, int.class, int.class);

        boolean actual;
        try
        {
            actual = (boolean)method.invoke(method, 18,17,20);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        boolean expected = false;
        Assert.assertEquals("canParty(18,17,20)",expected,actual);
    }

    @Test(timeout = 250)
    public void test10() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Planner"));
        Method method = classRef.getMethod("canParty", int.class, int.class, int.class);

        boolean actual;
        try
        {
            actual = (boolean)method.invoke(method, 11,17,15);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        boolean expected = false;
        Assert.assertEquals("canParty(11,17,15)",expected,actual);
    }
}
