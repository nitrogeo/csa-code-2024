package A8.LabsG2;

import A8.LabsG1.TestingOutputStream;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class A8_ArrayExpander_Tests
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
// add / toString tests
    @Test(timeout = 250)
    public void test1() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("A8_ArrayExpander"));
            Method add = classRef.getMethod("add", int.class);
            Method insert = classRef.getMethod("add", int.class, int.class);
            Method setInsert = classRef.getMethod("set", int.class, int.class);
            Method size = classRef.getMethod("size");
            Method remove = classRef.getMethod("remove", int.class);
            Method clear = classRef.getMethod("clear");
            Method get = classRef.getMethod("get", int.class);
            Method toString = classRef.getMethod("toString");

            Object actual = classRef.getConstructor().newInstance();
            ArrayList<Integer> teacher = new ArrayList<Integer>();

            Assert.assertEquals("toString() failed on an empty array expander.",teacher.toString(), toString.invoke(actual));
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test2() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("A8_ArrayExpander"));
            Method add = classRef.getMethod("add", int.class);
            Method insert = classRef.getMethod("add", int.class, int.class);
            Method setInsert = classRef.getMethod("set", int.class, int.class);
            Method size = classRef.getMethod("size");
            Method remove = classRef.getMethod("remove", int.class);
            Method clear = classRef.getMethod("clear");
            Method get = classRef.getMethod("get", int.class);
            Method toString = classRef.getMethod("toString");
            Object obj = classRef.getConstructor().newInstance();



            for(int t=0; t<10; t++)
            {
                Object actual = classRef.getConstructor().newInstance();
                ArrayList<Integer> teacher = new ArrayList<Integer>();

                int numAdds= (int) (Math.random() * 10) + 8;
                ArrayList<Integer> thingsToAdd = new ArrayList<>();
                for (int x = 0; x < numAdds;x++)
                {
                    int v = (int) (Math.random() * 35) + 1;
                    thingsToAdd.add(v);
                }
                for(int x = 0; x<thingsToAdd.size();x++)
                {
                    add.invoke(actual,thingsToAdd.get(x));
                    teacher.add(thingsToAdd.get(x));
                }

                Assert.assertEquals("toString() failed after calling add using these values: "+thingsToAdd,teacher.toString(), toString.invoke(actual));
            }
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }
// Size Tests
    @Test(timeout = 250)
    public void test3() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("A8_ArrayExpander"));
            Method add = classRef.getMethod("add", int.class);
            Method insert = classRef.getMethod("add", int.class, int.class);
            Method setInsert = classRef.getMethod("set", int.class, int.class);
            Method size = classRef.getMethod("size");
            Method remove = classRef.getMethod("remove", int.class);
            Method clear = classRef.getMethod("clear");
            Method get = classRef.getMethod("get", int.class);
            Method toString = classRef.getMethod("toString");

            Object actual = classRef.getConstructor().newInstance();
            ArrayList<Integer> teacher = new ArrayList<>();

            Assert.assertEquals("size() failed on an empty array expander.",teacher.size(), size.invoke(actual));
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test4() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("A8_ArrayExpander"));
            Method add = classRef.getMethod("add", int.class);
            Method insert = classRef.getMethod("add", int.class, int.class);
            Method setInsert = classRef.getMethod("set", int.class, int.class);
            Method size = classRef.getMethod("size");
            Method remove = classRef.getMethod("remove", int.class);
            Method clear = classRef.getMethod("clear");
            Method get = classRef.getMethod("get", int.class);
            Method toString = classRef.getMethod("toString");
            Object obj = classRef.getConstructor().newInstance();



            for(int t=0; t<10; t++)
            {
                Object actual = classRef.getConstructor().newInstance();
                ArrayList<Integer> teacher = new ArrayList<>();

                int numAdds= (int) (Math.random() * 10) + 8;
                ArrayList<Integer> thingsToAdd = new ArrayList<>();
                for (int x = 0; x < numAdds;x++)
                {
                    int v = (int) (Math.random() * 35) + 1;
                    thingsToAdd.add(v);
                }
                for(int x = 0; x<thingsToAdd.size();x++)
                {
                    add.invoke(actual,thingsToAdd.get(x));
                    teacher.add(thingsToAdd.get(x));
                }

                Assert.assertEquals("size() failed after calling add using these values: "+thingsToAdd,teacher.size(), size.invoke(actual));
            }
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }
// insert tests
    @Test(timeout = 250)
    public void test5() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("A8_ArrayExpander"));
            Method add = classRef.getMethod("add", int.class);
            Method insert = classRef.getMethod("add", int.class, int.class);
            Method setInsert = classRef.getMethod("set", int.class, int.class);
            Method size = classRef.getMethod("size");
            Method remove = classRef.getMethod("remove", int.class);
            Method clear = classRef.getMethod("clear");
            Method get = classRef.getMethod("get", int.class);
            Method toString = classRef.getMethod("toString");
            Object obj = classRef.getConstructor().newInstance();

            for(int t=0; t<10; t++)
            {
                Object actual = classRef.getConstructor().newInstance();
                ArrayList<Integer> teacher = new ArrayList<>();

                int numAdds= (int) (Math.random() * 10) + 8;
                ArrayList<Integer> thingsToAdd = new ArrayList<>();
                for (int x = 0; x < numAdds;x++)
                {
                    int v = (int) (Math.random() * 35) + 1;
                    thingsToAdd.add(v);
                }
                for(int x = 0; x<thingsToAdd.size();x++)
                {
                    insert.invoke(actual,0,thingsToAdd.get(x));
                    teacher.add(0,thingsToAdd.get(x));
                }

                Assert.assertEquals("toString() failed after calling add using these values: "+thingsToAdd+ " each at position 0.",teacher.toString() , toString.invoke(actual));
            }
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test6() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("A8_ArrayExpander"));
            Method add = classRef.getMethod("add", int.class);
            Method insert = classRef.getMethod("add", int.class, int.class);
            Method setInsert = classRef.getMethod("set", int.class, int.class);
            Method size = classRef.getMethod("size");
            Method remove = classRef.getMethod("remove", int.class);
            Method clear = classRef.getMethod("clear");
            Method get = classRef.getMethod("get", int.class);
            Method toString = classRef.getMethod("toString");
            Object obj = classRef.getConstructor().newInstance();

            for(int t=0; t<10; t++)
            {
                Object actual = classRef.getConstructor().newInstance();
                ArrayList<Integer> teacher = new ArrayList<>();

                int numAdds= (int) (Math.random() * 10) + 8;
                ArrayList<Integer> thingsToAdd = new ArrayList<>();
                for (int x = 0; x < numAdds;x++)
                {
                    int v = (int) (Math.random() * 35) + 1;
                    thingsToAdd.add(v);
                }
                for(int x = 0; x<thingsToAdd.size();x++)
                {
                    insert.invoke(actual,size.invoke(actual),thingsToAdd.get(x));
                    teacher.add(teacher.size(),thingsToAdd.get(x));
                }

                Assert.assertEquals("toString() failed after calling add using these values: "+thingsToAdd+ " each add at one position past the last element.",teacher.toString() , toString.invoke(actual));
            }
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test7() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("A8_ArrayExpander"));
            Method add = classRef.getMethod("add", int.class);
            Method insert = classRef.getMethod("add", int.class, int.class);
            Method setInsert = classRef.getMethod("set", int.class, int.class);
            Method size = classRef.getMethod("size");
            Method remove = classRef.getMethod("remove", int.class);
            Method clear = classRef.getMethod("clear");
            Method get = classRef.getMethod("get", int.class);
            Method toString = classRef.getMethod("toString");
            Object obj = classRef.getConstructor().newInstance();

            for(int t=0; t<10; t++)
            {
                Object actual = classRef.getConstructor().newInstance();
                ArrayList<Integer> teacher = new ArrayList<>();

                int numAdds= (int) (Math.random() * 10) + 8;
                ArrayList<Integer> thingsToAdd = new ArrayList<>();
                for (int x = 0; x < numAdds;x++)
                {
                    int v = (int) (Math.random() * 35) + 1;
                    thingsToAdd.add(v);
                }
                for(int x = 0; x<thingsToAdd.size();x++)
                {
                    add.invoke(actual,thingsToAdd.get(x));
                    teacher.add(thingsToAdd.get(x));
                }

                int toAdd = (int) (Math.random() * 35) + 1;
                int pos = (int)(Math.random() *teacher.size()-2)+1;

                insert.invoke(actual,pos,toAdd);
                teacher.add(pos,toAdd);

                Assert.assertEquals("toString() failed after calling add using these values: "+thingsToAdd +"and then inserting "+add + " at position "+pos,teacher.toString(),toString.invoke(actual));
            }
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }
//Set Get Tests
@Test(timeout = 250)
public void test8() throws Exception {
    try {
        Class<?> classRef = Class.forName(generateClassName("A8_ArrayExpander"));
        Method add = classRef.getMethod("add", int.class);
        Method insert = classRef.getMethod("add", int.class, int.class);
        Method set = classRef.getMethod("set", int.class, int.class);
        Method size = classRef.getMethod("size");
        Method remove = classRef.getMethod("remove", int.class);
        Method clear = classRef.getMethod("clear");
        Method get = classRef.getMethod("get", int.class);
        Method toString = classRef.getMethod("toString");
        Object obj = classRef.getConstructor().newInstance();

        for(int t=0; t<10; t++)
        {
            Object actual = classRef.getConstructor().newInstance();
            ArrayList<Integer> teacher = new ArrayList<>();

            int numAdds= (int) (Math.random() * 10) + 8;
            ArrayList<Integer> thingsToAdd = new ArrayList<>();
            for (int x = 0; x < numAdds;x++)
            {
                int v = (int) (Math.random() * 35) + 1;
                thingsToAdd.add(v);
            }
            for(int x = 0; x<thingsToAdd.size();x++)
            {
                add.invoke(actual,thingsToAdd.get(x));
                teacher.add(thingsToAdd.get(x));
            }

            int pos = (int)(Math.random()*teacher.size());
            int newValue = (int)(Math.random()*100)+1;
            Assert.assertEquals("set("+pos+","+newValue+") failed after calling add using these values: "+thingsToAdd,teacher.set(pos,newValue), set.invoke(actual,pos,newValue));
            Assert.assertEquals("get("+pos+") failed after calling add using these values "+thingsToAdd+" and then using: set("+pos+","+newValue+")",teacher.get(pos), get.invoke(actual,pos));
            Assert.assertEquals("toString() failed after calling add using these values "+thingsToAdd+" and then using: set("+pos+","+newValue+")",teacher.toString(), toString.invoke(actual));
        }
    }
    catch ( InvocationTargetException e )
    {
        throw (Exception) e.getCause();
    }
}

