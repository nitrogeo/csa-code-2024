package A14;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Sorts_Tests {
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
        String className = "Sorts";
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

    // selection sort - ordered
    @Test(timeout = 250)
    public void test1() throws Exception
    {
        try
        {
            Class<?> classRef = Class.forName(generateClassName("Sorts"));
            Method method = classRef.getMethod("selectionSort", int[].class);

            int[] list = {1, 2, 3, 4, 5, 6};

            method.invoke(method, list);

            String expected = "[1, 2, 3, 4, 5, 6]";
            Assert.assertEquals(expected, Arrays.toString(list));
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    // selection sort - reverse ordered
    @Test(timeout = 250)
    public void test2() throws Exception
    {
        try
        {
            Class<?> classRef = Class.forName(generateClassName("Sorts"));
            Method method = classRef.getMethod("selectionSort", int[].class);

            int[] list = {99, 77, 55, 44, 43, 41, 22 , 13, 7};

            method.invoke(method, list);

            String expected = "[7, 13, 22, 41, 43, 44, 55, 77, 99]";
            Assert.assertEquals(expected, Arrays.toString(list));
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    // selection sort - random
    @Test(timeout = 250)
    public void test3() throws Exception
    {
        try
        {
            Class<?> classRef = Class.forName(generateClassName("Sorts"));
            Method method = classRef.getMethod("selectionSort", int[].class);

            int[] list = {12, 45, 67, 89, 12, 34, 45, 23, 67, 90, 56, 78, 45, 12, 34, 89, 23, 67, 56, 90};

            method.invoke(method, list);

            String expected = "[12, 12, 12, 23, 23, 34, 34, 45, 45, 45, 56, 56, 67, 67, 67, 78, 89, 89, 90, 90]";
            Assert.assertEquals(expected, Arrays.toString(list));
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    // selection sort - random
    @Test(timeout = 250)
    public void test4() throws Exception
    {
        try
        {
            Class<?> classRef = Class.forName(generateClassName("Sorts"));
            Method method = classRef.getMethod("selectionSort", int[].class);

            int[] list = {54, 19, 82, 37, 63, 21, 76, 45, 11, 89, 32, 47, 58};

            method.invoke(method, list);

            String expected = "[11, 19, 21, 32, 37, 45, 47, 54, 58, 63, 76, 82, 89]";
            Assert.assertEquals(expected, Arrays.toString(list));
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    // selection sort - random
    @Test(timeout = 250)
    public void test5() throws Exception
    {
        try
        {
            Class<?> classRef = Class.forName(generateClassName("Sorts"));
            Method method = classRef.getMethod("selectionSort", int[].class);

            int[] list = {54, 19, 82, 37, 63, 21, 76, 45, 11, 89, 32, 47, 58};

            method.invoke(method, list);

            String expected = "[11, 19, 21, 32, 37, 45, 47, 54, 58, 63, 76, 82, 89]";
            Assert.assertEquals(expected, Arrays.toString(list));
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    // insertion sort - ordered
    @Test(timeout = 250)
    public void test6() throws Exception
    {
        try
        {
            Class<?> classRef = Class.forName(generateClassName("Sorts"));
            Method method = classRef.getMethod("insertionSort", int[].class);

            int[] list = {1, 2, 3, 4, 5, 6};

            method.invoke(method, list);

            String expected = "[1, 2, 3, 4, 5, 6]";
            Assert.assertEquals(expected, Arrays.toString(list));
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    // insertion sort - reverse ordered
    @Test(timeout = 250)
    public void test7() throws Exception
    {
        try
        {
            Class<?> classRef = Class.forName(generateClassName("Sorts"));
            Method method = classRef.getMethod("insertionSort", int[].class);

            int[] list = {99, 77, 55, 44, 43, 41, 22 , 13, 7};

            method.invoke(method, list);

            String expected = "[7, 13, 22, 41, 43, 44, 55, 77, 99]";
            Assert.assertEquals(expected, Arrays.toString(list));
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    // insertion sort - random
    @Test(timeout = 250)
    public void test8() throws Exception
    {
        try
        {
            Class<?> classRef = Class.forName(generateClassName("Sorts"));
            Method method = classRef.getMethod("insertionSort", int[].class);

            int[] list = {12, 45, 67, 89, 12, 34, 45, 23, 67, 90, 56, 78, 45, 12, 34, 89, 23, 67, 56, 90};

            method.invoke(method, list);

            String expected = "[12, 12, 12, 23, 23, 34, 34, 45, 45, 45, 56, 56, 67, 67, 67, 78, 89, 89, 90, 90]";
            Assert.assertEquals(expected, Arrays.toString(list));
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    // insertion sort - random
    @Test(timeout = 250)
    public void test9() throws Exception
    {
        try
        {
            Class<?> classRef = Class.forName(generateClassName("Sorts"));
            Method method = classRef.getMethod("insertionSort", int[].class);

            int[] list = {54, 19, 82, 37, 63, 21, 76, 45, 11, 89, 32, 47, 58};

            method.invoke(method, list);

            String expected = "[11, 19, 21, 32, 37, 45, 47, 54, 58, 63, 76, 82, 89]";
            Assert.assertEquals(expected, Arrays.toString(list));
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    // insertion sort - random
    @Test(timeout = 250)
    public void test10() throws Exception
    {
        try
        {
            Class<?> classRef = Class.forName(generateClassName("Sorts"));
            Method method = classRef.getMethod("insertionSort", int[].class);

            int[] list = {54, 19, 82, 37, 63, 21, 76, 45, 11, 89, 32, 47, 58};

            method.invoke(method, list);

            String expected = "[11, 19, 21, 32, 37, 45, 47, 54, 58, 63, 76, 82, 89]";
            Assert.assertEquals(expected, Arrays.toString(list));
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }
}
