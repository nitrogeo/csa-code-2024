package A12.CG1;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class A12_Thief_Tests
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
            Class<?> classRef = Class.forName(generateClassName("A12_Thief"));
            Method getCharacterName = classRef.getMethod("getCharacterName");
            Method getHitPoints = classRef.getMethod("getHitPoints");
            Method getMagicPoints = classRef.getMethod("getMagicPoints");
            Method getStealthPoints = classRef.getMethod("getStealthPoints");
            Method getInventoryWeight = classRef.getMethod("getInventoryWeight");
            Method stealthAbility = classRef.getMethod("stealthAbility");

            Object check = classRef.getConstructor(String.class,int.class,int.class,int.class).newInstance("Jane",15,8,2);

            Assert.assertEquals("getCharacterName() failed after creation","Jane",getCharacterName.invoke(check));
            Assert.assertEquals("getHitPoints() failed after creation",15,getHitPoints.invoke(check));
            Assert.assertEquals("getMagicPoints() failed after creation",0,getMagicPoints.invoke(check));
            Assert.assertEquals("getStealthPoints() failed after creation",8,getStealthPoints.invoke(check));
            Assert.assertEquals("getInventoryWeight() failed after creation",2,getInventoryWeight.invoke(check));
            Assert.assertEquals("stealthAbility() failed after creation",7,stealthAbility.invoke(check));
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test2() throws Exception {
        try {
            try {
                Class<?> classRef = Class.forName(generateClassName("A12_Thief"));
                Method getCharacterName = classRef.getMethod("getCharacterName");
                Method getHitPoints = classRef.getMethod("getHitPoints");
                Method getMagicPoints = classRef.getMethod("getMagicPoints");
                Method getStealthPoints = classRef.getMethod("getStealthPoints");
                Method getInventoryWeight = classRef.getMethod("getInventoryWeight");
                Method stealthAbility = classRef.getMethod("stealthAbility");

                Object check = classRef.getConstructor(String.class,int.class,int.class,int.class).newInstance("Bilbo",12,10,5);

                Assert.assertEquals("getCharacterName() failed after creation","Bilbo",getCharacterName.invoke(check));
                Assert.assertEquals("getHitPoints() failed after creation",12,getHitPoints.invoke(check));
                Assert.assertEquals("getMagicPoints() failed after creation",0,getMagicPoints.invoke(check));
                Assert.assertEquals("getStealthPoints() failed after creation",10,getStealthPoints.invoke(check));
                Assert.assertEquals("getInventoryWeight() failed after creation",5,getInventoryWeight.invoke(check));
                Assert.assertEquals("stealthAbility() failed after creation",8,stealthAbility.invoke(check));
            }
            catch ( InvocationTargetException e )
            {
                throw (Exception) e.getCause();
            }
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test3() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("A12_Thief"));
            Method getHitPoints = classRef.getMethod("getHitPoints");
            Method takeDamage = classRef.getMethod("takeDamage",int.class);

            Object check = classRef.getConstructor(String.class,int.class,int.class,int.class).newInstance("Bilbo",12,10,5);

            takeDamage.invoke(check,10);
            Assert.assertEquals("TakeDamage did not correctly reduce the incoming damage",10,getHitPoints.invoke(check));
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test4() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("A12_Thief"));
            Method getHitPoints = classRef.getMethod("getHitPoints");
            Method takeDamage = classRef.getMethod("takeDamage",int.class);

            Object check = classRef.getConstructor(String.class,int.class,int.class,int.class).newInstance("James",10,6,12);

            takeDamage.invoke(check,8);
            Assert.assertEquals("TakeDamage did not correctly reduce the incoming damage",2,getHitPoints.invoke(check));
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test5() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("A12_Thief"));
            Method getHitPoints = classRef.getMethod("getHitPoints");
            Method takeDamage = classRef.getMethod("takeDamage",int.class);

            Object check = classRef.getConstructor(String.class,int.class,int.class,int.class).newInstance("Tina",15,6,1);

            takeDamage.invoke(check,1);
            Assert.assertEquals("TakeDamage did not correctly reduce the incoming damage",15,getHitPoints.invoke(check));
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test6() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("A12_Thief"));
            Method getHitPoints = classRef.getMethod("getHitPoints");
            Method takeDamage = classRef.getMethod("takeDamage",int.class);

            Object check = classRef.getConstructor(String.class,int.class,int.class,int.class).newInstance("Bilbo",12,10,0);

            takeDamage.invoke(check,3);
            Assert.assertEquals("TakeDamage did not correctly reduce the incoming damage",12,getHitPoints.invoke(check));
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

}
