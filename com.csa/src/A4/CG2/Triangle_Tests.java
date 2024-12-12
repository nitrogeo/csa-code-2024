package A4.CG2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Scanner;

public class Triangle_Tests {
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
        String className = "Triangle";
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
        Class<?> classRef = Class.forName(generateClassName("Triangle"));
        Method method = classRef.getMethod("hypotenuse", double.class, double.class);

        double actual;
        try
        {
            actual = (double)method.invoke(method, 1.0,1.0);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        double expected = 1.4142135623730951;
        Assert.assertEquals("hypotenuse(1.0,1.0)",  expected,actual,.001);
    }

    @Test(timeout = 2000)
    public void test2() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Triangle"));
        Method method = classRef.getMethod("hypotenuse", double.class, double.class);

        double actual;
        try
        {
            actual = (double)method.invoke(method, .5,7);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        double expected = 7.0178344238090995;
        Assert.assertEquals("hypotenuse(.5,7)",  expected,actual,.001);
    }

    @Test(timeout = 2000)
    public void test3() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Triangle"));
        Method method = classRef.getMethod("hypotenuse", double.class, double.class);

        double actual;
        try
        {
            actual = (double)method.invoke(method, .2,.65);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        double expected = 0.6800735254367721;
        Assert.assertEquals("hypotenuse(.2,.65)", expected,actual,.001);
    }

    @Test(timeout = 2000)
    public void test4() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Triangle"));
        Method method = classRef.getMethod("hypotenuse", double.class, double.class);

        double actual;
        try
        {
            actual = (double)method.invoke(method, 8,9);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        double expected = 12.041594578792296;
        Assert.assertEquals("hypotenuse(8,9)", expected,actual,.001);
    }

    @Test(timeout = 2000)
    public void test5() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Triangle"));
        Method method = classRef.getMethod("hypotenuse", double.class, double.class);

        double actual;
        try
        {
            actual = (double)method.invoke(method, 100,13);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        double expected = 100.84145972763385;
        Assert.assertEquals("hypotenuse(100,13)", expected,actual,.001);
    }

    @Test(timeout = 2000)
    public void test6() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Triangle"));
        Method method = classRef.getMethod("hypotenuse", double.class, double.class);

        double actual;
        try
        {
            actual = (double)method.invoke(method, 65,22.22);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        double expected = 68.69300109909305;
        Assert.assertEquals("hypotenuse(65,22.22)", expected,actual,.001);
    }

    @Test(timeout = 2000)
    public void test7() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Triangle"));
        Method method = classRef.getMethod("hypotenuse", double.class, double.class);

        double actual;
        try
        {
            actual = (double)method.invoke(method, 1,.1);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        double expected = 1.004987562112089;
        Assert.assertEquals("hypotenuse(1,.1)", expected,actual,.001);
    }

    @Test(timeout = 2000)
    public void test8() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Triangle"));
        Method method = classRef.getMethod("hypotenuse", double.class, double.class);

        double actual;
        try
        {
            actual = (double)method.invoke(method, 45,45);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        double expected = 63.63961030678928;
        Assert.assertEquals("hypotenuse(45,45)", expected,actual,.001);
    }

    @Test(timeout = 2000)
    public void test9() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Triangle"));
        Method method = classRef.getMethod("hypotenuse", double.class, double.class);

        double actual;
        try
        {
            actual = (double)method.invoke(method, 111.11,68.5);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        double expected = 130.5284723728888;
        Assert.assertEquals("hypotenuse(111.11,68.5)", expected,actual,.001);
    }

    @Test(timeout = 2000)
    public void test10() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("Triangle"));
        Method method = classRef.getMethod("hypotenuse", double.class, double.class);

        double actual;
        try
        {
            actual = (double)method.invoke(method, 89.98,98.89);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        double expected = 133.69978496616963;
        Assert.assertEquals("hypotenuse(89.98,98.89)", expected,actual,.001);
    }
}
