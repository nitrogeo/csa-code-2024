package A11.CG1;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

public class A11_CH3_Tests 
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
            Class<?> classRef = Class.forName(generateClassName("A11_CH3"));
            Method capitals = classRef.getMethod("capitals", ArrayList.class);
            Object check = classRef.getConstructor().newInstance();

            String[] teacherList = {"AA","BB","CC"};

            ArrayList<String> studentAL = new ArrayList<>();

            for(String i:teacherList)
                studentAL.add(i);

            capitals.invoke(check,studentAL);
            Assert.assertEquals("capitals("+ Arrays.toString(teacherList)+") failed to produce the correct result.","[AA, BB, CC]", studentAL.toString());
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test2() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("A11_CH3"));
            Method capitals = classRef.getMethod("capitals", ArrayList.class);
            Object check = classRef.getConstructor().newInstance();

            String[] teacherList = {"Axe","0*"};

            ArrayList<String> studentAL = new ArrayList<>();

            for(String i:teacherList)
                studentAL.add(i);

            capitals.invoke(check,studentAL);
            Assert.assertEquals("capitals("+ Arrays.toString(teacherList)+") failed to produce the correct result.","[A, ]", studentAL.toString());
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test3() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("A11_CH3"));
            Method capitals = classRef.getMethod("capitals", ArrayList.class);
            Object check = classRef.getConstructor().newInstance();

            String[] teacherList = {"AXE","back","turtlE","AaA"};

            ArrayList<String> studentAL = new ArrayList<>();

            for(String i:teacherList)
                studentAL.add(i);

            capitals.invoke(check,studentAL);
            Assert.assertEquals("capitals("+ Arrays.toString(teacherList)+") failed to produce the correct result.","[AXE, , E, AA]", studentAL.toString());
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test4() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("A11_CH3"));
            Method capitals = classRef.getMethod("capitals", ArrayList.class);
            Object check = classRef.getConstructor().newInstance();

            String[] teacherList = {"aBcDE","SNAKE","bat","BiKE"};

            ArrayList<String> studentAL = new ArrayList<>();

            for(String i:teacherList)
                studentAL.add(i);

            capitals.invoke(check,studentAL);
            Assert.assertEquals("capitals("+ Arrays.toString(teacherList)+") failed to produce the correct result.","[BDE, SNAKE, , BKE]", studentAL.toString());
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test5() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("A11_CH3"));
            Method capitals = classRef.getMethod("capitals", ArrayList.class);
            Object check = classRef.getConstructor().newInstance();

            String[] teacherList = {"James","C++","HaAlT","NoOn"};

            ArrayList<String> studentAL = new ArrayList<>();

            for(String i:teacherList)
                studentAL.add(i);

            capitals.invoke(check,studentAL);
            Assert.assertEquals("capitals("+ Arrays.toString(teacherList)+") failed to produce the correct result.","[J, C, HAT, NO]", studentAL.toString());
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }
}
