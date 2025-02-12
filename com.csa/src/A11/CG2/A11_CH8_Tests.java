
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

public class A11_CH8_Tests
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
            Class<?> classRef = Class.forName(generateClassName("A11_CH8"));
            Method quadrantCount = classRef.getMethod("quadrantCount", ArrayList.class);
            Object check = classRef.getConstructor().newInstance();

            for(int c=0; c<30; c++) {
                ArrayList<Point> pointsBackup = new ArrayList<>();
                ArrayList<Point> points = new ArrayList<>();
                int answer = 0;
                for (int i = 0; i < 10; i++) {
                    int x = (int) (Math.random() * 1000 - 500);
                    int y = (int) (Math.random() * 1000 - 500);
                    if (x == 0 || y == 0)
                        continue;
                    if (x < 0 && y < 0)
                        answer++;
                    points.add(new Point(x, y));
                    pointsBackup.add(new Point(x, y));
                }

                Assert.assertEquals("quadrantCount(" + pointsBackup.toString() + ") failed to produce the correct result.", answer, quadrantCount.invoke(check, points));
                Assert.assertEquals("quadrantCount(" + pointsBackup.toString() + ") failed due altering the ArrayList", pointsBackup.toString(), points.toString());
            }
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }
}
