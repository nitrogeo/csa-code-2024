package A7.Labs.L2Dessert;

import A7.Labs.L1Lines.TestingOutputStream;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;

public class IceCreamLab_Tests
{
    public String generateClassName(String name)
    {
        if(getClass().toString().contains("."))
        {
            return getClass().toString().substring(6,getClass().toString().lastIndexOf(".")+1)+name;
        }
        return name;
    }

    public TestingOutputStream testingOutputStream = new TestingOutputStream();

    @Before
    public void setup()
    {
        System.setOut(testingOutputStream);

    }

    public String unifyLineSeperators(String line)
    {
        return line.replaceAll("\\n|\\r\\n", System.getProperty("line.separator")).trim();
    }

    @Test(timeout = 250)
    public void test1() throws Exception{
        String input =  "Totally Cool\n" +
                "1\n" +
                "5\n" +
                "6";

        String expected =   "Enter the name of your ice cream shop:\n" +
                "\n" +
                "-Zom Menu-\n" +
                "1. View Shop's Menu\n" +
                "2. Add / Change Menu Item 1\n" +
                "3. Add / Change Menu Item 2\n" +
                "4. Add / Change Special\n" +
                "5. Sale\n" +
                "6. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "---Totally Cool---\n" +
                "Menu Unavailable\n" +
                "\n" +
                "-Zom Menu-\n" +
                "1. View Shop's Menu\n" +
                "2. Add / Change Menu Item 1\n" +
                "3. Add / Change Menu Item 2\n" +
                "4. Add / Change Special\n" +
                "5. Sale\n" +
                "6. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "You must first add items to the menu.\n" +
                "\n" +
                "-Zom Menu-\n" +
                "1. View Shop's Menu\n" +
                "2. Add / Change Menu Item 1\n" +
                "3. Add / Change Menu Item 2\n" +
                "4. Add / Change Special\n" +
                "5. Sale\n" +
                "6. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "Goodbye.";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("IceCreamLab"));
        Object classObject = classRef.getConstructor().newInstance();

        Method main = classRef.getMethod("main",String[].class);
        try
        {
            main.invoke(classObject,(Object)null);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }

        expected = unifyLineSeperators(expected);

        TestingOutputStream o = (TestingOutputStream)System.out;
        Assert.assertEquals(unifyLineSeperators(expected), unifyLineSeperators(o.toString()));
    }

    @Test(timeout = 250)
    public void test2() throws Exception{
        String input =  "Bob's Desserts\n" +
                "4\n" +
                "2\n" +
                "4\n" +
                "3\n" +
                "1\n" +
                "Chocolate\n" +
                "Chocolate Syrup\n" +
                "19.99\n" +
                "1\n" +
                "6";

        String expected =   "Enter the name of your ice cream shop:\n" +
                "\n" +
                "-Zom Menu-\n" +
                "1. View Shop's Menu\n" +
                "2. Add / Change Menu Item 1\n" +
                "3. Add / Change Menu Item 2\n" +
                "4. Add / Change Special\n" +
                "5. Sale\n" +
                "6. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "Enter menu item special..\n" +
                "Enter the item's Name: \n" +
                "Enter the item's container type (0-Cone/1-Bowl/2-Waffle Cone): \n" +
                "Enter the item's container type (0-Cone/1-Bowl/2-Waffle Cone): \n" +
                "Enter the item's container type (0-Cone/1-Bowl/2-Waffle Cone): \n" +
                "Enter the item's flavor: \n" +
                "Enter the item's toppings: \n" +
                "Enter the item's cost: \n" +
                "\n" +
                "-Zom Menu-\n" +
                "1. View Shop's Menu\n" +
                "2. Add / Change Menu Item 1\n" +
                "3. Add / Change Menu Item 2\n" +
                "4. Add / Change Special\n" +
                "5. Sale\n" +
                "6. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "---Bob's Desserts---\n" +
                "S. (19.99): 2 - Chocolate ice cream in a(n) bowl with Chocolate Syrup.\n" +
                "\n" +
                "-Zom Menu-\n" +
                "1. View Shop's Menu\n" +
                "2. Add / Change Menu Item 1\n" +
                "3. Add / Change Menu Item 2\n" +
                "4. Add / Change Special\n" +
                "5. Sale\n" +
                "6. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "Goodbye.";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("IceCreamLab"));
        Object classObject = classRef.getConstructor().newInstance();

        Method main = classRef.getMethod("main",String[].class);
        try
        {
            main.invoke(classObject,(Object)null);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }

        expected = unifyLineSeperators(expected);

        TestingOutputStream o = (TestingOutputStream)System.out;
        Assert.assertEquals(unifyLineSeperators(expected), unifyLineSeperators(o.toString()));
    }

