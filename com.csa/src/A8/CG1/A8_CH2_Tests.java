package A8.CG1;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class A8_CH2_Tests
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
            Class<?> classRef = Class.forName(generateClassName("A8_CH2"));
            Method swap = classRef.getMethod("swap", int[].class, int.class, int.class);
            Object obj = classRef.getConstructor().newInstance();

            int[] studentList = {1,2,3,4,5,6,7,8,9,10};
            int index1 = 0;
            int index2 = 0;
            int[] result =  {1,2,3,4,5,6,7,8,9,10};
            swap.invoke(obj,studentList,index1,index2);
            Assert.assertEquals("swap("+ Arrays.toString(studentList)+","+index1+"," +index2+"), failed.", Arrays.toString(result), Arrays.toString(studentList));
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }
    @Test(timeout = 250)
    public void test2() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("A8_CH2"));
            Method swap = classRef.getMethod("swap", int[].class, int.class, int.class);
            Object obj = classRef.getConstructor().newInstance();

            int[] studentList = {1,2,3,4,5,6,7,8,9,10};
            int index1 = 0;
            int index2 = 8;
            int[] result =  {9,2,3,4,5,6,7,8,1,10};
            swap.invoke(obj,studentList,index1,index2);
            Assert.assertEquals("swap("+ Arrays.toString(studentList)+","+index1+"," +index2+"), failed.", Arrays.toString(result), Arrays.toString(studentList));
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test3() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("A8_CH2"));
            Method swap = classRef.getMethod("swap", int[].class, int.class, int.class);
            Object obj = classRef.getConstructor().newInstance();

            int[] studentList = {1,2,3,4,5,6,7,8,9,10};
            int index1 = 3;
            int index2 = 4;
            int[] result =  {1,2,3,5,4,6,7,8,9,10};
            swap.invoke(obj,studentList,index1,index2);
            Assert.assertEquals("swap("+ Arrays.toString(studentList)+","+index1+"," +index2+"), failed.", Arrays.toString(result), Arrays.toString(studentList));
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test4() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("A8_CH2"));
            Method swap = classRef.getMethod("swap", int[].class, int.class, int.class);
            Object obj = classRef.getConstructor().newInstance();

            int[] studentList = {17,88,4,88,5,6,7,8};
            int index1 = 1;
            int index2 = 3;
            int[] result =  {17,88,4,88,5,6,7,8};
            swap.invoke(obj,studentList,index1,index2);
            Assert.assertEquals("swap("+ Arrays.toString(studentList)+","+index1+"," +index2+"), failed.", Arrays.toString(result), Arrays.toString(studentList));
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test5() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("A8_CH2"));
            Method swap = classRef.getMethod("swap", int[].class, int.class, int.class);
            Object obj = classRef.getConstructor().newInstance();

            int[] studentList = {17,88,4,88,5,6,7,8};
            int index1 = 3;
            int index2 = 7;
            int[] result =  {17,88,4,8,5,6,7,88};
            swap.invoke(obj,studentList,index1,index2);
            Assert.assertEquals("swap("+ Arrays.toString(studentList)+","+index1+"," +index2+"), failed.", Arrays.toString(result), Arrays.toString(studentList));
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test6() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("A8_CH2"));
            Method swap = classRef.getMethod("swap", int[].class, int.class, int.class);
            Object obj = classRef.getConstructor().newInstance();

            int[] studentList = {17,88,4,88,5,6,7,8};
            int index1 = 5;
            int index2 = 6;
            int[] result =  {17,88,4,88,5,7,6,8};
            swap.invoke(obj,studentList,index1,index2);
            Assert.assertEquals("swap("+ Arrays.toString(studentList)+","+index1+"," +index2+"), failed.", Arrays.toString(result), Arrays.toString(studentList));
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

}