//clear tests
@Test(timeout = 250)
public void test9() throws Exception {
    try {
        Class<?> classRef = Class.forName(generateClassName("A8_ArrayExpander"));
        Method add = classRef.getMethod("add", int.class);
        Method insert = classRef.getMethod("add", int.class, int.class);
        Method set = classRef.getMethod("set", int.class, int.class);
        Method size = classRef.getMethod("size");
        Method remove = classRef.getMethod("remove", int.class);
        Method clear = classRef.getMethod("clear");
        Method get = classRef.getMethod("get", int.class);
        Method toString = classRef.getMethod("toString");
        Object obj = classRef.getConstructor().newInstance();

        for(int t=0; t<10; t++)
        {
            Object actual = classRef.getConstructor().newInstance();
            ArrayList<Integer> teacher = new ArrayList<>();

            int numAdds= (int) (Math.random() * 10) + 8;
            ArrayList<Integer> thingsToAdd = new ArrayList<>();
            for (int x = 0; x < numAdds;x++)
            {
                int v = (int) (Math.random() * 35) + 1;
                thingsToAdd.add(v);
            }
            for(int x = 0; x<thingsToAdd.size();x++)
            {
                add.invoke(actual,thingsToAdd.get(x));
                teacher.add(thingsToAdd.get(x));
            }

            clear.invoke(actual);
            teacher.clear();
            Assert.assertEquals("clear() failed to empty out an array expander with data. (Tested with size())"+thingsToAdd,teacher.size(), size.invoke(actual));
        }
    }
    catch ( InvocationTargetException e )
    {
        throw (Exception) e.getCause();
    }
}

