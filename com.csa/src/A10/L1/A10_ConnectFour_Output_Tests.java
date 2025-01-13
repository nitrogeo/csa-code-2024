package A10.L1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;

public class A10_ConnectFour_Output_Tests
{
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
    public void testIO1() throws Exception{
        String input =  "0\n" +
                "1\n" +
                "1\n" +
                "2\n" +
                "2\n" +
                "1\n" +
                "2\n" +
                "3\n" +
                "3\n" +
                "3\n" +
                "3";

        String expected =   "|   |   |   |   |   |   |   |\n" +
                "|   |   |   |   |   |   |   |\n" +
                "|   |   |   |   |   |   |   |\n" +
                "|   |   |   |   |   |   |   |\n" +
                "|   |   |   |   |   |   |   |\n" +
                "|   |   |   |   |   |   |   |\n" +
                "-----------------------------\n" +
                "\n" +
                "Red enter a column for your move (0-6):\n" +
                "\n" +
                "|   |   |   |   |   |   |   |\n" +
                "|   |   |   |   |   |   |   |\n" +
                "|   |   |   |   |   |   |   |\n" +
                "|   |   |   |   |   |   |   |\n" +
                "|   |   |   |   |   |   |   |\n" +
                "| R |   |   |   |   |   |   |\n" +
                "-----------------------------\n" +
                "\n" +
                "Black enter a column for your move (0-6):\n" +
                "\n" +
                "|   |   |   |   |   |   |   |\n" +
                "|   |   |   |   |   |   |   |\n" +
                "|   |   |   |   |   |   |   |\n" +
                "|   |   |   |   |   |   |   |\n" +
                "|   |   |   |   |   |   |   |\n" +
                "| R | B |   |   |   |   |   |\n" +
                "-----------------------------\n" +
                "\n" +
                "Red enter a column for your move (0-6):\n" +
                "\n" +
                "|   |   |   |   |   |   |   |\n" +
                "|   |   |   |   |   |   |   |\n" +
                "|   |   |   |   |   |   |   |\n" +
                "|   |   |   |   |   |   |   |\n" +
                "|   | R |   |   |   |   |   |\n" +
                "| R | B |   |   |   |   |   |\n" +
                "-----------------------------\n" +
                "\n" +
                "Black enter a column for your move (0-6):\n" +
                "\n" +
                "|   |   |   |   |   |   |   |\n" +
                "|   |   |   |   |   |   |   |\n" +
                "|   |   |   |   |   |   |   |\n" +
                "|   |   |   |   |   |   |   |\n" +
                "|   | R |   |   |   |   |   |\n" +
                "| R | B | B |   |   |   |   |\n" +
                "-----------------------------\n" +
                "\n" +
                "Red enter a column for your move (0-6):\n" +
                "\n" +
                "|   |   |   |   |   |   |   |\n" +
                "|   |   |   |   |   |   |   |\n" +
                "|   |   |   |   |   |   |   |\n" +
                "|   |   |   |   |   |   |   |\n" +
                "|   | R | R |   |   |   |   |\n" +
                "| R | B | B |   |   |   |   |\n" +
                "-----------------------------\n" +
                "\n" +
                "Black enter a column for your move (0-6):\n" +
                "\n" +
                "|   |   |   |   |   |   |   |\n" +
                "|   |   |   |   |   |   |   |\n" +
                "|   |   |   |   |   |   |   |\n" +
                "|   | B |   |   |   |   |   |\n" +
                "|   | R | R |   |   |   |   |\n" +
                "| R | B | B |   |   |   |   |\n" +
                "-----------------------------\n" +
                "\n" +
                "Red enter a column for your move (0-6):\n" +
                "\n" +
                "|   |   |   |   |   |   |   |\n" +
                "|   |   |   |   |   |   |   |\n" +
                "|   |   |   |   |   |   |   |\n" +
                "|   | B | R |   |   |   |   |\n" +
                "|   | R | R |   |   |   |   |\n" +
                "| R | B | B |   |   |   |   |\n" +
                "-----------------------------\n" +
                "\n" +
                "Black enter a column for your move (0-6):\n" +
                "\n" +
                "|   |   |   |   |   |   |   |\n" +
                "|   |   |   |   |   |   |   |\n" +
                "|   |   |   |   |   |   |   |\n" +
                "|   | B | R |   |   |   |   |\n" +
                "|   | R | R |   |   |   |   |\n" +
                "| R | B | B | B |   |   |   |\n" +
                "-----------------------------\n" +
                "\n" +
                "Red enter a column for your move (0-6):\n" +
                "\n" +
                "|   |   |   |   |   |   |   |\n" +
                "|   |   |   |   |   |   |   |\n" +
                "|   |   |   |   |   |   |   |\n" +
                "|   | B | R |   |   |   |   |\n" +
                "|   | R | R | R |   |   |   |\n" +
                "| R | B | B | B |   |   |   |\n" +
                "-----------------------------\n" +
                "\n" +
                "Black enter a column for your move (0-6):\n" +
                "\n" +
                "|   |   |   |   |   |   |   |\n" +
                "|   |   |   |   |   |   |   |\n" +
                "|   |   |   |   |   |   |   |\n" +
                "|   | B | R | B |   |   |   |\n" +
                "|   | R | R | R |   |   |   |\n" +
                "| R | B | B | B |   |   |   |\n" +
                "-----------------------------\n" +
                "\n" +
                "Red enter a column for your move (0-6):\n" +
                "\n" +
                "|   |   |   |   |   |   |   |\n" +
                "|   |   |   |   |   |   |   |\n" +
                "|   |   |   | R |   |   |   |\n" +
                "|   | B | R | B |   |   |   |\n" +
                "|   | R | R | R |   |   |   |\n" +
                "| R | B | B | B |   |   |   |\n" +
                "-----------------------------\n" +
                "\n" +
                "Red Wins!";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("A10_ConnectFourMain"));
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
        Assert.assertEquals(unifyLineSeperators(expected), unifyLineSeperators(o.toString()));
    }

    @Test(timeout = 250)
    public void testIO2() throws Exception{
        String input =  "9\n" +
                "-1\n" +
                "6\n" +
                "0\n" +
                "0\n" +
                "-1\n" +
                "0\n" +
                "0\n" +
                "0\n" +
                "0\n" +
                "0\n" +
                "1\n" +
                "1\n" +
                "2\n" +
                "2\n" +
                "3";

        String expected =   "|   |   |   |   |   |   |   |\n" +
                "|   |   |   |   |   |   |   |\n" +
                "|   |   |   |   |   |   |   |\n" +
                "|   |   |   |   |   |   |   |\n" +
                "|   |   |   |   |   |   |   |\n" +
                "|   |   |   |   |   |   |   |\n" +
                "-----------------------------\n" +
                "\n" +
                "Red enter a column for your move (0-6):\n" +
                "\n" +
                "Invalid move.\n" +
                "\n" +
                "Red enter a column for your move (0-6):\n" +
                "\n" +
                "Invalid move.\n" +
                "\n" +
                "Red enter a column for your move (0-6):\n" +
                "\n" +
                "|   |   |   |   |   |   |   |\n" +
                "|   |   |   |   |   |   |   |\n" +
                "|   |   |   |   |   |   |   |\n" +
                "|   |   |   |   |   |   |   |\n" +
                "|   |   |   |   |   |   |   |\n" +
                "|   |   |   |   |   |   | R |\n" +
                "-----------------------------\n" +
                "\n" +
                "Black enter a column for your move (0-6):\n" +
                "\n" +
                "|   |   |   |   |   |   |   |\n" +
                "|   |   |   |   |   |   |   |\n" +
                "|   |   |   |   |   |   |   |\n" +
                "|   |   |   |   |   |   |   |\n" +
                "|   |   |   |   |   |   |   |\n" +
                "| B |   |   |   |   |   | R |\n" +
                "-----------------------------\n" +
                "\n" +
                "Red enter a column for your move (0-6):\n" +
                "\n" +
                "|   |   |   |   |   |   |   |\n" +
                "|   |   |   |   |   |   |   |\n" +
                "|   |   |   |   |   |   |   |\n" +
                "|   |   |   |   |   |   |   |\n" +
                "| R |   |   |   |   |   |   |\n" +
                "| B |   |   |   |   |   | R |\n" +
                "-----------------------------\n" +
                "\n" +
                "Black enter a column for your move (0-6):\n" +
                "\n" +
                "Invalid move.\n" +
                "\n" +
                "Black enter a column for your move (0-6):\n" +
                "\n" +
                "|   |   |   |   |   |   |   |\n" +
                "|   |   |   |   |   |   |   |\n" +
                "|   |   |   |   |   |   |   |\n" +
                "| B |   |   |   |   |   |   |\n" +
                "| R |   |   |   |   |   |   |\n" +
                "| B |   |   |   |   |   | R |\n" +
                "-----------------------------\n" +
                "\n" +
                "Red enter a column for your move (0-6):\n" +
                "\n" +
                "|   |   |   |   |   |   |   |\n" +
                "|   |   |   |   |   |   |   |\n" +
                "| R |   |   |   |   |   |   |\n" +
                "| B |   |   |   |   |   |   |\n" +
                "| R |   |   |   |   |   |   |\n" +
                "| B |   |   |   |   |   | R |\n" +
                "-----------------------------\n" +
                "\n" +
                "Black enter a column for your move (0-6):\n" +
                "\n" +
                "|   |   |   |   |   |   |   |\n" +
                "| B |   |   |   |   |   |   |\n" +
                "| R |   |   |   |   |   |   |\n" +
                "| B |   |   |   |   |   |   |\n" +
                "| R |   |   |   |   |   |   |\n" +
                "| B |   |   |   |   |   | R |\n" +
                "-----------------------------\n" +
                "\n" +
                "Red enter a column for your move (0-6):\n" +
                "\n" +
                "| R |   |   |   |   |   |   |\n" +
                "| B |   |   |   |   |   |   |\n" +
                "| R |   |   |   |   |   |   |\n" +
                "| B |   |   |   |   |   |   |\n" +
                "| R |   |   |   |   |   |   |\n" +
                "| B |   |   |   |   |   | R |\n" +
                "-----------------------------\n" +
                "\n" +
                "Black enter a column for your move (0-6):\n" +
                "\n" +
                "Invalid move.\n" +
                "\n" +
                "Black enter a column for your move (0-6):\n" +
                "\n" +
                "| R |   |   |   |   |   |   |\n" +
                "| B |   |   |   |   |   |   |\n" +
                "| R |   |   |   |   |   |   |\n" +
                "| B |   |   |   |   |   |   |\n" +
                "| R |   |   |   |   |   |   |\n" +
                "| B | B |   |   |   |   | R |\n" +
                "-----------------------------\n" +
                "\n" +
                "Red enter a column for your move (0-6):\n" +
                "\n" +
                "| R |   |   |   |   |   |   |\n" +
                "| B |   |   |   |   |   |   |\n" +
                "| R |   |   |   |   |   |   |\n" +
                "| B |   |   |   |   |   |   |\n" +
                "| R | R |   |   |   |   |   |\n" +
                "| B | B |   |   |   |   | R |\n" +
                "-----------------------------\n" +
                "\n" +
                "Black enter a column for your move (0-6):\n" +
                "\n" +
                "| R |   |   |   |   |   |   |\n" +
                "| B |   |   |   |   |   |   |\n" +
                "| R |   |   |   |   |   |   |\n" +
                "| B |   |   |   |   |   |   |\n" +
                "| R | R |   |   |   |   |   |\n" +
                "| B | B | B |   |   |   | R |\n" +
                "-----------------------------\n" +
                "\n" +
                "Red enter a column for your move (0-6):\n" +
                "\n" +
                "| R |   |   |   |   |   |   |\n" +
                "| B |   |   |   |   |   |   |\n" +
                "| R |   |   |   |   |   |   |\n" +
                "| B |   |   |   |   |   |   |\n" +
                "| R | R | R |   |   |   |   |\n" +
                "| B | B | B |   |   |   | R |\n" +
                "-----------------------------\n" +
                "\n" +
                "Black enter a column for your move (0-6):\n" +
                "\n" +
                "| R |   |   |   |   |   |   |\n" +
                "| B |   |   |   |   |   |   |\n" +
                "| R |   |   |   |   |   |   |\n" +
                "| B |   |   |   |   |   |   |\n" +
                "| R | R | R |   |   |   |   |\n" +
                "| B | B | B | B |   |   | R |\n" +
                "-----------------------------\n" +
                "\n" +
                "Black Wins!";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("A10_ConnectFourMain"));
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
        Assert.assertEquals(unifyLineSeperators(expected), unifyLineSeperators(o.toString()));
    }

    @Test(timeout = 250)
    public void testIO3() throws Exception{
        String input =
                "0\n" +
                        "0\n" +
                        "0\n" +
                        "0\n" +
                        "0\n" +
                        "0\n" +
                        "1\n" +
                        "1\n" +
                        "1\n" +
                        "1\n" +
                        "1\n" +
                        "1\n" +
                        "2\n" +
                        "2\n" +
                        "2\n" +
                        "2\n" +
                        "2\n" +
                        "2\n" +
                        "6\n" +
                        "3\n" +
                        "3\n" +
                        "3\n" +
                        "3\n" +
                        "3\n" +
                        "3\n" +
                        "4\n" +
                        "4\n" +
                        "4\n" +
                        "4\n" +
                        "4\n" +
                        "4\n" +
                        "5\n" +
                        "5\n" +
                        "5\n" +
                        "5\n" +
                        "5\n" +
                        "5\n" +
                        "6\n" +
                        "6\n" +
                        "6\n" +
                        "6\n" +
                        "6";

        String expected =   "|   |   |   |   |   |   |   |\n" +
                "|   |   |   |   |   |   |   |\n" +
                "|   |   |   |   |   |   |   |\n" +
                "|   |   |   |   |   |   |   |\n" +
                "|   |   |   |   |   |   |   |\n" +
                "|   |   |   |   |   |   |   |\n" +
                "-----------------------------\n" +
                "\n" +
                "Red enter a column for your move (0-6):\n" +
                "\n" +
                "|   |   |   |   |   |   |   |\n" +
                "|   |   |   |   |   |   |   |\n" +
                "|   |   |   |   |   |   |   |\n" +
                "|   |   |   |   |   |   |   |\n" +
                "|   |   |   |   |   |   |   |\n" +
                "| R |   |   |   |   |   |   |\n" +
                "-----------------------------\n" +
                "\n" +
                "Black enter a column for your move (0-6):\n" +
                "\n" +
                "|   |   |   |   |   |   |   |\n" +
                "|   |   |   |   |   |   |   |\n" +
                "|   |   |   |   |   |   |   |\n" +
                "|   |   |   |   |   |   |   |\n" +
                "| B |   |   |   |   |   |   |\n" +
                "| R |   |   |   |   |   |   |\n" +
                "-----------------------------\n" +
                "\n" +
                "Red enter a column for your move (0-6):\n" +
                "\n" +
                "|   |   |   |   |   |   |   |\n" +
                "|   |   |   |   |   |   |   |\n" +
                "|   |   |   |   |   |   |   |\n" +
                "| R |   |   |   |   |   |   |\n" +
                "| B |   |   |   |   |   |   |\n" +
                "| R |   |   |   |   |   |   |\n" +
                "-----------------------------\n" +
                "\n" +
                "Black enter a column for your move (0-6):\n" +
                "\n" +
                "|   |   |   |   |   |   |   |\n" +
                "|   |   |   |   |   |   |   |\n" +
                "| B |   |   |   |   |   |   |\n" +
                "| R |   |   |   |   |   |   |\n" +
                "| B |   |   |   |   |   |   |\n" +
                "| R |   |   |   |   |   |   |\n" +
                "-----------------------------\n" +
                "\n" +
                "Red enter a column for your move (0-6):\n" +
                "\n" +
                "|   |   |   |   |   |   |   |\n" +
                "| R |   |   |   |   |   |   |\n" +
                "| B |   |   |   |   |   |   |\n" +
                "| R |   |   |   |   |   |   |\n" +
                "| B |   |   |   |   |   |   |\n" +
                "| R |   |   |   |   |   |   |\n" +
                "-----------------------------\n" +
                "\n" +
                "Black enter a column for your move (0-6):\n" +
                "\n" +
                "| B |   |   |   |   |   |   |\n" +
                "| R |   |   |   |   |   |   |\n" +
                "| B |   |   |   |   |   |   |\n" +
                "| R |   |   |   |   |   |   |\n" +
                "| B |   |   |   |   |   |   |\n" +
                "| R |   |   |   |   |   |   |\n" +
                "-----------------------------\n" +
                "\n" +
                "Red enter a column for your move (0-6):\n" +
                "\n" +
                "| B |   |   |   |   |   |   |\n" +
                "| R |   |   |   |   |   |   |\n" +
                "| B |   |   |   |   |   |   |\n" +
                "| R |   |   |   |   |   |   |\n" +
                "| B |   |   |   |   |   |   |\n" +
                "| R | R |   |   |   |   |   |\n" +
                "-----------------------------\n" +
                "\n" +
                "Black enter a column for your move (0-6):\n" +
                "\n" +
                "| B |   |   |   |   |   |   |\n" +
                "| R |   |   |   |   |   |   |\n" +
                "| B |   |   |   |   |   |   |\n" +
                "| R |   |   |   |   |   |   |\n" +
                "| B | B |   |   |   |   |   |\n" +
                "| R | R |   |   |   |   |   |\n" +
                "-----------------------------\n" +
                "\n" +
                "Red enter a column for your move (0-6):\n" +
                "\n" +
                "| B |   |   |   |   |   |   |\n" +
                "| R |   |   |   |   |   |   |\n" +
                "| B |   |   |   |   |   |   |\n" +
                "| R | R |   |   |   |   |   |\n" +
                "| B | B |   |   |   |   |   |\n" +
                "| R | R |   |   |   |   |   |\n" +
                "-----------------------------\n" +
                "\n" +
                "Black enter a column for your move (0-6):\n" +
                "\n" +
                "| B |   |   |   |   |   |   |\n" +
                "| R |   |   |   |   |   |   |\n" +
                "| B | B |   |   |   |   |   |\n" +
                "| R | R |   |   |   |   |   |\n" +
                "| B | B |   |   |   |   |   |\n" +
                "| R | R |   |   |   |   |   |\n" +
                "-----------------------------\n" +
                "\n" +
                "Red enter a column for your move (0-6):\n" +
                "\n" +
                "| B |   |   |   |   |   |   |\n" +
                "| R | R |   |   |   |   |   |\n" +
                "| B | B |   |   |   |   |   |\n" +
                "| R | R |   |   |   |   |   |\n" +
                "| B | B |   |   |   |   |   |\n" +
                "| R | R |   |   |   |   |   |\n" +
                "-----------------------------\n" +
                "\n" +
                "Black enter a column for your move (0-6):\n" +
                "\n" +
                "| B | B |   |   |   |   |   |\n" +
                "| R | R |   |   |   |   |   |\n" +
                "| B | B |   |   |   |   |   |\n" +
                "| R | R |   |   |   |   |   |\n" +
                "| B | B |   |   |   |   |   |\n" +
                "| R | R |   |   |   |   |   |\n" +
                "-----------------------------\n" +
                "\n" +
                "Red enter a column for your move (0-6):\n" +
                "\n" +
                "| B | B |   |   |   |   |   |\n" +
                "| R | R |   |   |   |   |   |\n" +
                "| B | B |   |   |   |   |   |\n" +
                "| R | R |   |   |   |   |   |\n" +
                "| B | B |   |   |   |   |   |\n" +
                "| R | R | R |   |   |   |   |\n" +
                "-----------------------------\n" +
                "\n" +
                "Black enter a column for your move (0-6):\n" +
                "\n" +
                "| B | B |   |   |   |   |   |\n" +
                "| R | R |   |   |   |   |   |\n" +
                "| B | B |   |   |   |   |   |\n" +
                "| R | R |   |   |   |   |   |\n" +
                "| B | B | B |   |   |   |   |\n" +
                "| R | R | R |   |   |   |   |\n" +
                "-----------------------------\n" +
                "\n" +
                "Red enter a column for your move (0-6):\n" +
                "\n" +
                "| B | B |   |   |   |   |   |\n" +
                "| R | R |   |   |   |   |   |\n" +
                "| B | B |   |   |   |   |   |\n" +
                "| R | R | R |   |   |   |   |\n" +
                "| B | B | B |   |   |   |   |\n" +
                "| R | R | R |   |   |   |   |\n" +
                "-----------------------------\n" +
                "\n" +
                "Black enter a column for your move (0-6):\n" +
                "\n" +
                "| B | B |   |   |   |   |   |\n" +
                "| R | R |   |   |   |   |   |\n" +
                "| B | B | B |   |   |   |   |\n" +
                "| R | R | R |   |   |   |   |\n" +
                "| B | B | B |   |   |   |   |\n" +
                "| R | R | R |   |   |   |   |\n" +
                "-----------------------------\n" +
                "\n" +
                "Red enter a column for your move (0-6):\n" +
                "\n" +
                "| B | B |   |   |   |   |   |\n" +
                "| R | R | R |   |   |   |   |\n" +
                "| B | B | B |   |   |   |   |\n" +
                "| R | R | R |   |   |   |   |\n" +
                "| B | B | B |   |   |   |   |\n" +
                "| R | R | R |   |   |   |   |\n" +
                "-----------------------------\n" +
                "\n" +
                "Black enter a column for your move (0-6):\n" +
                "\n" +
                "| B | B | B |   |   |   |   |\n" +
                "| R | R | R |   |   |   |   |\n" +
                "| B | B | B |   |   |   |   |\n" +
                "| R | R | R |   |   |   |   |\n" +
                "| B | B | B |   |   |   |   |\n" +
                "| R | R | R |   |   |   |   |\n" +
                "-----------------------------\n" +
                "\n" +
                "Red enter a column for your move (0-6):\n" +
                "\n" +
                "| B | B | B |   |   |   |   |\n" +
                "| R | R | R |   |   |   |   |\n" +
                "| B | B | B |   |   |   |   |\n" +
                "| R | R | R |   |   |   |   |\n" +
                "| B | B | B |   |   |   |   |\n" +
                "| R | R | R |   |   |   | R |\n" +
                "-----------------------------\n" +
                "\n" +
                "Black enter a column for your move (0-6):\n" +
                "\n" +
                "| B | B | B |   |   |   |   |\n" +
                "| R | R | R |   |   |   |   |\n" +
                "| B | B | B |   |   |   |   |\n" +
                "| R | R | R |   |   |   |   |\n" +
                "| B | B | B |   |   |   |   |\n" +
                "| R | R | R | B |   |   | R |\n" +
                "-----------------------------\n" +
                "\n" +
                "Red enter a column for your move (0-6):\n" +
                "\n" +
                "| B | B | B |   |   |   |   |\n" +
                "| R | R | R |   |   |   |   |\n" +
                "| B | B | B |   |   |   |   |\n" +
                "| R | R | R |   |   |   |   |\n" +
                "| B | B | B | R |   |   |   |\n" +
                "| R | R | R | B |   |   | R |\n" +
                "-----------------------------\n" +
                "\n" +
                "Black enter a column for your move (0-6):\n" +
                "\n" +
                "| B | B | B |   |   |   |   |\n" +
                "| R | R | R |   |   |   |   |\n" +
                "| B | B | B |   |   |   |   |\n" +
                "| R | R | R | B |   |   |   |\n" +
                "| B | B | B | R |   |   |   |\n" +
                "| R | R | R | B |   |   | R |\n" +
                "-----------------------------\n" +
                "\n" +
                "Red enter a column for your move (0-6):\n" +
                "\n" +
                "| B | B | B |   |   |   |   |\n" +
                "| R | R | R |   |   |   |   |\n" +
                "| B | B | B | R |   |   |   |\n" +
                "| R | R | R | B |   |   |   |\n" +
                "| B | B | B | R |   |   |   |\n" +
                "| R | R | R | B |   |   | R |\n" +
                "-----------------------------\n" +
                "\n" +
                "Black enter a column for your move (0-6):\n" +
                "\n" +
                "| B | B | B |   |   |   |   |\n" +
                "| R | R | R | B |   |   |   |\n" +
                "| B | B | B | R |   |   |   |\n" +
                "| R | R | R | B |   |   |   |\n" +
                "| B | B | B | R |   |   |   |\n" +
                "| R | R | R | B |   |   | R |\n" +
                "-----------------------------\n" +
                "\n" +
                "Red enter a column for your move (0-6):\n" +
                "\n" +
                "| B | B | B | R |   |   |   |\n" +
                "| R | R | R | B |   |   |   |\n" +
                "| B | B | B | R |   |   |   |\n" +
                "| R | R | R | B |   |   |   |\n" +
                "| B | B | B | R |   |   |   |\n" +
                "| R | R | R | B |   |   | R |\n" +
                "-----------------------------\n" +
                "\n" +
                "Black enter a column for your move (0-6):\n" +
                "\n" +
                "| B | B | B | R |   |   |   |\n" +
                "| R | R | R | B |   |   |   |\n" +
                "| B | B | B | R |   |   |   |\n" +
                "| R | R | R | B |   |   |   |\n" +
                "| B | B | B | R |   |   |   |\n" +
                "| R | R | R | B | B |   | R |\n" +
                "-----------------------------\n" +
                "\n" +
                "Red enter a column for your move (0-6):\n" +
                "\n" +
                "| B | B | B | R |   |   |   |\n" +
                "| R | R | R | B |   |   |   |\n" +
                "| B | B | B | R |   |   |   |\n" +
                "| R | R | R | B |   |   |   |\n" +
                "| B | B | B | R | R |   |   |\n" +
                "| R | R | R | B | B |   | R |\n" +
                "-----------------------------\n" +
                "\n" +
                "Black enter a column for your move (0-6):\n" +
                "\n" +
                "| B | B | B | R |   |   |   |\n" +
                "| R | R | R | B |   |   |   |\n" +
                "| B | B | B | R |   |   |   |\n" +
                "| R | R | R | B | B |   |   |\n" +
                "| B | B | B | R | R |   |   |\n" +
                "| R | R | R | B | B |   | R |\n" +
                "-----------------------------\n" +
                "\n" +
                "Red enter a column for your move (0-6):\n" +
                "\n" +
                "| B | B | B | R |   |   |   |\n" +
                "| R | R | R | B |   |   |   |\n" +
                "| B | B | B | R | R |   |   |\n" +
                "| R | R | R | B | B |   |   |\n" +
                "| B | B | B | R | R |   |   |\n" +
                "| R | R | R | B | B |   | R |\n" +
                "-----------------------------\n" +
                "\n" +
                "Black enter a column for your move (0-6):\n" +
                "\n" +
                "| B | B | B | R |   |   |   |\n" +
                "| R | R | R | B | B |   |   |\n" +
                "| B | B | B | R | R |   |   |\n" +
                "| R | R | R | B | B |   |   |\n" +
                "| B | B | B | R | R |   |   |\n" +
                "| R | R | R | B | B |   | R |\n" +
                "-----------------------------\n" +
                "\n" +
                "Red enter a column for your move (0-6):\n" +
                "\n" +
                "| B | B | B | R | R |   |   |\n" +
                "| R | R | R | B | B |   |   |\n" +
                "| B | B | B | R | R |   |   |\n" +
                "| R | R | R | B | B |   |   |\n" +
                "| B | B | B | R | R |   |   |\n" +
                "| R | R | R | B | B |   | R |\n" +
                "-----------------------------\n" +
                "\n" +
                "Black enter a column for your move (0-6):\n" +
                "\n" +
                "| B | B | B | R | R |   |   |\n" +
                "| R | R | R | B | B |   |   |\n" +
                "| B | B | B | R | R |   |   |\n" +
                "| R | R | R | B | B |   |   |\n" +
                "| B | B | B | R | R |   |   |\n" +
                "| R | R | R | B | B | B | R |\n" +
                "-----------------------------\n" +
                "\n" +
                "Red enter a column for your move (0-6):\n" +
                "\n" +
                "| B | B | B | R | R |   |   |\n" +
                "| R | R | R | B | B |   |   |\n" +
                "| B | B | B | R | R |   |   |\n" +
                "| R | R | R | B | B |   |   |\n" +
                "| B | B | B | R | R | R |   |\n" +
                "| R | R | R | B | B | B | R |\n" +
                "-----------------------------\n" +
                "\n" +
                "Black enter a column for your move (0-6):\n" +
                "\n" +
                "| B | B | B | R | R |   |   |\n" +
                "| R | R | R | B | B |   |   |\n" +
                "| B | B | B | R | R |   |   |\n" +
                "| R | R | R | B | B | B |   |\n" +
                "| B | B | B | R | R | R |   |\n" +
                "| R | R | R | B | B | B | R |\n" +
                "-----------------------------\n" +
                "\n" +
                "Red enter a column for your move (0-6):\n" +
                "\n" +
                "| B | B | B | R | R |   |   |\n" +
                "| R | R | R | B | B |   |   |\n" +
                "| B | B | B | R | R | R |   |\n" +
                "| R | R | R | B | B | B |   |\n" +
                "| B | B | B | R | R | R |   |\n" +
                "| R | R | R | B | B | B | R |\n" +
                "-----------------------------\n" +
                "\n" +
                "Black enter a column for your move (0-6):\n" +
                "\n" +
                "| B | B | B | R | R |   |   |\n" +
                "| R | R | R | B | B | B |   |\n" +
                "| B | B | B | R | R | R |   |\n" +
                "| R | R | R | B | B | B |   |\n" +
                "| B | B | B | R | R | R |   |\n" +
                "| R | R | R | B | B | B | R |\n" +
                "-----------------------------\n" +
                "\n" +
                "Red enter a column for your move (0-6):\n" +
                "\n" +
                "| B | B | B | R | R | R |   |\n" +
                "| R | R | R | B | B | B |   |\n" +
                "| B | B | B | R | R | R |   |\n" +
                "| R | R | R | B | B | B |   |\n" +
                "| B | B | B | R | R | R |   |\n" +
                "| R | R | R | B | B | B | R |\n" +
                "-----------------------------\n" +
                "\n" +
                "Black enter a column for your move (0-6):\n" +
                "\n" +
                "| B | B | B | R | R | R |   |\n" +
                "| R | R | R | B | B | B |   |\n" +
                "| B | B | B | R | R | R |   |\n" +
                "| R | R | R | B | B | B |   |\n" +
                "| B | B | B | R | R | R | B |\n" +
                "| R | R | R | B | B | B | R |\n" +
                "-----------------------------\n" +
                "\n" +
                "Red enter a column for your move (0-6):\n" +
                "\n" +
                "| B | B | B | R | R | R |   |\n" +
                "| R | R | R | B | B | B |   |\n" +
                "| B | B | B | R | R | R |   |\n" +
                "| R | R | R | B | B | B | R |\n" +
                "| B | B | B | R | R | R | B |\n" +
                "| R | R | R | B | B | B | R |\n" +
                "-----------------------------\n" +
                "\n" +
                "Black enter a column for your move (0-6):\n" +
                "\n" +
                "| B | B | B | R | R | R |   |\n" +
                "| R | R | R | B | B | B |   |\n" +
                "| B | B | B | R | R | R | B |\n" +
                "| R | R | R | B | B | B | R |\n" +
                "| B | B | B | R | R | R | B |\n" +
                "| R | R | R | B | B | B | R |\n" +
                "-----------------------------\n" +
                "\n" +
                "Red enter a column for your move (0-6):\n" +
                "\n" +
                "| B | B | B | R | R | R |   |\n" +
                "| R | R | R | B | B | B | R |\n" +
                "| B | B | B | R | R | R | B |\n" +
                "| R | R | R | B | B | B | R |\n" +
                "| B | B | B | R | R | R | B |\n" +
                "| R | R | R | B | B | B | R |\n" +
                "-----------------------------\n" +
                "\n" +
                "Black enter a column for your move (0-6):\n" +
                "\n" +
                "| B | B | B | R | R | R | B |\n" +
                "| R | R | R | B | B | B | R |\n" +
                "| B | B | B | R | R | R | B |\n" +
                "| R | R | R | B | B | B | R |\n" +
                "| B | B | B | R | R | R | B |\n" +
                "| R | R | R | B | B | B | R |\n" +
                "-----------------------------\n" +
                "\n" +
                "Tie Game.";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("A10_ConnectFourMain"));
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
        Assert.assertEquals(unifyLineSeperators(expected), unifyLineSeperators(o.toString()));
    }


}

