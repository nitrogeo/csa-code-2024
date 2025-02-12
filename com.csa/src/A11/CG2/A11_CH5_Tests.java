
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

public class A11_CH5_Tests 
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
            Class<?> classRef = Class.forName(generateClassName("A11_CH5"));
            Method removeShared = classRef.getMethod("removeShared", ArrayList.class, ArrayList.class);
            Object check = classRef.getConstructor().newInstance();

            int[] teacherList1 = {3,4,5,-1};
            int[] teacherList2 ={3,3,-1,77,88,-1};

            ArrayList<Integer> studentAL1 = new ArrayList<>();
            ArrayList<Integer> studentAL2 = new ArrayList<>();

            for(Integer i:teacherList1)
                studentAL1.add(i);
            for(Integer i:teacherList2)
                studentAL2.add(i);

            removeShared.invoke(check,studentAL1,studentAL2);
            Assert.assertEquals("removeShared("+ Arrays.toString(teacherList1)+", "+Arrays.toString(teacherList2)+") failed to produce the correct result on the first ArrayList.","[4, 5]", studentAL1.toString());
            Assert.assertEquals("removeShared("+ Arrays.toString(teacherList1)+", "+Arrays.toString(teacherList2)+") failed to produce the correct result on the first ArrayList.","[77, 88]", studentAL2.toString());
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test2() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("A11_CH5"));
            Method removeShared = classRef.getMethod("removeShared", ArrayList.class, ArrayList.class);
            Object check = classRef.getConstructor().newInstance();

            int[] teacherList1 = {1};
            int[] teacherList2 ={0};

            ArrayList<Integer> studentAL1 = new ArrayList<>();
            ArrayList<Integer> studentAL2 = new ArrayList<>();

            for(Integer i:teacherList1)
                studentAL1.add(i);
            for(Integer i:teacherList2)
                studentAL2.add(i);

            removeShared.invoke(check,studentAL1,studentAL2);
            Assert.assertEquals("removeShared("+ Arrays.toString(teacherList1)+", "+Arrays.toString(teacherList2)+") failed to produce the correct result on the first ArrayList.","[1]", studentAL1.toString());
            Assert.assertEquals("removeShared("+ Arrays.toString(teacherList1)+", "+Arrays.toString(teacherList2)+") failed to produce the correct result on the first ArrayList.","[0]", studentAL2.toString());
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test3() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("A11_CH5"));
            Method removeShared = classRef.getMethod("removeShared", ArrayList.class, ArrayList.class);
            Object check = classRef.getConstructor().newInstance();

            int[] teacherList1 = {1,1,2,2,};
            int[] teacherList2 ={2,1};

            ArrayList<Integer> studentAL1 = new ArrayList<>();
            ArrayList<Integer> studentAL2 = new ArrayList<>();

            for(Integer i:teacherList1)
                studentAL1.add(i);
            for(Integer i:teacherList2)
                studentAL2.add(i);

            removeShared.invoke(check,studentAL1,studentAL2);
            Assert.assertEquals("removeShared("+ Arrays.toString(teacherList1)+", "+Arrays.toString(teacherList2)+") failed to produce the correct result on the first ArrayList.","[]", studentAL1.toString());
            Assert.assertEquals("removeShared("+ Arrays.toString(teacherList1)+", "+Arrays.toString(teacherList2)+") failed to produce the correct result on the first ArrayList.","[]", studentAL2.toString());
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test4() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("A11_CH5"));
            Method removeShared = classRef.getMethod("removeShared", ArrayList.class, ArrayList.class);
            Object check = classRef.getConstructor().newInstance();

            int[] teacherList1 = {1,2,3,1,5,1,76,43,2};
            int[] teacherList2 ={1,3,254,567,88,2};

            ArrayList<Integer> studentAL1 = new ArrayList<>();
            ArrayList<Integer> studentAL2 = new ArrayList<>();

            for(Integer i:teacherList1)
                studentAL1.add(i);
            for(Integer i:teacherList2)
                studentAL2.add(i);

            removeShared.invoke(check,studentAL1,studentAL2);
            Assert.assertEquals("removeShared("+ Arrays.toString(teacherList1)+", "+Arrays.toString(teacherList2)+") failed to produce the correct result on the first ArrayList.","[5, 76, 43]", studentAL1.toString());
            Assert.assertEquals("removeShared("+ Arrays.toString(teacherList1)+", "+Arrays.toString(teacherList2)+") failed to produce the correct result on the first ArrayList.","[254, 567, 88]", studentAL2.toString());
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test5() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("A11_CH5"));
            Method removeShared = classRef.getMethod("removeShared", ArrayList.class, ArrayList.class);
            Object check = classRef.getConstructor().newInstance();

            int[] teacherList1 = {5,5,8,7,8,4,3,6,7,7,74};
            int[] teacherList2 ={-1,2,38,8,11,21,7};

            ArrayList<Integer> studentAL1 = new ArrayList<>();
            ArrayList<Integer> studentAL2 = new ArrayList<>();

            for(Integer i:teacherList1)
                studentAL1.add(i);
            for(Integer i:teacherList2)
                studentAL2.add(i);

            removeShared.invoke(check,studentAL1,studentAL2);
            Assert.assertEquals("removeShared("+ Arrays.toString(teacherList1)+", "+Arrays.toString(teacherList2)+") failed to produce the correct result on the first ArrayList.","[5, 5, 4, 3, 6, 74]", studentAL1.toString());
            Assert.assertEquals("removeShared("+ Arrays.toString(teacherList1)+", "+Arrays.toString(teacherList2)+") failed to produce the correct result on the first ArrayList.","[-1, 2, 38, 11, 21]", studentAL2.toString());
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }
}
