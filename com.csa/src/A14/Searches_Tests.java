package A14;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Scanner;

public class Searches_Tests {
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

    @Test(timeout = 250)
    public void checkImports() throws Exception{
        String className = "Searches";
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

    // binary - found
    @Test(timeout = 250)
    public void test1() throws Exception
    {
        try
        {
            Class<?> classRef = Class.forName(generateClassName("Searches"));
            Method method = classRef.getMethod("binarySearch", int[].class,int.class);

            int[] list = {1};
            int spot = 0;
            int toFind = 1;

            int actual = (int) method.invoke(method, list,toFind);

            Assert.assertEquals(spot, actual);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test2() throws Exception
    {
        try
        {
            Class<?> classRef = Class.forName(generateClassName("Searches"));
            Method method = classRef.getMethod("binarySearch", int[].class,int.class);

            int[] list = {-1, 6, 8 , 9 , 99 , 654, 900};
            int spot = 2;
            int toFind = 8;

            int actual = (int) method.invoke(method, list,toFind);

            Assert.assertEquals(spot, actual);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test3() throws Exception
    {
        try
        {
            Class<?> classRef = Class.forName(generateClassName("Searches"));
            Method method = classRef.getMethod("binarySearch", int[].class,int.class);

            int[] list = {1, 2, 2, 4, 5 ,5, 6};
            int spot = 1;
            int toFind = 2;

            int actual = (int) method.invoke(method, list,toFind);

            Assert.assertEquals(spot, actual);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test4() throws Exception
    {
        try
        {
            Class<?> classRef = Class.forName(generateClassName("Searches"));
            Method method = classRef.getMethod("binarySearch", int[].class,int.class);

            int[] list = {1, 2, 2, 4, 5 ,5, 6};
            int spot = 5;
            int toFind = 5;

            int actual = (int) method.invoke(method, list,toFind);

            Assert.assertEquals(spot, actual);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test5() throws Exception
    {
        try
        {
            Class<?> classRef = Class.forName(generateClassName("Searches"));
            Method method = classRef.getMethod("binarySearch", int[].class,int.class);

            int[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            int spot = 6;
            int toFind = 7;

            int actual = (int) method.invoke(method, list,toFind);

            Assert.assertEquals(spot, actual);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    // Binary not Found
    @Test(timeout = 250)
    public void test6() throws Exception
    {
        try
        {
            Class<?> classRef = Class.forName(generateClassName("Searches"));
            Method method = classRef.getMethod("binarySearch", int[].class,int.class);

            int[] list = {1};
            int spot = -1;
            int toFind = 2;

            int actual = (int) method.invoke(method, list,toFind);

            Assert.assertEquals(spot, actual);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test7() throws Exception
    {
        try
        {
            Class<?> classRef = Class.forName(generateClassName("Searches"));
            Method method = classRef.getMethod("binarySearch", int[].class,int.class);

            int[] list = {-1, 6, 8 , 9 , 99 , 654, 900};
            int spot = -1;
            int toFind = 100;

            int actual = (int) method.invoke(method, list,toFind);

            Assert.assertEquals(spot, actual);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test8() throws Exception
    {
        try
        {
            Class<?> classRef = Class.forName(generateClassName("Searches"));
            Method method = classRef.getMethod("binarySearch", int[].class,int.class);

            int[] list = {1, 2, 2, 4, 5 ,5, 6};
            int spot = -1;
            int toFind = 7;

            int actual = (int) method.invoke(method, list,toFind);

            Assert.assertEquals(spot, actual);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test9() throws Exception
    {
        try
        {
            Class<?> classRef = Class.forName(generateClassName("Searches"));
            Method method = classRef.getMethod("binarySearch", int[].class,int.class);

            int[] list = {1, 2, 2, 4, 5 ,5, 6};
            int spot = -1;
            int toFind = 3;

            int actual = (int) method.invoke(method, list,toFind);

            Assert.assertEquals(spot, actual);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test10() throws Exception
    {
        try
        {
            Class<?> classRef = Class.forName(generateClassName("Searches"));
            Method method = classRef.getMethod("binarySearch", int[].class,int.class);

            int[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            int spot = -1;
            int toFind = 0;

            int actual = (int) method.invoke(method, list,toFind);

            Assert.assertEquals(spot, actual);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    // linear - found
    @Test(timeout = 250)
    public void test11() throws Exception
    {
        try
        {
            Class<?> classRef = Class.forName(generateClassName("Searches"));
            Method method = classRef.getMethod("linearSearch", int[].class,int.class);

            int[] list = {1};
            int spot = 0;
            int toFind = 1;

            int actual = (int) method.invoke(method, list,toFind);

            Assert.assertEquals(spot, actual);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test12() throws Exception
    {
        try
        {
            Class<?> classRef = Class.forName(generateClassName("Searches"));
            Method method = classRef.getMethod("linearSearch", int[].class,int.class);

            int[] list = {-1, 6, 8 , 9 , 99 , 654, 900};
            int spot = 2;
            int toFind = 8;

            int actual = (int) method.invoke(method, list,toFind);

            Assert.assertEquals(spot, actual);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test13() throws Exception
    {
        try
        {
            Class<?> classRef = Class.forName(generateClassName("Searches"));
            Method method = classRef.getMethod("linearSearch", int[].class,int.class);

            int[] list = {1, 2, 2, 4, 5 ,5, 6};
            int spot = 4;
            int toFind = 5;

            int actual = (int) method.invoke(method, list,toFind);

            Assert.assertEquals(spot, actual);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test14() throws Exception
    {
        try
        {
            Class<?> classRef = Class.forName(generateClassName("Searches"));
            Method method = classRef.getMethod("linearSearch", int[].class,int.class);

            int[] list = {17, 43, 8, 92, 51, 34, 76, 22, 58, 67, 89, 14, 31, 45, 28, 90, 61, 3, 72, 56};
            int spot = 19;
            int toFind = 56;

            int actual = (int) method.invoke(method, list,toFind);

            Assert.assertEquals(spot, actual);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test15() throws Exception
    {
        try
        {
            Class<?> classRef = Class.forName(generateClassName("Searches"));
            Method method = classRef.getMethod("linearSearch", int[].class,int.class);

            int[] list = {17, 43, 8, 92, 51, 34, 76, 22, 58, 67, 89, 14, 31, 45, 28, 90, 61, 3, 72, 56};
            int spot = 8;
            int toFind = 58;

            int actual = (int) method.invoke(method, list,toFind);

            Assert.assertEquals(spot, actual);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    // Binary not Found
    @Test(timeout = 250)
    public void test16() throws Exception
    {
        try
        {
            Class<?> classRef = Class.forName(generateClassName("Searches"));
            Method method = classRef.getMethod("linearSearch", int[].class,int.class);

            int[] list = {1};
            int spot = -1;
            int toFind = 2;

            int actual = (int) method.invoke(method, list,toFind);

            Assert.assertEquals(spot, actual);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test17() throws Exception
    {
        try
        {
            Class<?> classRef = Class.forName(generateClassName("Searches"));
            Method method = classRef.getMethod("linearSearch", int[].class,int.class);

            int[] list = {-1, 6, 8 , 9 , 99 , 654, 900};
            int spot = -1;
            int toFind = 100;

            int actual = (int) method.invoke(method, list,toFind);

            Assert.assertEquals(spot, actual);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test18() throws Exception
    {
        try
        {
            Class<?> classRef = Class.forName(generateClassName("Searches"));
            Method method = classRef.getMethod("linearSearch", int[].class,int.class);

            int[] list = {1, 2, 2, 4, 5 ,5, 6};
            int spot = -1;
            int toFind = 7;

            int actual = (int) method.invoke(method, list,toFind);

            Assert.assertEquals(spot, actual);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test19() throws Exception
    {
        try
        {
            Class<?> classRef = Class.forName(generateClassName("Searches"));
            Method method = classRef.getMethod("linearSearch", int[].class,int.class);

            int[] list = {17, 43, 8, 92, 51, 34, 76, 22, 58, 67, 89, 14, 31, 45, 28, 90, 61, 3, 72, 56};
            int spot = -1;
            int toFind = 23;

            int actual = (int) method.invoke(method, list,toFind);

            Assert.assertEquals(spot, actual);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test20() throws Exception
    {
        try
        {
            Class<?> classRef = Class.forName(generateClassName("Searches"));
            Method method = classRef.getMethod("linearSearch", int[].class,int.class);

            int[] list = {17, 43, 8, 92, 51, 34, 76, 22, 58, 67, 89, 14, 31, 45, 28, 90, 61, 3, 72, 56};
            int spot = -1;
            int toFind = 88;

            int actual = (int) method.invoke(method, list,toFind);

            Assert.assertEquals(spot, actual);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }
}
