package A10.L1;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class A10_TicTacToe_Method_Tests
{
    public String generateClassName(String name)
    {
        if(getClass().toString().contains("."))
        {
            return getClass().toString().substring(6,getClass().toString().lastIndexOf(".")+1)+name;
        }
        return name;
    }

    private char[][][] catBoards=
            {
                    {{'X','X','O'},
                    {'O','O','X'},
                    {'X','X','O'}},

                    {{'O','X','X'},
                    {'X','O','O'},
                    {'X','O','X'}},

                    {{'O','O','X'},
                    {'X','X','O'},
                    {'O','X','X'}},

                    {{'O','X','X'},
                    {'X','O','O'},
                    {'O','X','X'}},
            };

    private char[][][] inProgressBoards=
            {
                    {{' ',' ','X'},
                    {' ',' ',' '},
                    {' ',' ',' '}},

                    {{'O',' ','X'},
                    {'X',' ',' '},
                    {' ','O','X'}},

                    {{'O','O','X'},
                    {'X','X','O'},
                    {'O',' ','X'}},

                    {{'O','X',' '},
                    {'X',' ','O'},
                    {'O','X','X'}},
            };

    private char[][][] xWinsBoards=
            {
                    {{' ','O','X'},
                    {' ','X',' '},
                    {'X','O',' '}},

                    {{'X',' ','X'},
                    {'O','X','O'},
                    {' ','O','X'}},

                    {{'X','X','X'},
                    {' ','O',' '},
                    {'O','O','X'}},

                    {{'O','X',' '},
                    {'X','X','X'},
                    {'O','O',' '}},

                    {{'O','X','O'},
                    {'X','O','O'},
                    {'X','X','X'}},

                    {{'X','O','O'},
                    {'X','O',' '},
                    {'X',' ','X'}},

                    {{'O','X',' '},
                    {' ','X','O'},
                    {'O','X','X'}},

                    {{'O','O','X'},
                    {' ',' ','X'},
                    {' ',' ','X'}}
            };

    private char[][][] oWinsBoards=
            {
                    {{' ','X','O'},
                    {'X','O',' '},
                    {'O','X',' '}},

                    {{'O',' ',' '},
                    {'X','O','X'},
                    {' ','X','O'}},

                    {{'O','O','O'},
                    {' ','X',' '},
                    {'X','X',' '}},

                    {{' ','X',' '},
                    {'O','O','O'},
                    {'X','X',' '}},

                    {{'O','X','X'},
                    {'X',' ','X'},
                    {'O','O','O'}},

                    {{'O','X','X'},
                    {'O',' ','O'},
                    {'O','X','X'}},

                    {{'X','O',' '},
                    {' ','O',' '},
                    {'X','O','X'}},

                    {{'X','X','O'},
                    {' ',' ','O'},
                    {'X',' ','O'}}
            };

    // Cat Checks (True)
    @Test(timeout = 250)
    public void test1() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("A10_TicTacToe"));
            Object check = classRef.getConstructor().newInstance();
            Method isCat = classRef.getMethod("isCat",char[][].class);

            for(char[][] b: catBoards)
                Assert.assertTrue("isCat("+Arrays.deepToString(b)+") failed to return true.",(Boolean) isCat.invoke(check,(Object)b));
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    // Cat Checks (False)
    @Test(timeout = 250)
    public void test2() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("A10_TicTacToe"));
            Object check = classRef.getConstructor().newInstance();
            Method isCat = classRef.getMethod("isCat",char[][].class);

            for(char[][] b: inProgressBoards)
                Assert.assertFalse("isCat("+Arrays.deepToString(b)+") failed to return false.",(Boolean) isCat.invoke(check,(Object)b));
            for(char[][] b: xWinsBoards)
                Assert.assertFalse("isCat("+Arrays.deepToString(b)+") failed to return false.",(Boolean) isCat.invoke(check,(Object)b));
            for(char[][] b: oWinsBoards)
                Assert.assertFalse("isCat("+Arrays.deepToString(b)+") failed to return false.",(Boolean) isCat.invoke(check,(Object)b));
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    // isWinnerX (True)
    @Test(timeout = 250)
    public void test3() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("A10_TicTacToe"));
            Object check = classRef.getConstructor().newInstance();
            Method isWinner = classRef.getMethod("isWinner",char[][].class,char.class);

            for(char[][] b: xWinsBoards)
                Assert.assertTrue("isWinner("+Arrays.deepToString(b)+",'X') failed to return true.",(Boolean) isWinner.invoke(check,(Object)b,'X'));
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    // isWinnerX (False)
    @Test(timeout = 250)
    public void test4() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("A10_TicTacToe"));
            Object check = classRef.getConstructor().newInstance();
            Method isWinner = classRef.getMethod("isWinner",char[][].class,char.class);

            for(char[][] b: inProgressBoards)
                Assert.assertFalse("isWinner("+Arrays.deepToString(b)+",'X') failed to return false.",(Boolean) isWinner.invoke(check,(Object)b,'X'));
            for(char[][] b: catBoards)
                Assert.assertFalse("isWinner("+Arrays.deepToString(b)+",'X') failed to return false.",(Boolean) isWinner.invoke(check,(Object)b,'X'));
            for(char[][] b: oWinsBoards)
                Assert.assertFalse("isWinner("+Arrays.deepToString(b)+",'X') failed to return false.",(Boolean) isWinner.invoke(check,(Object)b,'X'));
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    // isWinnerO (True)
    @Test(timeout = 250)
    public void test5() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("A10_TicTacToe"));
            Object check = classRef.getConstructor().newInstance();
            Method isWinner = classRef.getMethod("isWinner",char[][].class,char.class);

            for(char[][] b: oWinsBoards)
                Assert.assertTrue("isWinner("+Arrays.deepToString(b)+",'X') failed to return true.",(Boolean) isWinner.invoke(check,(Object)b,'O'));
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    // isWinnerO (False)
    @Test(timeout = 250)
    public void test6() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("A10_TicTacToe"));
            Object check = classRef.getConstructor().newInstance();
            Method isWinner = classRef.getMethod("isWinner",char[][].class,char.class);

            for(char[][] b: inProgressBoards)
                Assert.assertFalse("isWinner("+Arrays.deepToString(b)+",'O') failed to return true.",(Boolean) isWinner.invoke(check,(Object)b,'O'));
            for(char[][] b: catBoards)
                Assert.assertFalse("isWinner("+Arrays.deepToString(b)+",'O') failed to return true.",(Boolean) isWinner.invoke(check,(Object)b,'O'));
            for(char[][] b: xWinsBoards)
                Assert.assertFalse("isWinner("+Arrays.deepToString(b)+",'O') failed to return true.",(Boolean) isWinner.invoke(check,(Object)b,'O'));
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }
}
