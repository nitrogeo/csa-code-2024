package A7.Labs.L2Dessert;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class IceCreamShop_Tests {

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
            Class<?> classRefDessert = Class.forName(generateClassName("Dessert"));

            Class<?> classRefShop = Class.forName(generateClassName("IceCreamShop"));
            Method getStoreName = classRefShop.getMethod("getStoreName");
            Method getMenuItem1 = classRefShop.getMethod("getMenuItem1");
            Method getMenuItem2 = classRefShop.getMethod("getMenuItem2");
            Method getSpecial = classRefShop.getMethod("getSpecial");
            Method shopString = classRefShop.getMethod("toString");

            Object shop = classRefShop.getConstructor(String.class).newInstance("Pinky's");
            
            Assert.assertEquals("getStoreName() failed after using using IceCreamShop constructor.","Pinky's",getStoreName.invoke(shop));
            Assert.assertNull("getMenuItem1() failed to return null after using IceCreamShop constructor.",getMenuItem1.invoke(shop));
            Assert.assertNull("getMenuItem2() failed to return null after using IceCreamShop constructor.",getMenuItem2.invoke(shop));
            Assert.assertNull("getSpecial() failed to return null after using IceCreamShop constructor.",getSpecial.invoke(shop));
            Assert.assertEquals("toString() failed after using using IceCreamShop constructor.","---Pinky's---\nMenu Unavailable",shopString.invoke(shop));

        }
        catch (InvocationTargetException e) {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test2() throws Exception{
        try
        {
            Class<?> classRefDessert = Class.forName(generateClassName("Dessert"));

            Class<?> classRefShop = Class.forName(generateClassName("IceCreamShop"));
            Method getStoreName = classRefShop.getMethod("getStoreName");
            Method getMenuItem1 = classRefShop.getMethod("getMenuItem1");
            Method getMenuItem2 = classRefShop.getMethod("getMenuItem2");
            Method getSpecial = classRefShop.getMethod("getSpecial");
            Method shopString = classRefShop.getMethod("toString");

            Object shop = classRefShop.getConstructor(String.class).newInstance("Bob's Ice Cream Shop");

            Assert.assertEquals("getStoreName() failed after using using IceCreamShop constructor.","Bob's Ice Cream Shop",getStoreName.invoke(shop));
            Assert.assertNull("getMenuItem1() failed to return null after using IceCreamShop constructor.",getMenuItem1.invoke(shop));
            Assert.assertNull("getMenuItem2() failed to return null after using IceCreamShop constructor.",getMenuItem2.invoke(shop));
            Assert.assertNull("getSpecial() failed to return null after using IceCreamShop constructor.",getSpecial.invoke(shop));
            Assert.assertEquals("toString() failed after using using IceCreamShop constructor.","---Bob's Ice Cream Shop---\nMenu Unavailable",shopString.invoke(shop));
        }
        catch (InvocationTargetException e) {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test3() throws Exception{
        try
        {
            Class<?> classRefDessert = Class.forName(generateClassName("Dessert"));
            Method dessertToString = classRefDessert.getMethod("toString");

            Class<?> classRefShop = Class.forName(generateClassName("IceCreamShop"));
            Method getStoreName = classRefShop.getMethod("getStoreName");
            Method getMenuItem1 = classRefShop.getMethod("getMenuItem1");
            Method getMenuItem2 = classRefShop.getMethod("getMenuItem2");
            Method getSpecial = classRefShop.getMethod("getSpecial");
            Method setMenuItem1 = classRefShop.getMethod("setMenuItem1",classRefDessert);
            Method shopString = classRefShop.getMethod("toString");

            Object menu1 = classRefDessert.getConstructor
                    (String.class,int.class,String.class,String.class,double.class).newInstance
                    ("Menu 1",1,"Vanilla","Butter Cups",15.93);

            Object shop = classRefShop.getConstructor(String.class).newInstance("Head Freeze");
            setMenuItem1.invoke(shop,menu1);

            Assert.assertEquals("getStoreName() failed after using using IceCreamShop constructor and setting menu item 1.","Head Freeze",getStoreName.invoke(shop));
            Assert.assertEquals("getMenuItem1() failed after using using IceCreamShop constructor and setting menu item 1.","(15.93): Menu 1 - Vanilla ice cream in a(n) bowl with Butter Cups.",dessertToString.invoke(getMenuItem1.invoke(shop)));
            Assert.assertNull("getMenuItem2() failed after using using IceCreamShop constructor and setting menu item 1.",getMenuItem2.invoke(shop));
            Assert.assertNull("getSpecial() failed after using using IceCreamShop constructor and setting menu item 1.",getSpecial.invoke(shop));
            Assert.assertEquals("toString() failed after using using IceCreamShop constructor and setting menu item 1.","---Head Freeze---\n" +
                    "1. (15.93): Menu 1 - Vanilla ice cream in a(n) bowl with Butter Cups.",shopString.invoke(shop));
        }
        catch (InvocationTargetException e) {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test4() throws Exception{
        try
        {
            Class<?> classRefDessert = Class.forName(generateClassName("Dessert"));
            Method dessertToString = classRefDessert.getMethod("toString");

            Class<?> classRefShop = Class.forName(generateClassName("IceCreamShop"));
            Method getStoreName = classRefShop.getMethod("getStoreName");
            Method getMenuItem1 = classRefShop.getMethod("getMenuItem1");
            Method getMenuItem2 = classRefShop.getMethod("getMenuItem2");
            Method getSpecial = classRefShop.getMethod("getSpecial");
            Method setMenuItem2 = classRefShop.getMethod("setMenuItem2",classRefDessert);
            Method shopString = classRefShop.getMethod("toString");

            Object menu2 = classRefDessert.getConstructor
                    (String.class,int.class,String.class,String.class,double.class).newInstance
                    ("Menu 2",1,"Vanilla","Butter Cups",15.93);
            /*Object p2 = classRefDessert.getConstructor
                    (String.class,int.class,String.class,String.class,double.class).newInstance
                    (8.0,188.0);*/

            Object shop = classRefShop.getConstructor(String.class).newInstance("Cold Stuff");
            setMenuItem2.invoke(shop,menu2);

            Assert.assertEquals("getStoreName() failed after using using IceCreamShop constructor and setting menu item 2","Cold Stuff",getStoreName.invoke(shop));
            Assert.assertNull("getMenuItem1() failed after using using IceCreamShop constructor and setting menu item 2",getMenuItem1.invoke(shop));
            Assert.assertEquals("getMenuItem2() failed after using using IceCreamShop constructor and setting menu item 2","(15.93): Menu 2 - Vanilla ice cream in a(n) bowl with Butter Cups.",dessertToString.invoke(getMenuItem2.invoke(shop)));
            Assert.assertNull("getSpecial() failed after using using IceCreamShop constructor and setting menu item 2",getSpecial.invoke(shop));
            Assert.assertEquals("toString() failed after using using IceCreamShop constructor and setting menu item 2.","---Cold Stuff---\n" +
                    "2. (15.93): Menu 2 - Vanilla ice cream in a(n) bowl with Butter Cups.",shopString.invoke(shop));
        }
        catch (InvocationTargetException e) {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test5() throws Exception{
        try
        {
            Class<?> classRefDessert = Class.forName(generateClassName("Dessert"));
            Method dessertToString = classRefDessert.getMethod("toString");

            Class<?> classRefShop = Class.forName(generateClassName("IceCreamShop"));
            Method getStoreName = classRefShop.getMethod("getStoreName");
            Method getMenuItem1 = classRefShop.getMethod("getMenuItem1");
            Method getMenuItem2 = classRefShop.getMethod("getMenuItem2");
            Method getSpecial = classRefShop.getMethod("getSpecial");
            Method setSpecial = classRefShop.getMethod("setSpecial",classRefDessert);
            Method shopString = classRefShop.getMethod("toString");

            Object special = classRefDessert.getConstructor
                    (String.class,int.class,String.class,String.class,double.class).newInstance
                    ("Special A",2,"Peanut Butter","Chocolate Syrup and Bananas",26.79);

            Object shop = classRefShop.getConstructor(String.class).newInstance("Special Ice Cream");
            setSpecial.invoke(shop,special);

            Assert.assertEquals("getStoreName() failed after using using IceCreamShop constructor and setting the special.","Special Ice Cream",getStoreName.invoke(shop));
            Assert.assertNull("getMenuItem1() failed after using using IceCreamShop constructor and setting the special.",getMenuItem1.invoke(shop));
            Assert.assertNull("getMenuItem2() failed after using using IceCreamShop constructor and setting the special.",getMenuItem2.invoke(shop));
            Assert.assertEquals("getSpecial() failed after using using IceCreamShop constructor and setting the special.","(26.79): Special A - Peanut Butter ice cream in a(n) waffle cone with Chocolate Syrup and Bananas.",dessertToString.invoke(getSpecial.invoke(shop)));
            Assert.assertEquals("toString() failed after using using IceCreamShop constructor and setting the special.","---Special Ice Cream---\n" +
                    "S. (26.79): Special A - Peanut Butter ice cream in a(n) waffle cone with Chocolate Syrup and Bananas.",shopString.invoke(shop));

        }
        catch (InvocationTargetException e) {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test6() throws Exception{
        try
        {
            Class<?> classRefDessert = Class.forName(generateClassName("Dessert"));
            Method dessertToString = classRefDessert.getMethod("toString");

            Class<?> classRefShop = Class.forName(generateClassName("IceCreamShop"));
            Method getStoreName = classRefShop.getMethod("getStoreName");
            Method getMenuItem1 = classRefShop.getMethod("getMenuItem1");
            Method getMenuItem2 = classRefShop.getMethod("getMenuItem2");
            Method setMenuItem1 = classRefShop.getMethod("setMenuItem1",classRefDessert);
            Method setMenuItem2 = classRefShop.getMethod("setMenuItem2",classRefDessert);
            Method getSpecial = classRefShop.getMethod("getSpecial");
            Method setSpecial = classRefShop.getMethod("setSpecial",classRefDessert);
            Method shopString = classRefShop.getMethod("toString");

            Object menu1 = classRefDessert.getConstructor
                    (String.class,int.class,String.class,String.class,double.class).newInstance
                    ("A",0,"Chocolate","Sprinkles",8.93);
            Object menu2 = classRefDessert.getConstructor
                    (String.class,int.class,String.class,String.class,double.class).newInstance
                    ("B",2,"Strawberry","Broken Cookies",4.76);
            Object special = classRefDessert.getConstructor
                    (String.class,int.class,String.class,String.class,double.class).newInstance
                    ("C",1,"Mixed","Peanuts",19.71);

            Object shop = classRefShop.getConstructor(String.class).newInstance("Special Ice Cream");
            setMenuItem1.invoke(shop,menu1);
            setMenuItem2.invoke(shop,menu2);
            setSpecial.invoke(shop,special);

            Assert.assertEquals("getStoreName() failed after using using IceCreamShop constructor and setting all desserts.","Special Ice Cream",getStoreName.invoke(shop));
            Assert.assertEquals("getMenuItem1() failed after using using IceCreamShop constructor and setting all desserts.","( 8.93): A - Chocolate ice cream in a(n) cone with Sprinkles.",dessertToString.invoke(getMenuItem1.invoke(shop)));
            Assert.assertEquals("getMenuItem2() failed after using using IceCreamShop constructor and setting all desserts.","( 4.76): B - Strawberry ice cream in a(n) waffle cone with Broken Cookies.",dessertToString.invoke(getMenuItem2.invoke(shop)));
            Assert.assertEquals("getSpecial() failed after using using IceCreamShop constructor and setting all desserts.","(19.71): C - Mixed ice cream in a(n) bowl with Peanuts.",dessertToString.invoke(getSpecial.invoke(shop)));
            Assert.assertEquals("toString() failed after using using IceCreamShop constructor and setting all desserts.","---Special Ice Cream---\n" +
                    "1. ( 8.93): A - Chocolate ice cream in a(n) cone with Sprinkles.\n" +
                    "2. ( 4.76): B - Strawberry ice cream in a(n) waffle cone with Broken Cookies.\n" +
                    "S. (19.71): C - Mixed ice cream in a(n) bowl with Peanuts.",shopString.invoke(shop));

        }
        catch (InvocationTargetException e) {
            throw (Exception) e.getCause();
        }
    }

}
