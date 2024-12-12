package A7.Labs.L1Lines;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MyLine_Tests {
    public String generateClassName(String name) {
        if (getClass().toString().contains(".")) {
            return getClass().toString().substring(6, getClass().toString().lastIndexOf(".") + 1) + name;
        }
        return name;
    }

    @Test(timeout = 250)
    public void test1() throws Exception{
        try
        {
            Class<?> classRefPoint = Class.forName(generateClassName("MyPoint"));
            Method getX = classRefPoint.getMethod("getX");
            Method getY = classRefPoint.getMethod("getY");
            Method pointToString = classRefPoint.getMethod("toString");

            Class<?> classRefLine = Class.forName(generateClassName("MyLine"));
            Method getPointOne = classRefLine.getMethod("getPointOne");
            Method getPointTwo = classRefLine.getMethod("getPointTwo");
            Method getXInt = classRefLine.getMethod("getXInt");
            Method getYInt = classRefLine.getMethod("getYInt");
            Method getSlope = classRefLine.getMethod("getSlope");
            Method lineToString = classRefLine.getMethod("toString");

            Object p1 = classRefPoint.getConstructor(double.class, double.class).newInstance(5,6);
            Object p2 = classRefPoint.getConstructor(double.class, double.class).newInstance(8.0,188.0);

            Object line = classRefLine.getConstructor(classRefPoint, classRefPoint).newInstance(p1,p2);


            Assert.assertEquals("getPointOne().toString() failed after creating a line with points {"+pointToString.invoke(p1) +", "+pointToString.invoke(p2)+"}."
                    ,"(5.000,6.000)",pointToString.invoke(getPointOne.invoke(line)));
            Assert.assertEquals("getPointTwo().toString() failed after creating a line with points {"+pointToString.invoke(p1) +", "+pointToString.invoke(p2)+"}."
                    ,"(8.000,188.000)",pointToString.invoke(getPointTwo.invoke(line)));
            Assert.assertEquals("getXInt() failed after creating a line with points {"+pointToString.invoke(p1) +", "+pointToString.invoke(p2)+"}."
                    ,4.901098901098901,(double)getXInt.invoke(line),.001);
            Assert.assertEquals("getYInt() failed after creating a line with points {"+pointToString.invoke(p1) +", "+pointToString.invoke(p2)+"}."
                    ,-297.3333333333333,(double)getYInt.invoke(line),.001);
            Assert.assertEquals("getSlope() failed after creating a line with points {"+pointToString.invoke(p1) +", "+pointToString.invoke(p2)+"}."
                    ,60.666666666666664,(double)getSlope.invoke(line),.001);
            Assert.assertEquals("toString() failed after creating a line with points {"+pointToString.invoke(p1) +", "+pointToString.invoke(p2)+"}."
                    ,"Points: [(5.000,6.000),(8.000,188.000)]\n" +
                            "Slope: 60.667\n" +
                            "X Intercept: 4.901\n" +
                            "Y Intercept: -297.333\n" +
                            "Equation: y = 60.667x + -297.333",line.toString());

        }
        catch (InvocationTargetException e) {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test2() throws Exception{
        try
        {
            Class<?> classRefPoint = Class.forName(generateClassName("MyPoint"));
            Method getX = classRefPoint.getMethod("getX");
            Method getY = classRefPoint.getMethod("getY");
            Method pointToString = classRefPoint.getMethod("toString");

            Class<?> classRefLine = Class.forName(generateClassName("MyLine"));
            Method getPointOne = classRefLine.getMethod("getPointOne");
            Method getPointTwo = classRefLine.getMethod("getPointTwo");
            Method getXInt = classRefLine.getMethod("getXInt");
            Method getYInt = classRefLine.getMethod("getYInt");
            Method getSlope = classRefLine.getMethod("getSlope");
            Method lineToString = classRefLine.getMethod("toString");

            Object p1 = classRefPoint.getConstructor(double.class, double.class).newInstance(0.0,15.0);
            Object p2 = classRefPoint.getConstructor(double.class, double.class).newInstance(9.0,1.0);

            Object line = classRefLine.getConstructor(classRefPoint, classRefPoint).newInstance(p1,p2);


            Assert.assertEquals("getPointOne().toString() failed after creating a line with points {"+pointToString.invoke(p1) +", "+pointToString.invoke(p2)+"}."
                    ,"(0.000,15.000)",pointToString.invoke(getPointOne.invoke(line)));
            Assert.assertEquals("getPointTwo().toString() failed after creating a line with points {"+pointToString.invoke(p1) +", "+pointToString.invoke(p2)+"}."
                    ,"(9.000,1.000)",pointToString.invoke(getPointTwo.invoke(line)));
            Assert.assertEquals("getXInt() failed after creating a line with points {"+pointToString.invoke(p1) +", "+pointToString.invoke(p2)+"}."
                    ,9.642857142857142,(double)getXInt.invoke(line),.001);
            Assert.assertEquals("getYInt() failed after creating a line with points {"+pointToString.invoke(p1) +", "+pointToString.invoke(p2)+"}."
                    ,15.0,(double)getYInt.invoke(line),.001);
            Assert.assertEquals("getSlope() failed after creating a line with points {"+pointToString.invoke(p1) +", "+pointToString.invoke(p2)+"}."
                    ,-1.5555555555555556,(double)getSlope.invoke(line),.001);
            Assert.assertEquals("toString() failed after creating a line with points {"+pointToString.invoke(p1) +", "+pointToString.invoke(p2)+"}."
                    ,"Points: [(0.000,15.000),(9.000,1.000)]\n" +
                            "Slope: -1.556\n" +
                            "X Intercept: 9.643\n" +
                            "Y Intercept: 15.000\n" +
                            "Equation: y = -1.556x + 15.000",line.toString());

        }
        catch (InvocationTargetException e) {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test3() throws Exception{
        try
        {
            Class<?> classRefPoint = Class.forName(generateClassName("MyPoint"));
            Method getX = classRefPoint.getMethod("getX");
            Method getY = classRefPoint.getMethod("getY");
            Method pointToString = classRefPoint.getMethod("toString");

            Class<?> classRefLine = Class.forName(generateClassName("MyLine"));
            Method getPointOne = classRefLine.getMethod("getPointOne");
            Method getPointTwo = classRefLine.getMethod("getPointTwo");
            Method getXInt = classRefLine.getMethod("getXInt");
            Method getYInt = classRefLine.getMethod("getYInt");
            Method getSlope = classRefLine.getMethod("getSlope");
            Method setPointOne = classRefLine.getMethod("setPointOne",classRefPoint);

            Object p1 = classRefPoint.getConstructor(double.class, double.class).newInstance(1.0,7.0);
            Object p2 = classRefPoint.getConstructor(double.class, double.class).newInstance(2.0,2.0);
            Object p3 = classRefPoint.getConstructor(double.class, double.class).newInstance(8.0,12.0);

            Object line = classRefLine.getConstructor(classRefPoint, classRefPoint).newInstance(p1,p2);
            setPointOne.invoke(line,p3);

            Assert.assertEquals("getPointOne().toString() failed after creating a line with points {"+pointToString.invoke(p1) +", "+pointToString.invoke(p2)+"} and then changing point one to "+pointToString.invoke(p3)
                    ,"(8.000,12.000)",getPointOne.invoke(line)+"");
            Assert.assertEquals("getPointTwo().toString() failed after creating a line with points {"+pointToString.invoke(p1) +", "+pointToString.invoke(p2)+"} and then changing point one to "+pointToString.invoke(p3)
                    ,"(2.000,2.000)",getPointTwo.invoke(line)+"");
            Assert.assertEquals("getXInt() failed after creating a line with points {"+pointToString.invoke(p1) +", "+pointToString.invoke(p2)+"} and then changing point one to "+pointToString.invoke(p3)
                    ,0.8,(double)getXInt.invoke(line),.001);
            Assert.assertEquals("getYInt() failed after creating a line with points {"+pointToString.invoke(p1) +", "+pointToString.invoke(p2)+"} and then changing point one to "+pointToString.invoke(p3)
                    ,-1.3333333333333335,(double)getYInt.invoke(line),.001);
            Assert.assertEquals("getSlope() failed after creating a line with points {"+pointToString.invoke(p1) +", "+pointToString.invoke(p2)+"} and then changing point one to "+pointToString.invoke(p3)
                    ,1.6666666666666667,(double)getSlope.invoke(line),.001);
            Assert.assertEquals("toString() failed after creating a line with points {"+pointToString.invoke(p1) +", "+pointToString.invoke(p2)+"} and then changing point one to "+pointToString.invoke(p3)
                    ,"Points: [(8.000,12.000),(2.000,2.000)]\n" +
                            "Slope: 1.667\n" +
                            "X Intercept: 0.800\n" +
                            "Y Intercept: -1.333\n" +
                            "Equation: y = 1.667x + -1.333",line.toString());

        }
        catch (InvocationTargetException e) {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test4() throws Exception{
        try
        {
            Class<?> classRefPoint = Class.forName(generateClassName("MyPoint"));
            Method getX = classRefPoint.getMethod("getX");
            Method getY = classRefPoint.getMethod("getY");
            Method pointToString = classRefPoint.getMethod("toString");

            Class<?> classRefLine = Class.forName(generateClassName("MyLine"));
            Method getPointOne = classRefLine.getMethod("getPointOne");
            Method getPointTwo = classRefLine.getMethod("getPointTwo");
            Method getXInt = classRefLine.getMethod("getXInt");
            Method getYInt = classRefLine.getMethod("getYInt");
            Method getSlope = classRefLine.getMethod("getSlope");
            Method setPointTwo = classRefLine.getMethod("setPointTwo",classRefPoint);


            Object p1 = classRefPoint.getConstructor(double.class, double.class).newInstance(1.0,7.0);
            Object p2 = classRefPoint.getConstructor(double.class, double.class).newInstance(2.0,2.0);
            Object p3 = classRefPoint.getConstructor(double.class, double.class).newInstance(12.0,-1.0);

            Object line = classRefLine.getConstructor(classRefPoint, classRefPoint).newInstance(p1,p2);
            setPointTwo.invoke(line,p3);

            Assert.assertEquals("getPointOne().toString() failed after creating a line with points {"+pointToString.invoke(p1) +", "+pointToString.invoke(p2)+"} and then changing point two to "+pointToString.invoke(p3)
                    ,"(1.000,7.000)",getPointOne.invoke(line)+"");
            Assert.assertEquals("getPointTwo().toString() failed after creating a line with points {"+pointToString.invoke(p1) +", "+pointToString.invoke(p2)+"} and then changing point two to "+pointToString.invoke(p3)
                    ,"(12.000,-1.000)",getPointTwo.invoke(line)+"");
            Assert.assertEquals("getXInt() failed after creating a line with points {"+pointToString.invoke(p1) +", "+pointToString.invoke(p2)+"} and then changing point two to "+pointToString.invoke(p3)
                    ,10.624999999999998,(double)getXInt.invoke(line),.001);
            Assert.assertEquals("getYInt() failed after creating a line with points {"+pointToString.invoke(p1) +", "+pointToString.invoke(p2)+"} and then changing point two to "+pointToString.invoke(p3)
                    ,7.727272727272727,(double)getYInt.invoke(line),.001);
            Assert.assertEquals("getSlope() failed after creating a line with points {"+pointToString.invoke(p1) +", "+pointToString.invoke(p2)+"} and then changing point two to "+pointToString.invoke(p3)
                    ,-0.7272727272727273,(double)getSlope.invoke(line),.001);
            Assert.assertEquals("toString() failed after creating a line with points {"+pointToString.invoke(p1) +", "+pointToString.invoke(p2)+"} and then changing point two to "+pointToString.invoke(p3)
                    ,"Points: [(1.000,7.000),(12.000,-1.000)]\n" +
                            "Slope: -0.727\n" +
                            "X Intercept: 10.625\n" +
                            "Y Intercept: 7.727\n" +
                            "Equation: y = -0.727x + 7.727",line.toString());

        }
        catch (InvocationTargetException e) {
            throw (Exception) e.getCause();
        }
    }

}
