package A4.CG2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Scanner;

public class Calculations_Tests {
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
        String className = "Calculations";
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
        Class<?> classRef = Class.forName(generateClassName("Calculations"));
        Method method = classRef.getMethod("minimum", int.class, int.class, int.class);

        int actual;
        try
        {
            actual = (int)method.invoke(method, 0,1,2);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }

        int expected = 0;
        Assert.assertEquals("minimum(0,1,2)",expected,actual);
    }

    @Test(timeout = 2000)
    public void test2() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Calculations"));
        Method method = classRef.getMethod("minimum", int.class, int.class, int.class);


        int actual;
        try
        {
            actual = (int)method.invoke(method, 4,-7,18);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }

        int expected = -7;
        Assert.assertEquals("minimum(4,-7,18)",expected,actual);
    }

    @Test(timeout = 2000)
    public void test3() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Calculations"));
        Method method = classRef.getMethod("minimum", int.class, int.class, int.class);


        int actual;
        try
        {
            actual = (int)method.invoke(method, 20,31,12);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }

        int expected = 12;
        Assert.assertEquals("minimum(20,31,12)",expected,actual);
    }

    @Test(timeout = 2000)
    public void test4() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Calculations"));
        Method method = classRef.getMethod("minimum", int.class, int.class, int.class);


        int actual;
        try
        {
            actual =(int)method.invoke(method, 1000,245,298);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }

        int expected = 245;
        Assert.assertEquals("minimum(1000,245,298)",expected,actual);
    }

    @Test(timeout = 2000)
    public void test5() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Calculations"));
        Method method = classRef.getMethod("minimum", int.class, int.class, int.class);


        int actual;
        try
        {
            actual = (int)method.invoke(method, 0,-16,-32);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }

        int expected = -32;
        Assert.assertEquals("minimum(0,-16,-32)",expected,actual);
    }

    @Test(timeout = 2000)
    public void test6() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Calculations"));
        Method method = classRef.getMethod("minimum", int.class, int.class, int.class);


        int actual;
        try
        {
            actual =(int)method.invoke(method, -85,-100,-200);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }

        int expected = -200;
        Assert.assertEquals("minimum(-85,-100,-200)",expected,actual);
    }

    @Test(timeout = 2000)
    public void test7() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Calculations"));
        Method method = classRef.getMethod("minimum", int.class, int.class, int.class);


        int actual;
        try
        {
            actual = (int)method.invoke(method, 76,76,76);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }

        int expected = 76;
        Assert.assertEquals("minimum(76,76,76)",expected,actual);
    }

    @Test(timeout = 2000)
    public void test8() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Calculations"));
        Method method = classRef.getMethod("minimum", int.class, int.class, int.class);


        int actual;
        try
        {
            actual =(int)method.invoke(method, 0,1,2);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }

        int expected = 0;
        Assert.assertEquals("minimum(0,1,2)",expected,actual);
    }

    @Test(timeout = 2000)
    public void test9() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Calculations"));
        Method method = classRef.getMethod("minimum", int.class, int.class, int.class);


        int actual;
        try
        {
            actual = (int)method.invoke(method, 67,33,66);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }

        int expected = 33;
        Assert.assertEquals("minimum(67,33,66)",expected,actual);
    }

    @Test(timeout = 2000)
    public void test10() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Calculations"));
        Method method = classRef.getMethod("minimum", int.class, int.class, int.class);


        int actual;
        try
        {
            actual = (int)method.invoke(method, 18,9,-18);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        int expected = -18;
        Assert.assertEquals("minimum(18,9,-18)",expected,actual);
    }
}
