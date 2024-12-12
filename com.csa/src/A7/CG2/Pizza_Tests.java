package A7.CG2;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Pizza_Tests {
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
            Class<?> classRef = Class.forName(generateClassName("Pizza"));
            Method getCustomer = classRef.getMethod("getCustomer");
            Method getNumberOfToppings = classRef.getMethod("getNumberOfToppings");
            Method getMaker = classRef.getMethod("getMaker");
            Method price = classRef.getMethod("price");

            Object pizza = classRef.getConstructor().newInstance();

            Assert.assertEquals("getCustomer() failed after using the default constructor."
                    ,"", getCustomer.invoke(pizza));
            Assert.assertEquals("getNumberOfToppings() failed after using the default constructor."
                    ,0, getNumberOfToppings.invoke(pizza));
            Assert.assertEquals("getMaker() failed after using the default constructor."
                    ,"", getMaker.invoke(pizza));
            Assert.assertEquals("price() failed after using the default constructor."
                    ,10, (double)price.invoke(pizza),.001);
        }
        catch (InvocationTargetException e) {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test2() throws Exception {
        try
        {
            Class<?> classRef = Class.forName(generateClassName("Pizza"));
            Method getCustomer = classRef.getMethod("getCustomer");
            Method getNumberOfToppings = classRef.getMethod("getNumberOfToppings");
            Method getMaker = classRef.getMethod("getMaker");
            Method price = classRef.getMethod("price");
            Method toString = classRef.getMethod("toString");

            Object pizza = classRef.getConstructor(int.class,String.class,String.class).newInstance(2, "Sue", "Me");


            Assert.assertEquals("getCustomer() failed after using the non-default constructor."
                    ,"Sue", getCustomer.invoke(pizza));
            Assert.assertEquals("getNumberOfToppings() failed after using the non-default constructor."
                    ,2, getNumberOfToppings.invoke(pizza));
            Assert.assertEquals("getMaker() failed after using the non-default constructor."
                    ,"Me", getMaker.invoke(pizza));
            Assert.assertEquals("price() failed after using the non-default constructor."
                    ,11, (double)price.invoke(pizza),.001);
            Assert.assertEquals("toString() failed after using the non-default constructor.",
                    "Sue ordered a pizza from Me with 2 topping(s), which costs $11.00.",toString.invoke(pizza));
        }
        catch (InvocationTargetException e) {
            throw (Exception) e.getCause();
        }

    }

    @Test(timeout = 250)
    public void test3() throws Exception {
        try
        {
            Class<?> classRef = Class.forName(generateClassName("Pizza"));
            Method getCustomer = classRef.getMethod("getCustomer");
            Method getNumberOfToppings = classRef.getMethod("getNumberOfToppings");
            Method getMaker = classRef.getMethod("getMaker");
            Method price = classRef.getMethod("price");

            Object pizza = classRef.getConstructor(int.class,String.class,String.class).newInstance(15, "Me", "Dominos");

            Assert.assertEquals("getCustomer() failed after using the non-default constructor."
                    ,"Me", getCustomer.invoke(pizza));
            Assert.assertEquals("getNumberOfToppings() failed after using the non-default constructor."
                    ,15, getNumberOfToppings.invoke(pizza));
            Assert.assertEquals("getMaker() failed after using the non-default constructor."
                    ,"Dominos", getMaker.invoke(pizza));
            Assert.assertEquals("price() failed after using the non-default constructor."
                    ,17.5, (double)price.invoke(pizza),.001);
            Assert.assertEquals("toString() failed after using the non-default constructor.",
                    "Me ordered a pizza from Dominos with 15 topping(s), which costs $17.50.",pizza.toString());
        }
        catch (InvocationTargetException e) {
            throw (Exception) e.getCause();
        }

    }

    @Test(timeout = 250)
    public void test4() throws Exception {
        try
        {
            Class<?> classRef = Class.forName(generateClassName("Pizza"));
            Method getCustomer = classRef.getMethod("getCustomer");
            Method getNumberOfToppings = classRef.getMethod("getNumberOfToppings");
            Method setNumberOfToppings = classRef.getMethod("setNumberOfToppings",int.class);
            Method getMaker = classRef.getMethod("getMaker");
            Method price = classRef.getMethod("price");

            Object pizza = classRef.getConstructor(int.class,String.class,String.class).newInstance(2, "abc", "def");

            setNumberOfToppings.invoke(pizza,24);
            Assert.assertEquals("getNumberOfToppings() failed after using setNumberOfToppings.",
                    24, getNumberOfToppings.invoke(pizza));
            Assert.assertEquals("price() failed after using setNumberOfToppings.",
                    22, (double)price.invoke(pizza),.001);
        }
        catch (InvocationTargetException e) {
            throw (Exception) e.getCause();
        }

    }

    @Test(timeout = 250)
    public void test5() throws Exception {
        try
        {
            Class<?> classRef = Class.forName(generateClassName("Pizza"));
            Method getCustomer = classRef.getMethod("getCustomer");
            Method getNumberOfToppings = classRef.getMethod("getNumberOfToppings");
            Method setMaker = classRef.getMethod("setMaker",String.class);
            Method getMaker = classRef.getMethod("getMaker");
            Method price = classRef.getMethod("price");

            Object pizza = classRef.getConstructor(int.class,String.class,String.class).newInstance(2, "a", "b");

           setMaker.invoke(pizza,"Marcos");
            Assert.assertEquals("getMaker() failed after using setMaker.","Marcos", getMaker.invoke(pizza));
        }
        catch (InvocationTargetException e) {
            throw (Exception) e.getCause();
        }

    }

    @Test(timeout = 250)
    public void test6() throws Exception {
        try
        {
            Class<?> classRef = Class.forName(generateClassName("Pizza"));
            Method getCustomer = classRef.getMethod("getCustomer");
            Method getNumberOfToppings = classRef.getMethod("getNumberOfToppings");
            Method setCustomer = classRef.getMethod("setCustomer",String.class);
            Method getMaker = classRef.getMethod("getMaker");
            Method price = classRef.getMethod("price");

            Object pizza = classRef.getConstructor(int.class,String.class,String.class).newInstance(2, "a", "b");

            setCustomer.invoke(pizza,"Joey");
            Assert.assertEquals("getCustomer() failed after using setCustomer.","Joey", getCustomer.invoke(pizza));
        }
        catch (InvocationTargetException e) {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test7() throws Exception {
        try
        {
            Class<?> classRef = Class.forName(generateClassName("Pizza"));
            Method getCustomer = classRef.getMethod("getCustomer");
            Method getNumberOfToppings = classRef.getMethod("getNumberOfToppings");
            Method getMaker = classRef.getMethod("getMaker");
            Method price = classRef.getMethod("price");
            Method toString = classRef.getMethod("toString");

            Object pizza1 = classRef.getConstructor(int.class,String.class,String.class).newInstance(2, "Sue", "Me");
            Object pizza2 = classRef.getConstructor(int.class,String.class,String.class).newInstance(7, "Tina", "Ted");


            Assert.assertEquals("getCustomer() failed after using the non-default constructor to create 2 different pizzas."
                    ,"Sue", getCustomer.invoke(pizza1));
            Assert.assertEquals("getNumberOfToppings() failed after using the non-default constructor to create 2 different pizzas."
                    ,2, getNumberOfToppings.invoke(pizza1));
            Assert.assertEquals("getMaker() failed after using the non-default constructor to create 2 different pizzas."
                    ,"Me", getMaker.invoke(pizza1));
            Assert.assertEquals("price() failed after using the non-default constructor to create 2 different pizzas."
                    ,11, (double)price.invoke(pizza1),.001);
            Assert.assertEquals("toString() failed after using the non-default constructor to create 2 different pizzas.",
                    "Sue ordered a pizza from Me with 2 topping(s), which costs $11.00.", toString.invoke(pizza1));

            Assert.assertEquals("getCustomer() failed after using the non-default constructor to create 2 different pizzas."
                    ,"Tina", getCustomer.invoke(pizza2));
            Assert.assertEquals("getNumberOfToppings() failed after using the non-default constructor to create 2 different pizzas."
                    ,7, getNumberOfToppings.invoke(pizza2));
            Assert.assertEquals("getMaker() failed after using the non-default constructor to create 2 different pizzas."
                    ,"Ted", getMaker.invoke(pizza2));
            Assert.assertEquals("price() failed after using the non-default constructor to create 2 different pizzas."
                    ,13.5, (double)price.invoke(pizza2),.001);
            Assert.assertEquals("toString() failed after using the non-default constructor to create 2 different pizzas.",
                    "Tina ordered a pizza from Ted with 7 topping(s), which costs $13.50.",toString.invoke(pizza2));
        }
        catch (InvocationTargetException e) {
            throw (Exception) e.getCause();
        }

    }
}
