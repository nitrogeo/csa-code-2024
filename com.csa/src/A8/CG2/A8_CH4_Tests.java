package A8.CG2;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class A8_CH4_Tests
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
            Class<?> classRef = Class.forName(generateClassName("A8_CH4"));
            Method join = classRef.getMethod("join", double[].class,double[].class);
            Object obj = classRef.getConstructor().newInstance();

            for(int a=0; a<10; a++)
            {
                double[] teacherList1 = new double[(int)(Math.random()*10)+1];
                double[] teacherList2 = new double[(int)(Math.random()*10)+1];

                double[] studentList1 = new double[teacherList1.length];
                double[] studentList2 = new double[teacherList2.length];

                for(int x=0; x<teacherList1.length; x++)
                    teacherList1[x] = studentList1[x] = ((int)(Math.random()*1000))/100.0;
                for(int x=0; x<teacherList2.length; x++)
                    teacherList2[x] = studentList2[x] = ((int)(Math.random()*1000))/100.0;

                String s1 =Arrays.toString(teacherList1);
                String s2 = Arrays.toString(teacherList2);

                String expected = s1.substring(0,s1.length()-1)+", "+s2.substring(1);
                double[] result = (double[]) join.invoke(obj,studentList1,studentList2);

                Assert.assertEquals("join("+ Arrays.toString(teacherList1)+", "+Arrays.toString(teacherList2)+") failed.",expected,Arrays.toString(result));
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
