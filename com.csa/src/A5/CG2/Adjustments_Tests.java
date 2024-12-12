package A5.CG2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Adjustments_Tests {
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
        Class<?> classRef = Class.forName(generateClassName("Adjustments"));
        Method method = classRef.getMethod("roundedSum", int.class, int.class, int.class);

        int actual;
        try
        {
            actual = (int)method.invoke(method, 5,5,0);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        int expected = 10;
        Assert.assertEquals("roundedSum(5,5,0)",expected,actual);
    }

    @Test(timeout = 250)
    public void test2() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Adjustments"));
        Method method = classRef.getMethod("roundedSum", int.class, int.class, int.class);

        int actual;
        try
        {
            actual = (int)method.invoke(method, 5,6,0);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        int expected = 10;
        Assert.assertEquals("roundedSum(5,6,0)",expected,actual);
    }

    @Test(timeout = 250)
    public void test3() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Adjustments"));
        Method method = classRef.getMethod("roundedSum", int.class, int.class, int.class);

        int actual;
        try
        {
            actual = (int)method.invoke(method, 5,5,5);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        int expected = 20;
        Assert.assertEquals("roundedSum(5,5,5)",expected,actual);
    }

    @Test(timeout = 250)
    public void test4() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Adjustments"));
        Method method = classRef.getMethod("roundedSum", int.class, int.class, int.class);

        int actual;
        try
        {
            actual = (int)method.invoke(method, 12,44,38);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        int expected = 90;
        Assert.assertEquals("roundedSum(12,44,38)",expected,actual);
    }

    @Test(timeout = 250)
    public void test5() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Adjustments"));
        Method method = classRef.getMethod("roundedSum", int.class, int.class, int.class);

        int actual;
        try
        {
            actual = (int)method.invoke(method, 10,20,30);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        int expected = 60;
        Assert.assertEquals("roundedSum(10,20,30)",expected,actual);
    }

    @Test(timeout = 250)
    public void test6() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Adjustments"));
        Method method = classRef.getMethod("roundedSum", int.class, int.class, int.class);

        int actual;
        try
        {
            actual = (int)method.invoke(method, 11,12,13);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        int expected = 40;
        Assert.assertEquals("roundedSum(11,12,13)",expected,actual);
    }

    @Test(timeout = 250)
    public void test7() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Adjustments"));
        Method method = classRef.getMethod("roundedSum", int.class, int.class, int.class);

        int actual;
        try
        {
            actual = (int)method.invoke(method, 57,98,77);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        int expected = 230;
        Assert.assertEquals("roundedSum(57,98,77)",expected,actual);
    }

    @Test(timeout = 250)
    public void test8() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Adjustments"));
        Method method = classRef.getMethod("roundedSum", int.class, int.class, int.class);

        int actual;
        try
        {
            actual = (int)method.invoke(method, 41,31,135);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        int expected = 210;
        Assert.assertEquals("roundedSum(41,31,135)",expected,actual);
    }

    @Test(timeout = 250)
    public void test9() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Adjustments"));
        Method method = classRef.getMethod("roundedSum", int.class, int.class, int.class);

        int actual;
        try
        {
            actual = (int)method.invoke(method, 55,55,67);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        int expected = 180;
        Assert.assertEquals("roundedSum(55,55,67)",expected,actual);
    }

    @Test(timeout = 250)
    public void test10() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Adjustments"));
        Method method = classRef.getMethod("roundedSum", int.class, int.class, int.class);

        int actual;
        try
        {
            actual = (int)method.invoke(method, 51,52,53);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        int expected = 160;
        Assert.assertEquals("roundedSum(51,52,53)",expected,actual);
    }
}