    @Test(timeout = 250)
    public void test3() throws Exception{
        String input =  "Pinky's\n" +
                "2\n" +
                "Yummy Rainbow\n" +
                "1\n" +
                "Neopolitan\n" +
                "Sprinkles\n" +
                "9.09\n" +
                "3\n" +
                "Turtle Cone\n" +
                "2\n" +
                "Chocolate and Vanilla\n" +
                "Chocolate Shell\n" +
                "14.85\n" +
                "1\n" +
                "6\n";

        String expected =   "Enter the name of your ice cream shop:\n" +
                "\n" +
                "-Zom Menu-\n" +
                "1. View Shop's Menu\n" +
                "2. Add / Change Menu Item 1\n" +
                "3. Add / Change Menu Item 2\n" +
                "4. Add / Change Special\n" +
                "5. Sale\n" +
                "6. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "Enter menu item 1..\n" +
                "Enter the item's Name: \n" +
                "Enter the item's container type (0-Cone/1-Bowl/2-Waffle Cone): \n" +
                "Enter the item's flavor: \n" +
                "Enter the item's toppings: \n" +
                "Enter the item's cost: \n" +
                "\n" +
                "-Zom Menu-\n" +
                "1. View Shop's Menu\n" +
                "2. Add / Change Menu Item 1\n" +
                "3. Add / Change Menu Item 2\n" +
                "4. Add / Change Special\n" +
                "5. Sale\n" +
                "6. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "Enter menu item 2..\n" +
                "Enter the item's Name: \n" +
                "Enter the item's container type (0-Cone/1-Bowl/2-Waffle Cone): \n" +
                "Enter the item's flavor: \n" +
                "Enter the item's toppings: \n" +
                "Enter the item's cost: \n" +
                "\n" +
                "-Zom Menu-\n" +
                "1. View Shop's Menu\n" +
                "2. Add / Change Menu Item 1\n" +
                "3. Add / Change Menu Item 2\n" +
                "4. Add / Change Special\n" +
                "5. Sale\n" +
                "6. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "---Pinky's---\n" +
                "1. ( 9.09): Yummy Rainbow - Neopolitan ice cream in a(n) bowl with Sprinkles.\n" +
                "2. (14.85): Turtle Cone - Chocolate and Vanilla ice cream in a(n) waffle cone with Chocolate Shell.\n" +
                "\n" +
                "-Zom Menu-\n" +
                "1. View Shop's Menu\n" +
                "2. Add / Change Menu Item 1\n" +
                "3. Add / Change Menu Item 2\n" +
                "4. Add / Change Special\n" +
                "5. Sale\n" +
                "6. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "Goodbye.";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("IceCreamLab"));
        Object classObject = classRef.getConstructor().newInstance();

        Method main = classRef.getMethod("main",String[].class);
        try
        {
            main.invoke(classObject,(Object)null);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }

        expected = unifyLineSeperators(expected);

        TestingOutputStream o = (TestingOutputStream)System.out;
        Assert.assertEquals(unifyLineSeperators(expected), unifyLineSeperators(o.toString()));
    }

