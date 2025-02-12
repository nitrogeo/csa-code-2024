package A11.CG1;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

public class A11_CH2_Tests 
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
            Class<?> classRef = Class.forName(generateClassName("A11_CH2"));
            Method average = classRef.getMethod("average", ArrayList.class);
            Object check = classRef.getConstructor().newInstance();

            double[] teacherList = {3.8,4.6,0,99};

            ArrayList<Double> studentAL = new ArrayList<>();

            for(double i:teacherList)
                studentAL.add(i);

            Assert.assertEquals("average("+ Arrays.toString(teacherList)+") failed to produce the correct result.",26.85, (Double)average.invoke(check,studentAL),.00001);

            Assert.assertEquals("average("+Arrays.toString(teacherList)+") failed due to changing the size of the ArrayList.",teacherList.length, studentAL.size());

            Assert.assertEquals("average("+Arrays.toString(teacherList)+") failed due altering the ArrayList",Arrays.toString(teacherList), studentAL.toString());
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test2() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("A11_CH2"));
            Method average = classRef.getMethod("average", ArrayList.class);
            Object check = classRef.getConstructor().newInstance();

            double[] teacherList = {3.51,49.58,55,-10};

            ArrayList<Double> studentAL = new ArrayList<>();

            for(double i:teacherList)
                studentAL.add(i);

            Assert.assertEquals("average("+Arrays.toString(teacherList)+") failed to produce the correct result.",24.5225, (Double)average.invoke(check,studentAL),.00001);

            Assert.assertEquals("average("+Arrays.toString(teacherList)+") failed due to changing the size of the ArrayList.",teacherList.length, studentAL.size());

            Assert.assertEquals("average("+Arrays.toString(teacherList)+") failed due altering the ArrayList",Arrays.toString(teacherList), studentAL.toString());
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test3() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("A11_CH2"));
            Method average = classRef.getMethod("average", ArrayList.class);
            Object check = classRef.getConstructor().newInstance();

            double[] teacherList = {3.51,4.69,58,0,-8};

            ArrayList<Double> studentAL = new ArrayList<>();

            for(double i:teacherList)
                studentAL.add(i);

            Assert.assertEquals("average("+Arrays.toString(teacherList)+") failed to produce the correct result.",11.64, (Double)average.invoke(check,studentAL),.00001);

            Assert.assertEquals("average("+Arrays.toString(teacherList)+") failed due to changing the size of the ArrayList.",teacherList.length, studentAL.size());

            Assert.assertEquals("average("+Arrays.toString(teacherList)+") failed due altering the ArrayList",Arrays.toString(teacherList), studentAL.toString());
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test4() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("A11_CH2"));
            Method average = classRef.getMethod("average", ArrayList.class);
            Object check = classRef.getConstructor().newInstance();

            double[] teacherList = {8,49,7.77,7,5,3,9000.87};

            ArrayList<Double> studentAL = new ArrayList<>();

            for(double i:teacherList)
                studentAL.add(i);

            Assert.assertEquals("average("+Arrays.toString(teacherList)+") failed to produce the correct result.",1297.234285714286, (Double)average.invoke(check,studentAL),.0000000000001);

            Assert.assertEquals("average("+Arrays.toString(teacherList)+") failed due to changing the size of the ArrayList.",teacherList.length, studentAL.size());

            Assert.assertEquals("average("+Arrays.toString(teacherList)+") failed due altering the ArrayList",Arrays.toString(teacherList), studentAL.toString());
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test5() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("A11_CH2"));
            Method average = classRef.getMethod("average", ArrayList.class);
            Object check = classRef.getConstructor().newInstance();

            double[] teacherList = {8.88,98,7,-9,-1};

            ArrayList<Double> studentAL = new ArrayList<>();

            for(double i:teacherList)
                studentAL.add(i);

            Assert.assertEquals("average("+Arrays.toString(teacherList)+") failed to produce the correct result.",20.776, (Double)average.invoke(check,studentAL),.0001);

            Assert.assertEquals("average("+Arrays.toString(teacherList)+") failed due to changing the size of the ArrayList.",teacherList.length, studentAL.size());

            Assert.assertEquals("average("+Arrays.toString(teacherList)+") failed due altering the ArrayList",Arrays.toString(teacherList), studentAL.toString());
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

}
