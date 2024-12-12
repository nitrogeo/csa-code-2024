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

public class StudentID_Tests {
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
        String className = "StudentID";
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
        Class<?> classRef = Class.forName(generateClassName("StudentID"));
        Method method = classRef.getMethod("studentID",String.class,String.class,int.class,long.class);

        String actual;
        try
        {
            actual = (String)method.invoke(method, "Harry","Potter",4,73984);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        String expected = "(Potter, Harry) 73984/4";
        Assert.assertEquals("studentID(\"Harry\",\"Potter\",4,73984)",expected,actual);
    }

    @Test(timeout = 2000)
    public void test2() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("StudentID"));
        Method method = classRef.getMethod("studentID",String.class,String.class,int.class,long.class);

        String actual;
        try
        {
            actual = (String)method.invoke(method, "James","Bond",45,7);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }

        String expected = "(Bond, James) 7/45";
        Assert.assertEquals("studentID(\"James\",\"Bond\",45,7)",expected,actual);
    }

    @Test(timeout = 2000)
    public void test3() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("StudentID"));
        Method method = classRef.getMethod("studentID",String.class,String.class,int.class,long.class);

        String actual;
        try
        {
            actual = (String)method.invoke(method, "Jackie","Sue",12,9474628);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }

        String expected = "(Sue, Jackie) 9474628/12";
        Assert.assertEquals("studentID(\"Jackie\",\"Sue\",12,9474628)",expected,actual);
    }

    @Test(timeout = 2000)
    public void test4() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("StudentID"));
        Method method = classRef.getMethod("studentID",String.class,String.class,int.class,long.class);

        String actual;
        try
        {
            actual = (String)method.invoke(method, "Tina","Shoemaker",10,38467372);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }

        String expected = "(Shoemaker, Tina) 38467372/10";
        Assert.assertEquals("studentID(\"Tina\",\"Shoemaker\",10,38467372)",expected,actual);
    }

    @Test(timeout = 2000)
    public void test5() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("StudentID"));
        Method method = classRef.getMethod("studentID",String.class,String.class,int.class,long.class);

        String actual;
        try
        {
            actual = (String)method.invoke(method, "Alex","Jackson",3,2846487);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }

        String expected = "(Jackson, Alex) 2846487/3";
        Assert.assertEquals("studentID()",expected,actual);
    }

    @Test(timeout = 2000)
    public void test6() throws Exception{
        String input =  "Billy\n" +
                "Smith\n" +
                "2\n"+
                "17384576";

        String expected =   "Enter your first name:\n" +
                "Enter your last name:\n" +
                "Enter your grade level:\n" +
                "Enter your id:\n" +
                "\n" +
                "The text for your student ID is: \n" +
                "(Smith, Billy) 17384576/2";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("StudentID"));
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
        String input =  "Goat\n" +
                "Goat\n" +
                "9\n"+
                "9000";

        String expected =   "Enter your first name:\n" +
                "Enter your last name:\n" +
                "Enter your grade level:\n" +
                "Enter your id:\n" +
                "\n" +
                "The text for your student ID is: \n" +
                "(Goat, Goat) 9000/9";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("StudentID"));
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
        String input =  "Mel\n" +
                "Baitman\n" +
                "11\n"+
                "739876987";

        String expected =   "Enter your first name:\n" +
                "Enter your last name:\n" +
                "Enter your grade level:\n" +
                "Enter your id:\n" +
                "\n" +
                "The text for your student ID is: \n" +
                "(Baitman, Mel) 739876987/11";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("StudentID"));
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
        String input =  "Kim\n" +
                "Johnson\n" +
                "24\n"+
                "1345321";

        String expected =   "Enter your first name:\n" +
                "Enter your last name:\n" +
                "Enter your grade level:\n" +
                "Enter your id:\n" +
                "\n" +
                "The text for your student ID is: \n" +
                "(Johnson, Kim) 1345321/24";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("StudentID"));
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
        String input =  "Yertle\n" +
                "Turtle\n" +
                "1\n"+
                "2222222";

        String expected =   "Enter your first name:\n" +
                "Enter your last name:\n" +
                "Enter your grade level:\n" +
                "Enter your id:\n" +
                "\n" +
                "The text for your student ID is: \n" +
                "(Turtle, Yertle) 2222222/1";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("StudentID"));
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