    @Test(timeout = 250)
    public void test4() throws Exception{
        String input =  "Pinky's\n" +
                "3\n" +
                "Yummy Rainbow\n" +
                "1\n" +
                "Neopolitan\n" +
                "Sprinkles\n" +
                "9.09\n" +
                "4\n" +
                "Turtle Cone\n" +
                "2\n" +
                "Chocolate and Vanilla\n" +
                "Chocolate Shell\n" +
                "14.85\n" +
                "1\n" +
                "6\n";;

        String expected =   "Enter the name of your ice cream shop:\n" +
                "\n" +
                "-Zom Menu-\n" +
                "1. View Shop's Menu\n" +
                "2. Add / Change Menu Item 1\n" +
                "3. Add / Change Menu Item 2\n" +
                "4. Add / Change Special\n" +
                "5. Sale\n" +
                "6. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "Enter menu item 2..\n" +
                "Enter the item's Name: \n" +
                "Enter the item's container type (0-Cone/1-Bowl/2-Waffle Cone): \n" +
                "Enter the item's flavor: \n" +
                "Enter the item's toppings: \n" +
                "Enter the item's cost: \n" +
                "\n" +
                "-Zom Menu-\n" +
                "1. View Shop's Menu\n" +
                "2. Add / Change Menu Item 1\n" +
                "3. Add / Change Menu Item 2\n" +
                "4. Add / Change Special\n" +
                "5. Sale\n" +
                "6. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "Enter menu item special..\n" +
                "Enter the item's Name: \n" +
                "Enter the item's container type (0-Cone/1-Bowl/2-Waffle Cone): \n" +
                "Enter the item's flavor: \n" +
                "Enter the item's toppings: \n" +
                "Enter the item's cost: \n" +
                "\n" +
                "-Zom Menu-\n" +
                "1. View Shop's Menu\n" +
                "2. Add / Change Menu Item 1\n" +
                "3. Add / Change Menu Item 2\n" +
                "4. Add / Change Special\n" +
                "5. Sale\n" +
                "6. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "---Pinky's---\n" +
                "2. ( 9.09): Yummy Rainbow - Neopolitan ice cream in a(n) bowl with Sprinkles.\n" +
                "S. (14.85): Turtle Cone - Chocolate and Vanilla ice cream in a(n) waffle cone with Chocolate Shell.\n" +
                "\n" +
                "-Zom Menu-\n" +
                "1. View Shop's Menu\n" +
                "2. Add / Change Menu Item 1\n" +
                "3. Add / Change Menu Item 2\n" +
                "4. Add / Change Special\n" +
                "5. Sale\n" +
                "6. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "Goodbye.";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("IceCreamLab"));
        Object classObject = classRef.getConstructor().newInstance();

        Method main = classRef.getMethod("main",String[].class);
        try
        {
            main.invoke(classObject,(Object)null);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }

        expected = unifyLineSeperators(expected);

        TestingOutputStream o = (TestingOutputStream)System.out;
        Assert.assertEquals(unifyLineSeperators(expected), unifyLineSeperators(o.toString()));
    }

