package A10.CG2;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class A10_CH4_Tests
{
    public String generateClassName(String name)
    {
        if(getClass().toString().contains("."))
        {
            return getClass().toString().substring(6,getClass().toString().lastIndexOf(".")+1)+name;
        }
        return name;
    }

    @Test(timeout = 250)
    public void test1() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("A10_CH4"));
            Method columnTotals = classRef.getMethod("columnTotals", int[][].class);
            Object check = classRef.getConstructor().newInstance();

            int[][] studentArray;
            int[][] teacherArray;


            // Initialize each 2D array with specific values
            studentArray = new int[][] {
                    {1, 2, 0},
                    {4, -1, 6}
            };
            teacherArray = new int[][] {
                    {1, 2, 0},
                    {4, -1, 6}
            };

            int[] studentResult;
            studentResult = (int[])columnTotals.invoke(check,(Object)studentArray);

            Assert.assertEquals("columnTotals("+ Arrays.deepToString(teacherArray)+") failed to produce the correct result.","[5, 1, 6]",Arrays.toString(studentResult));
            Assert.assertEquals("columnTotals("+Arrays.deepToString(teacherArray)+") failed because it altered the array",Arrays.deepToString(teacherArray),Arrays.deepToString(studentArray));
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test2() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("A10_CH4"));
            Method columnTotals = classRef.getMethod("columnTotals", int[][].class);
            Object check = classRef.getConstructor().newInstance();

            int[][] studentArray;
            int[][] teacherArray;


            // Initialize each 2D array with specific values
            studentArray = new int[][] {
                    {7, 8},
                    {9, 10},
                    {11, 12}
            };
            teacherArray = new int[][] {
                    {7, 8},
                    {9, 10},
                    {11, 12}
            };

            int[] studentResult=(int[])columnTotals.invoke(check,(Object)studentArray);

            Assert.assertEquals("columnTotals("+ Arrays.deepToString(teacherArray)+") failed to produce the correct result.","[27, 30]",Arrays.toString(studentResult));
            Assert.assertEquals("columnTotals("+Arrays.deepToString(teacherArray)+") failed because it altered the array",Arrays.deepToString(teacherArray),Arrays.deepToString(studentArray));
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test3() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("A10_CH4"));
            Method columnTotals = classRef.getMethod("columnTotals", int[][].class);
            Object check = classRef.getConstructor().newInstance();

            int[][] studentArray;
            int[][] teacherArray;


            // Initialize each 2D array with specific values
            studentArray = new int[][] {
                    {13, 14, 15, 16}
            };
            teacherArray = new int[][] {
                    {13, 14, 15, 16}
            };

            int[] studentResult=(int[])columnTotals.invoke(check,(Object)studentArray);

            Assert.assertEquals("columnTotals("+ Arrays.deepToString(teacherArray)+") failed to produce the correct result.","[13, 14, 15, 16]",Arrays.toString(studentResult));
            Assert.assertEquals("columnTotals("+Arrays.deepToString(teacherArray)+") failed because it altered the array",Arrays.deepToString(teacherArray),Arrays.deepToString(studentArray));
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test4() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("A10_CH4"));
            Method columnTotals = classRef.getMethod("columnTotals", int[][].class);
            Object check = classRef.getConstructor().newInstance();

            int[][] studentArray;
            int[][] teacherArray;


            // Initialize each 2D array with specific values
            studentArray = new int[][] {
                    {17, 18, 19},
                    {20, 21, 22},
                    {23, 24, 25}
            };
            teacherArray = new int[][] {
                    {17, 18, 19},
                    {20, 21, 22},
                    {23, 24, 25}
            };

            int[] studentResult=(int[])columnTotals.invoke(check,(Object)studentArray);

            Assert.assertEquals("columnTotals("+ Arrays.deepToString(teacherArray)+") failed to produce the correct result.","[60, 63, 66]",Arrays.toString(studentResult));
            Assert.assertEquals("columnTotals("+Arrays.deepToString(teacherArray)+") failed because it altered the array",Arrays.deepToString(teacherArray),Arrays.deepToString(studentArray));
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test5() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("A10_CH4"));
            Method columnTotals = classRef.getMethod("columnTotals", int[][].class);
            Object check = classRef.getConstructor().newInstance();

            int[][] studentArray;
            int[][] teacherArray;


            // Initialize each 2D array with specific values
            studentArray  = new int[][] {
                    {26},
                    {1},
                    {30}
            };
            teacherArray = new int[][] {
                    {26},
                    {1},
                    {30}
            };

            int[] studentResult=(int[])columnTotals.invoke(check,(Object)studentArray);

            Assert.assertEquals("columnTotals("+ Arrays.deepToString(teacherArray)+") failed to produce the correct result.","[57]",Arrays.toString(studentResult));
            Assert.assertEquals("columnTotals("+Arrays.deepToString(teacherArray)+") failed because it altered the array",Arrays.deepToString(teacherArray),Arrays.deepToString(studentArray));
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }
}
