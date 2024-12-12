package A7.Labs.L1Lines;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MyPoint_Tests {
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
            Class<?> classRef = Class.forName(generateClassName("MyPoint"));
            Method getX = classRef.getMethod("getX");
            Method getY = classRef.getMethod("getY");
            Method toString = classRef.getMethod("toString");

            Object myPoint = classRef.getConstructor(double.class, double.class).newInstance(3,8);

            Assert.assertEquals("getX() failed after using the constructor."
                    ,3, (double)getX.invoke(myPoint),.001);
            Assert.assertEquals("getY() failed after using the constructor."
                    ,8, (double)getY.invoke(myPoint),.001);
            Assert.assertEquals("toString() failed after using the constructor."
                    ,"(3.000,8.000)",toString.invoke(myPoint));

        }
        catch (InvocationTargetException e) {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test2() throws Exception {
        try
        {
            Class<?> classRef = Class.forName(generateClassName("MyPoint"));
            Method getX = classRef.getMethod("getX");
            Method getY = classRef.getMethod("getY");
            Method toString = classRef.getMethod("toString");


            Object myPoint = classRef.getConstructor(double.class, double.class).newInstance(6.5,11);

            Assert.assertEquals("getX() failed after using the constructor."
                    ,6.5, (double)getX.invoke(myPoint),.001);
            Assert.assertEquals("getY() failed after using the constructor."
                    ,11, (double)getY.invoke(myPoint),.001);
            Assert.assertEquals("toString() failed after using the constructor."
                    ,"(6.500,11.000)",toString.invoke(myPoint));

        }
        catch (InvocationTargetException e) {
            throw (Exception) e.getCause();
        }
    }


}
