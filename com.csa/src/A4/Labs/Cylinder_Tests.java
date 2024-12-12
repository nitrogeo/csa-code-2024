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

public class Cylinder_Tests {
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
        String className = "Cylinder";
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
        Class<?> classRef = Class.forName(generateClassName("Cylinder"));
        Method method = classRef.getMethod("volume", double.class, double.class);

        double actual;
        try
        {
            actual = (double)method.invoke(method, 1.0,1.0);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        double expected = 3.141592653589793;
        Assert.assertEquals("volume(1.0,1.0)",expected,actual,.001);
    }

    @Test(timeout = 2000)
    public void test2() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Cylinder"));
        Method method = classRef.getMethod("volume", double.class, double.class);

        double actual;
        try
        {
            actual =  (double)method.invoke(method, .6,.3);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        double expected = 0.33929200658769765;
        Assert.assertEquals("volume(.6,.3)",expected,actual,.001);
    }

    @Test(timeout = 2000)
    public void test3() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Cylinder"));
        Method method = classRef.getMethod("volume", double.class, double.class);

        double actual;
        try
        {
            actual =  (double)method.invoke(method, 23,5);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }

        double expected = 8309.512568745002;
        Assert.assertEquals("volume(23,5)",expected,actual,.001);
    }

    @Test(timeout = 2000)
    public void test4() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Cylinder"));
        Method method = classRef.getMethod("volume", double.class, double.class);

        double actual;
        try
        {
            actual =  (double)method.invoke(method, 17,9);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }

        double expected = 8171.282491987053;
        Assert.assertEquals("volume(17,9)",expected,actual,.001);
    }

    @Test(timeout = 2000)
    public void test5() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Cylinder"));
        Method method = classRef.getMethod("volume", double.class, double.class);

        double actual;
        try
        {
            actual =  (double)method.invoke(method, 145.76,33.3);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        double expected = 2222648.6979782265;
        Assert.assertEquals("volume(145.76,33.3)",expected,actual,.001);
    }

    @Test(timeout = 2000)
    public void test6() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Cylinder"));
        Method method = classRef.getMethod("surfaceArea", double.class, double.class);

        double actual;
        try
        {
            actual =  (double)method.invoke(method, 1.0,1.0);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        double expected = 12.566370614359172;
        Assert.assertEquals("surfaceArea(1.0,1.0)",expected,actual,.001);
    }

    @Test(timeout = 2000)
    public void test7() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Cylinder"));
        Method method = classRef.getMethod("surfaceArea", double.class, double.class);

        double actual;
        try
        {
            actual =  (double)method.invoke(method, 87,6.7);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        double expected = 51219.89830559727;
        Assert.assertEquals("surfaceArea(87,6.7)",expected,actual,.001);
    }

    @Test(timeout = 2000)
    public void test8() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Cylinder"));
        Method method = classRef.getMethod("surfaceArea", double.class, double.class);

        double actual;
        try
        {
            actual =  (double)method.invoke(method, 19,55.55);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        double expected = 8899.817828354524;
        Assert.assertEquals("surfaceArea(19,55.55)",expected,actual,.001);
    }

    @Test(timeout = 2000)
    public void test9() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Cylinder"));
        Method method = classRef.getMethod("surfaceArea", double.class, double.class);

        double actual;
        try
        {
            actual =  (double)method.invoke(method, 12.12,13.13);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        double expected = 1922.8431995561687;
        Assert.assertEquals("surfaceArea(12.12,13.13)",expected,actual,.001);
    }

    @Test(timeout = 2000)
    public void test10() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Cylinder"));
        Method method = classRef.getMethod("surfaceArea", double.class, double.class);

        double actual;
        try
        {
            actual =  (double)method.invoke(method, 123,60);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }

        double expected = 141428.2180793053;
        Assert.assertEquals("surfaceArea(123,60)",expected,actual,.001);
    }

    @Test(timeout = 2000)
    public void test11() throws Exception{
        String input =  "4.3\n" +
                "6.7";

        String expected =   "Enter the radius of your cylinder:\n" +
                "Enter the height of your cylinder:\n" +
                "\n" +
                "Cylinder Properties:\n" +
                "Radius:             4.300\n" +
                "Height:             6.700\n" +
                "Surface Area:     297.195\n" +
                "Volume:           389.190";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("Cylinder"));
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
    public void test12() throws Exception{
        String input =  "55\n" +
                "16";

        String expected =   "Enter the radius of your cylinder:\n" +
                "Enter the height of your cylinder:\n" +
                "\n" +
                "Cylinder Properties:\n" +
                "Radius:            55.000\n" +
                "Height:            16.000\n" +
                "Surface Area:   24535.839\n" +
                "Volume:        152053.084";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("Cylinder"));
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
    public void test13() throws Exception{
        String input =  "1\n" +
                "2";

        String expected =   "Enter the radius of your cylinder:\n" +
                "Enter the height of your cylinder:\n" +
                "\n" +
                "Cylinder Properties:\n" +
                "Radius:             1.000\n" +
                "Height:             2.000\n" +
                "Surface Area:      18.850\n" +
                "Volume:             6.283";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("Cylinder"));
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
    public void test14() throws Exception{
        String input =  "14\n" +
                "67";

        String expected =   "Enter the radius of your cylinder:\n" +
                "Enter the height of your cylinder:\n" +
                "\n" +
                "Cylinder Properties:\n" +
                "Radius:            14.000\n" +
                "Height:            67.000\n" +
                "Surface Area:    7125.132\n" +
                "Volume:         41255.395";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("Cylinder"));
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
    public void test15() throws Exception{
        String input =  "2\n" +
                "11";

        String expected =   "Enter the radius of your cylinder:\n" +
                "Enter the height of your cylinder:\n" +
                "\n" +
                "Cylinder Properties:\n" +
                "Radius:             2.000\n" +
                "Height:            11.000\n" +
                "Surface Area:     163.363\n" +
                "Volume:           138.230";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("Cylinder"));
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
