package A4.CG1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Scanner;

public class Sales_Tests {

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
        String className = "Sales";
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
        Class<?> classRef = Class.forName(generateClassName("Sales"));
        Method method = classRef.getMethod("totalCost", double.class);


        double actual;
        try
        {
            actual = (double)method.invoke(method, 19.99);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        double expected = 21.639174999999998;
        Assert.assertEquals("totalCost(19.99)",expected,actual,.001);
    }

    @Test(timeout = 2000)
    public void test2() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Sales"));
        Method method = classRef.getMethod("totalCost", double.class);


        double actual;
        try
        {
            actual = (double)method.invoke(method, 0.13);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        double expected = 0.14072500000000002;
        Assert.assertEquals("totalCost(0.13)",expected,actual,.001);
    }

    @Test(timeout = 2000)
    public void test3() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Sales"));
        Method method = classRef.getMethod("totalCost", double.class);


        double actual;
        try
        {
            actual = (double)method.invoke(method, 8.67);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        double expected = 9.385275;
        Assert.assertEquals("totalCost(8.67)",expected,actual,.001);
    }

    @Test(timeout = 2000)
    public void test4() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Sales"));
        Method method = classRef.getMethod("totalCost", double.class);


        double actual;
        try
        {
            actual = (double)method.invoke(method, 1.00);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        double expected = 1.0825;
        Assert.assertEquals("totalCost(1.00)",expected,actual,.001);
    }

    @Test(timeout = 2000)
    public void test5() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Sales"));
        Method method = classRef.getMethod("totalCost", double.class);


        double actual;
        try
        {
            actual = (double)method.invoke(method, 2085.93);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        double expected = 2258.019225;
        Assert.assertEquals("totalCost(2085.93)",expected,actual,.001);
    }

    @Test(timeout = 2000)
    public void test6() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Sales"));
        Method method = classRef.getMethod("totalCost", double.class);


        double actual;
        try
        {
            actual = (double)method.invoke(method, 222.22);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        double expected = 240.55315;
        Assert.assertEquals("totalCost(222.22)",expected,actual,.001);
    }

    @Test(timeout = 2000)
    public void test7() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Sales"));
        Method method = classRef.getMethod("totalCost", double.class);


        double actual;
        try
        {
            actual = (double)method.invoke(method, 66.45);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        double expected = 71.932125;
        Assert.assertEquals("totalCost(66.45)",expected,actual,.001);
    }

    @Test(timeout = 2000)
    public void test8() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Sales"));
        Method method = classRef.getMethod("totalCost", double.class);


        double actual;
        try
        {
            actual = (double)method.invoke(method, 10000.00);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        double expected = 10825.0;
        Assert.assertEquals("totalCost(10000.00)",expected,actual,.001);
    }

    @Test(timeout = 2000)
    public void test9() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Sales"));
        Method method = classRef.getMethod("totalCost", double.class);


        double actual;
        try
        {
            actual = (double)method.invoke(method, 1234.56);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        double expected = 1336.4112;
        Assert.assertEquals("totalCost(1234.56)",expected,actual,.001);
    }

    @Test(timeout = 2000)
    public void test10() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Sales"));
        Method method = classRef.getMethod("totalCost", double.class);


        double actual;
        try
        {
            actual = (double)method.invoke(method, 8753.71);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        double expected = 9475.891075;
        Assert.assertEquals("totalCost(8753.71)",expected,actual,.001);
    }

}
