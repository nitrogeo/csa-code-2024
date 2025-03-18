package A12.CG1;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class A12_Mage_Tests
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
            Class<?> classRef = Class.forName(generateClassName("A12_Mage"));
            Method getCharacterName = classRef.getMethod("getCharacterName");
            Method getHitPoints = classRef.getMethod("getHitPoints");
            Method getMagicPoints = classRef.getMethod("getMagicPoints");
            Method getSpellShieldCost = classRef.getMethod("getSpellShieldCost");
            Method getSpellShieldAbsorbAmount = classRef.getMethod("getSpellShieldAbsorbAmount");

            Object check = classRef.getConstructor(String.class,int.class,int.class,int.class,int.class).newInstance("Jane",15,10,3,2);

            Assert.assertEquals("getCharacterName() failed after creation","Jane",getCharacterName.invoke(check));
            Assert.assertEquals("getHitPoints() failed after creation",15,getHitPoints.invoke(check));
            Assert.assertEquals("getMagicPoints() failed after creation",10,getMagicPoints.invoke(check));
            Assert.assertEquals("getSpellShieldCost() failed after creation",3,getSpellShieldCost.invoke(check));
            Assert.assertEquals("getSpellShieldAbsorbAmount() failed after creation",2,getSpellShieldAbsorbAmount.invoke(check));

        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test2() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("A12_Mage"));
            Method getCharacterName = classRef.getMethod("getCharacterName");
            Method getHitPoints = classRef.getMethod("getHitPoints");
            Method getMagicPoints = classRef.getMethod("getMagicPoints");
            Method getSpellShieldCost = classRef.getMethod("getSpellShieldCost");
            Method getSpellShieldAbsorbAmount = classRef.getMethod("getSpellShieldAbsorbAmount");

            Object check = classRef.getConstructor(String.class,int.class,int.class,int.class,int.class).newInstance("Gandolf",100,100,25,5);

            Assert.assertEquals("getCharacterName() failed after creation","Gandolf",getCharacterName.invoke(check));
            Assert.assertEquals("getHitPoints() failed after creation",100,getHitPoints.invoke(check));
            Assert.assertEquals("getMagicPoints() failed after creation",100,getMagicPoints.invoke(check));
            Assert.assertEquals("getSpellShieldCost() failed after creation",25,getSpellShieldCost.invoke(check));
            Assert.assertEquals("getSpellShieldAbsorbAmount() failed after creation",5,getSpellShieldAbsorbAmount.invoke(check));

        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test3() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("A12_Mage"));
            Method getHitPoints = classRef.getMethod("getHitPoints");
            Method getMagicPoints = classRef.getMethod("getMagicPoints");
            Method takeDamage = classRef.getMethod("takeDamage",int.class);

            Object check = classRef.getConstructor(String.class,int.class,int.class,int.class,int.class).newInstance("Billy",10,5,3,2);

            takeDamage.invoke(check,8);
            Assert.assertEquals("TakeDamage did not correctly reduce damage from the spell shield",4,getHitPoints.invoke(check));
            Assert.assertEquals("TakeDamage did not correctly reduce magicPoints after shielding",2,getMagicPoints.invoke(check));
        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test4() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("A12_Mage"));
            Method getHitPoints = classRef.getMethod("getHitPoints");
            Method getMagicPoints = classRef.getMethod("getMagicPoints");
            Method takeDamage = classRef.getMethod("takeDamage",int.class);

            Object check = classRef.getConstructor(String.class,int.class,int.class,int.class,int.class).newInstance("Billy",10,5,6,2);

            takeDamage.invoke(check,8);
            Assert.assertEquals("TakeDamage did not correctly reduce damage from the spell shield",2,getHitPoints.invoke(check));
            Assert.assertEquals("TakeDamage did not correctly reduce magicPoints after shielding",5,getMagicPoints.invoke(check));


        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test5() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("A12_Mage"));
            Method getHitPoints = classRef.getMethod("getHitPoints");
            Method getMagicPoints = classRef.getMethod("getMagicPoints");
            Method takeDamage = classRef.getMethod("takeDamage",int.class);

            Object check = classRef.getConstructor(String.class,int.class,int.class,int.class,int.class).newInstance("Ted",10,5,2,2);

            takeDamage.invoke(check,1);
            Assert.assertEquals("TakeDamage did not correctly reduce damage from the spell shield",10,getHitPoints.invoke(check));
            Assert.assertEquals("TakeDamage did not correctly reduce magicPoints after shielding",3,getMagicPoints.invoke(check));


        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test6() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("A12_Mage"));
            Method getMagicPoints = classRef.getMethod("getMagicPoints");
            Method drinkManaPotion = classRef.getMethod("drinkManaPotion",int.class);

            Object check = classRef.getConstructor(String.class,int.class,int.class,int.class,int.class).newInstance("Billy",10,5,2,2);

            drinkManaPotion.invoke(check,3);
            Assert.assertEquals("drinkManaPotion did not correctly increase magicPoints",8,getMagicPoints.invoke(check));

        }
        catch ( InvocationTargetException e )
        {
            throw (Exception) e.getCause();
        }
    }

}
