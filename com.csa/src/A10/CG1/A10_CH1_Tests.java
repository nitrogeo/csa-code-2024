package A10.CG1;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class A10_CH1_Tests
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
            Class<?> classRef = Class.forName(generateClassName("A10_CH1"));
            Method largest = classRef.getMethod("largest", double[][].class);
            Object check = classRef.getConstructor().newInstance();

            for(int a=0; a<25; a++) {
                int numRows = 1 + (int)(Math.random()*5);
                int numCols = 1 + (int)(Math.random()*5);
                double[][] listA = new double[numRows][numCols];
                double[][] listB = new double[numRows][numCols];
                Double max=null;
                for(int r=0; r<numRows; r++)
                    for(int c=0; c<numCols; c++)
                        if(max==null)
                            max = listA[r][c] = listB[r][c]= (Math.random()*50);
                        else
                            max = Math.max(max,listA[r][c] = listB[r][c]= (Math.random()*50));

                Assert.assertEquals("largest("+ Arrays.deepToString(listA)+") failed to produce the correct result.",max.doubleValue(),((Double)(largest.invoke(check,(Object)listB))).doubleValue(),.001);

                Assert.assertEquals("largest("+Arrays.deepToString(listA)+") failed because it altered the array",Arrays.deepToString(listA),Arrays.deepToString(listB));
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
            Class<?> classRef = Class.forName(generateClassName("A10_CH1"));
            Method largest = classRef.getMethod("largest", double[][].class);
            System.out.println(largest);
            Object check = classRef.getConstructor().newInstance();

            for(int a=0; a<25; a++) {
                int numRows = 1 + (int)(Math.random()*5);
                int numCols = 1 + (int)(Math.random()*5);
                double[][] listA = new double[numRows][numCols];
                double[][] listB = new double[numRows][numCols];
                Double max=null;
                for(int r=0; r<numRows; r++)
                    for(int c=0; c<numCols; c++)
                        if(max==null)
                            max = (listA[r][c] = listB[r][c]= (Math.random()*50+1)*-1);
                        else
                            max = Math.max(max,listA[r][c] = listB[r][c]= ((Math.random()*50)+1)*-1);

                Assert.assertEquals("largest("+ Arrays.deepToString(listA)+") failed to produce the correct result.",max,(Double)largest.invoke(check,(Object)listB),.001);

                Assert.assertEquals("largest("+Arrays.deepToString(listA)+") failed because it altered the array",Arrays.deepToString(listA),Arrays.deepToString(listB));
            }
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }
}
