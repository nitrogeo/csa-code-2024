package A12.L1;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class A12_VideoStore_RentalClasses_Tests
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
            Class<?> rentalClass = Class.forName(generateClassName("A12_Rental"));
            Method getTitle = rentalClass.getMethod("getTitle");
            Method getCost = rentalClass.getMethod("getCost");
            Method getRating = rentalClass.getMethod("getRating");


            Object check = rentalClass.getConstructor(String.class,double.class,int.class).newInstance("Title", 14.98,4);


            Assert.assertEquals("getTitle() failed after using the constructor."
                    ,"Title", getTitle.invoke(check));
            Assert.assertEquals("getCost() failed after using the constructor."
                    ,14.98, (Double)getCost.invoke(check),.001);
            Assert.assertEquals("getRating() failed after using the constructor."
                    ,4, getRating.invoke(check));
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test2() throws Exception {
        try {
            Class<?> rentalClass = Class.forName(generateClassName("A12_Rental"));
            Method getTitle = rentalClass.getMethod("getTitle");
            Method getCost = rentalClass.getMethod("getCost");
            Method getRating = rentalClass.getMethod("getRating");


            Object check = rentalClass.getConstructor(String.class,double.class,int.class).newInstance("Game 2", 3.99,2);


            Assert.assertEquals("getTitle() failed after using the constructor."
                    ,"Game 2", getTitle.invoke(check));
            Assert.assertEquals("getCost() failed after using the constructor."
                    ,3.99, (Double)getCost.invoke(check),.001);
            Assert.assertEquals("getRating() failed after using the constructor."
                    ,2, getRating.invoke(check));
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test3() throws Exception {
        try {
            Class<?> rentalClass = Class.forName(generateClassName("A12_Rental"));
            Method getTitle = rentalClass.getMethod("getTitle");
            Method getCost = rentalClass.getMethod("getCost");
            Method getRating = rentalClass.getMethod("getRating");


            Object check = rentalClass.getConstructor(String.class,double.class,int.class).newInstance("Vid", 1.63,1);


            Assert.assertEquals("getTitle() failed after using the constructor."
                    ,"Vid", getTitle.invoke(check));
            Assert.assertEquals("getCost() failed after using the constructor."
                    ,1.63, (Double)getCost.invoke(check),.001);
            Assert.assertEquals("getRating() failed after using the constructor."
                    ,1, getRating.invoke(check));
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test4() throws Exception {
        try {
            Class<?> rentalClass = Class.forName(generateClassName("A12_Rental"));
            Method getTitle = rentalClass.getMethod("getTitle");
            Method getCost = rentalClass.getMethod("getCost");
            Method getRating = rentalClass.getMethod("getRating");


            Object check = rentalClass.getConstructor(String.class,double.class,int.class).newInstance("Vid", 1.63,1);


            Assert.assertEquals("getTitle() failed after using the constructor."
                    ,"Vid", getTitle.invoke(check));
            Assert.assertEquals("getCost() failed after using the constructor."
                    ,1.63, (Double)getCost.invoke(check),.001);
            Assert.assertEquals("getRating() failed after using the constructor."
                    ,1, getRating.invoke(check));
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test5() throws Exception {
        try {
            Class<?> rentalClass = Class.forName(generateClassName("A12_Rental"));
            Class<?> videoClass = Class.forName(generateClassName("A12_Video"));
            Method getTitle = rentalClass.getMethod("getTitle");
            Method getCost = rentalClass.getMethod("getCost");
            Method getRating = rentalClass.getMethod("getRating");
            Method getDirector = videoClass.getMethod("getDirector");
            Method getMinutes = videoClass.getMethod("getMinutes");

            Object check = videoClass.getConstructor(String.class,double.class,int.class,String.class,int.class).newInstance
                    ("Video 1", 7.98,0,"Jack Smith",73);


            Assert.assertEquals("getTitle() failed after using the constructor."
                    ,"Video 1", getTitle.invoke(check));
            Assert.assertEquals("getCost() failed after using the constructor."
                    ,7.98, (Double)getCost.invoke(check),.001);
            Assert.assertEquals("getRating() failed after using the constructor."
                    ,0, getRating.invoke(check));
            Assert.assertEquals("getDirector() failed after using the constructor."
                    ,"Jack Smith", getDirector.invoke(check));
            Assert.assertEquals("getMinutes() failed after using the constructor."
                    ,73, getMinutes.invoke(check));

        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test6() throws Exception {
        try {
            Class<?> rentalClass = Class.forName(generateClassName("A12_Rental"));
            Class<?> videoClass = Class.forName(generateClassName("A12_Video"));
            Method getTitle = rentalClass.getMethod("getTitle");
            Method getCost = rentalClass.getMethod("getCost");
            Method getRating = rentalClass.getMethod("getRating");
            Method getDirector = videoClass.getMethod("getDirector");
            Method getMinutes = videoClass.getMethod("getMinutes");

            Object check = videoClass.getConstructor(String.class,double.class,int.class,String.class,int.class).newInstance
                    ("Video 2", 3.33,1,"Targon",89);


            Assert.assertEquals("getTitle() failed after using the constructor."
                    ,"Video 2", getTitle.invoke(check));
            Assert.assertEquals("getCost() failed after using the constructor."
                    ,3.33, (Double)getCost.invoke(check),.001);
            Assert.assertEquals("getRating() failed after using the constructor."
                    ,1, getRating.invoke(check));
            Assert.assertEquals("getDirector() failed after using the constructor."
                    ,"Targon", getDirector.invoke(check));
            Assert.assertEquals("getMinutes() failed after using the constructor."
                    ,89, getMinutes.invoke(check));

        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test7() throws Exception {
        try {
            Class<?> rentalClass = Class.forName(generateClassName("A12_Rental"));
            Class<?> videoClass = Class.forName(generateClassName("A12_Video"));
            Method getTitle = rentalClass.getMethod("getTitle");
            Method getCost = rentalClass.getMethod("getCost");
            Method getRating = rentalClass.getMethod("getRating");
            Method getDirector = videoClass.getMethod("getDirector");
            Method getMinutes = videoClass.getMethod("getMinutes");

            Object check = videoClass.getConstructor(String.class,double.class,int.class,String.class,int.class).newInstance
                    ("Bob", 1.23,3,"Bob Hammer",152);


            Assert.assertEquals("getTitle() failed after using the constructor."
                    ,"Bob", getTitle.invoke(check));
            Assert.assertEquals("getCost() failed after using the constructor."
                    ,1.23, (Double)getCost.invoke(check),.001);
            Assert.assertEquals("getRating() failed after using the constructor."
                    ,3, getRating.invoke(check));
            Assert.assertEquals("getDirector() failed after using the constructor."
                    ,"Bob Hammer", getDirector.invoke(check));
            Assert.assertEquals("getMinutes() failed after using the constructor."
                    ,152, getMinutes.invoke(check));

        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test8() throws Exception {
        try {
            Class<?> rentalClass = Class.forName(generateClassName("A12_Rental"));
            Class<?> videoClass = Class.forName(generateClassName("A12_Video"));
            Method getTitle = rentalClass.getMethod("getTitle");
            Method getCost = rentalClass.getMethod("getCost");
            Method getRating = rentalClass.getMethod("getRating");
            Method getDirector = videoClass.getMethod("getDirector");
            Method getMinutes = videoClass.getMethod("getMinutes");

            Object check = videoClass.getConstructor(String.class,double.class,int.class,String.class,int.class).newInstance
                    ("Video A", 2.22,4,"Test Dir",1);


            Assert.assertEquals("getTitle() failed after using the constructor."
                    ,"Video A", getTitle.invoke(check));
            Assert.assertEquals("getCost() failed after using the constructor."
                    ,2.22, (Double)getCost.invoke(check),.001);
            Assert.assertEquals("getRating() failed after using the constructor."
                    ,4, getRating.invoke(check));
            Assert.assertEquals("getDirector() failed after using the constructor."
                    ,"Test Dir", getDirector.invoke(check));
            Assert.assertEquals("getMinutes() failed after using the constructor."
                    ,1, getMinutes.invoke(check));

        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test9() throws Exception {
        try {
            Class<?> rentalClass = Class.forName(generateClassName("A12_Rental"));
            Class<?> gameClass = Class.forName(generateClassName("A12_Game"));
            Method getTitle = rentalClass.getMethod("getTitle");
            Method getCost = rentalClass.getMethod("getCost");
            Method getRating = rentalClass.getMethod("getRating");
            Method getPlatform = gameClass.getMethod("getPlatform");
            Method getNumberOfPlayers = gameClass.getMethod("getNumberOfPlayers");

            Object check = gameClass.getConstructor(String.class,double.class,int.class,String.class,int.class).newInstance
                    ("Game A",1.98,0,"GameBoy",1);


            Assert.assertEquals("getTitle() failed after using the constructor."
                    ,"Game A", getTitle.invoke(check));
            Assert.assertEquals("getCost() failed after using the constructor."
                    ,1.98, (Double)getCost.invoke(check),.001);
            Assert.assertEquals("getRating() failed after using the constructor."
                    ,0, getRating.invoke(check));
            Assert.assertEquals("getPlatform() failed after using the constructor."
                    ,"GameBoy", getPlatform.invoke(check));
            Assert.assertEquals("getNumberOfPlayers() failed after using the constructor."
                    ,1, getNumberOfPlayers.invoke(check));

        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test10() throws Exception {
        try {
            Class<?> rentalClass = Class.forName(generateClassName("A12_Rental"));
            Class<?> gameClass = Class.forName(generateClassName("A12_Game"));
            Method getTitle = rentalClass.getMethod("getTitle");
            Method getCost = rentalClass.getMethod("getCost");
            Method getRating = rentalClass.getMethod("getRating");
            Method getPlatform = gameClass.getMethod("getPlatform");
            Method getNumberOfPlayers = gameClass.getMethod("getNumberOfPlayers");

            Object check = gameClass.getConstructor(String.class,double.class,int.class,String.class,int.class).newInstance
                    ("Fall 13",14.94,1,"XBox",4);


            Assert.assertEquals("getTitle() failed after using the constructor."
                    ,"Fall 13", getTitle.invoke(check));
            Assert.assertEquals("getCost() failed after using the constructor."
                    ,14.94, (Double)getCost.invoke(check),.001);
            Assert.assertEquals("getRating() failed after using the constructor."
                    ,1, getRating.invoke(check));
            Assert.assertEquals("getPlatform() failed after using the constructor."
                    ,"XBox", getPlatform.invoke(check));
            Assert.assertEquals("getNumberOfPlayers() failed after using the constructor."
                    ,4, getNumberOfPlayers.invoke(check));

        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test11() throws Exception {
        try {
            Class<?> rentalClass = Class.forName(generateClassName("A12_Rental"));
            Class<?> gameClass = Class.forName(generateClassName("A12_Game"));
            Method getTitle = rentalClass.getMethod("getTitle");
            Method getCost = rentalClass.getMethod("getCost");
            Method getRating = rentalClass.getMethod("getRating");
            Method getPlatform = gameClass.getMethod("getPlatform");
            Method getNumberOfPlayers = gameClass.getMethod("getNumberOfPlayers");

            Object check = gameClass.getConstructor(String.class,double.class,int.class,String.class,int.class).newInstance
                    ("Fall 13",11.11,1,"Rectangle",4);


            Assert.assertEquals("getTitle() failed after using the constructor."
                    ,"Fall 13", getTitle.invoke(check));
            Assert.assertEquals("getCost() failed after using the constructor."
                    ,11.11, (Double)getCost.invoke(check),.001);
            Assert.assertEquals("getRating() failed after using the constructor."
                    ,1, getRating.invoke(check));
            Assert.assertEquals("getPlatform() failed after using the constructor."
                    ,"Rectangle", getPlatform.invoke(check));
            Assert.assertEquals("getNumberOfPlayers() failed after using the constructor."
                    ,4, getNumberOfPlayers.invoke(check));

        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test12() throws Exception {
        try {
            Class<?> rentalClass = Class.forName(generateClassName("A12_Rental"));
            Class<?> gameClass = Class.forName(generateClassName("A12_Game"));
            Method getTitle = rentalClass.getMethod("getTitle");
            Method getCost = rentalClass.getMethod("getCost");
            Method getRating = rentalClass.getMethod("getRating");
            Method getPlatform = gameClass.getMethod("getPlatform");
            Method getNumberOfPlayers = gameClass.getMethod("getNumberOfPlayers");

            Object check = gameClass.getConstructor(String.class,double.class,int.class,String.class,int.class).newInstance
                    ("Fall 17",17.11,2,"XBox",2);


            Assert.assertEquals("getTitle() failed after using the constructor."
                    ,"Fall 17", getTitle.invoke(check));
            Assert.assertEquals("getCost() failed after using the constructor."
                    ,17.11, (Double)getCost.invoke(check),.001);
            Assert.assertEquals("getRating() failed after using the constructor."
                    ,2, getRating.invoke(check));
            Assert.assertEquals("getPlatform() failed after using the constructor."
                    ,"XBox", getPlatform.invoke(check));
            Assert.assertEquals("getNumberOfPlayers() failed after using the constructor."
                    ,2, getNumberOfPlayers.invoke(check));

        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test13() throws Exception {
        try {
            Class<?> rentalClass = Class.forName(generateClassName("A12_Rental"));
            Method isRented = rentalClass.getMethod("isRented");
            Method setRented = rentalClass.getMethod("setRented",boolean.class);


            Object check = rentalClass.getConstructor(String.class,double.class,int.class).newInstance("Title", 14.98,4);

            Assert.assertFalse("isRented() failed to return false after construction.",(Boolean)isRented.invoke(check));
            setRented.invoke(check,true);
            Assert.assertTrue("isRented() failed to return true after using setRented(true).",(Boolean)isRented.invoke(check));
            setRented.invoke(check,false);
            Assert.assertFalse("isRented() failed to return false after using setRented(false).",(Boolean)isRented.invoke(check));
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test14() throws Exception {
        try {
            Class<?> rentalClass = Class.forName(generateClassName("A12_Rental"));
            Method isRented = rentalClass.getMethod("isRented");
            Method setRented = rentalClass.getMethod("setRented",boolean.class);


            Class<?> videoClass = Class.forName(generateClassName("A12_Video"));
            Object check = videoClass.getConstructor(String.class,double.class,int.class,String.class,int.class).newInstance
                    ("Video A", 2.22,4,"Test Dir",1);

            Assert.assertFalse("isRented() failed to return false after construction.",(Boolean)isRented.invoke(check));
            setRented.invoke(check,true);
            Assert.assertTrue("isRented() failed to return true after using setRented(true).",(Boolean)isRented.invoke(check));
            setRented.invoke(check,false);
            Assert.assertFalse("isRented() failed to return false after using setRented(false).",(Boolean)isRented.invoke(check));
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test15() throws Exception {
        try {
            Class<?> rentalClass = Class.forName(generateClassName("A12_Rental"));
            Method isRented = rentalClass.getMethod("isRented");
            Method setRented = rentalClass.getMethod("setRented",boolean.class);

            Class<?> gameClass = Class.forName(generateClassName("A12_Game"));
            Object check = gameClass.getConstructor(String.class,double.class,int.class,String.class,int.class).newInstance
                    ("Fall 17",17.11,2,"XBox",2);

            Assert.assertFalse("isRented() failed to return false after construction.",(Boolean)isRented.invoke(check));
            setRented.invoke(check,true);
            Assert.assertTrue("isRented() failed to return true after using setRented(true).",(Boolean)isRented.invoke(check));
            setRented.invoke(check,false);
            Assert.assertFalse("isRented() failed to return false after using setRented(false).",(Boolean)isRented.invoke(check));
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }



}
