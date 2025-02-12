
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class A11_ClassGrades_StudentClass_Tests
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
            Class<?> classRef = Class.forName(generateClassName("A11_StudentClass"));
            Class<?> classRefAssignment = Class.forName(generateClassName("A11_Assignment"));
            Method addAssignment = classRef.getMethod("addAssignment",classRefAssignment);
            Method getAssignments = classRef.getMethod("getAssignments");
            Method minorAverage = classRef.getMethod("minorAverage");
            Method majorAverage = classRef.getMethod("majorAverage");
            Method otherAverage = classRef.getMethod("otherAverage");
            Method average = classRef.getMethod("average");

            for(int times = 0 ; times<50; times++)
            {
                String[] names = {"Test 1", "Test 2","Test 3",
                        "Exam 1", "Exam 2","Exam 3",
                        "Quiz 1", "Quiz 2","Quiz 3",
                        "Homework 1", "Homework 2","Homework 3",
                        "Group Project 1", "Group Project 2","Group Project 3"};
                ArrayList<String> uniqueNames = new ArrayList<String>();

                Object check = classRef.getConstructor().newInstance();

                for(String s: names)
                    uniqueNames.add(s);

                int numAssignments = (int)(Math.random()*7)+3;
                int numOther=0;
                int numMinor=0;
                int numMajor=0;
                double totalOther=0;
                double totalMinor=0;
                double totalMajor=0;
                String assignments="";
                for(int i=0; i<numAssignments; i++)
                {
                    String name = uniqueNames.remove((int)(Math.random()*uniqueNames.size()));
                    double grade =  (int)(Math.random()*10000)/100.0;
                    int cat = (int)(Math.random()*3);
                    Object assignment = classRefAssignment.getConstructor(String.class,double.class,int.class).newInstance(name,grade,cat);
                    addAssignment.invoke(check,assignment);
                    if(cat==0)
                    {
                        numOther++;
                        totalOther+=grade;
                    }
                    if(cat==1)
                    {
                        numMinor++;
                        totalMinor+=grade;
                    }
                    if(cat==2)
                    {
                        numMajor++;
                        totalMajor+=grade;
                    }
                    assignments+= "("+name+"/"+grade+"/"+cat+") ";
                }
                double otherAvg = (numOther>0?(totalOther/numOther):100);
                double minorAvg = (numMinor>0?(totalMinor/numMinor):100);
                double majorAvg = (numMajor>0?(totalMajor/numMajor):100);
                String message = "failed after creating a class with these assignments:"+assignments.trim();

                Assert.assertEquals("getAssignments.size() "+message
                        ,numAssignments, ((ArrayList)getAssignments.invoke(check)).size());
                Assert.assertEquals("minorAverage() "+message
                    ,minorAvg, (Double)minorAverage.invoke(check),.001);
                Assert.assertEquals("majorAverage() "+message
                        ,majorAvg, (Double)majorAverage.invoke(check),.001);
                Assert.assertEquals("otherAverage() "+message
                        ,otherAvg, (Double)otherAverage.invoke(check),.001);
                Assert.assertEquals("average() "+message
                        ,otherAvg*.1+minorAvg*.2+majorAvg*.7, (Double)average.invoke(check),.001);


            }
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }
}
