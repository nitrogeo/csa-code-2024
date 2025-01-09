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

public class A8_GradeAverageV2_Tests {

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
            Class<?> classRef = Class.forName(generateClassName("A8_GradeAverageV2"));
            Method average = classRef.getMethod("average", double[].class);
            Object obj = classRef.getConstructor().newInstance();

            for(int a=0; a<100; a++)
            {
                double[] teacherList = new double[4];
                double[] studentList = new double[4];

                double total =0;
                for(int x=0; x<teacherList.length; x++)
                    total+= teacherList[x] = studentList[x] = ((int)(Math.random()*100))+1;
                total/=4;

                Assert.assertEquals("average("+ Arrays.toString(teacherList)+") failed.",total,average.invoke(classRef,studentList));
                Assert.assertEquals("average("+ Arrays.toString(teacherList)+") failed because it altered an input array.",Arrays.toString(teacherList),Arrays.toString(studentList));
            }
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test2() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("A8_GradeAverageV2"));
            Method gradeLetter = classRef.getMethod("gradeLetter", double[].class);
            Object obj = classRef.getConstructor().newInstance();

            char[] check = {'F','F','F','F','F','F','F','F','F','F',
                    'F','F','F','F','F','F','F','F','F','F',
                    'F','F','F','F','F','F','F','F','F','F',
                    'F','F','F','F','F','F','F','F','F','F',
                    'F','F','F','F','F','F','F','F','F','F',
                    'F','F','F','F','F','F','F','F','F','F',
                    'F','F','F','F','F','F','F','F','F','F',
                    'D','D','D','D','D','C','C','C','C','C',
                    'B','B','B','B','B','B','B','B','B','B',
                    'A','A','A','A','A','A','A','A','A','A'};
            for(int a=0; a<100; a++)
            {
                double[] teacherList = new double[4];
                double[] studentList = new double[4];

                double total =0;
                for(int x=0; x<teacherList.length; x++)
                    total+= teacherList[x] = studentList[x] = ((int)(Math.random()*100))+1;
                total/=4;

                Assert.assertEquals("gradeLetter("+ Arrays.toString(teacherList)+") failed.",check[((int)total)],gradeLetter.invoke(classRef,studentList));
                Assert.assertEquals("average("+ Arrays.toString(teacherList)+") failed because it altered an input array.",Arrays.toString(teacherList),Arrays.toString(studentList));
            }
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }


    @Test(timeout = 250)
    public void testIO1() throws Exception{
        String input =  "8\n" +
                "50\n" +
                "90\n" +
                "90\n" +
                "90\n" +
                "80\n" +
                "75\n" +
                "88\n" +
                "99\n";

        String expected =   "How many grades does the student have?\n" +

                "Enter grade 1:\n" +

                "Enter grade 2:\n" +

                "Enter grade 3:\n" +

                "Enter grade 4:\n" +

                "Enter grade 5:\n" +

                "Enter grade 6:\n" +

                "Enter grade 7:\n" +

                "Enter grade 8:\n" +

                "\n" +
                "The student's average is 82.75.\n" +
                "The student's grade letter is a(n) B.";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("A8_GradeAverageV2"));
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
        String input =  "8\n" +
                "50\n" +
                "90\n" +
                "90\n" +
                "90\n" +
                "80\n" +
                "75\n" +
                "88\n" +
                "99\n";

        String expected =   "How many grades does the student have?\n" +

                "Enter grade 1:\n" +

                "Enter grade 2:\n" +

                "Enter grade 3:\n" +

                "Enter grade 4:\n" +

                "Enter grade 5:\n" +

                "Enter grade 6:\n" +

                "Enter grade 7:\n" +

                "Enter grade 8:\n" +

                "\n" +
                "The student's average is 82.75.\n" +
                "The student's grade letter is a(n) B.";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.in.close();
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("A8_GradeAverageV2"));
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

    /*@Test(timeout = 250)
    public void testIO2() throws Exception{
        String input =  "2\n" +
                "85\n" +
                "96\n";

        String expected =   "How many grades does the student have?\n" +
                "Enter grade 1:\n" +
                "Enter grade 2:\n" +
                "\n" +
                "The student's average is 90.50.\n" +
                "The student's grade letter is a(n) A.";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("A8_GradeAverageV2"));
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

        A8.LabsG1.A9.CG1.A9.CG1.TestingOutputStream o = (A8.LabsG1.A9.CG1.A9.CG1.TestingOutputStream)System.out;
        Assert.assertEquals(unifyLineSeperators(expected), unifyLineSeperators(o.toString()));
    }*/

}
