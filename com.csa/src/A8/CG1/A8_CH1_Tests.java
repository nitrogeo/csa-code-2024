package A8.CG1;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class A8_CH1_Tests {
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
            Class<?> classRef = Class.forName(generateClassName("A8_CH1"));
            Method isFinalEven = classRef.getMethod("isFinalEven", int[].class);
            Object check = classRef.getConstructor().newInstance();

            boolean willBeEven=true;
            for(int a=0; a<20; a++)
            {
                int size = (int)(Math.random()*15+1);
                int[] teacherList = new int[size];
                int[] studentList = new int[size];



                for(int x=0; x<teacherList.length; x++)
                    teacherList[x] = studentList[x] = (int) (Math.random() * 100) + 1;

                if(willBeEven) {
                    teacherList[size - 1] = studentList[size - 1] = (int) ((Math.random() * 50) + 1) * 2;
                    Assert.assertTrue("isFinalEvent("+ Arrays.toString(teacherList)+") failed.",(boolean)isFinalEven.invoke(check,studentList));
                }
                else {
                    teacherList[size - 1] = studentList[size - 1] = (int) ((Math.random() * 50) + 1) * 2 + 1;
                    Assert.assertFalse("isFinalEvent("+ Arrays.toString(teacherList)+") failed.",(boolean)isFinalEven.invoke(check,studentList));
                }
                for(int i=0; i<teacherList.length; i++)
                    Assert.assertEquals("isFinalEvent("+ Arrays.toString(teacherList)+") failed because it altered the input array.",teacherList[i],studentList[i]);

                Assert.assertEquals("isFinalEvent("+ Arrays.toString(teacherList)+") failed because it altered the input array.",Arrays.toString(teacherList),Arrays.toString(studentList));
            }
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }
}
