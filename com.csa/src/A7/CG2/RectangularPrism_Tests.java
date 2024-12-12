package A7.CG2;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RectangularPrism_Tests {
    public String generateClassName(String name) {
        if (getClass().toString().contains(".")) {
            return getClass().toString().substring(6, getClass().toString().lastIndexOf(".") + 1) + name;
        }
        return name;
    }

    @Test(timeout = 250)
    public void test1() throws Exception {
        try
        {
            Class<?> classRef = Class.forName(generateClassName("RectangularPrism"));
            Method getLength = classRef.getMethod("getLength");
            Method getWidth = classRef.getMethod("getWidth");
            Method getHeight = classRef.getMethod("getHeight");
            Method surfaceArea = classRef.getMethod("surfaceArea");
            Method volume = classRef.getMethod("volume");
            Method toString = classRef.getMethod("toString");

            Object rectangularPrism = classRef.getConstructor().newInstance();

            Assert.assertEquals("getLength(), failed after using the default constructor.",1,getLength.invoke(rectangularPrism));
            Assert.assertEquals("getWidth(), failed after using the default constructor.",1,getWidth.invoke(rectangularPrism));
            Assert.assertEquals("getHeight(), failed after using the default constructor.",1,getHeight.invoke(rectangularPrism));
            Assert.assertEquals("surfaceArea(), failed after using the default constructor.",6,surfaceArea.invoke(rectangularPrism));
            Assert.assertEquals("volume(), failed after using the default constructor.",1,volume.invoke(rectangularPrism));
            Assert.assertEquals("toString(), failed after using the non-default constructor.","Dimensions: (1/1/1) / Surface Area: (6) / Volume: (1)",toString.invoke(rectangularPrism));
        }
        catch (InvocationTargetException e) {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test2() throws Exception {
        try
        {
            Class<?> classRef = Class.forName(generateClassName("RectangularPrism"));
            Method getLength = classRef.getMethod("getLength");
            Method getWidth = classRef.getMethod("getWidth");
            Method getHeight = classRef.getMethod("getHeight");
            Method surfaceArea = classRef.getMethod("surfaceArea");
            Method volume = classRef.getMethod("volume");
            Method toString = classRef.getMethod("toString");

            Object rectangularPrism = classRef.getConstructor(int.class,int.class,int.class).newInstance(7,4,2);

            Assert.assertEquals("getLength(), failed after using the non-default constructor.",7,getLength.invoke(rectangularPrism));
            Assert.assertEquals("getWidth(), failed after using the non-default constructor.",4,getWidth.invoke(rectangularPrism));
            Assert.assertEquals("getHeight(), failed after using the non-default constructor.",2,getHeight.invoke(rectangularPrism));
            Assert.assertEquals("surfaceArea(), failed after using the non-default constructor.",100,surfaceArea.invoke(rectangularPrism));
            Assert.assertEquals("volume(), failed after using the non-default constructor.",56,volume.invoke(rectangularPrism));
            Assert.assertEquals("toString(), failed after using the non-default constructor.","Dimensions: (7/4/2) / Surface Area: (100) / Volume: (56)",toString.invoke(rectangularPrism));
        }
        catch (InvocationTargetException e) {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test3() throws Exception {
        try
        {
            Class<?> classRef = Class.forName(generateClassName("RectangularPrism"));
            Method getLength = classRef.getMethod("getLength");
            Method getWidth = classRef.getMethod("getWidth");
            Method getHeight = classRef.getMethod("getHeight");
            Method surfaceArea = classRef.getMethod("surfaceArea");
            Method volume = classRef.getMethod("volume");
            Method toString = classRef.getMethod("toString");

            Object rectangularPrism = classRef.getConstructor(int.class,int.class,int.class).newInstance(3,3,1);

            Assert.assertEquals("getLength(), failed after using the non-default constructor.",3,getLength.invoke(rectangularPrism));
            Assert.assertEquals("getWidth(), failed after using the non-default constructor.",3,getWidth.invoke(rectangularPrism));
            Assert.assertEquals("getHeight(), failed after using the non-default constructor.",1,getHeight.invoke(rectangularPrism));
            Assert.assertEquals("surfaceArea(), failed after using the non-default constructor.",30,surfaceArea.invoke(rectangularPrism));
            Assert.assertEquals("volume(), failed after using the non-default constructor.",9,volume.invoke(rectangularPrism));
            Assert.assertEquals("toString(), failed after using the non-default constructor.","Dimensions: (3/3/1) / Surface Area: (30) / Volume: (9)",toString.invoke(rectangularPrism));
        }
        catch (InvocationTargetException e) {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test4() throws Exception {
        try
        {
            Class<?> classRef = Class.forName(generateClassName("RectangularPrism"));
            Method getLength = classRef.getMethod("getLength");
            Method setLength = classRef.getMethod("setLength",int.class);
            Method getWidth = classRef.getMethod("getWidth");
            Method getHeight = classRef.getMethod("getHeight");
            Method surfaceArea = classRef.getMethod("surfaceArea");
            Method volume = classRef.getMethod("volume");
            Method toString = classRef.getMethod("toString");

            Object rectangularPrism = classRef.getConstructor(int.class,int.class,int.class).newInstance(2,22,3);
            setLength.invoke(rectangularPrism,9);

            Assert.assertEquals("getLength(), failed after using setLength.",9,getLength.invoke(rectangularPrism));
            Assert.assertEquals("getWidth(), failed after using setLength.",22,getWidth.invoke(rectangularPrism));
            Assert.assertEquals("getHeight(), failed after using setLength.",3,getHeight.invoke(rectangularPrism));
            Assert.assertEquals("surfaceArea(), failed after using setLength.",582,surfaceArea.invoke(rectangularPrism));
            Assert.assertEquals("volume(), failed after using setLength.",594,volume.invoke(rectangularPrism));
            Assert.assertEquals("toString(), failed after using setLength.","Dimensions: (9/22/3) / Surface Area: (582) / Volume: (594)",toString.invoke(rectangularPrism));
        }
        catch (InvocationTargetException e) {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test5() throws Exception {
        try
        {
            Class<?> classRef = Class.forName(generateClassName("RectangularPrism"));
            Method getLength = classRef.getMethod("getLength");
            Method setWidth = classRef.getMethod("setWidth",int.class);
            Method getWidth = classRef.getMethod("getWidth");
            Method getHeight = classRef.getMethod("getHeight");
            Method surfaceArea = classRef.getMethod("surfaceArea");
            Method volume = classRef.getMethod("volume");
            Method toString = classRef.getMethod("toString");

            Object rectangularPrism = classRef.getConstructor(int.class,int.class,int.class).newInstance(2,22,3);
            setWidth.invoke(rectangularPrism,13);

            Assert.assertEquals("getLength(), failed after using setWidth.",2,getLength.invoke(rectangularPrism));
            Assert.assertEquals("getWidth(), failed after using setWidth.",13,getWidth.invoke(rectangularPrism));
            Assert.assertEquals("getHeight(), failed after using setWidth.",3,getHeight.invoke(rectangularPrism));
            Assert.assertEquals("surfaceArea(), failed after using setWidth.",142,surfaceArea.invoke(rectangularPrism));
            Assert.assertEquals("volume(), failed after using setWidth.",78,volume.invoke(rectangularPrism));
            Assert.assertEquals("toString(), failed after using setWidth.","Dimensions: (2/13/3) / Surface Area: (142) / Volume: (78)",toString.invoke(rectangularPrism));
        }
        catch (InvocationTargetException e) {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test6() throws Exception {
        try
        {
            Class<?> classRef = Class.forName(generateClassName("RectangularPrism"));
            Method getLength = classRef.getMethod("getLength");
            Method setHeight = classRef.getMethod("setHeight",int.class);
            Method getWidth = classRef.getMethod("getWidth");
            Method getHeight = classRef.getMethod("getHeight");
            Method surfaceArea = classRef.getMethod("surfaceArea");
            Method volume = classRef.getMethod("volume");
            Method toString = classRef.getMethod("toString");

            Object rectangularPrism = classRef.getConstructor(int.class,int.class,int.class).newInstance(2,22,3);
            setHeight.invoke(rectangularPrism,44);

            Assert.assertEquals("getLength(), failed after using setHeight.",2,getLength.invoke(rectangularPrism));
            Assert.assertEquals("getWidth(), failed after using setHeight.",22,getWidth.invoke(rectangularPrism));
            Assert.assertEquals("getHeight(), failed after using setHeight.",44,getHeight.invoke(rectangularPrism));
            Assert.assertEquals("surfaceArea(), failed after using setHeight.",2200,surfaceArea.invoke(rectangularPrism));
            Assert.assertEquals("volume(), failed after using setHeight.",1936,volume.invoke(rectangularPrism));
            Assert.assertEquals("toString(), failed after using setHeight.","Dimensions: (2/22/44) / Surface Area: (2200) / Volume: (1936)",toString.invoke(rectangularPrism));;
        }
        catch (InvocationTargetException e) {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test7() throws Exception {
        try
        {
            Class<?> classRef = Class.forName(generateClassName("RectangularPrism"));
            Method getLength = classRef.getMethod("getLength");
            Method getWidth = classRef.getMethod("getWidth");
            Method getHeight = classRef.getMethod("getHeight");
            Method surfaceArea = classRef.getMethod("surfaceArea");
            Method volume = classRef.getMethod("volume");
            Method toString = classRef.getMethod("toString");

            Object rectangularPrism1 = classRef.getConstructor(int.class,int.class,int.class).newInstance(7,4,2);
            Object rectangularPrism2 = classRef.getConstructor(int.class,int.class,int.class).newInstance(5,6,3);

            Assert.assertEquals("getLength(), failed after using the non-default constructor to create two RectangularPrisms.",7,getLength.invoke(rectangularPrism1));
            Assert.assertEquals("getWidth(), failed after using the non-default constructor to create two RectangularPrisms.",4,getWidth.invoke(rectangularPrism1));
            Assert.assertEquals("getHeight(), failed after using the non-default constructor to create two RectangularPrisms.",2,getHeight.invoke(rectangularPrism1));
            Assert.assertEquals("surfaceArea(), failed after using the non-default constructor to create two RectangularPrisms.",100,surfaceArea.invoke(rectangularPrism1));
            Assert.assertEquals("volume(), failed after using the non-default constructor to create two RectangularPrisms.",56,volume.invoke(rectangularPrism1));
            Assert.assertEquals("toString(), failed after using the non-default constructor to create two RectangularPrisms.","Dimensions: (7/4/2) / Surface Area: (100) / Volume: (56)",toString.invoke(rectangularPrism1));

            Assert.assertEquals("getLength(), failed after using the non-default constructor to create two RectangularPrisms.",5,getLength.invoke(rectangularPrism2));
            Assert.assertEquals("getWidth(), failed after using the non-default constructor to create two RectangularPrisms.",6,getWidth.invoke(rectangularPrism2));
            Assert.assertEquals("getHeight(), failed after using the non-default constructor to create two RectangularPrisms.",3,getHeight.invoke(rectangularPrism2));
            Assert.assertEquals("surfaceArea(), failed after using the non-default constructor to create two RectangularPrisms.",126,surfaceArea.invoke(rectangularPrism2));
            Assert.assertEquals("volume(), failed after using the non-default constructor to create two RectangularPrisms.",90,volume.invoke(rectangularPrism2));
            Assert.assertEquals("toString(), failed after using the non-default constructor to create two RectangularPrisms.","Dimensions: (7/4/2) / Surface Area: (100) / Volume: (56)",toString.invoke(rectangularPrism1));
        }
        catch (InvocationTargetException e) {
            throw (Exception) e.getCause();
        }
    }
}
