package A4.CG1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Scanner;

public class Formulas_Tests {
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
        String className = "Formulas";
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
        Class<?> classRef = Class.forName(generateClassName("Formulas"));
        Method method = classRef.getMethod("distance", double.class,double.class,double.class,double.class);

        double actual;
        try
        {
            actual =(double)method.invoke(method, 1,1,1,1);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        double expected = 0;
        Assert.assertEquals("distance(1,1,1,1)",expected,actual,.001);
    }

    @Test(timeout = 2000)
    public void test2() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Formulas"));
        Method method = classRef.getMethod("distance", double.class,double.class,double.class,double.class);

        double actual;
        try
        {
            actual = (double)method.invoke(method, 1,1,2,2);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        double expected = 1.4142135623730951;
        Assert.assertEquals("distance(1,1,2,2)",expected,actual,.001);
    }

    @Test(timeout = 2000)
    public void test3() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Formulas"));
        Method method = classRef.getMethod("distance", double.class,double.class,double.class,double.class);

        double actual;
        try
        {
            actual = (double)method.invoke(method, 1,2,4,4);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        double expected = 3.605551275463989;
        Assert.assertEquals("distance(1,2,4,4)",expected,actual,.001);
    }

    @Test(timeout = 2000)
    public void test4() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Formulas"));
        Method method = classRef.getMethod("distance", double.class,double.class,double.class,double.class);

        double actual;
        try
        {
            actual = (double)method.invoke(method, -1,-10,12,4);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        double expected = 19.1049731745428;
        Assert.assertEquals("distance(-1,-10,12,4)",expected,actual,.001);
    }

    @Test(timeout = 2000)
    public void test5() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Formulas"));
        Method method = classRef.getMethod("distance", double.class,double.class,double.class,double.class);

        double actual;
        try
        {
            actual = (double)method.invoke(method, 14,18,55,19);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        double expected = 41.01219330881975;
        Assert.assertEquals("distance(-14,18,55,19)",expected,actual,.001);
    }

    @Test(timeout = 2000)
    public void test6() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Formulas"));
        Method method = classRef.getMethod("distance", double.class,double.class,double.class,double.class);

        double actual;
        try
        {
            actual = (double)method.invoke(method, 34,1333,50,2000);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        double expected = 667.1918764493464;
        Assert.assertEquals("distance(34,1333,50,2000)",expected,actual,.001);
    }

    @Test(timeout = 2000)
    public void test7() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Formulas"));
        Method method = classRef.getMethod("distance", double.class,double.class,double.class,double.class);

        double actual;
        try
        {
            actual = (double)method.invoke(method, 4,-1,-6,-13);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        double expected = 15.620499351813308;
        Assert.assertEquals("distance(4,-1,-6,-13)",expected,actual,.001);
    }

    @Test(timeout = 2000)
    public void test8() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Formulas"));
        Method method = classRef.getMethod("distance", double.class,double.class,double.class,double.class);

        double actual;
        try
        {
            actual =(double)method.invoke(method, -100,50,100,700);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        double expected = 680.0735254367721;
        Assert.assertEquals("distance(-100,50,100,700)",expected,actual,.001);
    }

    @Test(timeout = 2000)
    public void test9() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Formulas"));
        Method method = classRef.getMethod("distance", double.class,double.class,double.class,double.class);

        double actual;
        try
        {
            actual = (double)method.invoke(method, -3,-4,-70,-1);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        double expected = 67.06713054842886;
        Assert.assertEquals("distance(-3,-4,-70,-1)",expected,actual,.001);
    }

    @Test(timeout = 2000)
    public void test10() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Formulas"));
        Method method = classRef.getMethod("distance", double.class,double.class,double.class,double.class);

        double actual;
        try
        {
            actual = (double)method.invoke(method, 13,14,15,17);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        double expected = 3.605551275463989;
        Assert.assertEquals("distance(13,14,15,17)",expected,actual,.001);
    }
}
