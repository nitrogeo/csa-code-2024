package A4.CG2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Scanner;

public class Sphere_Tests {

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
        String className = "Sphere";
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
        Class<?> classRef = Class.forName(generateClassName("Sphere"));
        Method method = classRef.getMethod("surfaceArea", double.class);

        double actual;
        try
        {
            actual = (double)method.invoke(method, 1.0);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        double expected = 12.566370614359172;
        Assert.assertEquals("surfaceArea(1.0)",expected,actual,.001);
    }

    @Test(timeout = 2000)
    public void test2() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Sphere"));
        Method method = classRef.getMethod("surfaceArea", double.class);

        double actual;
        try
        {
            actual = (double)method.invoke(method, 3.87);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        double expected = 188.2052760541959;
        Assert.assertEquals("surfaceArea(3.87)",expected,actual,.001);
    }

    @Test(timeout = 2000)
    public void test3() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Sphere"));
        Method method = classRef.getMethod("surfaceArea", double.class);

        double actual;
        try
        {
            actual = (double)method.invoke(method, 36.77);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        double expected = 16990.146504206816;
        Assert.assertEquals("surfaceArea(36.77)",expected,actual,.001);
    }

    @Test(timeout = 2000)
    public void test4() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Sphere"));
        Method method = classRef.getMethod("surfaceArea", double.class);

        double actual;
        try
        {
            actual = (double)method.invoke(method, 198.781);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        double expected = 496546.13539944985;
        Assert.assertEquals("surfaceArea(198.781)",expected,actual,.001);
    }

    @Test(timeout = 2000)
    public void test5() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Sphere"));
        Method method = classRef.getMethod("surfaceArea", double.class);

        double actual;
        try
        {
            actual = (double)method.invoke(method, 11.0);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        double expected = 1520.53084433746;
        Assert.assertEquals("surfaceArea(11.0)",expected,actual,.001);
    }

    @Test(timeout = 2000)
    public void test6() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Sphere"));
        Method method = classRef.getMethod("volume", double.class);

        double actual;
        try
        {
            actual = (double)method.invoke(method, 1.0);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        double expected = 4.1887902047863905;
        Assert.assertEquals("volume(1.0)",expected,actual,.001);
    }

    @Test(timeout = 2000)
    public void test7() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Sphere"));
        Method method = classRef.getMethod("volume", double.class);

        double actual;
        try
        {
            actual = (double)method.invoke(method, 19.5);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        double expected = 31059.35576971549;
        Assert.assertEquals("volume(19.5)",expected,actual,.001);
    }

    @Test(timeout = 2000)
    public void test8() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Sphere"));
        Method method = classRef.getMethod("volume", double.class);

        double actual;
        try
        {
            actual = (double)method.invoke(method, 13.33);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        double expected = 9921.53931251085;
        Assert.assertEquals("volume(13.33)",expected,actual,.001);
    }

    @Test(timeout = 2000)
    public void test9() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Sphere"));
        Method method = classRef.getMethod("volume", double.class);

        double actual;
        try
        {
            actual = (double)method.invoke(method, 123);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        double expected = 7794781.462010237;
        Assert.assertEquals("volume(123)",expected,actual,.001);
    }

    @Test(timeout = 2000)
    public void test10() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Sphere"));
        Method method = classRef.getMethod("volume", double.class);

        double actual;
        try
        {
            actual = (double)method.invoke(method, 22);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        double expected = 44602.23810056548;
        Assert.assertEquals("volume(22)",expected,actual,.001);
    }

}
