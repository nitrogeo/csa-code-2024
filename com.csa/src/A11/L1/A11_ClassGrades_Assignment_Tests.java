
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class A11_ClassGrades_Assignment_Tests
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
            Class<?> classRef = Class.forName(generateClassName("A11_Assignment"));
            Method getCategory = classRef.getMethod("getCategory");
            Method getGrade = classRef.getMethod("getGrade");
            Method getAssignmentName = classRef.getMethod("getAssignmentName");

            Object check = classRef.getConstructor(String.class,double.class,int.class).newInstance("Line Lab", 88.7,1);


            Assert.assertEquals("getAssignmentName() failed after using the constructor."
                    ,"Line Lab", getAssignmentName.invoke(check));
            Assert.assertEquals("getGrade() failed after using the constructor."
                    ,88.7, (double)getGrade.invoke(check),.001);
            Assert.assertEquals("getCategory() failed after using the constructor."
                    ,1, ((Integer)getCategory.invoke(check)).intValue());
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test2() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("A11_Assignment"));
            Method getCategory = classRef.getMethod("getCategory");
            Method getGrade = classRef.getMethod("getGrade");
            Method getAssignmentName = classRef.getMethod("getAssignmentName");

            Object check = classRef.getConstructor(String.class,double.class,int.class).newInstance("Sorts Worksheet", 34.44,0);


            Assert.assertEquals("getAssignmentName() failed after using the constructor."
                    ,"Sorts Worksheet", getAssignmentName.invoke(check));
            Assert.assertEquals("getGrade() failed after using the constructor."
                    ,34.44, (double)getGrade.invoke(check),.001);
            Assert.assertEquals("getCategory() failed after using the constructor."
                    ,0, ((Integer)getCategory.invoke(check)).intValue());
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test3() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("A11_Assignment"));
            Method getCategory = classRef.getMethod("getCategory");
            Method getGrade = classRef.getMethod("getGrade");
            Method getAssignmentName = classRef.getMethod("getAssignmentName");

            Object check = classRef.getConstructor(String.class,double.class,int.class).newInstance("Recursion Test", 45.45,2);


            Assert.assertEquals("getAssignmentName() failed after using the constructor."
                    ,"Recursion Test", getAssignmentName.invoke(check));
            Assert.assertEquals("getGrade() failed after using the constructor."
                    ,45.45, (double)getGrade.invoke(check),.001);
            Assert.assertEquals("getCategory() failed after using the constructor."
                    ,2, ((Integer)getCategory.invoke(check)).intValue());
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test4() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("A11_Assignment"));
            Method getAssignmentName = classRef.getMethod("getAssignmentName");
            Method setAssignmentName = classRef.getMethod("setAssignmentName", String.class);

            Object check = classRef.getConstructor(String.class,double.class,int.class).newInstance("Line Lab", 88.7,1);

            setAssignmentName.invoke(check,"turtles");
            Assert.assertEquals("getAssignmentName() failed using setAssignmentName(\"turtles\")"
                    ,"turtles", getAssignmentName.invoke(check));
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test5() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("A11_Assignment"));
            Method getCategory = classRef.getMethod("getCategory");
            Method getGrade = classRef.getMethod("getGrade");
            Method getAssignmentName = classRef.getMethod("getAssignmentName");
            Method setAssignmentName = classRef.getMethod("setAssignmentName", String.class);
            Method setGrade = classRef.getMethod("setGrade", double.class);
            Method setCategory = classRef.getMethod("setCategory", int.class);
            Object check = classRef.getConstructor(String.class,double.class,int.class).newInstance("Line Lab", 88.7,1);

            setGrade.invoke(check,12.7);
            Assert.assertEquals("getGrade() failed after using setGrade(12.7)"
                    ,12.7, (double)getGrade.invoke(check),.001);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test6() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("A11_Assignment"));
            Method getCategory = classRef.getMethod("getCategory");
            Method setCategory = classRef.getMethod("setCategory", int.class);
            Object check = classRef.getConstructor(String.class,double.class,int.class).newInstance("Line Lab", 88.7,1);

            setCategory.invoke(check,0);
            Assert.assertEquals("getCategory() failed after using setCategory(0)."
                    ,0, ((Integer)getCategory.invoke(check)).intValue());
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }
}
