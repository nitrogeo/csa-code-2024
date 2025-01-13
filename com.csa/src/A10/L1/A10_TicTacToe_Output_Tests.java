package A10.L1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;

public class A10_TicTacToe_Output_Tests
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
        String input =  "1\n" +
                "1\n" +
                "0\n" +
                "1\n" +
                "2\n" +
                "2\n" +
                "1\n" +
                "0\n" +
                "0\n" +
                "0";

        String expected =   "   |   |   \n" +
                "-----------\n" +
                "   |   |   \n" +
                "-----------\n" +
                "   |   |   \n" +
                "\n" +
                "X enter the column for your move (0-2):\n" +
                "X enter the row for your move(0-2):\n" +
                "\n" +
                "   |   |   \n" +
                "-----------\n" +
                "   | X |   \n" +
                "-----------\n" +
                "   |   |   \n" +
                "\n" +
                "O enter the column for your move (0-2):\n" +
                "O enter the row for your move(0-2):\n" +
                "\n" +
                "   |   |   \n" +
                "-----------\n" +
                " O | X |   \n" +
                "-----------\n" +
                "   |   |   \n" +
                "\n" +
                "X enter the column for your move (0-2):\n" +
                "X enter the row for your move(0-2):\n" +
                "\n" +
                "   |   |   \n" +
                "-----------\n" +
                " O | X |   \n" +
                "-----------\n" +
                "   |   | X \n" +
                "\n" +
                "O enter the column for your move (0-2):\n" +
                "O enter the row for your move(0-2):\n" +
                "\n" +
                "   | O |   \n" +
                "-----------\n" +
                " O | X |   \n" +
                "-----------\n" +
                "   |   | X \n" +
                "\n" +
                "X enter the column for your move (0-2):\n" +
                "X enter the row for your move(0-2):\n" +
                "\n" +
                " X | O |   \n" +
                "-----------\n" +
                " O | X |   \n" +
                "-----------\n" +
                "   |   | X \n" +
                "\n" +
                "X WINS!";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("A10_TicTacToe"));
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
        String input =  "1\n" +
                "1\n" +
                "1\n" +
                "1\n" +
                "2\n" +
                "5\n" +
                "3\n" +
                "3\n" +
                "0\n" +
                "0\n" +
                "1\n" +
                "2\n" +
                "1\n" +
                "0\n" +
                "2\n" +
                "2\n" +
                "2\n" +
                "0";

        String expected =   "   |   |   \n" +
                "-----------\n" +
                "   |   |   \n" +
                "-----------\n" +
                "   |   |   \n" +
                "\n" +
                "X enter the column for your move (0-2):\n" +
                "X enter the row for your move(0-2):\n" +
                "\n" +
                "   |   |   \n" +
                "-----------\n" +
                "   | X |   \n" +
                "-----------\n" +
                "   |   |   \n" +
                "\n" +
                "O enter the column for your move (0-2):\n" +
                "O enter the row for your move(0-2):\n" +
                "\n" +
                "Invalid move, enter a new move.\n" +
                "\n" +
                "O enter the column for your move (0-2):\n" +
                "O enter the row for your move(0-2):\n" +
                "\n" +
                "Invalid move, enter a new move.\n" +
                "\n" +
                "O enter the column for your move (0-2):\n" +
                "O enter the row for your move(0-2):\n" +
                "\n" +
                "Invalid move, enter a new move.\n" +
                "\n" +
                "O enter the column for your move (0-2):\n" +
                "O enter the row for your move(0-2):\n" +
                "\n" +
                " O |   |   \n" +
                "-----------\n" +
                "   | X |   \n" +
                "-----------\n" +
                "   |   |   \n" +
                "\n" +
                "X enter the column for your move (0-2):\n" +
                "X enter the row for your move(0-2):\n" +
                "\n" +
                " O |   |   \n" +
                "-----------\n" +
                "   | X |   \n" +
                "-----------\n" +
                "   | X |   \n" +
                "\n" +
                "O enter the column for your move (0-2):\n" +
                "O enter the row for your move(0-2):\n" +
                "\n" +
                " O | O |   \n" +
                "-----------\n" +
                "   | X |   \n" +
                "-----------\n" +
                "   | X |   \n" +
                "\n" +
                "X enter the column for your move (0-2):\n" +
                "X enter the row for your move(0-2):\n" +
                "\n" +
                " O | O |   \n" +
                "-----------\n" +
                "   | X |   \n" +
                "-----------\n" +
                "   | X | X \n" +
                "\n" +
                "O enter the column for your move (0-2):\n" +
                "O enter the row for your move(0-2):\n" +
                "\n" +
                " O | O | O \n" +
                "-----------\n" +
                "   | X |   \n" +
                "-----------\n" +
                "   | X | X \n" +
                "\n" +
                "O WINS!";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("A10_TicTacToe"));
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
                "1\n" +
                "1\n" +
                "0\n" +
                "0\n" +
                "2\n" +
                "2\n" +
                "2\n" +
                "0\n" +
                "1\n" +
                "0\n" +
                "1\n" +
                "2\n" +
                "2\n" +
                "0\n" +
                "2\n" +
                "1\n" +
                "1\n" +
                "0\n" +
                "2\n" +
                "2\n" +
                "0\n" +
                "1\n" +
                "0\n" +

                "2";

        String expected =   "   |   |   \n" +
                "-----------\n" +
                "   |   |   \n" +
                "-----------\n" +
                "   |   |   \n" +
                "\n" +
                "X enter the column for your move (0-2):\n" +
                "X enter the row for your move(0-2):\n" +
                "\n" +
                "   |   |   \n" +
                "-----------\n" +
                "   | X |   \n" +
                "-----------\n" +
                "   |   |   \n" +
                "\n" +
                "O enter the column for your move (0-2):\n" +
                "O enter the row for your move(0-2):\n" +
                "\n" +
                " O |   |   \n" +
                "-----------\n" +
                "   | X |   \n" +
                "-----------\n" +
                "   |   |   \n" +
                "\n" +
                "X enter the column for your move (0-2):\n" +
                "X enter the row for your move(0-2):\n" +
                "\n" +
                " O |   |   \n" +
                "-----------\n" +
                "   | X |   \n" +
                "-----------\n" +
                "   |   | X \n" +
                "\n" +
                "O enter the column for your move (0-2):\n" +
                "O enter the row for your move(0-2):\n" +
                "\n" +
                " O |   | O \n" +
                "-----------\n" +
                "   | X |   \n" +
                "-----------\n" +
                "   |   | X \n" +
                "\n" +
                "X enter the column for your move (0-2):\n" +
                "X enter the row for your move(0-2):\n" +
                "\n" +
                " O | X | O \n" +
                "-----------\n" +
                "   | X |   \n" +
                "-----------\n" +
                "   |   | X \n" +
                "\n" +
                "O enter the column for your move (0-2):\n" +
                "O enter the row for your move(0-2):\n" +
                "\n" +
                " O | X | O \n" +
                "-----------\n" +
                "   | X |   \n" +
                "-----------\n" +
                "   | O | X \n" +
                "\n" +
                "X enter the column for your move (0-2):\n" +
                "X enter the row for your move(0-2):\n" +
                "\n" +
                "Invalid move, enter a new move.\n" +
                "\n" +
                "X enter the column for your move (0-2):\n" +
                "X enter the row for your move(0-2):\n" +
                "\n" +
                " O | X | O \n" +
                "-----------\n" +
                "   | X | X \n" +
                "-----------\n" +
                "   | O | X \n" +
                "\n" +
                "O enter the column for your move (0-2):\n" +
                "O enter the row for your move(0-2):\n" +
                "\n" +
                "Invalid move, enter a new move.\n" +
                "\n" +
                "O enter the column for your move (0-2):\n" +
                "O enter the row for your move(0-2):\n" +
                "\n" +
                "Invalid move, enter a new move.\n" +
                "\n" +
                "O enter the column for your move (0-2):\n" +
                "O enter the row for your move(0-2):\n" +
                "\n" +
                " O | X | O \n" +
                "-----------\n" +
                " O | X | X \n" +
                "-----------\n" +
                "   | O | X \n" +
                "\n" +
                "X enter the column for your move (0-2):\n" +
                "X enter the row for your move(0-2):\n" +
                "\n" +
                " O | X | O \n" +
                "-----------\n" +
                " O | X | X \n" +
                "-----------\n" +
                " X | O | X \n" +
                "\n" +
                "Cats game.";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("A10_TicTacToe"));
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

