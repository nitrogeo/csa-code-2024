package A4.CG2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Scanner;

public class School_Tests {
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
        String className = "School";
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
        Class<?> classRef = Class.forName(generateClassName("School"));
        Method method = classRef.getMethod("finalGrade", double.class, double.class, double.class, double.class);


        double actual;
        try
        {
            actual =(double)method.invoke(method, 90,90,90,89.5);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        double expected = 86.66666666666667;
        Assert.assertEquals("finalGrade(90,90,90,89.5)",expected,actual,.001);
    }

    @Test(timeout = 2000)
    public void test2() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("School"));
        Method method = classRef.getMethod("finalGrade", double.class, double.class, double.class, double.class);


        double actual;
        try
        {
            actual =(double)method.invoke(method, 90,90,90,80);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        double expected = 23.333333333333336;
        Assert.assertEquals("finalGrade(90,90,90,80)",expected,actual,.001);
    }

    @Test(timeout = 2000)
    public void test3() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("School"));
        Method method = classRef.getMethod("finalGrade", double.class, double.class, double.class, double.class);


        double actual;
        try
        {
            actual =(double)method.invoke(method, 75,63,81,80);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        double expected = 119.66666666666669;
        Assert.assertEquals("finalGrade(75,63,81,80)",expected,actual,.001);
    }

    @Test(timeout = 2000)
    public void test4() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("School"));
        Method method = classRef.getMethod("finalGrade", double.class, double.class, double.class, double.class);


        double actual;
        try
        {
            actual =(double)method.invoke(method, 68,100,53,90);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        double expected = 182.55555555555557;
        Assert.assertEquals("finalGrade(68,100,53,90)",expected,actual,.001);
    }

    @Test(timeout = 2000)
    public void test5() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("School"));
        Method method = classRef.getMethod("finalGrade", double.class, double.class, double.class, double.class);


        double actual;
        try
        {
            actual =(double)method.invoke(method, 53,56,61,69.5);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        double expected = 142.22222222222226;
        Assert.assertEquals("finalGrade(53,56,61,69.5)",expected,actual,.001);
    }

    @Test(timeout = 2000)
    public void test6() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("School"));
        Method method = classRef.getMethod("finalGrade", double.class, double.class, double.class, double.class);


        double actual;
        try
        {
            actual =(double)method.invoke(method, 73,80,85,82);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        double expected = 97.11111111111119;
        Assert.assertEquals("finalGrade(73,80,85,82)",expected,actual,.001);
    }

    @Test(timeout = 2000)
    public void test7() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("School"));
        Method method = classRef.getMethod("finalGrade", double.class, double.class, double.class, double.class);


        double actual;
        try
        {
            actual =(double)method.invoke(method, 76,67,95,89.5);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        double expected = 147.1111111111112;
        Assert.assertEquals("finalGrade(76,67,95,89.5)",expected,actual,.001);
    }

    @Test(timeout = 2000)
    public void test8() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("School"));
        Method method = classRef.getMethod("finalGrade", double.class, double.class, double.class, double.class);


        double actual;
        try
        {
            actual =(double)method.invoke(method, 50,35,65,80);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        double expected = 250.0;
        Assert.assertEquals("finalGrade(50,35,65,80)",expected,actual,.001);
    }

    @Test(timeout = 2000)
    public void test9() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("School"));
        Method method = classRef.getMethod("finalGrade", double.class, double.class, double.class, double.class);


        double actual;
        try
        {
            actual =(double)method.invoke(method, 17,100,100,70);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        double expected = 56.77777777777782;
        Assert.assertEquals("finalGrade(17,100,100,70)",expected,actual,.001);
    }

    @Test(timeout = 2000)
    public void test10() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("School"));
        Method method = classRef.getMethod("finalGrade", double.class, double.class, double.class, double.class);


        double actual;
        try
        {
            actual =(double)method.invoke(method, 89,95,99,89.5);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        double expected = 62.111111111111185;
        Assert.assertEquals("finalGrade(89,95,99,89.5)",expected,actual,.001);
    }

}
