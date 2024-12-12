package A7.CG1;

public class Player { // contains attributes
    String userName;
    int experience;
    int level;
    int strength;
    int dexterity;
    int armorClass;

    public Player() { // constructor
        userName = "Bobbob";
        experience = 0;
        level = 1;
        strength = 10;
        dexterity= 10;
    } // if static cant use outside variables

    public Player(String userName, int experience, int level, int strength, int dexterity) { // constructor
        this.userName = userName; // sets the variable given to the method to this.var; u only need this. if its a parameter with same exact name
        this.experience = experience;
        this.level = level;
        this.strength = strength;
        this.dexterity = dexterity;
    }


    // methods below
    public String getUserName() {
        return userName;
    }
    public int getExperience() {
        return experience;
    }
    public int getLevel() {
        return level;
    }
    public int getStrength() {
        return strength;
    }
    public int getDexterity() {
        return dexterity;
    }
    public int armorClass() { // Returns the calculated armor class using the formula: 10 + ((dexterity – 10)/2) with a minimum armor class of 10
        if ((10 + ((dexterity - 10)/2)) <= 10){
            return 10;
        }
        else {
            return (10 + ( (dexterity - 10)/2));
        }
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public void setExperience(int experience) {
        this.experience = experience;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public void setStrength(int strength) {
        this.strength = strength;
    }
    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }
    public String toString() { // this.var references attribute when method has variable of same name
        String text = "";
        text += ("Character: " + userName);
        text += ("\nLevel: " + level);
        text += ("\nExperience: " + experience);
        text += ("\nStrength: " + strength);
        text += ("\nDexterity: " + dexterity);
        text += ("\nArmor Class: " + armorClass());
        return text;
    }
}
