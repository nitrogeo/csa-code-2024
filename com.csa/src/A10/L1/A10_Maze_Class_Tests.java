package A10.L1;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class A10_Maze_Class_Tests
{
    public String generateClassName(String name)
    {
        if(getClass().toString().contains("."))
        {
            return getClass().toString().substring(6,getClass().toString().lastIndexOf(".")+1)+name;
        }
        return name;
    }

    private char[][][] testMazes=
    {
            {{'W','S','-','-'},
                    {'W','W','W','-'},
                    {'-','E','W','-'},
                    {'-','W','W','-'},
                    {'-','-','-','-'}},

            {{'-','-','-','-'},
                    {'-','W','-','W'},
                    {'W','-','-','-'},
                    {'-','W','W','-'},
                    {'-','S','-','E'}},

            {{'S','E'}}
    };

    @Test(timeout = 250)
    public void test1() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("A10_Maze"));
            Object maze = classRef.getConstructor().newInstance();
            Method won = classRef.getMethod("won");
            Method getMoveCount = classRef.getMethod("getMoveCount");
            Method getPlayerColumn = classRef.getMethod("getPlayerColumn");
            Method getPlayerRow = classRef.getMethod("getPlayerRow");
            Method move = classRef.getMethod("move",char.class);
            Method toString = classRef.getMethod("toString");

            Assert.assertEquals("toString() failed after calling the default constructor.",
                    "WWWWW-\n" +
                    "X---W-\n" +
                    "WWW-W-\n" +
                    "W-W-W-\n" +
                    "E-W---\n" +
                    "W---WW",toString.invoke(maze).toString().trim());
            Assert.assertEquals("getPlayerColumn() failed after calling the default constructor.",0,getPlayerColumn.invoke(maze));
            Assert.assertEquals("getPlayerRow() failed after calling the default constructor.",1,getPlayerRow.invoke(maze));
            Assert.assertEquals("getMoveCount() failed after calling the default constructor.",0,getMoveCount.invoke(maze));
            Assert.assertFalse("won() failed to return false, after calling the default constructor.",(Boolean) won.invoke(maze));
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test2() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("A10_Maze"));

            Method won = classRef.getMethod("won");
            Method getMoveCount = classRef.getMethod("getMoveCount");
            Method getPlayerColumn = classRef.getMethod("getPlayerColumn");
            Method getPlayerRow = classRef.getMethod("getPlayerRow");
            Method move = classRef.getMethod("move",char.class);
            Method toString = classRef.getMethod("toString");

            char[][] test = new char[][] {{'W','S','-','-'},
                    {'W','W','W','-'},
                    {'-','E','W','-'},
                    {'-','W','W','-'},
                    {'-','-','-','-'}};

            Object maze = classRef.getConstructor(char[][].class).newInstance((Object)test);
            Assert.assertEquals("toString() failed after calling the default constructor.",
                    "WX--\n" +
                    "WWW-\n" +
                    "-EW-\n" +
                    "-WW-\n" +
                    "----", toString.invoke(maze).toString().trim());
            Assert.assertEquals("getPlayerColumn() failed after constructing with Maze("+ Arrays.deepToString(test) +").", 1, getPlayerColumn.invoke(maze));
            Assert.assertEquals("getPlayerRow() failed after constructing with Maze("+ Arrays.deepToString(test) +").", 0, getPlayerRow.invoke(maze));
            Assert.assertEquals("getMoveCount() failed after constructing with Maze("+ Arrays.deepToString(test) +").", 0, getMoveCount.invoke(maze));
            Assert.assertFalse("won() failed to return false, after constructing with Maze("+ Arrays.deepToString(test) +").", (Boolean) won.invoke(maze));

        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test3() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("A10_Maze"));

            Method won = classRef.getMethod("won");
            Method getMoveCount = classRef.getMethod("getMoveCount");
            Method getPlayerColumn = classRef.getMethod("getPlayerColumn");
            Method getPlayerRow = classRef.getMethod("getPlayerRow");
            Method move = classRef.getMethod("move",char.class);
            Method toString = classRef.getMethod("toString");

            char[][] test = {{'-','-','-','-'},
                    {'-','W','-','W'},
                    {'W','-','-','-'},
                    {'-','W','W','-'},
                    {'-','S','-','E'}};

            Object maze = classRef.getConstructor(char[][].class).newInstance((Object)test);
            Assert.assertEquals("toString() failed after calling the default constructor.",
                    "----\n" +
                    "-W-W\n" +
                    "W---\n" +
                    "-WW-\n" +
                    "-X-E", toString.invoke(maze).toString().trim());
            Assert.assertEquals("getPlayerColumn() failed after constructing with Maze("+ Arrays.deepToString(test) +").", 1, getPlayerColumn.invoke(maze));
            Assert.assertEquals("getPlayerRow() failed after constructing with Maze("+ Arrays.deepToString(test) +").", 4, getPlayerRow.invoke(maze));
            Assert.assertEquals("getMoveCount() failed after constructing with Maze("+ Arrays.deepToString(test) +").", 0, getMoveCount.invoke(maze));
            Assert.assertFalse("won() failed to return false, after constructing with Maze("+ Arrays.deepToString(test) +").", (Boolean) won.invoke(maze));

        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test4() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("A10_Maze"));

            Method won = classRef.getMethod("won");
            Method getMoveCount = classRef.getMethod("getMoveCount");
            Method getPlayerColumn = classRef.getMethod("getPlayerColumn");
            Method getPlayerRow = classRef.getMethod("getPlayerRow");
            Method move = classRef.getMethod("move",char.class);
            Method toString = classRef.getMethod("toString");

            char[][] test = {{'S','E'}};

            Object maze = classRef.getConstructor(char[][].class).newInstance((Object)test);
            Assert.assertEquals("toString() failed after calling the default constructor.", "XE", toString.invoke(maze).toString().trim());
            Assert.assertEquals("getPlayerColumn() failed after constructing with Maze("+ Arrays.deepToString(test) +").", 0, getPlayerColumn.invoke(maze));
            Assert.assertEquals("getPlayerRow() failed after constructing with Maze("+ Arrays.deepToString(test) +").", 0, getPlayerRow.invoke(maze));
            Assert.assertEquals("getMoveCount() failed after constructing with Maze("+ Arrays.deepToString(test) +").", 0, getMoveCount.invoke(maze));
            Assert.assertFalse("won() failed to return false, after constructing with Maze("+ Arrays.deepToString(test) +").", (Boolean) won.invoke(maze));

        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test5() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("A10_Maze"));
            Object maze = classRef.getConstructor().newInstance();
            Method won = classRef.getMethod("won");
            Method getMoveCount = classRef.getMethod("getMoveCount");
            Method getPlayerColumn = classRef.getMethod("getPlayerColumn");
            Method getPlayerRow = classRef.getMethod("getPlayerRow");
            Method move = classRef.getMethod("move",char.class);
            Method toString = classRef.getMethod("toString");

            Assert.assertEquals("toString() failed after calling the default constructor.",
                    "WWWWW-\n" +
                    "X---W-\n" +
                    "WWW-W-\n" +
                    "W-W-W-\n" +
                    "E-W---\n" +
                    "W---WW",toString.invoke(maze).toString().trim());

            Assert.assertFalse("Move() failed to be false, when trying to walk off grid (left).",(Boolean)move.invoke(maze,'A'));
            Assert.assertFalse("Move() failed to be false, when trying to walk into a wall (down).",(Boolean)move.invoke(maze,'S'));
            Assert.assertTrue("Move() failed to be true, when trying to walking onto - (right).",(Boolean)move.invoke(maze,'D'));
            Assert.assertTrue("Move() failed to be true, when trying to walking onto - (right).",(Boolean)move.invoke(maze,'D'));
            Assert.assertTrue("Move() failed to be true, when trying to walking onto - (right).",(Boolean)move.invoke(maze,'D'));
            Assert.assertFalse("Move() failed to be false, when trying to walk into a wall (right).",(Boolean)move.invoke(maze,'D'));

            Assert.assertEquals("toString() failed after doing a few failed moves and 3 moves ot the right.",
                    "WWWWW-\n" +
                    "S--XW-\n" +
                    "WWW-W-\n" +
                    "W-W-W-\n" +
                    "E-W---\n" +
                    "W---WW", toString.invoke(maze).toString().trim());
            Assert.assertEquals("getPlayerColumn() failed after doing a few failed moves and 3 moves ot the right.", 3, getPlayerColumn.invoke(maze));
            Assert.assertEquals("getPlayerRow() failed after doing a few failed moves and 3 moves ot the right.", 1, getPlayerRow.invoke(maze));
            Assert.assertEquals("getMoveCount() failed after doing a few failed moves and 3 moves ot the right.", 3, getMoveCount.invoke(maze));
            Assert.assertFalse("won() failed to return false after doing a few failed moves and 3 moves ot the right.", (Boolean) won.invoke(maze));

            Assert.assertTrue("Move() failed to be true, when trying to walking onto - (down).",(Boolean)move.invoke(maze,'S'));
            Assert.assertFalse("Move() failed to be false, when trying to walk into a wall (left).",(Boolean)move.invoke(maze,'D'));
            Assert.assertTrue("Move() failed to be true, when trying to walking onto - (down).",(Boolean)move.invoke(maze,'S'));
            Assert.assertTrue("Move() failed to be true, when trying to walking onto - (down).",(Boolean)move.invoke(maze,'S'));
            Assert.assertTrue("Move() failed to be true, when trying to walking onto - (right).",(Boolean)move.invoke(maze,'D'));
            Assert.assertFalse("Move() failed to be false, when trying to walk into a wall (up).",(Boolean)move.invoke(maze,'W'));
            Assert.assertTrue("Move() failed to be true, when trying to walking onto - (right).",(Boolean)move.invoke(maze,'D'));
            Assert.assertFalse("Move() failed to be false, when trying to walk off grid (right).",(Boolean)move.invoke(maze,'D'));
            Assert.assertTrue("Move() failed to be true, when trying to walking onto - (up).",(Boolean)move.invoke(maze,'W'));
            Assert.assertTrue("Move() failed to be true, when trying to walking onto - (up).",(Boolean)move.invoke(maze,'W'));
            Assert.assertTrue("Move() failed to be true, when trying to walking onto - (up).",(Boolean)move.invoke(maze,'W'));
            Assert.assertTrue("Move() failed to be true, when trying to walking onto - (up).",(Boolean)move.invoke(maze,'W'));
            Assert.assertFalse("Move() failed to be false, when trying to walk off grid (up).",(Boolean)move.invoke(maze,'W'));
            Assert.assertTrue("Move() failed to be true, when trying to walking onto - (down).",(Boolean)move.invoke(maze,'S'));
            Assert.assertTrue("Move() failed to be true, when trying to walking onto - (down).",(Boolean)move.invoke(maze,'S'));
            Assert.assertTrue("Move() failed to be true, when trying to walking onto - (down).",(Boolean)move.invoke(maze,'S'));
            Assert.assertTrue("Move() failed to be true, when trying to walking onto - (down).",(Boolean)move.invoke(maze,'S'));
            Assert.assertTrue("Move() failed to be true, when trying to walking onto - (left).",(Boolean)move.invoke(maze,'A'));
            Assert.assertTrue("Move() failed to be true, when trying to walking onto - (left).",(Boolean)move.invoke(maze,'A'));
            Assert.assertTrue("Move() failed to be true, when trying to walking onto - (down).",(Boolean)move.invoke(maze,'S'));
            Assert.assertFalse("Move() failed to be false, when trying to walk off grid (down).",(Boolean)move.invoke(maze,'S'));
            Assert.assertTrue("Move() failed to be true, when trying to walking onto - (left).",(Boolean)move.invoke(maze,'A'));
            Assert.assertTrue("Move() failed to be true, when trying to walking onto - (left).",(Boolean)move.invoke(maze,'A'));
            Assert.assertTrue("Move() failed to be true, when trying to walking onto - (up).",(Boolean)move.invoke(maze,'W'));
            Assert.assertTrue("Move() failed to be true, when trying to walking onto E (left).",(Boolean)move.invoke(maze,'A'));

            Assert.assertEquals("toString() failed after reaching E.",
                    "WWWWW-\n" +
                    "S---W-\n" +
                    "WWW-W-\n" +
                    "W-W-W-\n" +
                    "X-W---\n" +
                    "W---WW", toString.invoke(maze).toString().trim());
            Assert.assertEquals("getPlayerColumn() failed after reaching E.", 0, getPlayerColumn.invoke(maze));
            Assert.assertEquals("getPlayerRow() failed after reaching E.", 4, getPlayerRow.invoke(maze));
            Assert.assertEquals("getMoveCount() failed after reaching E.", 23, getMoveCount.invoke(maze));
            Assert.assertTrue("won() failed to return true failed after reaching E.", (Boolean) won.invoke(maze));


        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }


    @Test(timeout = 250)
    public void test6() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("A10_Maze"));

            Method won = classRef.getMethod("won");
            Method getMoveCount = classRef.getMethod("getMoveCount");
            Method getPlayerColumn = classRef.getMethod("getPlayerColumn");
            Method getPlayerRow = classRef.getMethod("getPlayerRow");
            Method move = classRef.getMethod("move",char.class);
            Method toString = classRef.getMethod("toString");

            char[][] test = {{'-','-','-','-'},
                    {'-','W','-','W'},
                    {'W','-','-','-'},
                    {'-','W','W','-'},
                    {'-','S','-','E'}};

            Object maze = classRef.getConstructor(char[][].class).newInstance((Object)test);

            Assert.assertFalse("Move() failed to be false, when trying to walk into a wall (up).",(Boolean)move.invoke(maze,'W'));
            Assert.assertTrue("Move() failed to be true, when trying to walking onto - (left).",(Boolean)move.invoke(maze,'A'));
            Assert.assertTrue("Move() failed to be true, when trying to walking onto - (up).",(Boolean)move.invoke(maze,'W'));
            Assert.assertFalse("Move() failed to be false, when trying to walk off grid (left).",(Boolean)move.invoke(maze,'A'));
            Assert.assertTrue("Move() failed to be true, when trying to walking onto - (down).",(Boolean)move.invoke(maze,'S'));
            Assert.assertFalse("Move() failed to be false, when trying to walk off grid (left).",(Boolean)move.invoke(maze,'S'));

            Assert.assertTrue("Move() failed to be true, when trying to walking onto S (right).",(Boolean)move.invoke(maze,'D'));
            Assert.assertTrue("Move() failed to be true, when trying to walking onto - (right).",(Boolean)move.invoke(maze,'D'));
            Assert.assertTrue("Move() failed to be true, when trying to walking onto E (right).",(Boolean)move.invoke(maze,'D'));

            Assert.assertEquals("getPlayerColumn() failed after reaching E.", 3, getPlayerColumn.invoke(maze));
            Assert.assertEquals("getPlayerRow() failed after reaching E.", 4, getPlayerRow.invoke(maze));
            Assert.assertEquals("getMoveCount() failed after reaching E.", 6, getMoveCount.invoke(maze));
            Assert.assertTrue("won() failed to return true failed after reaching E.", (Boolean) won.invoke(maze));
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test7() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("A10_Maze"));

            Method won = classRef.getMethod("won");
            Method getMoveCount = classRef.getMethod("getMoveCount");
            Method getPlayerColumn = classRef.getMethod("getPlayerColumn");
            Method getPlayerRow = classRef.getMethod("getPlayerRow");
            Method move = classRef.getMethod("move",char.class);
            Method toString = classRef.getMethod("toString");

            char[][] test = {{'S','E'}};

            Object maze = classRef.getConstructor(char[][].class).newInstance((Object)test);
            Assert.assertEquals("toString() failed after calling the default constructor.",
                    "XE", toString.invoke(maze).toString().trim());
            Assert.assertTrue("Move() failed to be true, when trying to walking onto E (right).",(Boolean)move.invoke(maze,'D'));
            Assert.assertEquals("getPlayerColumn() failed after reaching E.", 1, getPlayerColumn.invoke(maze));
            Assert.assertEquals("getPlayerRow() failed after reaching E.", 0, getPlayerRow.invoke(maze));
            Assert.assertEquals("getMoveCount() failed after reaching E.", 1, getMoveCount.invoke(maze));
            Assert.assertTrue("won() failed to return true failed after reaching E.", (Boolean) won.invoke(maze));
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }
}
