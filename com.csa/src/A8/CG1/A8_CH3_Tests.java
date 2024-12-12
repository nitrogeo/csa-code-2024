package A8.CG1;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class A8_CH3_Tests
{
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
            Class<?> classRef = Class.forName(generateClassName("A8_CH3"));
            Method contains = classRef.getMethod("contains", int[].class,int.class);
            Object check = classRef.getConstructor().newInstance();

            for(int a=0; a<10; a++)
            {
                int[] teacherList = new int[10];
                int[] studentList = new int[10];
                boolean[] contained = new boolean[20];

                teacherList[0] = studentList[0]= (int)(Math.random()*2)+1;
                contained[teacherList[0]]=true;
                for(int x=1; x<teacherList.length; x++) {
                    teacherList[x] = studentList[x] = teacherList[x - 1] + (int) (Math.random() * 2) + 1;
                    contained[teacherList[x]]=true;
                }

                for(int x=0; x<teacherList.length; x++)
                {
                    if(contained[teacherList[x]])
                        Assert.assertTrue("contains("+ Arrays.toString(teacherList)+", "+teacherList[x]+") failed to produce the correct result.",(boolean)contains.invoke(check,studentList,teacherList[x]));
                    else
                        Assert.assertFalse("contains("+ Arrays.toString(teacherList)+", "+teacherList[x]+") failed to produce the correct result.",(boolean)contains.invoke(check,studentList,teacherList[x]));

                    Assert.assertEquals("contains("+ Arrays.toString(teacherList)+", "+teacherList[x]+") failed because it altered the input array.",Arrays.toString(teacherList),Arrays.toString(studentList));
                }
            }
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }
}
