package A10.CG1;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

public class A11_CH4_Tests 
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
            Class<?> classRef = Class.forName(generateClassName("A11_CH4"));
            Method removeInts = classRef.getMethod("removeInts", ArrayList.class, int[].class);
            Object check = classRef.getConstructor().newInstance();

            int[] teacherList = {3,4,5,-1};
            int[] r ={3};

            ArrayList<Integer> studentAL = new ArrayList<>();

            for(Integer i:teacherList)
                studentAL.add(i);

            removeInts.invoke(check,studentAL,r);
            Assert.assertEquals("removeInts("+ Arrays.toString(teacherList)+") failed to produce the correct result.","[4, 5, -1]", studentAL.toString());
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test2() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("A11_CH4"));
            Method removeInts = classRef.getMethod("removeInts", ArrayList.class, int[].class);
            Object check = classRef.getConstructor().newInstance();

            int[] teacherList = {1};
            int[] r = {0};
            ArrayList<Integer> studentAL = new ArrayList<>();

            for(Integer i:teacherList)
                studentAL.add(i);

            removeInts.invoke(check,studentAL,r);
            Assert.assertEquals("removeInts("+ Arrays.toString(teacherList)+") failed to produce the correct result.","[1]", studentAL.toString());
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test3() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("A11_CH4"));
            Method removeInts = classRef.getMethod("removeInts", ArrayList.class, int[].class);
            Object check = classRef.getConstructor().newInstance();

            int[] teacherList = {2,3,3};
            int[] r = {2,3};
            ArrayList<Integer> studentAL = new ArrayList<>();

            for(Integer i:teacherList)
                studentAL.add(i);

            removeInts.invoke(check,studentAL,r);
            Assert.assertEquals("removeInts("+ Arrays.toString(teacherList)+") failed to produce the correct result.","[]", studentAL.toString());
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test4() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("A11_CH4"));
            Method removeInts = classRef.getMethod("removeInts", ArrayList.class, int[].class);
            Object check = classRef.getConstructor().newInstance();

            int[] teacherList = {1,2,3,1,5,1};
            int[] r = {1,3};
            ArrayList<Integer> studentAL = new ArrayList<>();

            for(Integer i:teacherList)
                studentAL.add(i);

            removeInts.invoke(check,studentAL,r);
            Assert.assertEquals("removeInts("+ Arrays.toString(teacherList)+") failed to produce the correct result.","[2, 5]", studentAL.toString());
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test5() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("A11_CH4"));
            Method removeInts = classRef.getMethod("removeInts", ArrayList.class, int[].class);
            Object check = classRef.getConstructor().newInstance();

            int[] teacherList = {0,5,4,0,875};
            int[] r = {-1,875};
            ArrayList<Integer> studentAL = new ArrayList<>();

            for(Integer i:teacherList)
                studentAL.add(i);

            removeInts.invoke(check,studentAL,r);
            Assert.assertEquals("removeInts("+ Arrays.toString(teacherList)+") failed to produce the correct result.","[0, 5, 4, 0]", studentAL.toString());
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }
}