    @Test(timeout = 250)
    public void test5() throws Exception{
        String input =  "Chill Desserts\n" +
                "2\n" +
                "Yummy Rainbow\n" +
                "0\n" +
                "Neopolitan\n" +
                "Sprinkles\n" +
                "9.09\n" +
                "3\n" +
                "Turtle Cone\n" +
                "2\n" +
                "Chocolate and Vanilla\n" +
                "Chocolate Shell\n" +
                "14.85\n" +
                "4\n" +
                "Yummy Worms\n" +
                "1\n" +
                "Chocolate\n" +
                "Gummy Worms\n" +
                "15.99\n" +
                "1\n" +
                "5\n" +
                "1.11\n" +
                "2.22\n" +
                "3.33\n" +
                "1\n" +
                "6\n";

        String expected =   "Enter the name of your ice cream shop:\n" +
                "\n" +
                "-Zom Menu-\n" +
                "1. View Shop's Menu\n" +
                "2. Add / Change Menu Item 1\n" +
                "3. Add / Change Menu Item 2\n" +
                "4. Add / Change Special\n" +
                "5. Sale\n" +
                "6. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "Enter menu item 1..\n" +
                "Enter the item's Name: \n" +
                "Enter the item's container type (0-Cone/1-Bowl/2-Waffle Cone): \n" +
                "Enter the item's flavor: \n" +
                "Enter the item's toppings: \n" +
                "Enter the item's cost: \n" +
                "\n" +
                "-Zom Menu-\n" +
                "1. View Shop's Menu\n" +
                "2. Add / Change Menu Item 1\n" +
                "3. Add / Change Menu Item 2\n" +
                "4. Add / Change Special\n" +
                "5. Sale\n" +
                "6. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "Enter menu item 2..\n" +
                "Enter the item's Name: \n" +
                "Enter the item's container type (0-Cone/1-Bowl/2-Waffle Cone): \n" +
                "Enter the item's flavor: \n" +
                "Enter the item's toppings: \n" +
                "Enter the item's cost: \n" +
                "\n" +
                "-Zom Menu-\n" +
                "1. View Shop's Menu\n" +
                "2. Add / Change Menu Item 1\n" +
                "3. Add / Change Menu Item 2\n" +
                "4. Add / Change Special\n" +
                "5. Sale\n" +
                "6. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "Enter menu item special..\n" +
                "Enter the item's Name: \n" +
                "Enter the item's container type (0-Cone/1-Bowl/2-Waffle Cone): \n" +
                "Enter the item's flavor: \n" +
                "Enter the item's toppings: \n" +
                "Enter the item's cost: \n" +
                "\n" +
                "-Zom Menu-\n" +
                "1. View Shop's Menu\n" +
                "2. Add / Change Menu Item 1\n" +
                "3. Add / Change Menu Item 2\n" +
                "4. Add / Change Special\n" +
                "5. Sale\n" +
                "6. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "---Chill Desserts---\n" +
                "1. ( 9.09): Yummy Rainbow - Neopolitan ice cream in a(n) cone with Sprinkles.\n" +
                "2. (14.85): Turtle Cone - Chocolate and Vanilla ice cream in a(n) waffle cone with Chocolate Shell.\n" +
                "S. (15.99): Yummy Worms - Chocolate ice cream in a(n) bowl with Gummy Worms.\n" +
                "\n" +
                "-Zom Menu-\n" +
                "1. View Shop's Menu\n" +
                "2. Add / Change Menu Item 1\n" +
                "3. Add / Change Menu Item 2\n" +
                "4. Add / Change Special\n" +
                "5. Sale\n" +
                "6. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "( 9.09): Yummy Rainbow - Neopolitan ice cream in a(n) cone with Sprinkles.\n" +
                "Enter the new price for the above item: \n" +
                "(14.85): Turtle Cone - Chocolate and Vanilla ice cream in a(n) waffle cone with Chocolate Shell.\n" +
                "Enter the new price for the above item: \n" +
                "(15.99): Yummy Worms - Chocolate ice cream in a(n) bowl with Gummy Worms.\n" +
                "Enter the new price for the above item: \n" +
                "\n" +
                "-Zom Menu-\n" +
                "1. View Shop's Menu\n" +
                "2. Add / Change Menu Item 1\n" +
                "3. Add / Change Menu Item 2\n" +
                "4. Add / Change Special\n" +
                "5. Sale\n" +
                "6. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "---Chill Desserts---\n" +
                "1. ( 1.11): Yummy Rainbow - Neopolitan ice cream in a(n) cone with Sprinkles.\n" +
                "2. ( 2.22): Turtle Cone - Chocolate and Vanilla ice cream in a(n) waffle cone with Chocolate Shell.\n" +
                "S. ( 3.33): Yummy Worms - Chocolate ice cream in a(n) bowl with Gummy Worms.\n" +
                "\n" +
                "-Zom Menu-\n" +
                "1. View Shop's Menu\n" +
                "2. Add / Change Menu Item 1\n" +
                "3. Add / Change Menu Item 2\n" +
                "4. Add / Change Special\n" +
                "5. Sale\n" +
                "6. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "Goodbye.";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("IceCreamLab"));
        Object classObject = classRef.getConstructor().newInstance();

        Method main = classRef.getMethod("main",String[].class);
        try
        {
            main.invoke(classObject,(Object)null);
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }

        expected = unifyLineSeperators(expected);

        TestingOutputStream o = (TestingOutputStream)System.out;
        Assert.assertEquals(unifyLineSeperators(expected), unifyLineSeperators(o.toString()));
    }

}
