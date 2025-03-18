package A12.CG1;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class A12_Student_Tests
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
            Class<?> classRef = Class.forName(generateClassName("A12_Student"));
            Method getFirstName = classRef.getMethod("getFirstName");
            Method getLastName = classRef.getMethod("getLastName");
            Method getID = classRef.getMethod("getID");
            Method toString = classRef.getMethod("toString");

            Object check = classRef.getConstructor(String.class,String.class,int.class).newInstance("Billy","Smith",5);

            Assert.assertTrue("A12_Student does not extend A12.CG1.A12_Person",check instanceof A12_Person);
            Assert.assertEquals("toString() failed after creation","5 - Smith, Billy",toString.invoke(check));
            Assert.assertEquals("getFirstName() failed after creation","Billy",getFirstName.invoke(check));
            Assert.assertEquals("getLastName() failed after creation","Smith",getLastName.invoke(check));
            Assert.assertEquals("getID() failed after creation",5,((Integer) getID.invoke(check)).intValue());
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test2() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("A12_Student"));
            Method getFirstName = classRef.getMethod("getFirstName");
            Method getLastName = classRef.getMethod("getLastName");
            Method getID = classRef.getMethod("getID");
            Method toString = classRef.getMethod("toString");

            Object check = classRef.getConstructor(String.class,String.class,int.class).newInstance("Tina","Fey",1);

            Assert.assertTrue("A12_Student does not extend A12.CG1.A12_Person",check instanceof A12_Person);
            Assert.assertEquals("toString() failed after creation","1 - Fey, Tina",toString.invoke(check));
            Assert.assertEquals("getFirstName() failed after creation","Tina",getFirstName.invoke(check));
            Assert.assertEquals("getLastName() failed after creation","Fey",getLastName.invoke(check));
            Assert.assertEquals("getID() failed after creation",1,((Integer) getID.invoke(check)).intValue());
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test3() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("A12_Student"));
            Method equals = classRef.getMethod("equals",Object.class);
            Method toString = classRef.getMethod("toString");

            Object check1 = classRef.getConstructor(String.class,String.class,int.class).newInstance("Tina","Fey",1);
            Object check2 = classRef.getConstructor(String.class,String.class,int.class).newInstance("Billy", "Smith", 2);
            Object check3 = classRef.getConstructor(String.class,String.class,int.class).newInstance("Jane", "Smith", 1);
            Object check4 = classRef.getConstructor(String.class,String.class,int.class).newInstance("Alex", "Smith", 1);
            Object check5 = classRef.getConstructor(String.class,String.class,int.class).newInstance("Billy", "Smith", 2);

            Assert.assertFalse("Equals failed when comparing ("+toString.invoke(check1)+") to ("+toString.invoke(check2)+")" , (Boolean)equals.invoke(check1,check2));
            Assert.assertFalse("Equals failed when comparing ("+toString.invoke(check1)+") to ("+toString.invoke(check3)+")" , (Boolean)equals.invoke(check1,check3));
            Assert.assertFalse("Equals failed when comparing ("+toString.invoke(check1)+") to ("+toString.invoke(check4)+")" , (Boolean)equals.invoke(check1,check4));
            Assert.assertFalse("Equals failed when comparing ("+toString.invoke(check1)+") to ("+toString.invoke(check5)+")" , (Boolean)equals.invoke(check1,check5));

            Assert.assertFalse("Equals failed when comparing ("+toString.invoke(check2)+") to ("+toString.invoke(check3)+")" , (Boolean)equals.invoke(check2,check3));
            Assert.assertFalse("Equals failed when comparing ("+toString.invoke(check2)+") to ("+toString.invoke(check4)+")" , (Boolean)equals.invoke(check2,check4));
            Assert.assertTrue("Equals failed when comparing ("+toString.invoke(check2)+") to ("+toString.invoke(check5)+")" , (Boolean)equals.invoke(check2,check5));

            Assert.assertFalse("Equals failed when comparing ("+toString.invoke(check3)+") to ("+toString.invoke(check4)+")" , (Boolean)equals.invoke(check3,check4));
            Assert.assertFalse("Equals failed when comparing ("+toString.invoke(check3)+") to ("+toString.invoke(check5)+")" , (Boolean)equals.invoke(check3,check5));

            Assert.assertFalse("Equals failed when comparing ("+toString.invoke(check4)+") to ("+toString.invoke(check5)+")" , (Boolean)equals.invoke(check4,check5));

        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }
}
