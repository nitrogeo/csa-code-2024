package A5.CG2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Alpha_Tests {
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
        Class<?> classRef = Class.forName(generateClassName("Alpha"));
        Method method = classRef.getMethod("isLetter", char.class);

        boolean actual;
        try
        {
            actual = (boolean)method.invoke(method, 'A');
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        boolean expected = true;
        Assert.assertEquals("isLetter('A')",expected,actual);
    }

    @Test(timeout = 250)
    public void test2() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Alpha"));
        Method method = classRef.getMethod("isLetter", char.class);

        boolean actual;
        try
        {
            actual = (boolean)method.invoke(method, 'c');
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        boolean expected = true;
        Assert.assertEquals("isLetter('c')",expected,actual);
    }

    @Test(timeout = 250)
    public void test3() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Alpha"));
        Method method = classRef.getMethod("isLetter", char.class);

        boolean actual;
        try
        {
            actual = (boolean)method.invoke(method, 'z');
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        boolean expected = true;
        Assert.assertEquals("isLetter('z')",expected,actual);
    }

    @Test(timeout = 250)
    public void test4() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Alpha"));
        Method method = classRef.getMethod("isLetter", char.class);

        boolean actual;
        try
        {
            actual = (boolean)method.invoke(method, 'c');
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        boolean expected = true;
        Assert.assertEquals("isLetter('c')",expected,actual);
    }

    @Test(timeout = 250)
    public void test5() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Alpha"));
        Method method = classRef.getMethod("isLetter", char.class);

        boolean actual;
        try
        {
            actual = (boolean)method.invoke(method, 'a');
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        boolean expected = true;
        Assert.assertEquals("isLetter('a')",expected,actual);
    }

    @Test(timeout = 250)
    public void test6() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Alpha"));
        Method method = classRef.getMethod("isLetter", char.class);

        boolean actual;
        try
        {
            actual = (boolean)method.invoke(method, 'z');
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        boolean expected = true;
        Assert.assertEquals("isLetter('z')",expected,actual);
    }

    @Test(timeout = 250)
    public void test7() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Alpha"));
        Method method = classRef.getMethod("isLetter", char.class);

        boolean actual;
        try
        {
            actual = (boolean)method.invoke(method, 'M');
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        boolean expected = true;
        Assert.assertEquals("isLetter('M')",expected,actual);
    }

    @Test(timeout = 250)
    public void test8() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Alpha"));
        Method method = classRef.getMethod("isLetter", char.class);

        boolean actual;
        try
        {
            actual = (boolean)method.invoke(method, '1');
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        boolean expected = false;
        Assert.assertEquals("isLetter('1')",expected,actual);
    }

    @Test(timeout = 250)
    public void test9() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Alpha"));
        Method method = classRef.getMethod("isLetter", char.class);

        boolean actual;
        try
        {
            actual = (boolean)method.invoke(method, '~');
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        boolean expected = false;
        Assert.assertEquals("isLetter('~')",expected,actual);
    }

    @Test(timeout = 250)
    public void test10() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Alpha"));
        Method method = classRef.getMethod("isLetter", char.class);

        boolean actual;
        try
        {
            actual = (boolean)method.invoke(method, ']');
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        boolean expected = false;
        Assert.assertEquals("isLetter(']')",expected,actual);
    }

}
