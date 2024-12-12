package A8.LabsG2;

import A8.LabsG1.TestingOutputStream;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;

public class A8_ExpanderMain_Tests
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
                "2\n" +
                "3\n" +
                "3\n" +
                "3\n" +
                "4\n" +
                "3\n" +
                "5\n" +
                "1\n" +
                "2\n" +
                "4\n" +
                "28\n" +
                "2\n" +
                "1\n" +
                "2\n" +
                "5\n" +
                "78\n" +
                "3\n" +
                "1\n" +
                "2\n" +
                "6\n" +
                "0\n" +
                "1\n" +
                "2\n" +
                "7\n" +
                "1\n" +
                "2\n" +
                "8";

        String expected =   "-Menu-\n" +
                "1. Print\n" +
                "2. Size\n" +
                "3. Add\n" +
                "4. Insert\n" +
                "5. Set\n" +
                "6. Remove\n" +
                "7. Clear\n" +
                "8. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "[]\n" +
                "\n" +
                "-Menu-\n" +
                "1. Print\n" +
                "2. Size\n" +
                "3. Add\n" +
                "4. Insert\n" +
                "5. Set\n" +
                "6. Remove\n" +
                "7. Clear\n" +
                "8. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "The list has 0 elements.\n" +
                "\n" +
                "-Menu-\n" +
                "1. Print\n" +
                "2. Size\n" +
                "3. Add\n" +
                "4. Insert\n" +
                "5. Set\n" +
                "6. Remove\n" +
                "7. Clear\n" +
                "8. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "Enter a value to add:\n" +
                "\n" +
                "-Menu-\n" +
                "1. Print\n" +
                "2. Size\n" +
                "3. Add\n" +
                "4. Insert\n" +
                "5. Set\n" +
                "6. Remove\n" +
                "7. Clear\n" +
                "8. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "Enter a value to add:\n" +
                "\n" +
                "-Menu-\n" +
                "1. Print\n" +
                "2. Size\n" +
                "3. Add\n" +
                "4. Insert\n" +
                "5. Set\n" +
                "6. Remove\n" +
                "7. Clear\n" +
                "8. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "Enter a value to add:\n" +
                "\n" +
                "-Menu-\n" +
                "1. Print\n" +
                "2. Size\n" +
                "3. Add\n" +
                "4. Insert\n" +
                "5. Set\n" +
                "6. Remove\n" +
                "7. Clear\n" +
                "8. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "[3, 4, 5]\n" +
                "\n" +
                "-Menu-\n" +
                "1. Print\n" +
                "2. Size\n" +
                "3. Add\n" +
                "4. Insert\n" +
                "5. Set\n" +
                "6. Remove\n" +
                "7. Clear\n" +
                "8. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "The list has 3 elements.\n" +
                "\n" +
                "-Menu-\n" +
                "1. Print\n" +
                "2. Size\n" +
                "3. Add\n" +
                "4. Insert\n" +
                "5. Set\n" +
                "6. Remove\n" +
                "7. Clear\n" +
                "8. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "Enter a value to add:\n" +
                "Enter an index:\n" +
                "\n" +
                "-Menu-\n" +
                "1. Print\n" +
                "2. Size\n" +
                "3. Add\n" +
                "4. Insert\n" +
                "5. Set\n" +
                "6. Remove\n" +
                "7. Clear\n" +
                "8. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "[3, 4, 28, 5]\n" +
                "\n" +
                "-Menu-\n" +
                "1. Print\n" +
                "2. Size\n" +
                "3. Add\n" +
                "4. Insert\n" +
                "5. Set\n" +
                "6. Remove\n" +
                "7. Clear\n" +
                "8. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "The list has 4 elements.\n" +
                "\n" +
                "-Menu-\n" +
                "1. Print\n" +
                "2. Size\n" +
                "3. Add\n" +
                "4. Insert\n" +
                "5. Set\n" +
                "6. Remove\n" +
                "7. Clear\n" +
                "8. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "Enter the new value:\n" +
                "Enter an index:\n" +
                "5 was replaced.\n" +
                "\n" +
                "-Menu-\n" +
                "1. Print\n" +
                "2. Size\n" +
                "3. Add\n" +
                "4. Insert\n" +
                "5. Set\n" +
                "6. Remove\n" +
                "7. Clear\n" +
                "8. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "[3, 4, 28, 78]\n" +
                "\n" +
                "-Menu-\n" +
                "1. Print\n" +
                "2. Size\n" +
                "3. Add\n" +
                "4. Insert\n" +
                "5. Set\n" +
                "6. Remove\n" +
                "7. Clear\n" +
                "8. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "The list has 4 elements.\n" +
                "\n" +
                "-Menu-\n" +
                "1. Print\n" +
                "2. Size\n" +
                "3. Add\n" +
                "4. Insert\n" +
                "5. Set\n" +
                "6. Remove\n" +
                "7. Clear\n" +
                "8. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "Enter an index:\n" +
                "3 was removed.\n" +
                "\n" +
                "-Menu-\n" +
                "1. Print\n" +
                "2. Size\n" +
                "3. Add\n" +
                "4. Insert\n" +
                "5. Set\n" +
                "6. Remove\n" +
                "7. Clear\n" +
                "8. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "[4, 28, 78]\n" +
                "\n" +
                "-Menu-\n" +
                "1. Print\n" +
                "2. Size\n" +
                "3. Add\n" +
                "4. Insert\n" +
                "5. Set\n" +
                "6. Remove\n" +
                "7. Clear\n" +
                "8. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "The list has 3 elements.\n" +
                "\n" +
                "-Menu-\n" +
                "1. Print\n" +
                "2. Size\n" +
                "3. Add\n" +
                "4. Insert\n" +
                "5. Set\n" +
                "6. Remove\n" +
                "7. Clear\n" +
                "8. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "The list has been cleared.\n" +
                "\n" +
                "-Menu-\n" +
                "1. Print\n" +
                "2. Size\n" +
                "3. Add\n" +
                "4. Insert\n" +
                "5. Set\n" +
                "6. Remove\n" +
                "7. Clear\n" +
                "8. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "[]\n" +
                "\n" +
                "-Menu-\n" +
                "1. Print\n" +
                "2. Size\n" +
                "3. Add\n" +
                "4. Insert\n" +
                "5. Set\n" +
                "6. Remove\n" +
                "7. Clear\n" +
                "8. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "The list has 0 elements.\n" +
                "\n" +
                "-Menu-\n" +
                "1. Print\n" +
                "2. Size\n" +
                "3. Add\n" +
                "4. Insert\n" +
                "5. Set\n" +
                "6. Remove\n" +
                "7. Clear\n" +
                "8. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "Goodbye.";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("A8_ExpanderMain"));
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
        String input =  "4\n" +
                "0\n" +
                "0\n" +
                "4\n" +
                "5\n" +
                "1\n" +
                "4\n" +
                "88\n" +
                "2\n" +
                "4\n" +
                "777\n" +
                "1\n" +
                "1\n" +
                "2\n" +
                "6\n" +
                "0\n" +
                "3\n" +
                "99\n" +
                "1\n" +
                "2\n" +
                "5\n" +
                "4\n" +
                "3\n" +
                "1\n" +
                "2\n" +
                "8";

        String expected =   "-Menu-\n" +
                "1. Print\n" +
                "2. Size\n" +
                "3. Add\n" +
                "4. Insert\n" +
                "5. Set\n" +
                "6. Remove\n" +
                "7. Clear\n" +
                "8. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "Enter a value to add:\n" +
                "Enter an index:\n" +
                "\n" +
                "-Menu-\n" +
                "1. Print\n" +
                "2. Size\n" +
                "3. Add\n" +
                "4. Insert\n" +
                "5. Set\n" +
                "6. Remove\n" +
                "7. Clear\n" +
                "8. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "Enter a value to add:\n" +
                "Enter an index:\n" +
                "\n" +
                "-Menu-\n" +
                "1. Print\n" +
                "2. Size\n" +
                "3. Add\n" +
                "4. Insert\n" +
                "5. Set\n" +
                "6. Remove\n" +
                "7. Clear\n" +
                "8. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "Enter a value to add:\n" +
                "Enter an index:\n" +
                "\n" +
                "-Menu-\n" +
                "1. Print\n" +
                "2. Size\n" +
                "3. Add\n" +
                "4. Insert\n" +
                "5. Set\n" +
                "6. Remove\n" +
                "7. Clear\n" +
                "8. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "Enter a value to add:\n" +
                "Enter an index:\n" +
                "\n" +
                "-Menu-\n" +
                "1. Print\n" +
                "2. Size\n" +
                "3. Add\n" +
                "4. Insert\n" +
                "5. Set\n" +
                "6. Remove\n" +
                "7. Clear\n" +
                "8. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "[0, 777, 5, 88]\n" +
                "\n" +
                "-Menu-\n" +
                "1. Print\n" +
                "2. Size\n" +
                "3. Add\n" +
                "4. Insert\n" +
                "5. Set\n" +
                "6. Remove\n" +
                "7. Clear\n" +
                "8. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "The list has 4 elements.\n" +
                "\n" +
                "-Menu-\n" +
                "1. Print\n" +
                "2. Size\n" +
                "3. Add\n" +
                "4. Insert\n" +
                "5. Set\n" +
                "6. Remove\n" +
                "7. Clear\n" +
                "8. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "Enter an index:\n" +
                "0 was removed.\n" +
                "\n" +
                "-Menu-\n" +
                "1. Print\n" +
                "2. Size\n" +
                "3. Add\n" +
                "4. Insert\n" +
                "5. Set\n" +
                "6. Remove\n" +
                "7. Clear\n" +
                "8. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "Enter a value to add:\n" +
                "\n" +
                "-Menu-\n" +
                "1. Print\n" +
                "2. Size\n" +
                "3. Add\n" +
                "4. Insert\n" +
                "5. Set\n" +
                "6. Remove\n" +
                "7. Clear\n" +
                "8. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "[777, 5, 88, 99]\n" +
                "\n" +
                "-Menu-\n" +
                "1. Print\n" +
                "2. Size\n" +
                "3. Add\n" +
                "4. Insert\n" +
                "5. Set\n" +
                "6. Remove\n" +
                "7. Clear\n" +
                "8. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "The list has 4 elements.\n" +
                "\n" +
                "-Menu-\n" +
                "1. Print\n" +
                "2. Size\n" +
                "3. Add\n" +
                "4. Insert\n" +
                "5. Set\n" +
                "6. Remove\n" +
                "7. Clear\n" +
                "8. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "Enter the new value:\n" +
                "Enter an index:\n" +
                "99 was replaced.\n" +
                "\n" +
                "-Menu-\n" +
                "1. Print\n" +
                "2. Size\n" +
                "3. Add\n" +
                "4. Insert\n" +
                "5. Set\n" +
                "6. Remove\n" +
                "7. Clear\n" +
                "8. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "[777, 5, 88, 4]\n" +
                "\n" +
                "-Menu-\n" +
                "1. Print\n" +
                "2. Size\n" +
                "3. Add\n" +
                "4. Insert\n" +
                "5. Set\n" +
                "6. Remove\n" +
                "7. Clear\n" +
                "8. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "The list has 4 elements.\n" +
                "\n" +
                "-Menu-\n" +
                "1. Print\n" +
                "2. Size\n" +
                "3. Add\n" +
                "4. Insert\n" +
                "5. Set\n" +
                "6. Remove\n" +
                "7. Clear\n" +
                "8. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "Goodbye.";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("A8_ExpanderMain"));
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
        String input =  "3\n" +
                "3\n" +
                "4\n" +
                "8\n" +
                "0\n" +
                "5\n" +
                "95\n" +
                "1\n" +
                "1\n" +
                "2\n" +
                "6\n" +
                "1\n" +
                "1\n" +
                "2\n" +
                "8";

        String expected =   "-Menu-\n" +
                "1. Print\n" +
                "2. Size\n" +
                "3. Add\n" +
                "4. Insert\n" +
                "5. Set\n" +
                "6. Remove\n" +
                "7. Clear\n" +
                "8. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "Enter a value to add:\n" +
                "\n" +
                "-Menu-\n" +
                "1. Print\n" +
                "2. Size\n" +
                "3. Add\n" +
                "4. Insert\n" +
                "5. Set\n" +
                "6. Remove\n" +
                "7. Clear\n" +
                "8. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "Enter a value to add:\n" +
                "Enter an index:\n" +
                "\n" +
                "-Menu-\n" +
                "1. Print\n" +
                "2. Size\n" +
                "3. Add\n" +
                "4. Insert\n" +
                "5. Set\n" +
                "6. Remove\n" +
                "7. Clear\n" +
                "8. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "Enter the new value:\n" +
                "Enter an index:\n" +
                "3 was replaced.\n" +
                "\n" +
                "-Menu-\n" +
                "1. Print\n" +
                "2. Size\n" +
                "3. Add\n" +
                "4. Insert\n" +
                "5. Set\n" +
                "6. Remove\n" +
                "7. Clear\n" +
                "8. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "[8, 95]\n" +
                "\n" +
                "-Menu-\n" +
                "1. Print\n" +
                "2. Size\n" +
                "3. Add\n" +
                "4. Insert\n" +
                "5. Set\n" +
                "6. Remove\n" +
                "7. Clear\n" +
                "8. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "The list has 2 elements.\n" +
                "\n" +
                "-Menu-\n" +
                "1. Print\n" +
                "2. Size\n" +
                "3. Add\n" +
                "4. Insert\n" +
                "5. Set\n" +
                "6. Remove\n" +
                "7. Clear\n" +
                "8. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "Enter an index:\n" +
                "95 was removed.\n" +
                "\n" +
                "-Menu-\n" +
                "1. Print\n" +
                "2. Size\n" +
                "3. Add\n" +
                "4. Insert\n" +
                "5. Set\n" +
                "6. Remove\n" +
                "7. Clear\n" +
                "8. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "[8]\n" +
                "\n" +
                "-Menu-\n" +
                "1. Print\n" +
                "2. Size\n" +
                "3. Add\n" +
                "4. Insert\n" +
                "5. Set\n" +
                "6. Remove\n" +
                "7. Clear\n" +
                "8. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "The list has 1 elements.\n" +
                "\n" +
                "-Menu-\n" +
                "1. Print\n" +
                "2. Size\n" +
                "3. Add\n" +
                "4. Insert\n" +
                "5. Set\n" +
                "6. Remove\n" +
                "7. Clear\n" +
                "8. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "Goodbye.";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("A8_ExpanderMain"));
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
