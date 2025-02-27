package A11.L1;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;

public class A11_ClassGrades_Output_Tests
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
                "Test 1\n" +
                "85\n" +
                "2\n" +
                "1\n" +
                "Test 2\n" +
                "55\n" +
                "2\n" +
                "4\n" +
                "5";

        String expected =   "-Class Menu-\n" +
                "1. Add Assignment\n" +
                "2. Remove Assignment\n" +
                "3. Modify Assignment\n" +
                "4. View Class Information\n" +
                "5. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "Enter the name of the assignment:\n" +
                "Enter the grade:\n" +
                "Enter the new category (0-other, 1-Minor, 2-Major):\n" +
                "\n" +
                "-Class Menu-\n" +
                "1. Add Assignment\n" +
                "2. Remove Assignment\n" +
                "3. Modify Assignment\n" +
                "4. View Class Information\n" +
                "5. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "Enter the name of the assignment:\n" +
                "Enter the grade:\n" +
                "Enter the new category (0-other, 1-Minor, 2-Major):\n" +
                "\n" +
                "-Class Menu-\n" +
                "1. Add Assignment\n" +
                "2. Remove Assignment\n" +
                "3. Modify Assignment\n" +
                "4. View Class Information\n" +
                "5. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "Other Assignments: (Average)      100.00\n" +
                "Assignment Name                    Grade\n" +
                "\n" +
                "Minor Assignments: (Average)      100.00\n" +
                "Assignment Name                    Grade\n" +
                "\n" +
                "Major Assignments: (Average)       70.00\n" +
                "Assignment Name                    Grade\n" +
                "Test 1                             85.00\n" +
                "Test 2                             55.00\n" +
                "\n" +
                "Other Weight/points:       0.10 -  10.00\n" +
                "Minor Weight/points:       0.20 -  20.00\n" +
                "Major Weight/points:       0.70 -  49.00\n" +
                "Grade:                             79.00\n" +
                "\n" +
                "-Class Menu-\n" +
                "1. Add Assignment\n" +
                "2. Remove Assignment\n" +
                "3. Modify Assignment\n" +
                "4. View Class Information\n" +
                "5. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "Good bye.";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("A11_ClassGradesMain"));
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
        String input =  "1\n" +
                "Test\n" +
                "55\n" +
                "2\n" +
                "1\n" +
                "Minor\n" +
                "34\n" +
                "1\n" +
                "1\n" +
                "Other\n" +
                "99\n" +
                "0\n" +
                "4\n" +
                "5";

        String expected =   "-Class Menu-\n" +
                "1. Add Assignment\n" +
                "2. Remove Assignment\n" +
                "3. Modify Assignment\n" +
                "4. View Class Information\n" +
                "5. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "Enter the name of the assignment:\n" +
                "Enter the grade:\n" +
                "Enter the new category (0-other, 1-Minor, 2-Major):\n" +
                "\n" +
                "-Class Menu-\n" +
                "1. Add Assignment\n" +
                "2. Remove Assignment\n" +
                "3. Modify Assignment\n" +
                "4. View Class Information\n" +
                "5. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "Enter the name of the assignment:\n" +
                "Enter the grade:\n" +
                "Enter the new category (0-other, 1-Minor, 2-Major):\n" +
                "\n" +
                "-Class Menu-\n" +
                "1. Add Assignment\n" +
                "2. Remove Assignment\n" +
                "3. Modify Assignment\n" +
                "4. View Class Information\n" +
                "5. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "Enter the name of the assignment:\n" +
                "Enter the grade:\n" +
                "Enter the new category (0-other, 1-Minor, 2-Major):\n" +
                "\n" +
                "-Class Menu-\n" +
                "1. Add Assignment\n" +
                "2. Remove Assignment\n" +
                "3. Modify Assignment\n" +
                "4. View Class Information\n" +
                "5. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "Other Assignments: (Average)       99.00\n" +
                "Assignment Name                    Grade\n" +
                "Other                              99.00\n" +
                "\n" +
                "Minor Assignments: (Average)       34.00\n" +
                "Assignment Name                    Grade\n" +
                "Minor                              34.00\n" +
                "\n" +
                "Major Assignments: (Average)       55.00\n" +
                "Assignment Name                    Grade\n" +
                "Test                               55.00\n" +
                "\n" +
                "Other Weight/points:       0.10 -   9.90\n" +
                "Minor Weight/points:       0.20 -   6.80\n" +
                "Major Weight/points:       0.70 -  38.50\n" +
                "Grade:                             55.20\n" +
                "\n" +
                "-Class Menu-\n" +
                "1. Add Assignment\n" +
                "2. Remove Assignment\n" +
                "3. Modify Assignment\n" +
                "4. View Class Information\n" +
                "5. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "Good bye.";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("A11_ClassGradesMain"));
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
                "Test 1\n" +
                "100\n" +
                "2\n" +
                "1\n" +
                "Minor 1\n" +
                "88\n" +
                "1\n" +
                "1\n" +
                "Other 1\n" +
                "55\n" +
                "0\n" +
                "4\n" +
                "2\n" +
                "1\n" +
                "2\n" +
                "0\n" +
                "4\n" +
                "5";

        String expected =   "-Class Menu-\n" +
                "1. Add Assignment\n" +
                "2. Remove Assignment\n" +
                "3. Modify Assignment\n" +
                "4. View Class Information\n" +
                "5. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "Enter the name of the assignment:\n" +
                "Enter the grade:\n" +
                "Enter the new category (0-other, 1-Minor, 2-Major):\n" +
                "\n" +
                "-Class Menu-\n" +
                "1. Add Assignment\n" +
                "2. Remove Assignment\n" +
                "3. Modify Assignment\n" +
                "4. View Class Information\n" +
                "5. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "Enter the name of the assignment:\n" +
                "Enter the grade:\n" +
                "Enter the new category (0-other, 1-Minor, 2-Major):\n" +
                "\n" +
                "-Class Menu-\n" +
                "1. Add Assignment\n" +
                "2. Remove Assignment\n" +
                "3. Modify Assignment\n" +
                "4. View Class Information\n" +
                "5. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "Enter the name of the assignment:\n" +
                "Enter the grade:\n" +
                "Enter the new category (0-other, 1-Minor, 2-Major):\n" +
                "\n" +
                "-Class Menu-\n" +
                "1. Add Assignment\n" +
                "2. Remove Assignment\n" +
                "3. Modify Assignment\n" +
                "4. View Class Information\n" +
                "5. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "Other Assignments: (Average)       55.00\n" +
                "Assignment Name                    Grade\n" +
                "Other 1                            55.00\n" +
                "\n" +
                "Minor Assignments: (Average)       88.00\n" +
                "Assignment Name                    Grade\n" +
                "Minor 1                            88.00\n" +
                "\n" +
                "Major Assignments: (Average)      100.00\n" +
                "Assignment Name                    Grade\n" +
                "Test 1                            100.00\n" +
                "\n" +
                "Other Weight/points:       0.10 -   5.50\n" +
                "Minor Weight/points:       0.20 -  17.60\n" +
                "Major Weight/points:       0.70 -  70.00\n" +
                "Grade:                             93.10\n" +
                "\n" +
                "-Class Menu-\n" +
                "1. Add Assignment\n" +
                "2. Remove Assignment\n" +
                "3. Modify Assignment\n" +
                "4. View Class Information\n" +
                "5. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "-Remove Menu-\n" +
                "1. Test 1 (Major - 100.00)\n" +
                "2. Minor 1 (Minor - 88.00)\n" +
                "3. Other 1 (Other - 55.00)\n" +
                "0. Cancel\n" +
                "Enter selection:\n" +
                "\n" +
                "-Class Menu-\n" +
                "1. Add Assignment\n" +
                "2. Remove Assignment\n" +
                "3. Modify Assignment\n" +
                "4. View Class Information\n" +
                "5. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "-Remove Menu-\n" +
                "1. Minor 1 (Minor - 88.00)\n" +
                "2. Other 1 (Other - 55.00)\n" +
                "0. Cancel\n" +
                "Enter selection:\n" +
                "\n" +
                "-Class Menu-\n" +
                "1. Add Assignment\n" +
                "2. Remove Assignment\n" +
                "3. Modify Assignment\n" +
                "4. View Class Information\n" +
                "5. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "Other Assignments: (Average)       55.00\n" +
                "Assignment Name                    Grade\n" +
                "Other 1                            55.00\n" +
                "\n" +
                "Minor Assignments: (Average)       88.00\n" +
                "Assignment Name                    Grade\n" +
                "Minor 1                            88.00\n" +
                "\n" +
                "Major Assignments: (Average)      100.00\n" +
                "Assignment Name                    Grade\n" +
                "\n" +
                "Other Weight/points:       0.10 -   5.50\n" +
                "Minor Weight/points:       0.20 -  17.60\n" +
                "Major Weight/points:       0.70 -  70.00\n" +
                "Grade:                             93.10\n" +
                "\n" +
                "-Class Menu-\n" +
                "1. Add Assignment\n" +
                "2. Remove Assignment\n" +
                "3. Modify Assignment\n" +
                "4. View Class Information\n" +
                "5. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "Good bye.";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("A11_ClassGradesMain"));
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
                "Test 1\n" +
                "88\n" +
                "2\n" +
                "1\n" +
                "Minor 1\n" +
                "45\n" +
                "1\n" +
                "1\n" +
                "Minor 2\n" +
                "77\n" +
                "1\n" +
                "1\n" +
                "Other 1\n" +
                "17\n" +
                "0\n" +
                "1\n" +
                "Other 2\n" +
                "100\n" +
                "0\n" +
                "4\n" +
                "3\n" +
                "0\n" +
                "3\n" +
                "2\n" +
                "1\n" +
                "Test 2\n" +
                "3\n" +
                "2\n" +
                "3\n" +
                "2\n" +
                "3\n" +
                "4\n" +
                "2\n" +
                "84\n" +
                "4\n" +
                "5";

        String expected =   "-Class Menu-\n" +
                "1. Add Assignment\n" +
                "2. Remove Assignment\n" +
                "3. Modify Assignment\n" +
                "4. View Class Information\n" +
                "5. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "Enter the name of the assignment:\n" +
                "Enter the grade:\n" +
                "Enter the new category (0-other, 1-Minor, 2-Major):\n" +
                "\n" +
                "-Class Menu-\n" +
                "1. Add Assignment\n" +
                "2. Remove Assignment\n" +
                "3. Modify Assignment\n" +
                "4. View Class Information\n" +
                "5. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "Enter the name of the assignment:\n" +
                "Enter the grade:\n" +
                "Enter the new category (0-other, 1-Minor, 2-Major):\n" +
                "\n" +
                "-Class Menu-\n" +
                "1. Add Assignment\n" +
                "2. Remove Assignment\n" +
                "3. Modify Assignment\n" +
                "4. View Class Information\n" +
                "5. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "Enter the name of the assignment:\n" +
                "Enter the grade:\n" +
                "Enter the new category (0-other, 1-Minor, 2-Major):\n" +
                "\n" +
                "-Class Menu-\n" +
                "1. Add Assignment\n" +
                "2. Remove Assignment\n" +
                "3. Modify Assignment\n" +
                "4. View Class Information\n" +
                "5. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "Enter the name of the assignment:\n" +
                "Enter the grade:\n" +
                "Enter the new category (0-other, 1-Minor, 2-Major):\n" +
                "\n" +
                "-Class Menu-\n" +
                "1. Add Assignment\n" +
                "2. Remove Assignment\n" +
                "3. Modify Assignment\n" +
                "4. View Class Information\n" +
                "5. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "Enter the name of the assignment:\n" +
                "Enter the grade:\n" +
                "Enter the new category (0-other, 1-Minor, 2-Major):\n" +
                "\n" +
                "-Class Menu-\n" +
                "1. Add Assignment\n" +
                "2. Remove Assignment\n" +
                "3. Modify Assignment\n" +
                "4. View Class Information\n" +
                "5. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "Other Assignments: (Average)       58.50\n" +
                "Assignment Name                    Grade\n" +
                "Other 1                            17.00\n" +
                "Other 2                           100.00\n" +
                "\n" +
                "Minor Assignments: (Average)       61.00\n" +
                "Assignment Name                    Grade\n" +
                "Minor 1                            45.00\n" +
                "Minor 2                            77.00\n" +
                "\n" +
                "Major Assignments: (Average)       88.00\n" +
                "Assignment Name                    Grade\n" +
                "Test 1                             88.00\n" +
                "\n" +
                "Other Weight/points:       0.10 -   5.85\n" +
                "Minor Weight/points:       0.20 -  12.20\n" +
                "Major Weight/points:       0.70 -  61.60\n" +
                "Grade:                             79.65\n" +
                "\n" +
                "-Class Menu-\n" +
                "1. Add Assignment\n" +
                "2. Remove Assignment\n" +
                "3. Modify Assignment\n" +
                "4. View Class Information\n" +
                "5. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "-Modify Menu-\n" +
                "1.  Test 1 (Major - 88.00)\n" +
                "2.  Minor 1 (Minor - 45.00)\n" +
                "3.  Minor 2 (Minor - 77.00)\n" +
                "4.  Other 1 (Other - 17.00)\n" +
                "5.  Other 2 (Other - 100.00)\n" +
                "0. Cancel\n" +
                "Enter selection:\n" +
                "\n" +
                "-Class Menu-\n" +
                "1. Add Assignment\n" +
                "2. Remove Assignment\n" +
                "3. Modify Assignment\n" +
                "4. View Class Information\n" +
                "5. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "-Modify Menu-\n" +
                "1.  Test 1 (Major - 88.00)\n" +
                "2.  Minor 1 (Minor - 45.00)\n" +
                "3.  Minor 2 (Minor - 77.00)\n" +
                "4.  Other 1 (Other - 17.00)\n" +
                "5.  Other 2 (Other - 100.00)\n" +
                "0. Cancel\n" +
                "Enter selection:\n" +
                "\n" +
                "-Change Menu-\n" +
                "1. Assignment Name\n" +
                "2. Grade\n" +
                "3. Category\n" +
                "0. Cancel\n" +
                "Enter selection:\n" +
                "\n" +
                "Enter the new assignment name:\n" +
                "\n" +
                "-Class Menu-\n" +
                "1. Add Assignment\n" +
                "2. Remove Assignment\n" +
                "3. Modify Assignment\n" +
                "4. View Class Information\n" +
                "5. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "-Modify Menu-\n" +
                "1.  Test 1 (Major - 88.00)\n" +
                "2.  Test 2 (Minor - 45.00)\n" +
                "3.  Minor 2 (Minor - 77.00)\n" +
                "4.  Other 1 (Other - 17.00)\n" +
                "5.  Other 2 (Other - 100.00)\n" +
                "0. Cancel\n" +
                "Enter selection:\n" +
                "\n" +
                "-Change Menu-\n" +
                "1. Assignment Name\n" +
                "2. Grade\n" +
                "3. Category\n" +
                "0. Cancel\n" +
                "Enter selection:\n" +
                "\n" +
                "Enter the new category (0-other, 1-Minor, 2-Major):\n" +
                "\n" +
                "-Class Menu-\n" +
                "1. Add Assignment\n" +
                "2. Remove Assignment\n" +
                "3. Modify Assignment\n" +
                "4. View Class Information\n" +
                "5. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "-Modify Menu-\n" +
                "1.  Test 1 (Major - 88.00)\n" +
                "2.  Test 2 (Major - 45.00)\n" +
                "3.  Minor 2 (Minor - 77.00)\n" +
                "4.  Other 1 (Other - 17.00)\n" +
                "5.  Other 2 (Other - 100.00)\n" +
                "0. Cancel\n" +
                "Enter selection:\n" +
                "\n" +
                "-Change Menu-\n" +
                "1. Assignment Name\n" +
                "2. Grade\n" +
                "3. Category\n" +
                "0. Cancel\n" +
                "Enter selection:\n" +
                "\n" +
                "Enter the grade:\n" +
                "\n" +
                "-Class Menu-\n" +
                "1. Add Assignment\n" +
                "2. Remove Assignment\n" +
                "3. Modify Assignment\n" +
                "4. View Class Information\n" +
                "5. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "Other Assignments: (Average)       92.00\n" +
                "Assignment Name                    Grade\n" +
                "Other 1                            84.00\n" +
                "Other 2                           100.00\n" +
                "\n" +
                "Minor Assignments: (Average)       77.00\n" +
                "Assignment Name                    Grade\n" +
                "Minor 2                            77.00\n" +
                "\n" +
                "Major Assignments: (Average)       66.50\n" +
                "Assignment Name                    Grade\n" +
                "Test 1                             88.00\n" +
                "Test 2                             45.00\n" +
                "\n" +
                "Other Weight/points:       0.10 -   9.20\n" +
                "Minor Weight/points:       0.20 -  15.40\n" +
                "Major Weight/points:       0.70 -  46.55\n" +
                "Grade:                             71.15\n" +
                "\n" +
                "-Class Menu-\n" +
                "1. Add Assignment\n" +
                "2. Remove Assignment\n" +
                "3. Modify Assignment\n" +
                "4. View Class Information\n" +
                "5. Exit\n" +
                "Enter selection:\n" +
                "\n" +
                "Good bye.";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        Class<?> classRef = Class.forName(generateClassName("A11_ClassGradesMain"));
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
