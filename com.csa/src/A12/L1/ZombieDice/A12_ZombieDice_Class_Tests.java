/*
package A12.L1;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class A12_ZombieDice_Class_Tests
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
    public void test2() throws Exception {
        try {
            Class<?> zombieDie = Class.forName(generateClassName("A12_ZombieDie"));
            Class<?> redZombieDie = Class.forName(generateClassName("A12_RedZombieDie"));
            Class<?> yellowZombieDie = Class.forName(generateClassName("A12_YellowZombieDie"));
            Class<?> greenZombieDie = Class.forName(generateClassName("A12_GreenZombieDie"));
            Method getDieColor = zombieDie.getMethod("getDieColor");


            Object red = redZombieDie.getConstructor().newInstance();
            Object green = greenZombieDie.getConstructor().newInstance();
            Object yellow = yellowZombieDie.getConstructor().newInstance();

            Assert.assertEquals("RedZombieDie has the wrong color",1, getDieColor.invoke(red));
            Assert.assertEquals("YellowZombieDie has the wrong color",3, getDieColor.invoke(yellow));
            Assert.assertEquals("GreenZombieDie has the wrong color",2, getDieColor.invoke(green));
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test3() throws Exception {
        try {
            Class<?> zombieDie = Class.forName(generateClassName("A12_ZombieDie"));
            Class<?> redZombieDie = Class.forName(generateClassName("A12_RedZombieDie"));
            Class<?> yellowZombieDie = Class.forName(generateClassName("A12_YellowZombieDie"));
            Class<?> greenZombieDie = Class.forName(generateClassName("A12_GreenZombieDie"));
            Method getDieColor = zombieDie.getMethod("getDieColor");
            Method setValue = zombieDie.getMethod("setValue",int.class);
            Method toString = zombieDie.getMethod("toString");

            Object red = redZombieDie.getConstructor().newInstance();
            Object green = greenZombieDie.getConstructor().newInstance();
            Object yellow = yellowZombieDie.getConstructor().newInstance();

            Assert.assertEquals("RedZombieDie toString() failed after construction.","Red",toString.invoke(red));
            Assert.assertEquals("YellowZombieDie toString() failed after construction.","Yellow",toString.invoke(yellow));
            Assert.assertEquals("GreenZombieDie toString() failed after construction.","Green",toString.invoke(green));

            setValue.invoke(red,A12_ZombieDie.RUNNER);
            setValue.invoke(yellow,A12_ZombieDie.RUNNER);
            setValue.invoke(green,A12_ZombieDie.RUNNER);

            Assert.assertEquals("RedZombieDie toString() failed after setting its value to RUNNER.","Red-Runner",red.toString());
            Assert.assertEquals("YellowZombieDie toString() failed after setting its value to RUNNER.","Yellow-Runner",yellow.toString());
            Assert.assertEquals("GreenZombieDie toString() failed after setting its value to RUNNER.","Green-Runner",green.toString());

            setValue.invoke(red,A12_ZombieDie.BRAIN);
            setValue.invoke(yellow,A12_ZombieDie.BRAIN);
            setValue.invoke(green,A12_ZombieDie.BRAIN);

            Assert.assertEquals("RedZombieDie toString() failed after setting its value to BRAIN.","Red-Brain",red.toString());
            Assert.assertEquals("YellowZombieDie toString() failed after setting its value to BRAIN.","Yellow-Brain",yellow.toString());
            Assert.assertEquals("GreenZombieDie toString() failed after setting its value to BRAIN.","Green-Brain",green.toString());

            setValue.invoke(red,A12_ZombieDie.SHOT);
            setValue.invoke(yellow,A12_ZombieDie.SHOT);
            setValue.invoke(green,A12_ZombieDie.SHOT);

            Assert.assertEquals("RedZombieDie toString() failed after setting its value to SHOT.","Red-Shot",red.toString());
            Assert.assertEquals("YellowZombieDie toString() failed after setting its value to SHOT.","Yellow-Shot",yellow.toString());
            Assert.assertEquals("GreenZombieDie toString() failed after setting its value to SHOT.","Green-Shot",green.toString());

        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test4() throws Exception {
        try {
            Class<?> zombieBucket = Class.forName(generateClassName("A12_ZombieDiceBucket"));
            Class<?> zombieDie = Class.forName(generateClassName("A12_ZombieDie"));
            Object bucket = zombieBucket.getConstructor().newInstance();
            Method getDieColor = zombieDie.getMethod("getDieColor");
            Method draw = zombieBucket.getMethod("draw");

            int red=0, green=0, yellow=0;

            for(int x=0; x<13; x++)
            {
                Object zd = draw.invoke(bucket);
                if(zd.toString().contains("Green"))
                    green++;
                if(zd.toString().contains("Yellow"))
                    yellow++;
                if(zd.toString().contains("Red"))
                    red++;
            }

            Assert.assertEquals("After drawing from the ZombieDieBucket 13 times, the number of drawn green dice was wrong.",6,green);
            Assert.assertEquals("After drawing from the ZombieDieBucket 13 times, the number of drawn yellow dice was wrong.",4,yellow);
            Assert.assertEquals("After drawing from the ZombieDieBucket 13 times, the number of drawn red dice was wrong.",3,red);

            Assert.assertNull("The 14th draw from the ZombieDieBucket was not null",draw.invoke(bucket));


        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test5() throws Exception {
        try {
            Class<?> zombieBucket = Class.forName(generateClassName("A12_ZombieDiceBucket"));
            Class<?> zombieDie = Class.forName(generateClassName("A12_ZombieDie"));
            Object bucket = zombieBucket.getConstructor().newInstance();
            Method getDieColor = zombieDie.getMethod("getDieColor");
            Method draw = zombieBucket.getMethod("draw");
            Method loadBucket = zombieBucket.getMethod("loadBucket");

            for(int x=0; x<13; x++)
                draw.invoke(bucket);

            loadBucket.invoke(bucket);
            int red=0, green=0, yellow=0;

            for(int x=0; x<13; x++)
            {
                Object zd = draw.invoke(bucket);
                if(zd.toString().contains("Green"))
                    green++;
                if(zd.toString().contains("Yellow"))
                    yellow++;
                if(zd.toString().contains("Red"))
                    red++;
            }

            Assert.assertEquals("After loading the bucket and then drawing from the ZombieDieBucket 13 times, the number of drawn green dice was wrong.",6,green);
            Assert.assertEquals("After loading the bucket and then drawing from the ZombieDieBucket 13 times, the number of drawn yellow dice was wrong.",4,yellow);
            Assert.assertEquals("After loading the bucket and then drawing from the ZombieDieBucket 13 times, the number of drawn red dice was wrong.",3,red);

            Assert.assertNull("After loading the bucket the 14th draw from the ZombieDieBucket was not null",draw.invoke(bucket));


        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }
}
*/
