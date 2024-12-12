package A7.Labs.L2Dessert;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Dessert_Tests {

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
            Class<?> classRef = Class.forName(generateClassName("Dessert"));
            Method getItemName = classRef.getMethod("getItemName");
            Method getFlavor = classRef.getMethod("getFlavor");
            Method getContainer = classRef.getMethod("getContainer");
            Method getToppings = classRef.getMethod("getToppings");
            Method getCost = classRef.getMethod("getCost");
            Method toString = classRef.getMethod("toString");

            Object dessert = classRef.getConstructor
                    (String.class,int.class,String.class,String.class,double.class).newInstance
                    ("Strawberry Fun",1,"Strawberry","Butter Cups",5.23);

            Assert.assertEquals("getItemName() failed after using dessert constructor."
                    ,"Strawberry Fun",getItemName.invoke(dessert));
            Assert.assertEquals("getFlavor() failed after using dessert constructor."
                    ,"Strawberry",getFlavor.invoke(dessert));
            Assert.assertEquals("getContainer() failed after using dessert constructor."
                    ,"bowl",getContainer.invoke(dessert));
            Assert.assertEquals("getToppings() failed after using dessert constructor."
                    ,"Butter Cups",getToppings.invoke(dessert));
            Assert.assertEquals("getCost() failed after using dessert constructor."
                    ,5.23,(double)getCost.invoke(dessert),.001);
            Assert.assertEquals("toString() failed after using dessert constructor."
                    ,"( 5.23): Strawberry Fun - Strawberry ice cream in a(n) bowl with Butter Cups.",toString.invoke(dessert));

        }
        catch (InvocationTargetException e) {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test2() throws Exception {
        try
        {
            Class<?> classRef = Class.forName(generateClassName("Dessert"));
            Method getItemName = classRef.getMethod("getItemName");
            Method getFlavor = classRef.getMethod("getFlavor");
            Method getContainer = classRef.getMethod("getContainer");
            Method getToppings = classRef.getMethod("getToppings");
            Method getCost = classRef.getMethod("getCost");
            Method toString = classRef.getMethod("toString");

            Object dessert = classRef.getConstructor
                    (String.class,int.class,String.class,String.class,double.class).newInstance
                    ("White Turtle",2,"White Chocolate","Cherries",13.33);

            Assert.assertEquals("getItemName() failed after using dessert constructor."
                    ,"White Turtle",getItemName.invoke(dessert));
            Assert.assertEquals("getFlavor() failed after using dessert constructor."
                    ,"White Chocolate",getFlavor.invoke(dessert));
            Assert.assertEquals("getContainer() failed after using dessert constructor."
                    ,"waffle cone",getContainer.invoke(dessert));
            Assert.assertEquals("getToppings() failed after using dessert constructor."
                    ,"Cherries",getToppings.invoke(dessert));
            Assert.assertEquals("getCost() failed after using dessert constructor."
                    ,13.33,(double)getCost.invoke(dessert),.001);
            Assert.assertEquals("toString() failed after using dessert constructor."
                    ,"(13.33): White Turtle - White Chocolate ice cream in a(n) waffle cone with Cherries.",toString.invoke(dessert));

        }
        catch (InvocationTargetException e) {
            throw (Exception) e.getCause();
        }
    }
    @Test(timeout = 250)
    public void test3() throws Exception {
        try
        {
            Class<?> classRef = Class.forName(generateClassName("Dessert"));
            Method getItemName = classRef.getMethod("getItemName");
            Method getFlavor = classRef.getMethod("getFlavor");
            Method getContainer = classRef.getMethod("getContainer");
            Method getToppings = classRef.getMethod("getToppings");
            Method getCost = classRef.getMethod("getCost");
            Method toString = classRef.getMethod("toString");

            Object dessert = classRef.getConstructor
                    (String.class,int.class,String.class,String.class,double.class).newInstance
                    ("Sprinkle Tower",0,"Neopolitan","Spinkles",0.67);

            Assert.assertEquals("getItemName() failed after using dessert constructor."
                    ,"Sprinkle Tower",getItemName.invoke(dessert));
            Assert.assertEquals("getFlavor() failed after using dessert constructor."
                    ,"Neopolitan",getFlavor.invoke(dessert));
            Assert.assertEquals("getContainer() failed after using dessert constructor."
                    ,"cone",getContainer.invoke(dessert));
            Assert.assertEquals("getToppings() failed after using dessert constructor."
                    ,"Spinkles",getToppings.invoke(dessert));
            Assert.assertEquals("getCost() failed after using dessert constructor."
                    ,0.67,(double)getCost.invoke(dessert),.001);
            Assert.assertEquals("toString() failed after using dessert constructor."
                    ,"( 0.67): Sprinkle Tower - Neopolitan ice cream in a(n) cone with Spinkles.",toString.invoke(dessert));

        }
        catch (InvocationTargetException e) {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test4() throws Exception {
        try
        {
            Class<?> classRef = Class.forName(generateClassName("Dessert"));
            Method getCost = classRef.getMethod("getCost");
            Method setCost = classRef.getMethod("setCost",double.class);

            Object dessert = classRef.getConstructor
                    (String.class,int.class,String.class,String.class,double.class).newInstance
                    ("Sprinkle Tower",0,"Neopolitan","Spinkles",0.67);

            setCost.invoke(dessert,77.45);
            Assert.assertEquals("getCost() failed after using dessert constructor."
                    ,77.45,(double)getCost.invoke(dessert),.001);

        }
        catch (InvocationTargetException e) {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test5() throws Exception {
        try
        {
            Class<?> classRef = Class.forName(generateClassName("Dessert"));
            Method getCost = classRef.getMethod("getCost");
            Method setCost = classRef.getMethod("setCost",double.class);

            Object dessert = classRef.getConstructor
                    (String.class,int.class,String.class,String.class,double.class).newInstance
                    ("Sprinkle Tower",0,"Neopolitan","Spinkles",0.67);

            setCost.invoke(dessert,5.39);
            Assert.assertEquals("getCost() failed after using dessert constructor."
                    ,5.39,(double)getCost.invoke(dessert),.001);

        }
        catch (InvocationTargetException e) {
            throw (Exception) e.getCause();
        }
    }
}
