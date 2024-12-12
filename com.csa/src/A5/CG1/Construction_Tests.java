package A5.CG1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Construction_Tests {
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
        Class<?> classRef = Class.forName(generateClassName("Construction"));
        Method method = classRef.getMethod("canCross", int.class, int.class, int.class, int.class);

        boolean actual;
        try
        {
            actual = (boolean)method.invoke(method, 3,1,1,1);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        boolean expected = true;
        Assert.assertEquals("canCross(3,1,1,1)",expected,actual);
    }

    @Test(timeout = 250)
    public void test2() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Construction"));
        Method method = classRef.getMethod("canCross", int.class, int.class, int.class, int.class);

        boolean actual;
        try
        {
            actual = (boolean)method.invoke(method, 1000,50,70,800);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        boolean expected = true;
        Assert.assertEquals("canCross(1000,50,70,800)",expected,actual);
    }

    @Test(timeout = 250)
    public void test3() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Construction"));
        Method method = classRef.getMethod("canCross", int.class, int.class, int.class, int.class);

        boolean actual;
        try
        {
            actual = (boolean)method.invoke(method, 5,1,2,1);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        boolean expected = true;
        Assert.assertEquals("canCross(5,1,2,1)",expected,actual);
    }

    @Test(timeout = 250)
    public void test4() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Construction"));
        Method method = classRef.getMethod("canCross", int.class, int.class, int.class, int.class);

        boolean actual;
        try
        {
            actual = (boolean)method.invoke(method, 8000,3000,165,2500);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        boolean expected = true;
        Assert.assertEquals("canCross(8000,3000,165,2500)",expected,actual);
    }

    @Test(timeout = 250)
    public void test5() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Construction"));
        Method method = classRef.getMethod("canCross", int.class, int.class, int.class, int.class);

        boolean actual;
        try
        {
            actual = (boolean)method.invoke(method, 30000,4000,230,20000);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        boolean expected = true;
        Assert.assertEquals("canCross(30000,4000,230,20000)",expected,actual);
    }

    @Test(timeout = 250)
    public void test6() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Construction"));
        Method method = classRef.getMethod("canCross", int.class, int.class, int.class, int.class);

        boolean actual;
        try
        {
            actual = (boolean)method.invoke(method, 3,2,1,1);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        boolean expected = false;
        Assert.assertEquals("canCross(3,2,1,1)",expected,actual);
    }

    @Test(timeout = 250)
    public void test7() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Construction"));
        Method method = classRef.getMethod("canCross", int.class, int.class, int.class, int.class);

        boolean actual;
        try
        {
            actual = (boolean)method.invoke(method, 30000,20000,1,10000);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        boolean expected = false;
        Assert.assertEquals("canCross(30000,20000,1,10000)",expected,actual);
    }

    @Test(timeout = 250)
    public void test8() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Construction"));
        Method method = classRef.getMethod("canCross", int.class, int.class, int.class, int.class);

        boolean actual;
        try
        {
            actual = (boolean)method.invoke(method, 5,2,2,2);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        boolean expected = false;
        Assert.assertEquals("canCross(5,2,2,2)",expected,actual);
    }

    @Test(timeout = 250)
    public void test9() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Construction"));
        Method method = classRef.getMethod("canCross", int.class, int.class, int.class, int.class);

        boolean actual;
        try
        {
            actual = (boolean)method.invoke(method, 5,5,5,5);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        boolean expected = false;
        Assert.assertEquals("canCross(5,5,5,5)",expected,actual);
    }

    @Test(timeout = 250)
    public void test10() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Construction"));
        Method method = classRef.getMethod("canCross", int.class, int.class, int.class, int.class);

        boolean actual;
        try
        {
            actual = (boolean)method.invoke(method, 30000,20100,125,9999);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        boolean expected = false;
        Assert.assertEquals("canCross(30000,20100,125,9999)",expected,actual);
    }


}
