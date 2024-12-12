package A5.CG1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Formulas_Tests {
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
        Class<?> classRef = Class.forName(generateClassName("Formulas"));
        Method method = classRef.getMethod("divisibleBy", int.class, int.class);

        boolean actual;
        try
        {
            actual = (boolean)method.invoke(method, 3,3);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        boolean expected = true;
        Assert.assertEquals("divisibleBy(3,3)",expected,actual);
    }

    @Test(timeout = 250)
    public void test2() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Formulas"));
        Method method = classRef.getMethod("divisibleBy", int.class, int.class);

        boolean actual;
        try
        {
            actual = (boolean)method.invoke(method, 8,2);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        boolean expected = true;
        Assert.assertEquals("divisibleBy(8,2)",expected,actual);
    }

    @Test(timeout = 250)
    public void test3() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Formulas"));
        Method method = classRef.getMethod("divisibleBy", int.class, int.class);

        boolean actual;
        try
        {
            actual = (boolean)method.invoke(method, 30,10);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        boolean expected = true;
        Assert.assertEquals("divisibleBy(30,10)",expected,actual);
    }

    @Test(timeout = 250)
    public void test4() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Formulas"));
        Method method = classRef.getMethod("divisibleBy", int.class, int.class);

        boolean actual;
        try
        {
            actual = (boolean)method.invoke(method, 77,11);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        boolean expected = true;
        Assert.assertEquals("divisibleBy(77,11)",expected,actual);
    }

    @Test(timeout = 250)
    public void test5() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Formulas"));
        Method method = classRef.getMethod("divisibleBy", int.class, int.class);

        boolean actual;
        try
        {
            actual = (boolean)method.invoke(method, 100,25);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        boolean expected = true;
        Assert.assertEquals("divisibleBy(100,25)",expected,actual);
    }

    @Test(timeout = 250)
    public void test6() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Formulas"));
        Method method = classRef.getMethod("divisibleBy", int.class, int.class);

        boolean actual;
        try
        {
            actual = (boolean)method.invoke(method, 3,2);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        boolean expected = false;
        Assert.assertEquals("divisibleBy(3,2)",expected,actual);
    }

    @Test(timeout = 250)
    public void test7() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Formulas"));
        Method method = classRef.getMethod("divisibleBy", int.class, int.class);

        boolean actual;
        try
        {
            actual = (boolean)method.invoke(method, 7,3);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        boolean expected = false;
        Assert.assertEquals("divisibleBy(7,3)",expected,actual);
    }

    @Test(timeout = 250)
    public void test8() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Formulas"));
        Method method = classRef.getMethod("divisibleBy", int.class, int.class);

        boolean actual;
        try
        {
            actual = (boolean)method.invoke(method, 30,7);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        boolean expected = false;
        Assert.assertEquals("divisibleBy(30,7)",expected,actual);
    }

    @Test(timeout = 250)
    public void test9() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Formulas"));
        Method method = classRef.getMethod("divisibleBy", int.class, int.class);

        boolean actual;
        try
        {
            actual = (boolean)method.invoke(method, 78,12);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        boolean expected = false;
        Assert.assertEquals("divisibleBy(78,12)",expected,actual);
    }

    @Test(timeout = 250)
    public void test10() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Formulas"));
        Method method = classRef.getMethod("divisibleBy", int.class, int.class);

        boolean actual;
        try
        {
            actual = (boolean)method.invoke(method, 137,2);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        boolean expected = false;
        Assert.assertEquals("divisibleBy(137,2)",expected,actual);
    }

}
