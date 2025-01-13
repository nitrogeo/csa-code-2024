package A10.L1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;

public class A10_Maze_Output_Tests
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
        String input =  "A\n" +
                "D\n" +
                "D\n" +
                "D\n" +
                "S\n" +
                "S\n" +
                "A\n" +
                "S\n" +
                "D\n" +
                "D\n" +
                "W\n" +
                "W\n" +
                "W\n" +
                "W\n" +
                "A\n" +
                "D\n" +
                "W\n" +
                "S\n" +
                "S\n" +
                "S\n" +
                "S\n" +
                "A\n" +
                "A\n" +
                "S\n" +
                "S\n" +
                "A\n" +
                "A\n" +
                "W\n" +
                "A";

        String expected =   "WWWWW-\n" +
                "X---W-\n" +
                "WWW-W-\n" +
                "W-W-W-\n" +
                "E-W---\n" +
                "W---WW\n" +
                "\n" +
                "Enter move (W - up, A - left, S - Down, D - Right):\n" +
                "Invalid move\n" +
                "Enter move (W - up, A - left, S - Down, D - Right):\n" +
                "\n" +
                "WWWWW-\n" +
                "SX--W-\n" +
                "WWW-W-\n" +
                "W-W-W-\n" +
                "E-W---\n" +
                "W---WW\n" +
                "\n" +
                "Enter move (W - up, A - left, S - Down, D - Right):\n" +
                "\n" +
                "WWWWW-\n" +
                "S-X-W-\n" +
                "WWW-W-\n" +
                "W-W-W-\n" +
                "E-W---\n" +
                "W---WW\n" +
                "\n" +
                "Enter move (W - up, A - left, S - Down, D - Right):\n" +
                "\n" +
                "WWWWW-\n" +
                "S--XW-\n" +
                "WWW-W-\n" +
                "W-W-W-\n" +
                "E-W---\n" +
                "W---WW\n" +
                "\n" +
                "Enter move (W - up, A - left, S - Down, D - Right):\n" +
                "\n" +
                "WWWWW-\n" +
                "S---W-\n" +
                "WWWXW-\n" +
                "W-W-W-\n" +
                "E-W---\n" +
                "W---WW\n" +
                "\n" +
                "Enter move (W - up, A - left, S - Down, D - Right):\n" +
                "\n" +
                "WWWWW-\n" +
                "S---W-\n" +
                "WWW-W-\n" +
                "W-WXW-\n" +
                "E-W---\n" +
                "W---WW\n" +
                "\n" +
                "Enter move (W - up, A - left, S - Down, D - Right):\n" +
                "Invalid move\n" +
                "Enter move (W - up, A - left, S - Down, D - Right):\n" +
                "\n" +
                "WWWWW-\n" +
                "S---W-\n" +
                "WWW-W-\n" +
                "W-W-W-\n" +
                "E-WX--\n" +
                "W---WW\n" +
                "\n" +
                "Enter move (W - up, A - left, S - Down, D - Right):\n" +
                "\n" +
                "WWWWW-\n" +
                "S---W-\n" +
                "WWW-W-\n" +
                "W-W-W-\n" +
                "E-W-X-\n" +
                "W---WW\n" +
                "\n" +
                "Enter move (W - up, A - left, S - Down, D - Right):\n" +
                "\n" +
                "WWWWW-\n" +
                "S---W-\n" +
                "WWW-W-\n" +
                "W-W-W-\n" +
                "E-W--X\n" +
                "W---WW\n" +
                "\n" +
                "Enter move (W - up, A - left, S - Down, D - Right):\n" +
                "\n" +
                "WWWWW-\n" +
                "S---W-\n" +
                "WWW-W-\n" +
                "W-W-WX\n" +
                "E-W---\n" +
                "W---WW\n" +
                "\n" +
                "Enter move (W - up, A - left, S - Down, D - Right):\n" +
                "\n" +
                "WWWWW-\n" +
                "S---W-\n" +
                "WWW-WX\n" +
                "W-W-W-\n" +
                "E-W---\n" +
                "W---WW\n" +
                "\n" +
                "Enter move (W - up, A - left, S - Down, D - Right):\n" +
                "\n" +
                "WWWWW-\n" +
                "S---WX\n" +
                "WWW-W-\n" +
                "W-W-W-\n" +
                "E-W---\n" +
                "W---WW\n" +
                "\n" +
                "Enter move (W - up, A - left, S - Down, D - Right):\n" +
                "\n" +
                "WWWWWX\n" +
                "S---W-\n" +
                "WWW-W-\n" +
                "W-W-W-\n" +
                "E-W---\n" +
                "W---WW\n" +
                "\n" +
                "Enter move (W - up, A - left, S - Down, D - Right):\n" +
                "Invalid move\n" +
                "Enter move (W - up, A - left, S - Down, D - Right):\n" +
                "Invalid move\n" +
                "Enter move (W - up, A - left, S - Down, D - Right):\n" +
                "Invalid move\n" +
                "Enter move (W - up, A - left, S - Down, D - Right):\n" +
                "\n" +
                "WWWWW-\n" +
                "S---WX\n" +
                "WWW-W-\n" +
                "W-W-W-\n" +
                "E-W---\n" +
                "W---WW\n" +
                "\n" +
                "Enter move (W - up, A - left, S - Down, D - Right):\n" +
                "\n" +
                "WWWWW-\n" +
                "S---W-\n" +
                "WWW-WX\n" +
                "W-W-W-\n" +
                "E-W---\n" +
                "W---WW\n" +
                "\n" +
                "Enter move (W - up, A - left, S - Down, D - Right):\n" +
                "\n" +
                "WWWWW-\n" +
                "S---W-\n" +
                "WWW-W-\n" +
                "W-W-WX\n" +
                "E-W---\n" +
                "W---WW\n" +
                "\n" +
                "Enter move (W - up, A - left, S - Down, D - Right):\n" +
                "\n" +
                "WWWWW-\n" +
                "S---W-\n" +
                "WWW-W-\n" +
                "W-W-W-\n" +
                "E-W--X\n" +
                "W---WW\n" +
                "\n" +
                "Enter move (W - up, A - left, S - Down, D - Right):\n" +
                "\n" +
                "WWWWW-\n" +
                "S---W-\n" +
                "WWW-W-\n" +
                "W-W-W-\n" +
                "E-W-X-\n" +
                "W---WW\n" +
                "\n" +
                "Enter move (W - up, A - left, S - Down, D - Right):\n" +
                "\n" +
                "WWWWW-\n" +
                "S---W-\n" +
                "WWW-W-\n" +
                "W-W-W-\n" +
                "E-WX--\n" +
                "W---WW\n" +
                "\n" +
                "Enter move (W - up, A - left, S - Down, D - Right):\n" +
                "\n" +
                "WWWWW-\n" +
                "S---W-\n" +
                "WWW-W-\n" +
                "W-W-W-\n" +
                "E-W---\n" +
                "W--XWW\n" +
                "\n" +
                "Enter move (W - up, A - left, S - Down, D - Right):\n" +
                "Invalid move\n" +
                "Enter move (W - up, A - left, S - Down, D - Right):\n" +
                "\n" +
                "WWWWW-\n" +
                "S---W-\n" +
                "WWW-W-\n" +
                "W-W-W-\n" +
                "E-W---\n" +
                "W-X-WW\n" +
                "\n" +
                "Enter move (W - up, A - left, S - Down, D - Right):\n" +
                "\n" +
                "WWWWW-\n" +
                "S---W-\n" +
                "WWW-W-\n" +
                "W-W-W-\n" +
                "E-W---\n" +
                "WX--WW\n" +
                "\n" +
                "Enter move (W - up, A - left, S - Down, D - Right):\n" +
                "\n" +
                "WWWWW-\n" +
                "S---W-\n" +
                "WWW-W-\n" +
                "W-W-W-\n" +
                "EXW---\n" +
                "W---WW\n" +
                "\n" +
                "Enter move (W - up, A - left, S - Down, D - Right):\n" +
                "\n" +
                "WWWWW-\n" +
                "S---W-\n" +
                "WWW-W-\n" +
                "W-W-W-\n" +
                "X-W---\n" +
                "W---WW\n" +
                "\n" +
                "Congratulations you solved the maze in 23 moves!";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("A10_MazeMain"));
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
        String input =  "D\n" +
                "D\n" +
                "D\n" +
                "A\n" +
                "A\n" +
                "D\n" +
                "D\n" +
                "S\n" +
                "S\n" +
                "S\n" +
                "S\n" +
                "A\n" +
                "A\n" +
                "W\n" +
                "W\n" +
                "W\n" +
                "S\n" +
                "A";

        String expected =   "WWWWW-\n" +
                "X---W-\n" +
                "WWW-W-\n" +
                "W-W-W-\n" +
                "E-W---\n" +
                "W---WW\n" +
                "\n" +
                "Enter move (W - up, A - left, S - Down, D - Right):\n" +
                "\n" +
                "WWWWW-\n" +
                "SX--W-\n" +
                "WWW-W-\n" +
                "W-W-W-\n" +
                "E-W---\n" +
                "W---WW\n" +
                "\n" +
                "Enter move (W - up, A - left, S - Down, D - Right):\n" +
                "\n" +
                "WWWWW-\n" +
                "S-X-W-\n" +
                "WWW-W-\n" +
                "W-W-W-\n" +
                "E-W---\n" +
                "W---WW\n" +
                "\n" +
                "Enter move (W - up, A - left, S - Down, D - Right):\n" +
                "\n" +
                "WWWWW-\n" +
                "S--XW-\n" +
                "WWW-W-\n" +
                "W-W-W-\n" +
                "E-W---\n" +
                "W---WW\n" +
                "\n" +
                "Enter move (W - up, A - left, S - Down, D - Right):\n" +
                "\n" +
                "WWWWW-\n" +
                "S-X-W-\n" +
                "WWW-W-\n" +
                "W-W-W-\n" +
                "E-W---\n" +
                "W---WW\n" +
                "\n" +
                "Enter move (W - up, A - left, S - Down, D - Right):\n" +
                "\n" +
                "WWWWW-\n" +
                "SX--W-\n" +
                "WWW-W-\n" +
                "W-W-W-\n" +
                "E-W---\n" +
                "W---WW\n" +
                "\n" +
                "Enter move (W - up, A - left, S - Down, D - Right):\n" +
                "\n" +
                "WWWWW-\n" +
                "S-X-W-\n" +
                "WWW-W-\n" +
                "W-W-W-\n" +
                "E-W---\n" +
                "W---WW\n" +
                "\n" +
                "Enter move (W - up, A - left, S - Down, D - Right):\n" +
                "\n" +
                "WWWWW-\n" +
                "S--XW-\n" +
                "WWW-W-\n" +
                "W-W-W-\n" +
                "E-W---\n" +
                "W---WW\n" +
                "\n" +
                "Enter move (W - up, A - left, S - Down, D - Right):\n" +
                "\n" +
                "WWWWW-\n" +
                "S---W-\n" +
                "WWWXW-\n" +
                "W-W-W-\n" +
                "E-W---\n" +
                "W---WW\n" +
                "\n" +
                "Enter move (W - up, A - left, S - Down, D - Right):\n" +
                "\n" +
                "WWWWW-\n" +
                "S---W-\n" +
                "WWW-W-\n" +
                "W-WXW-\n" +
                "E-W---\n" +
                "W---WW\n" +
                "\n" +
                "Enter move (W - up, A - left, S - Down, D - Right):\n" +
                "\n" +
                "WWWWW-\n" +
                "S---W-\n" +
                "WWW-W-\n" +
                "W-W-W-\n" +
                "E-WX--\n" +
                "W---WW\n" +
                "\n" +
                "Enter move (W - up, A - left, S - Down, D - Right):\n" +
                "\n" +
                "WWWWW-\n" +
                "S---W-\n" +
                "WWW-W-\n" +
                "W-W-W-\n" +
                "E-W---\n" +
                "W--XWW\n" +
                "\n" +
                "Enter move (W - up, A - left, S - Down, D - Right):\n" +
                "\n" +
                "WWWWW-\n" +
                "S---W-\n" +
                "WWW-W-\n" +
                "W-W-W-\n" +
                "E-W---\n" +
                "W-X-WW\n" +
                "\n" +
                "Enter move (W - up, A - left, S - Down, D - Right):\n" +
                "\n" +
                "WWWWW-\n" +
                "S---W-\n" +
                "WWW-W-\n" +
                "W-W-W-\n" +
                "E-W---\n" +
                "WX--WW\n" +
                "\n" +
                "Enter move (W - up, A - left, S - Down, D - Right):\n" +
                "\n" +
                "WWWWW-\n" +
                "S---W-\n" +
                "WWW-W-\n" +
                "W-W-W-\n" +
                "EXW---\n" +
                "W---WW\n" +
                "\n" +
                "Enter move (W - up, A - left, S - Down, D - Right):\n" +
                "\n" +
                "WWWWW-\n" +
                "S---W-\n" +
                "WWW-W-\n" +
                "WXW-W-\n" +
                "E-W---\n" +
                "W---WW\n" +
                "\n" +
                "Enter move (W - up, A - left, S - Down, D - Right):\n" +
                "Invalid move\n" +
                "Enter move (W - up, A - left, S - Down, D - Right):\n" +
                "\n" +
                "WWWWW-\n" +
                "S---W-\n" +
                "WWW-W-\n" +
                "W-W-W-\n" +
                "EXW---\n" +
                "W---WW\n" +
                "\n" +
                "Enter move (W - up, A - left, S - Down, D - Right):\n" +
                "\n" +
                "WWWWW-\n" +
                "S---W-\n" +
                "WWW-W-\n" +
                "W-W-W-\n" +
                "X-W---\n" +
                "W---WW\n" +
                "\n" +
                "Congratulations you solved the maze in 17 moves!";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("A10_MazeMain"));
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

