package A8.CG2;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class A8_CH5_Tests
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
            Class<?> classRef = Class.forName(generateClassName("A8_CH5"));
            Method evensTotal = classRef.getMethod("evensTotal", double[].class);
            Object obj = classRef.getConstructor().newInstance();

            for(int a=0; a<10; a++)
            {
                double[] teacherList1 = new double[(int)(Math.random()*10)+1];
                double[] studentList1 = new double[teacherList1.length];

                double total=0;
                boolean b=true;
                for(int x=0; x<teacherList1.length; x++) {
                    teacherList1[x] = studentList1[x] = ((int) (Math.random() * 1000)) / 100.0;
                    b=!b;
                    total+=(b)?0:teacherList1[x];

                }

                Assert.assertEquals("evansTotal("+ Arrays.toString(teacherList1)+") failed.",total,evensTotal.invoke(obj, (Object) studentList1));
                Assert.assertEquals("evansTotal("+ Arrays.toString(teacherList1)+") failed because it altered an input array.",Arrays.toString(teacherList1),Arrays.toString(studentList1));
            }
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }
}
