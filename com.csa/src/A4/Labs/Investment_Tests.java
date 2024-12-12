package A4.Labs;

import A4.CG2.TestingOutputStream;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class Investment_Tests {
    public String generateClassName(String name)
    {
        if(getClass().toString().contains("."))
        {
            return getClass().toString().substring(6,getClass().toString().lastIndexOf(".")+1)+name;
        }
        return name;
    }

    public TestingOutputStream testingOutputStream = new TestingOutputStream();
    public ArrayList<String> allowedImports = new ArrayList<>();

    @Before
    public void setup()
    {
        System.setOut(testingOutputStream);
        allowedImports.add("java.util.Scanner");
    }

    @Test(timeout = 2000)
    public void checkImports() throws Exception{
        String className = "Investment";
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

    public String unifyLineSeperators(String line)
    {
        return line.replaceAll("\\n|\\r\\n", System.getProperty("line.separator")).trim();
    }

    @Test(timeout = 2000)
    public void test1() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Investment"));
        Method method = classRef.getMethod("totalInAccount", double.class, double.class, int.class);

        double actual;
        try
        {
            actual = (double)method.invoke(method, 1000,5,17);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        double expected = 2335.5188460835175;
        Assert.assertEquals("totalInAccount(1000,5,17)", expected,actual,.001);
    }

    @Test(timeout = 2000)
    public void test2() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Investment"));
        Method method = classRef.getMethod("totalInAccount", double.class, double.class, int.class);

        double actual;
        try
        {
            actual =  (double)method.invoke(method, 53.55,3.75,35);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }

        double expected = 198.55562312261162;
        Assert.assertEquals("totalInAccount(53.55,3.75,35)",expected,actual,.001);
    }

    @Test(timeout = 2000)
    public void test3() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Investment"));
        Method method = classRef.getMethod("totalInAccount", double.class, double.class, int.class);

        double actual;
        try
        {
            actual =  (double)method.invoke(method, 100,5,1);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }

        double expected = 105.1161897881733;
        Assert.assertEquals("totalInAccount(100,5,1)",expected,actual,.001);
    }

    @Test(timeout = 2000)
    public void test4() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Investment"));
        Method method = classRef.getMethod("totalInAccount", double.class, double.class, int.class);

        double actual;
        try
        {
            actual =  (double)method.invoke(method, 20000,4.5,65);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }

        double expected = 370651.24165808724;
        Assert.assertEquals("totalInAccount(20000,4.5,65)",expected,actual,.001);
    }

    @Test(timeout = 2000)
    public void test5() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Investment"));
        Method method = classRef.getMethod("totalInAccount", double.class, double.class, int.class);

        double actual;
        try
        {
            actual =  (double)method.invoke(method, 250000,2.85,50);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }

        double expected = 1037709.7547210228;
        Assert.assertEquals("totalInAccount(250000,2.85,50)",expected,actual,.001);
    }

    @Test(timeout = 2000)
    public void test6() throws Exception{
        String input =  "12345\n" +
                "10\n" +
                "47";

        String expected =   "Enter the amount of money you are investing:\n" +
                "Enter the annual interest rate on your investment:\n" +
                "Enter the number of years that you are planning to invest for (whole number):\n" +
                "\n" +
                "Investing $12345.00 over 47 years at an annual interest rate of 10.00% you would earn $1318774.92, giving you a total of $1331119.92";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("Investment"));
        Object classObject = classRef.getConstructor().newInstance();

        Method main = classRef.getMethod("main",String[].class);
        try
        {
            main.invoke(classObject,(Object)null);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }

        expected = unifyLineSeperators(expected);

        TestingOutputStream o = (TestingOutputStream)System.out;
        Assert.assertEquals(expected, unifyLineSeperators(o.toString()));
    }

    @Test(timeout = 2000)
    public void test7() throws Exception{
        String input =  "800\n" +
                "8\n" +
                "125";

        String expected =   "Enter the amount of money you are investing:\n" +
                "Enter the annual interest rate on your investment:\n" +
                "Enter the number of years that you are planning to invest for (whole number):\n" +
                "\n" +
                "Investing $800.00 over 125 years at an annual interest rate of 8.00% you would earn $17045194.47, giving you a total of $17045994.47";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("Investment"));
        Object classObject = classRef.getConstructor().newInstance();

        Method main = classRef.getMethod("main",String[].class);
        try
        {
            main.invoke(classObject,(Object)null);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }

        expected = unifyLineSeperators(expected);

        TestingOutputStream o = (TestingOutputStream)System.out;
        Assert.assertEquals(expected, unifyLineSeperators(o.toString()));
    }

    @Test(timeout = 2000)
    public void test8() throws Exception{
        String input =  "25887.45\n" +
                "2.35\n" +
                "35";

        String expected =   "Enter the amount of money you are investing:\n" +
                "Enter the annual interest rate on your investment:\n" +
                "Enter the number of years that you are planning to invest for (whole number):\n" +
                "\n" +
                "Investing $25887.45 over 35 years at an annual interest rate of 2.35% you would earn $32989.75, giving you a total of $58877.20";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("Investment"));
        Object classObject = classRef.getConstructor().newInstance();

        Method main = classRef.getMethod("main",String[].class);
        try
        {
            main.invoke(classObject,(Object)null);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }

        expected = unifyLineSeperators(expected);

        TestingOutputStream o = (TestingOutputStream)System.out;
        Assert.assertEquals(expected, unifyLineSeperators(o.toString()));
    }

    @Test(timeout = 2000)
    public void test9() throws Exception{
        String input =  "50\n" +
                "6.7\n" +
                "400";

        String expected =   "Enter the amount of money you are investing:\n" +
                "Enter the annual interest rate on your investment:\n" +
                "Enter the number of years that you are planning to invest for (whole number):\n" +
                "\n" +
                "Investing $50.00 over 400 years at an annual interest rate of 6.70% you would earn $20215760968144.78, giving you a total of $20215760968194.78";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("Investment"));
        Object classObject = classRef.getConstructor().newInstance();

        Method main = classRef.getMethod("main",String[].class);
        try
        {
            main.invoke(classObject,(Object)null);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }

        expected = unifyLineSeperators(expected);

        TestingOutputStream o = (TestingOutputStream)System.out;
        Assert.assertEquals(expected, unifyLineSeperators(o.toString()));
    }

    @Test(timeout = 2000)
    public void test10() throws Exception{
        String input =  "12\n" +
                "12\n" +
                "12";

        String expected =   "Enter the amount of money you are investing:\n" +
                "Enter the annual interest rate on your investment:\n" +
                "Enter the number of years that you are planning to invest for (whole number):\n" +
                "\n" +
                "Investing $12.00 over 12 years at an annual interest rate of 12.00% you would earn $38.29, giving you a total of $50.29";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("Investment"));
        Object classObject = classRef.getConstructor().newInstance();

        Method main = classRef.getMethod("main",String[].class);
        try
        {
            main.invoke(classObject,(Object)null);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }

        expected = unifyLineSeperators(expected);

        TestingOutputStream o = (TestingOutputStream)System.out;
        Assert.assertEquals(expected, unifyLineSeperators(o.toString()));
    }
}
