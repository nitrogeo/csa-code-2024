package A10.CG2;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class A10_CH5_Tests
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
            Class<?> classRef = Class.forName(generateClassName("A10_CH5"));
            Method equals = classRef.getMethod("equals", char[][].class, char[][].class);
            Object check = classRef.getConstructor().newInstance();

            char[][] studentArray1,studentArray2;
            char[][] teacherArray1,teacherArray2;


            // Initialize each 2D array with specific values
            studentArray1 = new char[][]{
                    {'C', 'A', 'T', 'S'},
                    {'D', 'O', 'G', 'S'},
                    {'F', 'I', 'S', 'H'},
                    {'B', 'I', 'R', 'D'}
            };
            studentArray2 = new char[][]{
                    {'C', 'A', 'T', 'S'},
                    {'D', 'O', 'M', 'S'},
                    {'F', 'I', 'S', 'H'},
                    {'B', 'I', 'R', 'D'}
            };
            teacherArray1 = new char[][]{
                    {'C', 'A', 'T', 'S'},
                    {'D', 'O', 'G', 'S'},
                    {'F', 'I', 'S', 'H'},
                    {'B', 'I', 'R', 'D'}
            };
            teacherArray2 = new char[][]{
                    {'C', 'A', 'T', 'S'},
                    {'D', 'O', 'M', 'S'},
                    {'F', 'I', 'S', 'H'},
                    {'B', 'I', 'R', 'D'}
            };

            boolean studentResult=(Boolean)equals.invoke(check,(Object)studentArray1,(Object) studentArray2);

            Assert.assertFalse("equals("+ Arrays.deepToString(teacherArray1)+", "+Arrays.deepToString(teacherArray2)+") failed to produce false.",studentResult);
            Assert.assertEquals("equals("+ Arrays.deepToString(teacherArray1)+", "+Arrays.deepToString(teacherArray2)+") failed because it altered one of the input arrays",Arrays.deepToString(teacherArray1),Arrays.deepToString(studentArray1));
            Assert.assertEquals("equals("+ Arrays.deepToString(teacherArray1)+", "+Arrays.deepToString(teacherArray2)+") failed because it altered one of the input arrays",Arrays.deepToString(teacherArray2),Arrays.deepToString(studentArray2));
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test2() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("A10_CH5"));
            Method equals = classRef.getMethod("equals", char[][].class, char[][].class);
            Object check = classRef.getConstructor().newInstance();

            char[][] studentArray1,studentArray2;
            char[][] teacherArray1,teacherArray2;


            // Initialize each 2D array with specific values
            studentArray1 = new char[][]{
                    {'C', 'A', 'T', 'S'},
                    {'D', 'O', 'G', 'S'},
                    {'F', 'I', 'S', 'H'},
                    {'B', 'I', 'R', 'D'}
            };
            studentArray2 = new char[][]{
                    {'C', 'A'},
                    {'D', 'O'},
                    {'F', 'I'},
                    {'B', 'I'}
            };
            teacherArray1 = new char[][]{
                    {'C', 'A', 'T', 'S'},
                    {'D', 'O', 'G', 'S'},
                    {'F', 'I', 'S', 'H'},
                    {'B', 'I', 'R', 'D'}
            };
            teacherArray2 = new char[][]{
                    {'C', 'A'},
                    {'D', 'O'},
                    {'F', 'I'},
                    {'B', 'I'}
            };

            boolean studentResult=(Boolean)equals.invoke(check,(Object)studentArray1,(Object) studentArray2);

            Assert.assertFalse("equals("+ Arrays.deepToString(teacherArray1)+", "+Arrays.deepToString(teacherArray2)+") failed to produce false.",studentResult);
            Assert.assertEquals("equals("+ Arrays.deepToString(teacherArray1)+", "+Arrays.deepToString(teacherArray2)+") failed because it altered one of the input arrays",Arrays.deepToString(teacherArray1),Arrays.deepToString(studentArray1));
            Assert.assertEquals("equals("+ Arrays.deepToString(teacherArray1)+", "+Arrays.deepToString(teacherArray2)+") failed because it altered one of the input arrays",Arrays.deepToString(teacherArray2),Arrays.deepToString(studentArray2));
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test3() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("A10_CH5"));
            Method equals = classRef.getMethod("equals", char[][].class, char[][].class);
            Object check = classRef.getConstructor().newInstance();

            char[][] studentArray1,studentArray2;
            char[][] teacherArray1,teacherArray2;


            // Initialize each 2D array with specific values
            studentArray1 = new char[][]{
                    {'C', 'A', 'T', 'S'},
                    {'D', 'O', 'G', 'S'},
                    {'F', 'I', 'S', 'H'},
                    {'B', 'I', 'R', 'D'}
            };
            studentArray2 = new char[][]{
                    {'C', 'A', 'T', 'S'},
                    {'D', 'O', 'M', 'S'},
                    {'F', 'I', 'S', 'H'}
            };
            teacherArray1 = new char[][]{
                    {'C', 'A', 'T', 'S'},
                    {'D', 'O', 'G', 'S'},
                    {'F', 'I', 'S', 'H'},
                    {'B', 'I', 'R', 'D'}
            };
            teacherArray2 = new char[][]{
                    {'C', 'A', 'T', 'S'},
                    {'D', 'O', 'M', 'S'},
                    {'F', 'I', 'S', 'H'}
            };

            boolean studentResult=(Boolean)equals.invoke(check,(Object)studentArray1,(Object) studentArray2);

            Assert.assertFalse("equals("+ Arrays.deepToString(teacherArray1)+", "+Arrays.deepToString(teacherArray2)+") failed to produce false.",studentResult);
            Assert.assertEquals("equals("+ Arrays.deepToString(teacherArray1)+", "+Arrays.deepToString(teacherArray2)+") failed because it altered one of the input arrays",Arrays.deepToString(teacherArray1),Arrays.deepToString(studentArray1));
            Assert.assertEquals("equals("+ Arrays.deepToString(teacherArray1)+", "+Arrays.deepToString(teacherArray2)+") failed because it altered one of the input arrays",Arrays.deepToString(teacherArray2),Arrays.deepToString(studentArray2));
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test4() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("A10_CH5"));
            Method equals = classRef.getMethod("equals", char[][].class, char[][].class);
            Object check = classRef.getConstructor().newInstance();

            char[][] studentArray1,studentArray2;
            char[][] teacherArray1,teacherArray2;


            // Initialize each 2D array with specific values
            studentArray1 = new char[][]{
                    {'C'}
            };
            studentArray2 = new char[][]{
                    {'C'}
            };
            teacherArray1 = new char[][]{
                    {'C'}
            };
            teacherArray2 = new char[][]{
                    {'C'}
            };

            boolean studentResult=(Boolean)equals.invoke(check,(Object)studentArray1,(Object) studentArray2);

            Assert.assertTrue("equals("+ Arrays.deepToString(teacherArray1)+", "+Arrays.deepToString(teacherArray2)+") failed to produce true.",studentResult);
            Assert.assertEquals("equals("+ Arrays.deepToString(teacherArray1)+", "+Arrays.deepToString(teacherArray2)+") failed because it altered one of the input arrays",Arrays.deepToString(teacherArray1),Arrays.deepToString(studentArray1));
            Assert.assertEquals("equals("+ Arrays.deepToString(teacherArray1)+", "+Arrays.deepToString(teacherArray2)+") failed because it altered one of the input arrays",Arrays.deepToString(teacherArray2),Arrays.deepToString(studentArray2));
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test5() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("A10_CH5"));
            Method equals = classRef.getMethod("equals", char[][].class, char[][].class);
            Object check = classRef.getConstructor().newInstance();

            char[][] studentArray1,studentArray2;
            char[][] teacherArray1,teacherArray2;


            // Initialize each 2D array with specific values
            studentArray1 = new char[][]{
                    {'C', 'A', 'T'},
                    {'D', 'O', 'G'},
                    {'F', 'I', 'S'},
                    {'B', 'I', 'R'}
            };
            studentArray2 = new char[][]{
                    {'C', 'A', 'T'},
                    {'D', 'O', 'G'},
                    {'F', 'I', 'S'},
                    {'B', 'I', 'R'}
            };
            teacherArray1 = new char[][]{
                    {'C', 'A', 'T'},
                    {'D', 'O', 'G'},
                    {'F', 'I', 'S'},
                    {'B', 'I', 'R'}
            };
            teacherArray2 = new char[][]{
                    {'C', 'A', 'T'},
                    {'D', 'O', 'G'},
                    {'F', 'I', 'S'},
                    {'B', 'I', 'R'}
            };

            boolean studentResult=(Boolean)equals.invoke(check,(Object)studentArray1,(Object) studentArray2);

            Assert.assertTrue("equals("+ Arrays.deepToString(teacherArray1)+", "+Arrays.deepToString(teacherArray2)+") failed to produce true.",studentResult);
            Assert.assertEquals("equals("+ Arrays.deepToString(teacherArray1)+", "+Arrays.deepToString(teacherArray2)+") failed because it altered one of the input arrays",Arrays.deepToString(teacherArray1),Arrays.deepToString(studentArray1));
            Assert.assertEquals("equals("+ Arrays.deepToString(teacherArray1)+", "+Arrays.deepToString(teacherArray2)+") failed because it altered one of the input arrays",Arrays.deepToString(teacherArray2),Arrays.deepToString(studentArray2));
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

}
