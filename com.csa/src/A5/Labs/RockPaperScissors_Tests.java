package A5.Labs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;

public class RockPaperScissors_Tests {
    public String generateClassName(String name)
    {
        if(getClass().toString().contains("."))
        {
            return getClass().toString().substring(6,getClass().toString().lastIndexOf(".")+1)+name;
        }
        return name;
    }

    public TestingOutputStream testingOutputStream = new TestingOutputStream();

    @Before
    public void setup()
    {
        System.setOut(testingOutputStream);
    }



    public String unifyLineSeperators(String line)
    {
        return line.replaceAll("\\n|\\r\\n", System.getProperty("line.separator")).trim();
    }

    @Test(timeout = 250)
    public void test1() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("RockPaperScissors"));
        Method method = classRef.getMethod("choiceText", int.class);

        String actual;
        try
        {
            actual = (String)method.invoke(method, 0);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        String expected = "Invalid Input";
        Assert.assertEquals("choiceText(0)",expected,actual);
    }

    @Test(timeout = 250)
    public void test2() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("RockPaperScissors"));
        Method method = classRef.getMethod("choiceText", int.class);

        String actual;
        try
        {
            actual = (String)method.invoke(method, 4);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        String expected = "Invalid Input";
        Assert.assertEquals("choiceText(4)",expected,actual);
    }

    @Test(timeout = 250)
    public void test3() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("RockPaperScissors"));
        Method method = classRef.getMethod("choiceText", int.class);

        String actual;
        try
        {
            actual = (String)method.invoke(method, 1);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        String expected = "Rock";
        Assert.assertEquals("choiceText(1)",expected,actual);
    }

    @Test(timeout = 250)
    public void test4() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("RockPaperScissors"));
        Method method = classRef.getMethod("choiceText", int.class);

        String actual;
        try
        {
            actual = (String)method.invoke(method, 2);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        String expected = "Paper";
        Assert.assertEquals("choiceText(2)",expected,actual);
    }

    @Test(timeout = 250)
    public void test5() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("RockPaperScissors"));
        Method method = classRef.getMethod("choiceText", int.class);

        String actual;
        try
        {
            actual = (String)method.invoke(method, 3);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        String expected = "Scissors";
        Assert.assertEquals("choiceText(4)",expected,actual);
    }

    @Test(timeout = 250)
    public void test6() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("RockPaperScissors"));
        Method method = classRef.getMethod("gameResults", int.class, int.class);

        String actual;
        try
        {
            actual = (String)method.invoke(method, 1,1);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        String expected = "Tie Game.";
        Assert.assertEquals("gameResults(1,1)",expected,actual);
    }

    @Test(timeout = 250)
    public void test7() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("RockPaperScissors"));
        Method method = classRef.getMethod("gameResults", int.class, int.class);

        String actual;
        try
        {
            actual = (String)method.invoke(method, 1,2);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        String expected = "Paper covers rock. You lose.";
        Assert.assertEquals("gameResults(1,2)",expected,actual);
    }

    @Test(timeout = 250)
    public void test8() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("RockPaperScissors"));
        Method method = classRef.getMethod("gameResults", int.class, int.class);

        String actual;
        try
        {
            actual = (String)method.invoke(method, 1,3);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        String expected = "Rock crushes scissors. You win!";
        Assert.assertEquals("gameResults(1,3)",expected,actual);
    }

    @Test(timeout = 250)
    public void test9() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("RockPaperScissors"));
        Method method = classRef.getMethod("gameResults", int.class, int.class);

        String actual;
        try
        {
            actual = (String)method.invoke(method, 2,1);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        String expected = "Paper covers rock. You win!";
        Assert.assertEquals("gameResults(2,1)",expected,actual);
    }

    @Test(timeout = 250)
    public void test10() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("RockPaperScissors"));
        Method method = classRef.getMethod("gameResults", int.class, int.class);

        String actual;
        try
        {
            actual = (String)method.invoke(method, 2,2);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        String expected = "Tie Game.";
        Assert.assertEquals("gameResults(2,2)",expected,actual);
    }

    @Test(timeout = 250)
    public void test11() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("RockPaperScissors"));
        Method method = classRef.getMethod("gameResults", int.class, int.class);

        String actual;
        try
        {
            actual = (String)method.invoke(method, 2,3);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        String expected = "Scissors cut paper. You lose.";
        Assert.assertEquals("gameResults(2,3)",expected,actual);
    }

    @Test(timeout = 250)
    public void test12() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("RockPaperScissors"));
        Method method = classRef.getMethod("gameResults", int.class, int.class);

        String actual;
        try
        {
            actual = (String)method.invoke(method, 3,1);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        String expected = "Rock crushes scissors. You lose.";
        Assert.assertEquals("gameResults(3,1)",expected,actual);
    }

    @Test(timeout = 250)
    public void test13() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("RockPaperScissors"));
        Method method = classRef.getMethod("gameResults", int.class, int.class);

        String actual;
        try
        {
            actual = (String)method.invoke(method, 3,2);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        String expected = "Scissors cut paper. You win!";
        Assert.assertEquals("gameResults(3,2)",expected,actual);
    }

    @Test(timeout = 250)
    public void test14() throws Exception
    {
        Class<?> classRef = Class.forName(generateClassName("RockPaperScissors"));
        Method method = classRef.getMethod("gameResults", int.class, int.class);

        String actual;
        try
        {
            actual = (String)method.invoke(method, 3,3);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        String expected = "Tie Game.";
        Assert.assertEquals("gameResults(3,3)",expected,actual);
    }

    @Test(timeout = 250)
    public void test15() throws Exception{
        String input =  "1";

        String expected =   "---Menu---\n" +
                "1. Rock\n" +
                "2. Paper\n" +
                "3. Scissors\n" +
                "Enter selection: \n" +
                "\n" +
                "You picked: Rock\n" +
                "The computer picked: Paper\n" +
                "Paper covers rock. You lose.";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("RockPaperScissors"));
        Object classObject = classRef.getConstructor().newInstance();

        Method main = classRef.getMethod("main",String[].class);
        try
        {
            main.invoke(classObject,(Object)new String[]{"40"});
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        expected = unifyLineSeperators(expected);

        TestingOutputStream o = (TestingOutputStream)System.out;
        Assert.assertEquals(expected, unifyLineSeperators(o.toString()));
    }

    @Test(timeout = 250)
    public void test16() throws Exception{
        String input =  "1";

        String expected =   "---Menu---\n" +
                "1. Rock\n" +
                "2. Paper\n" +
                "3. Scissors\n" +
                "Enter selection: \n" +
                "\n" +
                "You picked: Rock\n" +
                "The computer picked: Scissors\n" +
                "Rock crushes scissors. You win!";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("RockPaperScissors"));
        Object classObject = classRef.getConstructor().newInstance();

        Method main = classRef.getMethod("main",String[].class);
        try
        {
            main.invoke(classObject,(Object)new String[]{"35"});
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        expected = unifyLineSeperators(expected);

        TestingOutputStream o = (TestingOutputStream)System.out;
        Assert.assertEquals(expected, unifyLineSeperators(o.toString()));
    }

    @Test(timeout = 250)
    public void test17() throws Exception{
        String input =  "2";

        String expected =   "---Menu---\n" +
                "1. Rock\n" +
                "2. Paper\n" +
                "3. Scissors\n" +
                "Enter selection: \n" +
                "\n" +
                "You picked: Paper\n" +
                "The computer picked: Paper\n" +
                "Tie Game.";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("RockPaperScissors"));
        Object classObject = classRef.getConstructor().newInstance();

        Method main = classRef.getMethod("main",String[].class);
        try
        {
            main.invoke(classObject,(Object)new String[]{"13"});
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        expected = unifyLineSeperators(expected);

        TestingOutputStream o = (TestingOutputStream)System.out;
        Assert.assertEquals(expected, unifyLineSeperators(o.toString()));
    }

    @Test(timeout = 250)
    public void test18() throws Exception{
        String input =  "2";

        String expected =   "---Menu---\n" +
                "1. Rock\n" +
                "2. Paper\n" +
                "3. Scissors\n" +
                "Enter selection: \n" +
                "\n" +
                "You picked: Paper\n" +
                "The computer picked: Scissors\n" +
                "Scissors cut paper. You lose.";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("RockPaperScissors"));
        Object classObject = classRef.getConstructor().newInstance();

        Method main = classRef.getMethod("main",String[].class);
        try
        {
            main.invoke(classObject,(Object)new String[]{"3"});
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        expected = unifyLineSeperators(expected);

        TestingOutputStream o = (TestingOutputStream)System.out;
        Assert.assertEquals(expected, unifyLineSeperators(o.toString()));
    }

    @Test(timeout = 250)
    public void test19() throws Exception{
        String input =  "3";

        String expected =   "---Menu---\n" +
                "1. Rock\n" +
                "2. Paper\n" +
                "3. Scissors\n" +
                "Enter selection: \n" +
                "\n" +
                "You picked: Scissors\n" +
                "The computer picked: Scissors\n" +
                "Tie Game.";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("RockPaperScissors"));
        Object classObject = classRef.getConstructor().newInstance();

        Method main = classRef.getMethod("main",String[].class);
        try
        {
            main.invoke(classObject,(Object)new String[]{"456"});
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
        expected = unifyLineSeperators(expected);

        TestingOutputStream o = (TestingOutputStream)System.out;
        Assert.assertEquals(expected, unifyLineSeperators(o.toString()));
    }

    @Test(timeout = 250)
    public void test20() throws Exception{
        String input =  "3";

        String expected =   "---Menu---\n" +
                "1. Rock\n" +
                "2. Paper\n" +
                "3. Scissors\n" +
                "Enter selection: \n" +
                "\n" +
                "You picked: Scissors\n" +
                "The computer picked: Rock\n" +
                "Rock crushes scissors. You lose.";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("RockPaperScissors"));
        Object classObject = classRef.getConstructor().newInstance();

        Method main = classRef.getMethod("main",String[].class);
        try
        {
            main.invoke(classObject,(Object)new String[]{"1"});
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
