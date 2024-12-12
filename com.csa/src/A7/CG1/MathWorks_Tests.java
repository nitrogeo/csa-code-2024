package A7.CG1;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MathWorks_Tests {
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
            Class<?> classRef = Class.forName(generateClassName("MathWorks"));
            Method getNumber = classRef.getMethod("getNumber");
            Object mathWorks = classRef.getConstructor().newInstance();
            int actual = (int)getNumber.invoke(mathWorks);
            int expected = 100;
            Assert.assertEquals("getNumber(), failed after default constructor", expected, actual);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test2() throws Exception {
        try {
            for (int x = 0; x < 100; x++) {
                int num = (int) (Math.random() * 1000 + 1);
                Class<?> classRef = Class.forName(generateClassName("MathWorks"));
                Method getNumber = classRef.getMethod("getNumber");
                Object mathWorks = classRef.getConstructor(int.class).newInstance(num);
                int actual = (int)getNumber.invoke(mathWorks);

                Assert.assertEquals("getNumber(), failed after using the non-default constructor", num,actual);

            }
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test3() throws Exception {
        try
        {
            for (int x = 0; x < 100; x++) {
                Class<?> classRef = Class.forName(generateClassName("MathWorks"));
                Method getNumber = classRef.getMethod("getNumber");
                Method add = classRef.getMethod("add",int.class);

                int num = (int) (Math.random() * 1000 + 1);
                int num2 = (int) (Math.random() * 10 + 1);
                Object mathWorks = classRef.getConstructor(int.class).newInstance(num);
                add.invoke(mathWorks,num2);

                int actual = (int)getNumber.invoke(mathWorks);
                int expected = num+num2;


                Assert.assertEquals("getNumber(), failed after used add.",expected, actual);

            }
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test4() throws Exception {
        try
        {
            for(int x = 0; x<100;x++)
            {
                Class<?> classRef = Class.forName(generateClassName("MathWorks"));
                Method getNumber = classRef.getMethod("getNumber");
                Method subtract = classRef.getMethod("subtract",int.class);

                int num = (int) (Math.random() * 1000 + 1);
                int num2 = (int) (Math.random() * 10 + 1);
                Object mathWorks = classRef.getConstructor(int.class).newInstance(num);
                subtract.invoke(mathWorks,num2);

                int actual = (int)getNumber.invoke(mathWorks);
                int expected = num-num2;

                Assert.assertEquals("getNumber(), failed after using subtract.",expected,actual);

            }
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test5() throws Exception {
        try
        {
            for(int x = 0; x<100;x++)
            {
                Class<?> classRef = Class.forName(generateClassName("MathWorks"));
                Method getNumber = classRef.getMethod("getNumber");
                Method divide = classRef.getMethod("divide",int.class);

                int num = (int) (Math.random() * 1000 + 1);
                int num2 = (int) (Math.random() * 10 + 1);
                Object mathWorks = classRef.getConstructor(int.class).newInstance(num);
                divide.invoke(mathWorks,num2);

                int actual = (int)getNumber.invoke(mathWorks);
                int expected = num/num2;

                Assert.assertEquals("getNumber(), failed after default using divide.",expected,actual);
            }
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test6() throws Exception {
        try
        {
            for(int x = 0; x<100;x++)
            {
                Class<?> classRef = Class.forName(generateClassName("MathWorks"));
                Method getNumber = classRef.getMethod("getNumber");
                Method multiply = classRef.getMethod("multiply",int.class);

                int num = (int) (Math.random() * 1000 + 1);
                int num2 = (int) (Math.random() * 10 + 1);
                Object mathWorks = classRef.getConstructor(int.class).newInstance(num);
                multiply.invoke(mathWorks,num2);

                int actual = (int)getNumber.invoke(mathWorks);
                int expected = num*num2;

                Assert.assertEquals("getNumber(), failed using multiply.",expected,actual);
            }
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test7() throws Exception {
        try
        {
            for(int x = 0; x<100;x++)
            {
                Class<?> classRef = Class.forName(generateClassName("MathWorks"));
                Method getNumber = classRef.getMethod("getNumber");
                Method toString = classRef.getMethod("toString");

                int num = (int) (Math.random() * 1000 + 1);
                int num2 = (int) (Math.random() * 10 + 1);
                Object mathWorks = classRef.getConstructor(int.class).newInstance(num);
                toString.invoke(mathWorks);

                String actual = (String)toString.invoke(mathWorks);
                String expected = "The number is currently "+num+".";


                Assert.assertEquals("toString(), failed using non-default constructor.",expected,actual);
            }
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test8() throws Exception {
        try
        {
            Class<?> classRef = Class.forName(generateClassName("MathWorks"));
            Method getNumber = classRef.getMethod("getNumber");
            Method toString = classRef.getMethod("toString");

            int num = (int) (Math.random() * 1000 + 1);
            int num2 = num+(int) (Math.random() * 10 + 1);
            Object mathWorks1 = classRef.getConstructor(int.class).newInstance(num);
            Object mathWorks2 = classRef.getConstructor(int.class).newInstance(num);

            Assert.assertEquals("getNumber(), failed after constructing 2 MathWorks objects with different values.",getNumber.invoke(mathWorks1),num);
            Assert.assertEquals("getNumber(), failed after constructing 2 MathWorks objects with different values.",getNumber.invoke(mathWorks2),num);

        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }
}
