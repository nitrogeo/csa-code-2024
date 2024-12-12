package A5.CG2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MiddleValue_Tests {
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
        Class<?> classRef = Class.forName(generateClassName("MiddleValue"));
        Method method = classRef.getMethod("middleValue", int.class, int.class, int.class);

        int actual;
        try
        {
            actual = (int)method.invoke(method, 18,21,31);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        int expected = 21;
        Assert.assertEquals("middleValue(18,21,31)", expected,actual);
    }

    @Test(timeout = 250)
    public void test2() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("MiddleValue"));
        Method method = classRef.getMethod("middleValue", int.class, int.class, int.class);

        int actual;
        try
        {
            actual = (int)method.invoke(method, 80,70,90);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        int expected = 80;
        Assert.assertEquals("middleValue(80,70,90)",expected,actual);
    }

    @Test(timeout = 250)
    public void test3() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("MiddleValue"));
        Method method = classRef.getMethod("middleValue", int.class, int.class, int.class);

        int actual;
        try
        {
            actual = (int)method.invoke(method, 10,7,8);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        int expected = 8;
        Assert.assertEquals("middleValue(10,7,8)",expected,actual);
    }

    @Test(timeout = 250)
    public void test4() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("MiddleValue"));
        Method method = classRef.getMethod("middleValue", int.class, int.class, int.class);

        int actual;
        try
        {
            actual = (int)method.invoke(method, 4,4,5);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        int expected = -1;
        Assert.assertEquals("middleValue(4,4,5)",expected,actual);
    }

    @Test(timeout = 250)
    public void test5() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("MiddleValue"));
        Method method = classRef.getMethod("middleValue", int.class, int.class, int.class);

        int actual;
        try
        {
            actual = (int)method.invoke(method, 5,3,3);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        int expected = -1;
        Assert.assertEquals("middleValue(5,3,3)",expected,actual);
    }

    @Test(timeout = 250)
    public void test6() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("MiddleValue"));
        Method method = classRef.getMethod("middleValue", int.class, int.class, int.class);

        int actual;
        try
        {
            actual = (int)method.invoke(method, 55,75,43);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        int expected = 55;
        Assert.assertEquals("middleValue(55,75,43)",expected,actual);
    }

    @Test(timeout = 250)
    public void test7() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("MiddleValue"));
        Method method = classRef.getMethod("middleValue", int.class, int.class, int.class);

        int actual;
        try
        {
            actual = (int)method.invoke(method, 234,1,350);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        int expected = 234;
        Assert.assertEquals("middleValue(234,1,350)",expected,actual);
    }

    @Test(timeout = 250)
    public void test8() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("MiddleValue"));
        Method method = classRef.getMethod("middleValue", int.class, int.class, int.class);

        int actual;
        try
        {
            actual = (int)method.invoke(method, 234,543,754);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        int expected = 543;
        Assert.assertEquals("middleValue(234,543,754)",expected,actual);
    }

    @Test(timeout = 250)
    public void test9() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("MiddleValue"));
        Method method = classRef.getMethod("middleValue", int.class, int.class, int.class);

        int actual;
        try
        {
            actual = (int)method.invoke(method, 44,2,133);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        int expected = 44;
        Assert.assertEquals("middleValue(44,2,133)",expected,actual);
    }

    @Test(timeout = 250)
    public void test10() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("MiddleValue"));
        Method method = classRef.getMethod("middleValue", int.class, int.class, int.class);

        int actual;
        try
        {
            actual = (int)method.invoke(method, 234,765,7765);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        int expected = 765;
        Assert.assertEquals("middleValue(234,765,7765)",expected,actual);
    }
}
