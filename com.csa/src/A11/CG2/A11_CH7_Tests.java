
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

public class A11_CH7_Tests
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
            Class<?> classRef = Class.forName(generateClassName("A11_CH7"));
            Method intersect = classRef.getMethod("intersect", ArrayList.class, ArrayList.class);
            Object check = classRef.getConstructor().newInstance();

            int[] teacherList1 = {1,2,3};
            int[] teacherList2 ={4,5,6};

            ArrayList<Integer> studentAL1 = new ArrayList<>();
            ArrayList<Integer> studentAL2 = new ArrayList<>();

            for(Integer i:teacherList1)
                studentAL1.add(i);
            for(Integer i:teacherList2)
                studentAL2.add(i);

            ArrayList<Integer> studentAnswer = (ArrayList<Integer>)intersect.invoke(check,studentAL1,studentAL2);

            Assert.assertEquals("intersect("+ Arrays.toString(teacherList1)+","+Arrays.toString(teacherList2)+") failed to produce the correct result.","[]", studentAnswer.toString());
            Assert.assertEquals("intersect("+Arrays.toString(teacherList1)+","+Arrays.toString(teacherList2)+") failed due altering the ArrayList1",Arrays.toString(teacherList1), studentAL1.toString());
            Assert.assertEquals("intersect("+Arrays.toString(teacherList1)+","+Arrays.toString(teacherList2)+") failed due altering the ArrayList2",Arrays.toString(teacherList2), studentAL2.toString());
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test2() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("A11_CH7"));
            Method intersect = classRef.getMethod("intersect", ArrayList.class, ArrayList.class);
            Object check = classRef.getConstructor().newInstance();

            int[] teacherList1 = {1,2,3};
            int[] teacherList2 ={1,2};

            ArrayList<Integer> studentAL1 = new ArrayList<>();
            ArrayList<Integer> studentAL2 = new ArrayList<>();

            for(Integer i:teacherList1)
                studentAL1.add(i);
            for(Integer i:teacherList2)
                studentAL2.add(i);

            ArrayList<Integer> studentAnswer = (ArrayList<Integer>)intersect.invoke(check,studentAL1,studentAL2);

            Assert.assertEquals("intersect("+Arrays.toString(teacherList1)+","+Arrays.toString(teacherList2)+") failed to produce the correct result.","[1, 2]", studentAnswer.toString());
            Assert.assertEquals("intersect("+Arrays.toString(teacherList1)+","+Arrays.toString(teacherList2)+") failed due altering the ArrayList1",Arrays.toString(teacherList1), studentAL1.toString());
            Assert.assertEquals("intersect("+Arrays.toString(teacherList1)+","+Arrays.toString(teacherList2)+") failed due altering the ArrayList2",Arrays.toString(teacherList2), studentAL2.toString());
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test3() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("A11_CH7"));
            Method intersect = classRef.getMethod("intersect", ArrayList.class, ArrayList.class);
            Object check = classRef.getConstructor().newInstance();

            int[] teacherList1 = {1,5,1,2};
            int[] teacherList2 ={1,3,5,9};

            ArrayList<Integer> studentAL1 = new ArrayList<>();
            ArrayList<Integer> studentAL2 = new ArrayList<>();

            for(Integer i:teacherList1)
                studentAL1.add(i);
            for(Integer i:teacherList2)
                studentAL2.add(i);

            ArrayList<Integer> studentAnswer = (ArrayList<Integer>)intersect.invoke(check,studentAL1,studentAL2);

            Assert.assertEquals("intersect("+Arrays.toString(teacherList1)+","+Arrays.toString(teacherList2)+") failed to produce the correct result.","[1, 5]", studentAnswer.toString());
            Assert.assertEquals("intersect("+Arrays.toString(teacherList1)+","+Arrays.toString(teacherList2)+") failed due altering the ArrayList1",Arrays.toString(teacherList1), studentAL1.toString());
            Assert.assertEquals("intersect("+Arrays.toString(teacherList1)+","+Arrays.toString(teacherList2)+") failed due altering the ArrayList2",Arrays.toString(teacherList2), studentAL2.toString());

        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test4() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("A11_CH7"));
            Method intersect = classRef.getMethod("intersect", ArrayList.class, ArrayList.class);
            Object check = classRef.getConstructor().newInstance();

            int[] teacherList1 = {1,2,3,1,5,1};
            int[] teacherList2 ={1,3};

            ArrayList<Integer> studentAL1 = new ArrayList<>();
            ArrayList<Integer> studentAL2 = new ArrayList<>();

            for(Integer i:teacherList1)
                studentAL1.add(i);
            for(Integer i:teacherList2)
                studentAL2.add(i);

            ArrayList<Integer> studentAnswer = (ArrayList<Integer>)intersect.invoke(check,studentAL1,studentAL2);

            Assert.assertEquals("intersect("+Arrays.toString(teacherList1)+","+Arrays.toString(teacherList2)+") failed to produce the correct result.","[1, 3]", studentAnswer.toString());
            Assert.assertEquals("intersect("+Arrays.toString(teacherList1)+","+Arrays.toString(teacherList2)+") failed due altering the ArrayList1",Arrays.toString(teacherList1), studentAL1.toString());
            Assert.assertEquals("intersect("+Arrays.toString(teacherList1)+","+Arrays.toString(teacherList2)+") failed due altering the ArrayList2",Arrays.toString(teacherList2), studentAL2.toString());
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test5() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("A11_CH7"));
            Method intersect = classRef.getMethod("intersect", ArrayList.class, ArrayList.class);
            Object check = classRef.getConstructor().newInstance();

            int[] teacherList1 = {0,5,4,0,875};
            int[] teacherList2 ={-1,875};

            ArrayList<Integer> studentAL1 = new ArrayList<>();
            ArrayList<Integer> studentAL2 = new ArrayList<>();

            for(Integer i:teacherList1)
                studentAL1.add(i);
            for(Integer i:teacherList2)
                studentAL2.add(i);

            ArrayList<Integer> studentAnswer = (ArrayList<Integer>)intersect.invoke(check,studentAL1,studentAL2);

            Assert.assertEquals("intersect("+Arrays.toString(teacherList1)+","+Arrays.toString(teacherList2)+") failed to produce the correct result.","[875]", studentAnswer.toString());
            Assert.assertEquals("intersect("+Arrays.toString(teacherList1)+","+Arrays.toString(teacherList2)+") failed due altering the ArrayList1",Arrays.toString(teacherList1), studentAL1.toString());
            Assert.assertEquals("intersect("+Arrays.toString(teacherList1)+","+Arrays.toString(teacherList2)+") failed due altering the ArrayList2",Arrays.toString(teacherList2), studentAL2.toString());
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }
}
