package A10.CG1;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class A10_CH2_Tests
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
            Class<?> classRef = Class.forName(generateClassName("A10_CH2"));
            Method positiveCount = classRef.getMethod("positiveCount", int[][].class);
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

            int studentResult=(Integer)positiveCount.invoke(check,(Object)studentArray);

            Assert.assertEquals("positiveCount("+ Arrays.deepToString(teacherArray)+") failed to produce the correct result.",4,studentResult);
            Assert.assertEquals("positiveCount("+Arrays.deepToString(teacherArray)+") failed because it altered the array",Arrays.deepToString(teacherArray),Arrays.deepToString(studentArray));
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test2() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("A10_CH2"));
            Method positiveCount = classRef.getMethod("positiveCount", int[][].class);
            Object check = classRef.getConstructor().newInstance();

            int[][] studentArray;
            int[][] teacherArray;


            // Initialize each 2D array with specific values
            studentArray = new int[][] {
                    {7, 8},
                    {-9, -10},
                    {11, -12}
            };
            teacherArray = new int[][] {
                    {7, 8},
                    {-9, -10},
                    {11, -12}
            };


            int studentResult=(Integer)positiveCount.invoke(check,(Object)studentArray);

            Assert.assertEquals("positiveCount("+ Arrays.deepToString(teacherArray)+") failed to produce the correct result.",3,studentResult);
            Assert.assertEquals("positiveCount("+Arrays.deepToString(teacherArray)+") failed because it altered the array",Arrays.deepToString(teacherArray),Arrays.deepToString(studentArray));
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test3() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("A10_CH2"));
            Method positiveCount = classRef.getMethod("positiveCount", int[][].class);
            Object check = classRef.getConstructor().newInstance();

            int[][] studentArray;
            int[][] teacherArray;


            // Initialize each 2D array with specific values
            studentArray = new int[][] {
                    {-13, -14, 15, -16}
            };
            teacherArray = new int[][] {
                    {-13, -14, 15, -16}
            };

            int studentResult=(Integer)positiveCount.invoke(check,(Object)studentArray);

            Assert.assertEquals("positiveCount("+ Arrays.deepToString(teacherArray)+") failed to produce the correct result.",1,studentResult);
            Assert.assertEquals("positiveCount("+Arrays.deepToString(teacherArray)+") failed because it altered the array",Arrays.deepToString(teacherArray),Arrays.deepToString(studentArray));
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test4() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("A10_CH2"));
            Method positiveCount = classRef.getMethod("positiveCount", int[][].class);
            Object check = classRef.getConstructor().newInstance();

            int[][] studentArray;
            int[][] teacherArray;


            // Initialize each 2D array with specific values
            studentArray = new int[][] {
                    {-17, -18, -19},
                    {-20, -21, -22},
                    {-23, -24, -25}
            };
            teacherArray = new int[][] {
                    {-17, -18, -19},
                    {-20, -21, -22},
                    {-23, -24, -25}
            };

            int studentResult=(Integer)positiveCount.invoke(check,(Object)studentArray);

            Assert.assertEquals("positiveCount("+ Arrays.deepToString(teacherArray)+") failed to produce the correct result.",0,studentResult);
            Assert.assertEquals("positiveCount("+Arrays.deepToString(teacherArray)+") failed because it altered the array",Arrays.deepToString(teacherArray),Arrays.deepToString(studentArray));
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test5() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("A10_CH2"));
            Method positiveCount = classRef.getMethod("positiveCount", int[][].class);
            Object check = classRef.getConstructor().newInstance();

            int[][] studentArray;
            int[][] teacherArray;


            // Initialize each 2D array with specific values
            studentArray  = new int[][] {
                    {26, 1},
                    {1, 9},
                    {30, 31}
            };
            teacherArray = new int[][] {
                    {26, 1},
                    {1, 9},
                    {30, 31}
            };

            int studentResult=(Integer)positiveCount.invoke(check,(Object)studentArray);

            Assert.assertEquals("positiveCount("+ Arrays.deepToString(teacherArray)+") failed to produce the correct result.",6,studentResult);
            Assert.assertEquals("positiveCount("+Arrays.deepToString(teacherArray)+") failed because it altered the array",Arrays.deepToString(teacherArray),Arrays.deepToString(studentArray));
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }
}
