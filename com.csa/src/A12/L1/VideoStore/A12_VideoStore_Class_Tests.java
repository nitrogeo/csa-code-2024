package A12.L1.VideoStore;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class A12_VideoStore_Class_Tests
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
            Method isRented = rentalClass.getMethod("isRented");
            Method setRented = rentalClass.getMethod("setRented",boolean.class);

            Class<?> storeClass = Class.forName(generateClassName("A12_VideoStore"));
            Method getGames = storeClass.getMethod("getGames");
            Method getVideos = storeClass.getMethod("getVideos");
            Method rented = storeClass.getMethod("rented");
            Method gamesInStock = storeClass.getMethod("gamesInStock");
            Method videosInStock = storeClass.getMethod("videosInStock");

            Object check = storeClass.getConstructor().newInstance();


            Assert.assertEquals("getGames().size() failed after using the constructor",3,((ArrayList)getGames.invoke(check)).size());
            Assert.assertEquals("getVideos().size() failed after using the constructor",3,((ArrayList)getVideos.invoke(check)).size());
            Assert.assertEquals("rented().size() failed after using the constructor",0,((ArrayList)rented.invoke(check)).size());
            Assert.assertEquals("gamesInStock().size() failed after using the constructor",3,((ArrayList)gamesInStock.invoke(check)).size());
            Assert.assertEquals("videosInStock().size() failed after using the constructor",3,((ArrayList)videosInStock.invoke(check)).size());
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
            Method isRented = rentalClass.getMethod("isRented");
            Method setRented = rentalClass.getMethod("setRented",boolean.class);

            Class<?> storeClass = Class.forName(generateClassName("A12_VideoStore"));
            Method getGames = storeClass.getMethod("getGames");
            Method getVideos = storeClass.getMethod("getVideos");
            Method rented = storeClass.getMethod("rented");
            Method gamesInStock = storeClass.getMethod("gamesInStock");
            Method videosInStock = storeClass.getMethod("videosInStock");

            Object check = storeClass.getConstructor().newInstance();

            setRented.invoke(((ArrayList)getGames.invoke(check)).get(0),true);
            setRented.invoke(((ArrayList)getGames.invoke(check)).get(2),true);
            setRented.invoke(((ArrayList)getVideos.invoke(check)).get(1),true);

            String message =  "failed after using the constructor and then renting 2 games and 1 video.";
            Assert.assertEquals("getGames().size()"+message,3,((ArrayList)getGames.invoke(check)).size());
            Assert.assertEquals("getVideos().size()"+message,3,((ArrayList)getVideos.invoke(check)).size());
            Assert.assertEquals("rented().size()"+message,3,((ArrayList)rented.invoke(check)).size());
            Assert.assertEquals("gamesInStock().size()"+message,1,((ArrayList)gamesInStock.invoke(check)).size());
            Assert.assertEquals("videosInStock().size()"+message,2,((ArrayList)videosInStock.invoke(check)).size());
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
            Method isRented = rentalClass.getMethod("isRented");
            Method setRented = rentalClass.getMethod("setRented",boolean.class);

            Class<?> storeClass = Class.forName(generateClassName("A12_VideoStore"));
            Method getGames = storeClass.getMethod("getGames");
            Method getVideos = storeClass.getMethod("getVideos");
            Method rented = storeClass.getMethod("rented");
            Method gamesInStock = storeClass.getMethod("gamesInStock");
            Method videosInStock = storeClass.getMethod("videosInStock");

            Object check = storeClass.getConstructor().newInstance();

            setRented.invoke(((ArrayList)getGames.invoke(check)).get(0),true);
            setRented.invoke(((ArrayList)getGames.invoke(check)).get(1),true);
            setRented.invoke(((ArrayList)getGames.invoke(check)).get(2),true);
            setRented.invoke(((ArrayList)getVideos.invoke(check)).get(2),true);
            setRented.invoke(((ArrayList)getVideos.invoke(check)).get(1),true);

            String message =  "failed after using the constructor and then renting 2 games and 1 video.";
            Assert.assertEquals("getGames().size()"+message,3,((ArrayList)getGames.invoke(check)).size());
            Assert.assertEquals("getVideos().size()"+message,3,((ArrayList)getVideos.invoke(check)).size());
            Assert.assertEquals("rented().size()"+message,5,((ArrayList)rented.invoke(check)).size());
            Assert.assertEquals("gamesInStock().size()"+message,0,((ArrayList)gamesInStock.invoke(check)).size());
            Assert.assertEquals("videosInStock().size()"+message,1,((ArrayList)videosInStock.invoke(check)).size());
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }
}
