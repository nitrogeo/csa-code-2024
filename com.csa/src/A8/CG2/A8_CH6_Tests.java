package A8.CG2;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class A8_CH6_Tests
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
            Class<?> classRef = Class.forName(generateClassName("A8_CH6"));
            Method sumArrays = classRef.getMethod("sumArrays", int[].class,int[].class);
            Object obj = classRef.getConstructor().newInstance();

            for(int a=0; a<10; a++)
            {
                int[] teacherList1 = new int[(int)(Math.random()*10)+1];
                int[] teacherList2 = new int[teacherList1.length];

                int[] studentList1 = new int[teacherList1.length];
                int[] studentList2 = new int[teacherList2.length];

                int[] expected = new int[teacherList2.length];

                for(int x=0; x<teacherList1.length; x++) {
                    expected[x]+=teacherList1[x] = studentList1[x] = (int) (Math.random() * 10) * ((Math.random() > .5) ? 1 : -1);
                    expected[x]+=teacherList2[x] = studentList2[x] = (int) (Math.random() * 10) * ((Math.random() > .5) ? 1 : -1);
                }

                int[] result = (int[]) sumArrays.invoke(obj,studentList1,studentList2);

                Assert.assertEquals("join("+ Arrays.toString(teacherList1)+", "+Arrays.toString(teacherList2)+") failed.",Arrays.toString(expected),Arrays.toString(result));
                Assert.assertEquals("join("+ Arrays.toString(teacherList1)+", "+Arrays.toString(teacherList2)+") failed because it altered an input array.",Arrays.toString(teacherList1),Arrays.toString(studentList1));
                Assert.assertEquals("join("+ Arrays.toString(teacherList1)+", "+Arrays.toString(teacherList2)+") failed because it altered an input array.",Arrays.toString(teacherList2),Arrays.toString(studentList2));
            }
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }
}
