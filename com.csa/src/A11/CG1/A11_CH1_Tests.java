package A11.CG1;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

public class A11_CH1_Tests
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
            Class<?> classRef = Class.forName(generateClassName("A11_CH1"));
            Method totals = classRef.getMethod("totals", ArrayList.class);
            Object check = classRef.getConstructor().newInstance();

            int[] teacherList = {3,4,5,-1};

            ArrayList<Integer> studentAL = new ArrayList<>();

            for(int i:teacherList)
                studentAL.add(i);

            Assert.assertEquals("totals("+Arrays.toString(teacherList)+") failed to produce the correct result.",11, totals.invoke(check,studentAL));
            Assert.assertEquals("totals("+Arrays.toString(teacherList)+") failed due altering the ArrayList",Arrays.toString(teacherList), studentAL.toString());
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test2() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("A11_CH1"));
            Method totals = classRef.getMethod("totals", ArrayList.class);
            Object check = classRef.getConstructor().newInstance();

            int[] teacherList = {1};

            ArrayList<Integer> studentAL = new ArrayList<>();

            for(int i:teacherList)
                studentAL.add(i);

            Assert.assertEquals("totals("+Arrays.toString(teacherList)+") failed to produce the correct result.",1, totals.invoke(check,studentAL));
            Assert.assertEquals("totals("+Arrays.toString(teacherList)+") failed due altering the ArrayList",Arrays.toString(teacherList), studentAL.toString());
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test3() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("A11_CH1"));
            Method totals = classRef.getMethod("totals", ArrayList.class);
            Object check = classRef.getConstructor().newInstance();

            int[] teacherList = {14,8,9,74,-74};

            ArrayList<Integer> studentAL = new ArrayList<>();

            for(int i:teacherList)
                studentAL.add(i);

            Assert.assertEquals("totals("+Arrays.toString(teacherList)+") failed to produce the correct result.",31, totals.invoke(check,studentAL));
            Assert.assertEquals("totals("+Arrays.toString(teacherList)+") failed due altering the ArrayList",Arrays.toString(teacherList), studentAL.toString());
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test4() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("A11_CH1"));
            Method totals = classRef.getMethod("totals", ArrayList.class);
            Object check = classRef.getConstructor().newInstance();

            int[] teacherList = {1,1,1,1,1,1};

            ArrayList<Integer> studentAL = new ArrayList<>();

            for(int i:teacherList)
                studentAL.add(i);

            Assert.assertEquals("totals("+Arrays.toString(teacherList)+") failed to produce the correct result.",6, totals.invoke(check,studentAL));
            Assert.assertEquals("totals("+Arrays.toString(teacherList)+") failed due altering the ArrayList",Arrays.toString(teacherList), studentAL.toString());
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test5() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("A11_CH1"));
            Method totals = classRef.getMethod("totals", ArrayList.class);
            Object check = classRef.getConstructor().newInstance();

            int[] teacherList = {0,5,4,0,875};

            ArrayList<Integer> studentAL = new ArrayList<>();

            for(int i:teacherList)
                studentAL.add(i);

            Assert.assertEquals("totals("+Arrays.toString(teacherList)+") failed to produce the correct result.",884, totals.invoke(check,studentAL));
            Assert.assertEquals("totals("+Arrays.toString(teacherList)+") failed due altering the ArrayList",Arrays.toString(teacherList), studentAL.toString());
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }
}