// remove tests
@Test(timeout = 250)
public void test10() throws Exception {
    try {
        Class<?> classRef = Class.forName(generateClassName("A8_ArrayExpander"));
        Method add = classRef.getMethod("add", int.class);
        Method insert = classRef.getMethod("add", int.class, int.class);
        Method set = classRef.getMethod("set", int.class, int.class);
        Method size = classRef.getMethod("size");
        Method remove = classRef.getMethod("remove", int.class);
        Method clear = classRef.getMethod("clear");
        Method get = classRef.getMethod("get", int.class);
        Method toString = classRef.getMethod("toString");
        Object obj = classRef.getConstructor().newInstance();

        for(int t=0; t<10; t++)
        {
            Object actual = classRef.getConstructor().newInstance();
            ArrayList<Integer> teacher = new ArrayList<>();

            int numAdds= (int) (Math.random() * 10) + 8;
            ArrayList<Integer> thingsToAdd = new ArrayList<>();
            for (int x = 0; x < numAdds;x++)
            {
                int v = (int) (Math.random() * 35) + 1;
                thingsToAdd.add(v);
            }
            for(int x = 0; x<thingsToAdd.size();x++)
            {
                add.invoke(actual,thingsToAdd.get(x));
                teacher.add(thingsToAdd.get(x));
            }

            int pos = (int)(Math.random()*numAdds);
            Assert.assertEquals("remove("+pos+") failed after calling add using these values: "+thingsToAdd,teacher.remove(pos), remove.invoke(actual,pos));}
    }
    catch ( InvocationTargetException e )
    {
        throw (Exception) e.getCause();
    }
}
}
