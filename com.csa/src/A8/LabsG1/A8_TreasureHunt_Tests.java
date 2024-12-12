package A8.LabsG1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class A8_TreasureHunt_Tests
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
    public void test1() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("A8_TreasureHunt"));
            Method findTreasure = classRef.getMethod("findTreasure", char[].class);
            Object obj = classRef.getConstructor().newInstance();

            for(int a=0; a<100; a++)
            {
                char[] teacherList = new char[(int)(Math.random()*15)+1];
                char[] studentList = new char[teacherList.length];


                for(int x=0; x<teacherList.length; x++)
                    teacherList[x] = studentList[x] = 'N';

                int t = (int)(Math.random()*teacherList.length);
                teacherList[t] = studentList[t] = 'T';

                Assert.assertEquals("findTreasure("+ Arrays.toString(teacherList)+") failed.",t,findTreasure.invoke(classRef,studentList));
                Assert.assertEquals("findTreasure("+ Arrays.toString(teacherList)+") failed because it altered an input array.",Arrays.toString(teacherList),Arrays.toString(studentList));

            }
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void testIO1() throws Exception{
        String input =  "TNNNNN";

        String expected =   "Enter the treasure map ('N' - No treasure and 'T' - Treasure):\n" +
                "\n" +
                "The treasure can be found in location 0.";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("A8_TreasureHunt"));
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
        String input =  "NNNNNNNNNT";

        String expected =   "Enter the treasure map ('N' - No treasure and 'T' - Treasure):\n" +
                "\n" +
                "The treasure can be found in location 9.";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("A8_TreasureHunt"));
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
