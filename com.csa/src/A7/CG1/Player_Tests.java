package A7.CG1;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Player_Tests {
    public String generateClassName(String name) {
        if (getClass().toString().contains(".")) {
            return getClass().toString().substring(6, getClass().toString().lastIndexOf(".") + 1) + name;
        }
        return name;
    }

    @Test(timeout = 250)
    public void test1() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("Player"));
            Method getUserName = classRef.getMethod("getUserName");
            Method getExperience = classRef.getMethod("getExperience");
            Method getLevel = classRef.getMethod("getLevel");
            Method getStrength = classRef.getMethod("getStrength");
            Method getDexterity = classRef.getMethod("getDexterity");
            Method armorClass = classRef.getMethod("armorClass");

            Object player = classRef.getConstructor().newInstance();

            Assert.assertEquals("getUsername(), failed after default constructor", "Bobbob", getUserName.invoke(player));
            Assert.assertEquals("getExperience(), failed after default constructor", 0, getExperience.invoke(player));
            Assert.assertEquals("getLevel(), failed after default constructor", 1, getLevel.invoke(player));
            Assert.assertEquals("getStrength(), failed after default constructor", 10, getStrength.invoke(player));
            Assert.assertEquals("getDexterity(), failed after default constructor", 10, getDexterity.invoke(player));
            Assert.assertEquals("armorClass(), failed after default constructor", 10, armorClass.invoke(player));
        } catch (InvocationTargetException e) {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test2() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("Player"));
            Method getUserName = classRef.getMethod("getUserName");
            Method getExperience = classRef.getMethod("getExperience");
            Method getLevel = classRef.getMethod("getLevel");
            Method getStrength = classRef.getMethod("getStrength");
            Method getDexterity = classRef.getMethod("getDexterity");
            Method armorClass = classRef.getMethod("armorClass");

            Object player1 = classRef.getConstructor(String.class, int.class, int.class, int.class, int.class).newInstance
                    ("Glugbub", 1000, 3, 16, 14);
            Object player2 = classRef.getConstructor(String.class, int.class, int.class, int.class, int.class).newInstance
                    ("James", 4, 4, 4, 4);


            Assert.assertEquals("getUsername(), failed after constructing two different players", "Glugbub", getUserName.invoke(player1));
            Assert.assertEquals("getExperience(), failed after constructing two different players", 1000, getExperience.invoke(player1));
            Assert.assertEquals("getLevel(), failed after constructing two different players", 3, getLevel.invoke(player1));
            Assert.assertEquals("getStrength(), failed after constructing two different players", 16, getStrength.invoke(player1));
            Assert.assertEquals("getDexterity(), failed after constructing two different players", 14, getDexterity.invoke(player1));
            Assert.assertEquals("armorClass(), failed after constructing two different players", 12, armorClass.invoke(player1));

            Assert.assertEquals("getUsername(), failed after constructing two different players", "James", getUserName.invoke(player2));
            Assert.assertEquals("getExperience(), failed after constructing two different players", 4, getExperience.invoke(player2));
            Assert.assertEquals("getLevel(), failed after constructing two different players", 4, getLevel.invoke(player2));
            Assert.assertEquals("getStrength(), failed after constructing two different players", 4, getStrength.invoke(player2));
            Assert.assertEquals("getDexterity(), failed after constructing two different players", 4, getDexterity.invoke(player2));
            Assert.assertEquals("armorClass(), failed after constructing two different players", 10, armorClass.invoke(player2));
        } catch (InvocationTargetException e) {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test3() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("Player"));
            Method getUserName = classRef.getMethod("getUserName");
            Method getExperience = classRef.getMethod("getExperience");
            Method getLevel = classRef.getMethod("getLevel");
            Method getStrength = classRef.getMethod("getStrength");
            Method getDexterity = classRef.getMethod("getDexterity");
            Method armorClass = classRef.getMethod("armorClass");

            Object player = classRef.getConstructor(String.class, int.class, int.class, int.class, int.class).newInstance
                    ("Glugbub", 1000, 3, 16, 14);


            Assert.assertEquals("getUsername(), failed after default constructor", "Glugbub", getUserName.invoke(player));
            Assert.assertEquals("getExperience(), failed after default constructor", 1000, getExperience.invoke(player));
            Assert.assertEquals("getLevel(), failed after default constructor", 3, getLevel.invoke(player));
            Assert.assertEquals("getStrength(), failed after default constructor", 16, getStrength.invoke(player));
            Assert.assertEquals("getDexterity(), failed after default constructor", 14, getDexterity.invoke(player));
            Assert.assertEquals("armorClass(), failed after default constructor", 12, armorClass.invoke(player));
        } catch (InvocationTargetException e) {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test4() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("Player"));
            Method getUserName = classRef.getMethod("getUserName");
            Method getExperience = classRef.getMethod("getExperience");
            Method getLevel = classRef.getMethod("getLevel");
            Method getStrength = classRef.getMethod("getStrength");
            Method getDexterity = classRef.getMethod("getDexterity");
            Method armorClass = classRef.getMethod("armorClass");

            Object player = classRef.getConstructor(String.class, int.class, int.class, int.class, int.class).newInstance
                    ("Harry", 5000, 5, 18, 16);

            Assert.assertEquals("getUsername(), failed after default constructor", "Harry", getUserName.invoke(player));
            Assert.assertEquals("getExperience(), failed after default constructor", 5000, getExperience.invoke(player));
            Assert.assertEquals("getLevel(), failed after default constructor", 5, getLevel.invoke(player));
            Assert.assertEquals("getStrength(), failed after default constructor", 18, getStrength.invoke(player));
            Assert.assertEquals("getDexterity(), failed after default constructor", 16, getDexterity.invoke(player));
            Assert.assertEquals("armorClass(), failed after default constructor", 13, armorClass.invoke(player));
        } catch (InvocationTargetException e) {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test5() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("Player"));
            Method setExperience = classRef.getMethod("setExperience",int.class);
            Method getExperience = classRef.getMethod("getExperience");


            Object player = classRef.getConstructor(String.class, int.class, int.class, int.class, int.class).newInstance
                    ("Harry", 5000, 5, 18, 16);
            setExperience.invoke(player,10000);
            Assert.assertEquals("getExperience(), failed after changing the experience", 10000, getExperience.invoke(player));

        } catch (InvocationTargetException e) {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test6() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("Player"));

            Method getLevel = classRef.getMethod("getLevel");
            Method setLevel = classRef.getMethod("setLevel",int.class);


            Object player = classRef.getConstructor(String.class, int.class, int.class, int.class, int.class).newInstance
                    ("Harry", 5000, 5, 18, 16);
            setLevel.invoke(player,2);
            Assert.assertEquals("getLevel(), failed after changing the level", 2, getLevel.invoke(player));

        } catch (InvocationTargetException e) {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test7() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("Player"));

            Method getStrength = classRef.getMethod("getStrength");
            Method setStrength = classRef.getMethod("setStrength",int.class);


            Object player = classRef.getConstructor(String.class, int.class, int.class, int.class, int.class).newInstance
                    ("Harry", 5000, 5, 18, 16);
            setStrength.invoke(player,14);
            Assert.assertEquals("getStrength(), failed after changing the strength", 14, getStrength.invoke(player));

        } catch (InvocationTargetException e) {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test8() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("Player"));
            Method getDexterity = classRef.getMethod("getDexterity");
            Method setDexterity = classRef.getMethod("setDexterity",int.class);
            Method armorClass = classRef.getMethod("armorClass");

            Object player = classRef.getConstructor(String.class, int.class, int.class, int.class, int.class).newInstance
                    ("Harry", 5000, 5, 18, 16);
            setDexterity.invoke(player,18);
            Assert.assertEquals("getDexterity(), failed after changing the dexterity", 18, getDexterity.invoke(player));
            Assert.assertEquals("armorClass(), failed after changing the dexterity", 14, armorClass.invoke(player));

        } catch (InvocationTargetException e) {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test9() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("Player"));
            Method toString = classRef.getMethod("toString");

            Object player = classRef.getConstructor(String.class, int.class, int.class, int.class, int.class).newInstance
                    ("DarthVictus", 500, 2, 14, 12);
            String expected = "Character: DarthVictus\nLevel: 2\nExperience: 500\nStrength: 14\nDexterity: 12\nArmor Class: 11";
            Assert.assertEquals("toString(), failed after using the non-default constructor", expected.trim(), toString.invoke(player));

        } catch (InvocationTargetException e) {
            throw (Exception) e.getCause();
        }
    }

    @Test(timeout = 250)
    public void test10() throws Exception {
        try {
            Class<?> classRef = Class.forName(generateClassName("Player"));
            Method toString = classRef.getMethod("toString");

            Object player = classRef.getConstructor(String.class, int.class, int.class, int.class, int.class).newInstance
                    ("Bobbob", 0, 1, 10, 10);
            String s = "Character: Bobbob\nLevel: 1\nExperience: 0\nStrength: 10\nDexterity: 10\nArmor Class: 10";
            Assert.assertEquals("toString(), failed after using the non-default constructor", s.trim(), toString.invoke(player));

        } catch (InvocationTargetException e) {
            throw (Exception) e.getCause();
        }
    }

}

