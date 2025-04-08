/*
package A12.L1.VideoStore;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;

public class A12_VideoStore_Output_Tests 
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
    public void testIO1() throws Exception{
        String input =  "1\n" +
                "1\n" +
                "1\n" +
                "1\n" +
                "2\n" +
                "1\n" +
                "2\n" +
                "1\n" +
                "1\n" +
                "3";

        String expected =   "Renting Menu\n" +
                "1. Rent Video\n" +
                "2. Rent Game\n" +
                "3. Checkout\n" +
                "Enter selection:\n" +
                "\n" +
                "Video Menu\n" +
                "1. Iron Man 3\n" +
                "2. The Wolverine\n" +
                "3. The Avengers\n" +
                "0. Cancel\n" +
                "Enter selection:\n" +
                "\n" +
                "Title:                        Iron Man 3\n" +
                "Cost:                               3.99\n" +
                "Rating:                            PG-13\n" +
                "Director:                    Shawn Black\n" +
                "Runtime:                     130 minutes\n" +
                "\n" +
                "1 - Rent, 2 - Put Back\n" +
                "Enter selection:\n" +
                "\n" +
                "Renting Menu\n" +
                "1. Rent Video\n" +
                "2. Rent Game\n" +
                "3. Checkout\n" +
                "Enter selection:\n" +
                "\n" +
                "Video Menu\n" +
                "1. The Wolverine\n" +
                "2. The Avengers\n" +
                "0. Cancel\n" +
                "Enter selection:\n" +
                "\n" +
                "Title:                      The Avengers\n" +
                "Cost:                               1.99\n" +
                "Rating:                            PG-13\n" +
                "Director:                    Joss Whedon\n" +
                "Runtime:                     143 minutes\n" +
                "\n" +
                "1 - Rent, 2 - Put Back\n" +
                "Enter selection:\n" +
                "\n" +
                "Renting Menu\n" +
                "1. Rent Video\n" +
                "2. Rent Game\n" +
                "3. Checkout\n" +
                "Enter selection:\n" +
                "\n" +
                "Game Menu\n" +
                "1. Assassin's Creed\n" +
                "2. Frogger Advanced\n" +
                "3. Bomberman Land\n" +
                "0. Cancel\n" +
                "Enter selection:\n" +
                "\n" +
                "Title:                  Assassin's Creed\n" +
                "Cost:                               4.99\n" +
                "Rating:                           Mature\n" +
                "Platform:                  Playstation 3\n" +
                "# of players:                          1\n" +
                "\n" +
                "1 - Rent, 2 - Put Back\n" +
                "Enter selection:\n" +
                "\n" +
                "Renting Menu\n" +
                "1. Rent Video\n" +
                "2. Rent Game\n" +
                "3. Checkout\n" +
                "Enter selection:\n" +
                "\n" +
                "Receipt:\n" +
                "\n" +
                "Rented Videos:\n" +
                "    Iron Man 3                      3.99\n" +
                "    The Avengers                    1.99\n" +
                "\n" +
                "Rented Games:\n" +
                "    Assassin's Creed                4.99\n" +
                "\n" +
                "Subtotal:                          10.97\n" +
                "Tax:                                0.91\n" +
                "Total:                             11.88";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("A12_VideoStore_Main"));
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
    public void testIO2() throws Exception{
        String input =  "2\n" +
                "1\n" +
                "2\n" +
                "2\n" +
                "1\n" +
                "1\n" +
                "2\n" +
                "1\n" +
                "1\n" +
                "2\n" +
                "1\n" +
                "1\n" +
                "2\n" +
                "3";

        String expected =   "Renting Menu\n" +
                "1. Rent Video\n" +
                "2. Rent Game\n" +
                "3. Checkout\n" +
                "Enter selection:\n" +
                "\n" +
                "Game Menu\n" +
                "1. Assassin's Creed\n" +
                "2. Frogger Advanced\n" +
                "3. Bomberman Land\n" +
                "0. Cancel\n" +
                "Enter selection:\n" +
                "\n" +
                "Title:                  Assassin's Creed\n" +
                "Cost:                               4.99\n" +
                "Rating:                           Mature\n" +
                "Platform:                  Playstation 3\n" +
                "# of players:                          1\n" +
                "\n" +
                "1 - Rent, 2 - Put Back\n" +
                "Enter selection:\n" +
                "\n" +
                "Renting Menu\n" +
                "1. Rent Video\n" +
                "2. Rent Game\n" +
                "3. Checkout\n" +
                "Enter selection:\n" +
                "\n" +
                "Game Menu\n" +
                "1. Assassin's Creed\n" +
                "2. Frogger Advanced\n" +
                "3. Bomberman Land\n" +
                "0. Cancel\n" +
                "Enter selection:\n" +
                "\n" +
                "Title:                  Assassin's Creed\n" +
                "Cost:                               4.99\n" +
                "Rating:                           Mature\n" +
                "Platform:                  Playstation 3\n" +
                "# of players:                          1\n" +
                "\n" +
                "1 - Rent, 2 - Put Back\n" +
                "Enter selection:\n" +
                "\n" +
                "Renting Menu\n" +
                "1. Rent Video\n" +
                "2. Rent Game\n" +
                "3. Checkout\n" +
                "Enter selection:\n" +
                "\n" +
                "Game Menu\n" +
                "1. Frogger Advanced\n" +
                "2. Bomberman Land\n" +
                "0. Cancel\n" +
                "Enter selection:\n" +
                "\n" +
                "Title:                  Frogger Advanced\n" +
                "Cost:                               2.99\n" +
                "Rating:                  Early Childhood\n" +
                "Platform:              Game Boy Advanced\n" +
                "# of players:                          1\n" +
                "\n" +
                "1 - Rent, 2 - Put Back\n" +
                "Enter selection:\n" +
                "\n" +
                "Renting Menu\n" +
                "1. Rent Video\n" +
                "2. Rent Game\n" +
                "3. Checkout\n" +
                "Enter selection:\n" +
                "\n" +
                "Game Menu\n" +
                "1. Bomberman Land\n" +
                "0. Cancel\n" +
                "Enter selection:\n" +
                "\n" +
                "Title:                    Bomberman Land\n" +
                "Cost:                               2.99\n" +
                "Rating:                             Teen\n" +
                "Platform:                      Super NES\n" +
                "# of players:                          4\n" +
                "\n" +
                "1 - Rent, 2 - Put Back\n" +
                "Enter selection:\n" +
                "\n" +
                "Renting Menu\n" +
                "1. Rent Video\n" +
                "2. Rent Game\n" +
                "3. Checkout\n" +
                "Enter selection:\n" +
                "\n" +
                "There are no more games in stock.\n" +
                "\n" +
                "Renting Menu\n" +
                "1. Rent Video\n" +
                "2. Rent Game\n" +
                "3. Checkout\n" +
                "Enter selection:\n" +
                "\n" +
                "Receipt:\n" +
                "\n" +
                "Rented Games:\n" +
                "    Assassin's Creed                4.99\n" +
                "    Frogger Advanced                2.99\n" +
                "    Bomberman Land                  2.99\n" +
                "\n" +
                "Subtotal:                          10.97\n" +
                "Tax:                                0.91\n" +
                "Total:                             11.88";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("A12_VideoStore_Main"));
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
    public void testIO3() throws Exception{
        String input =  "1\n" +
                "1\n" +
                "2\n" +
                "1\n" +
                "1\n" +
                "1\n" +
                "1\n" +
                "1\n" +
                "1\n" +
                "1\n" +
                "1\n" +
                "1\n" +
                "1\n" +
                "3";

        String expected =   "Renting Menu\n" +
                "1. Rent Video\n" +
                "2. Rent Game\n" +
                "3. Checkout\n" +
                "Enter selection:\n" +
                "\n" +
                "Video Menu\n" +
                "1. Iron Man 3\n" +
                "2. The Wolverine\n" +
                "3. The Avengers\n" +
                "0. Cancel\n" +
                "Enter selection:\n" +
                "\n" +
                "Title:                        Iron Man 3\n" +
                "Cost:                               3.99\n" +
                "Rating:                            PG-13\n" +
                "Director:                    Shawn Black\n" +
                "Runtime:                     130 minutes\n" +
                "\n" +
                "1 - Rent, 2 - Put Back\n" +
                "Enter selection:\n" +
                "\n" +
                "Renting Menu\n" +
                "1. Rent Video\n" +
                "2. Rent Game\n" +
                "3. Checkout\n" +
                "Enter selection:\n" +
                "\n" +
                "Video Menu\n" +
                "1. Iron Man 3\n" +
                "2. The Wolverine\n" +
                "3. The Avengers\n" +
                "0. Cancel\n" +
                "Enter selection:\n" +
                "\n" +
                "Title:                        Iron Man 3\n" +
                "Cost:                               3.99\n" +
                "Rating:                            PG-13\n" +
                "Director:                    Shawn Black\n" +
                "Runtime:                     130 minutes\n" +
                "\n" +
                "1 - Rent, 2 - Put Back\n" +
                "Enter selection:\n" +
                "\n" +
                "Renting Menu\n" +
                "1. Rent Video\n" +
                "2. Rent Game\n" +
                "3. Checkout\n" +
                "Enter selection:\n" +
                "\n" +
                "Video Menu\n" +
                "1. The Wolverine\n" +
                "2. The Avengers\n" +
                "0. Cancel\n" +
                "Enter selection:\n" +
                "\n" +
                "Title:                     The Wolverine\n" +
                "Cost:                               2.79\n" +
                "Rating:                                R\n" +
                "Director:                  James Mangold\n" +
                "Runtime:                     126 minutes\n" +
                "\n" +
                "1 - Rent, 2 - Put Back\n" +
                "Enter selection:\n" +
                "\n" +
                "Renting Menu\n" +
                "1. Rent Video\n" +
                "2. Rent Game\n" +
                "3. Checkout\n" +
                "Enter selection:\n" +
                "\n" +
                "Video Menu\n" +
                "1. The Avengers\n" +
                "0. Cancel\n" +
                "Enter selection:\n" +
                "\n" +
                "Title:                      The Avengers\n" +
                "Cost:                               1.99\n" +
                "Rating:                            PG-13\n" +
                "Director:                    Joss Whedon\n" +
                "Runtime:                     143 minutes\n" +
                "\n" +
                "1 - Rent, 2 - Put Back\n" +
                "Enter selection:\n" +
                "\n" +
                "Renting Menu\n" +
                "1. Rent Video\n" +
                "2. Rent Game\n" +
                "3. Checkout\n" +
                "Enter selection:\n" +
                "\n" +
                "There are no more videos in stock.\n" +
                "\n" +
                "Renting Menu\n" +
                "1. Rent Video\n" +
                "2. Rent Game\n" +
                "3. Checkout\n" +
                "Enter selection:\n" +
                "\n" +
                "Receipt:\n" +
                "\n" +
                "Rented Videos:\n" +
                "    Iron Man 3                      3.99\n" +
                "    The Wolverine                   2.79\n" +
                "    The Avengers                    1.99\n" +
                "\n" +
                "Subtotal:                           8.77\n" +
                "Tax:                                0.72\n" +
                "Total:                              9.49";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("A12_VideoStore_Main"));
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
    public void testIO4() throws Exception{
        String input =  "1\n" +
                "0\n" +
                "2\n" +
                "0\n" +
                "3";

        String expected =   "Renting Menu\n" +
                "1. Rent Video\n" +
                "2. Rent Game\n" +
                "3. Checkout\n" +
                "Enter selection:\n" +
                "\n" +
                "Video Menu\n" +
                "1. Iron Man 3\n" +
                "2. The Wolverine\n" +
                "3. The Avengers\n" +
                "0. Cancel\n" +
                "Enter selection:\n" +
                "\n" +
                "Renting Menu\n" +
                "1. Rent Video\n" +
                "2. Rent Game\n" +
                "3. Checkout\n" +
                "Enter selection:\n" +
                "\n" +
                "Game Menu\n" +
                "1. Assassin's Creed\n" +
                "2. Frogger Advanced\n" +
                "3. Bomberman Land\n" +
                "0. Cancel\n" +
                "Enter selection:\n" +
                "\n" +
                "Renting Menu\n" +
                "1. Rent Video\n" +
                "2. Rent Game\n" +
                "3. Checkout\n" +
                "Enter selection:\n" +
                "\n" +
                "You did not rent anything.\n" +
                "Have a good day!";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("A12_VideoStore_Main"));
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
    public void testIO5() throws Exception{
        String input =  "3";

        String expected =   "Renting Menu\n" +
                "1. Rent Video\n" +
                "2. Rent Game\n" +
                "3. Checkout\n" +
                "Enter selection:\n" +
                "\n" +
                "You did not rent anything.\n" +
                "Have a good day!";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("A12_VideoStore_Main"));
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
*/
