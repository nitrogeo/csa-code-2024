package A4.CG1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Scanner;

public class Rectangle_Tests {
    public String generateClassName(String name)
    {
        if(getClass().toString().contains("."))
        {
            return getClass().toString().substring(6,getClass().toString().lastIndexOf(".")+1)+name;
        }
        return name;
    }

    public ArrayList<String> allowedImports = new ArrayList<>();

    @Before
    public void setup()
    {

    }

    @Test(timeout = 2000)
    public void checkImports() throws Exception{
        String className = "Rectangle";
        String fileName = "src/"+generateClassName(className).replaceAll("\\.","/")+".java";
        boolean allowedOnly = true;
        ArrayList<String> invalidImport = new ArrayList<>();
        try
        {

            File file = new File(fileName);
            Scanner fromFile = new Scanner(file);
            while(fromFile.hasNextLine())
            {
                String line = fromFile.nextLine().trim();
                if(line.contains("import"))
                {
                    boolean good = false;
                    for(String allowed: allowedImports)
                    {
                        if(line.matches("\\s*import\\s+"+allowed+"\\s*;\s*(//\\.*)?"))
                            good=true;
                    }
                    if(!good)
                    {
                        allowedOnly=false;
                        invalidImport.add(line);
                    }
                }

            }
        }
        catch(Exception e)
        {
            Assert.assertTrue("Missing File: "+className+".java",false);
            allowedOnly = false;
        }

        Assert.assertTrue("Invalid imports: "+invalidImport,allowedOnly);
    }

    @Test(timeout = 2000)
    public void test1() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Rectangle"));
        Method method = classRef.getMethod("area", int.class,int.class);


        int actual;
        try
        {
            actual = (int)method.invoke(method, 0,0);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        int expected = 0;
        Assert.assertEquals("area(0,0)",expected,actual);
    }

    @Test(timeout = 2000)
    public void test2() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Rectangle"));
        Method method = classRef.getMethod("area", int.class,int.class);


        int actual;
        try
        {
            actual = (int)method.invoke(method, 1,1);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        int expected = 1;
        Assert.assertEquals("area(1,1)",expected,actual);
    }
    @Test(timeout = 2000)
    public void test3() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Rectangle"));
        Method method = classRef.getMethod("area", int.class,int.class);


        int actual;
        try
        {
            actual = (int)method.invoke(method, 2,3);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        int expected = 6;
        Assert.assertEquals("area(2,3)",expected,actual);
    }

    @Test(timeout = 2000)
    public void test4() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Rectangle"));
        Method method = classRef.getMethod("area", int.class,int.class);


        int actual;
        try
        {
            actual = (int)method.invoke(method, 15,45);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        int expected =675;
        Assert.assertEquals("area(15,45)",expected,actual);
    }

    @Test(timeout = 2000)
    public void test5() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Rectangle"));
        Method method = classRef.getMethod("area", int.class,int.class);


        int actual;
        try
        {
            actual = (int)method.invoke(method, 73,51);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        int expected = 3723;
        Assert.assertEquals("area(73,51)",expected,actual);
    }

    @Test(timeout = 2000)
    public void test6() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Rectangle"));
        Method method = classRef.getMethod("perimeter", int.class,int.class);


        int actual;
        try
        {
            actual = (int)method.invoke(method, 0,0);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        int expected = 0;
        Assert.assertEquals("perimeter(0,0)",expected,actual);
    }

    @Test(timeout = 2000)
    public void test7() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Rectangle"));
        Method method = classRef.getMethod("perimeter", int.class,int.class);


        int actual;
        try
        {
            actual = (int)method.invoke(method, 1,1);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        int expected = 4;
        Assert.assertEquals("perimeter(1,1)",expected,actual);
    }

    @Test(timeout = 2000)
    public void test8() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Rectangle"));
        Method method = classRef.getMethod("perimeter", int.class,int.class);


        int actual;
        try
        {
            actual = (int)method.invoke(method, 21,35);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        int expected = 112;
        Assert.assertEquals("perimeter(21,35)",expected,actual);
    }

    @Test(timeout = 2000)
    public void test9() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Rectangle"));
        Method method = classRef.getMethod("perimeter", int.class,int.class);


        int actual;
        try
        {
            actual = (int)method.invoke(method, 99,94);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        int expected = 386;
        Assert.assertEquals("perimeter(99,94)",expected,actual);
    }

    @Test(timeout = 2000)
    public void test10() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Rectangle"));
        Method method = classRef.getMethod("perimeter", int.class,int.class);


        int actual;
        try
        {
            actual = (int)method.invoke(method, 1234,4321);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        int expected = 11110;
        Assert.assertEquals("perimeter(1234,4321)",expected,actual);
    }
}
