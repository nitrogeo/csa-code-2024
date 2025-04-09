package A13;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Scanner;

public class Maze_Tests {
    public String generateClassName(String name)
    {
        if(getClass().toString().contains("."))
        {
            return getClass().toString().substring(6,getClass().toString().lastIndexOf(".")+1)+name;
        }
        return name;
    }



    @Before
    public void setup()
    {
    }



    public boolean[][] createVisited(char[][] grid)
    {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        return visited;
    }

    @Test(timeout = 250)
    public void test1() throws Exception
    {
        try
        {
            Class<?> classRef = Class.forName(generateClassName("Maze"));
            Method method = classRef.getMethod("isSolvable", char[][].class, boolean[][].class, int.class, int.class);

            char[][] grid = {   {'S', 'E'}};
            boolean[][] visited = createVisited(grid);
            boolean actual = (boolean) method.invoke(method, (Object) grid, visited, 0,0);
            boolean expected = true;

            Assert.assertEquals(expected,actual);
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

            Class<?> classRef = Class.forName(generateClassName("Maze"));
            Method method = classRef.getMethod("isSolvable", char[][].class, boolean[][].class, int.class, int.class);

            char[][] grid = {   {'S'},
                    {'E'}};
            boolean[][] visited = createVisited(grid);
            boolean actual = (boolean) method.invoke(method, (Object) grid, visited, 0,0);
            boolean expected = true;

            Assert.assertEquals(expected,actual);
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

            Class<?> classRef = Class.forName(generateClassName("Maze"));
            Method method = classRef.getMethod("isSolvable", char[][].class, boolean[][].class, int.class, int.class);

            char[][] grid = {   {'S', 'W', 'E'}};
            boolean[][] visited = createVisited(grid);
            boolean actual = (boolean) method.invoke(method, (Object) grid, visited, 0,0);
            boolean expected = false;

            Assert.assertEquals(expected,actual);
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

            Class<?> classRef = Class.forName(generateClassName("Maze"));
            Method method = classRef.getMethod("isSolvable", char[][].class, boolean[][].class, int.class, int.class);

            char[][] grid = {   {'-','-','E'},

                    {'W','-','W'},
                    {'W','-','S'}};
            boolean[][] visited = createVisited(grid);
            boolean actual = (boolean) method.invoke(method, (Object) grid, visited, 2,2);
            boolean expected = true;

            Assert.assertEquals(expected,actual);
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

            Class<?> classRef = Class.forName(generateClassName("Maze"));
            Method method = classRef.getMethod("isSolvable", char[][].class, boolean[][].class, int.class, int.class);

            char[][] grid = {   {'-','W','E'},
                    {'-','-','W'},
                    {'-','-','S'}};
            boolean[][] visited = createVisited(grid);
            boolean actual = (boolean) method.invoke(method, (Object) grid, visited, 0,0);
            boolean expected = false;

            Assert.assertEquals(expected,actual);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test6() throws Exception
    {
        try
        {

            Class<?> classRef = Class.forName(generateClassName("Maze"));
            Method method = classRef.getMethod("isSolvable", char[][].class, boolean[][].class, int.class, int.class);

            char[][] grid = {   {'-','S','W','-','-','-'},
                    {'-','W','-','-','W','-'},
                    {'-','-','-','-','W','E'}};
            boolean[][] visited = createVisited(grid);
            boolean actual = (boolean) method.invoke(method, (Object) grid, visited, 1,0);
            boolean expected = true;

            Assert.assertEquals(expected,actual);
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

            Class<?> classRef = Class.forName(generateClassName("Maze"));
            Method method = classRef.getMethod("isSolvable", char[][].class, boolean[][].class, int.class, int.class);

            char[][] grid = {   {'-','S','W','-','-','W'},
                    {'-','W','-','-','W','-'},
                    {'-','-','-','W','W','E'}};
            boolean[][] visited = createVisited(grid);
            boolean actual = (boolean) method.invoke(method, (Object) grid, visited, 0,0);
            boolean expected = false;

            Assert.assertEquals(expected,actual);
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

            Class<?> classRef = Class.forName(generateClassName("Maze"));
            Method method = classRef.getMethod("isSolvable", char[][].class, boolean[][].class, int.class, int.class);

            char[][] grid = {   {'-','-','-','-','-','-'},
                    {'E','-','-','-','-','S'},
                    {'-','-','-','-','-','-'}};
            boolean[][] visited = createVisited(grid);
            boolean actual = (boolean) method.invoke(method, (Object) grid, visited, 5,1);
            boolean expected = true;

            Assert.assertEquals(expected,actual);
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

            Class<?> classRef = Class.forName(generateClassName("Maze"));
            Method method = classRef.getMethod("isSolvable", char[][].class, boolean[][].class, int.class, int.class);

            char[][] grid = {   {'-','-','-','-','W','-'},
                    {'-','W','W','-','-','-'},
                    {'-','-','S','W','-','W'},
                    {'W','-','W','-','-','-'},
                    {'-','W','-','W','E','W'}};
            boolean[][] visited = createVisited(grid);
            boolean actual = (boolean) method.invoke(method, (Object) grid, visited, 2,2);
            boolean expected = true;

            Assert.assertEquals(expected,actual);
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

            Class<?> classRef = Class.forName(generateClassName("Maze"));
            Method method = classRef.getMethod("isSolvable", char[][].class, boolean[][].class, int.class, int.class);

            char[][] grid = {   {'-','-','-','-','W','-'},
                    {'-','W','W','-','-','-'},
                    {'-','-','S','W','-','W'},
                    {'W','-','W','-','-','-'},
                    {'E','W','-','W','-','W'}};
            boolean[][] visited = createVisited(grid);
            boolean actual = (boolean) method.invoke(method, (Object) grid, visited, 0,0);
            boolean expected = false;

            Assert.assertEquals(expected,actual);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }
}
