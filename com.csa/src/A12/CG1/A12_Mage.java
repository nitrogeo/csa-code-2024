package A12.CG1;

// done 9:09 pm 3.17

public class A12_Mage extends A12_GameCharacter {
    // attributes
    public static int spellShieldCost;
    public static int spellShieldAbsorbAmount;
    /*
    THIS IS NOT REQ'd
    super.characterName = characterName;
    super.hitPoints = hitPoints;
    super.maqicPoints = magicPoints;
    */

    // constructors
    public A12_Mage(String characterName, int hitPoints, int magicPoints, int spellShieldCost, int spellShieldAbsorbAmount) {
        super(characterName, hitPoints, magicPoints);

        this.spellShieldCost = spellShieldCost;
        this.spellShieldAbsorbAmount = spellShieldAbsorbAmount;
    }

    // methods
    public static int getSpellShieldCost() {
        return spellShieldCost;
    }
    public static int getSpellShieldAbsorbAmount() {
        return spellShieldAbsorbAmount;
    }
    void setSpellShieldCost(int spellShieldCost) {
        this.spellShieldCost = spellShieldCost;
    }
    void setSpellShieldAbsorbAmount(int spellShieldAbsorbAmount) {
        this.spellShieldAbsorbAmount = spellShieldAbsorbAmount;
    }
    public void drinkManaPotion(int gain) {
        int mp = getMagicPoints();
        mp += gain;
        setMagicPoints(mp);
    }

    @Override
    public void takeDamage(int damage) {
        int newdamage = damage;
        int mp = getMagicPoints();
        //if mp greater or equal to speelshieldcost
        if (getMagicPoints() >= spellShieldCost) {
            // the damage is reduced by spellShieldAbsorbAmount (to a minimum 0)
            // minimum 0
            if ((newdamage - spellShieldAbsorbAmount) < 0) {
                newdamage = 0;
            }
            // above 0
            else {
                newdamage -= spellShieldAbsorbAmount;
            }

            // mp reduced by ssc
            mp -= spellShieldCost;
            setMagicPoints(mp);

            // hp - newdamage
            super.takeDamage(newdamage);
            // i.e. `hp - newdamage;`
        }
        // if mp too low
        else {
            /*// if mp too low
            if ((mp -= spellShieldCost) < 0) {

            }
            // if mp not too low
            else {
                mp -= spellShieldCost;
                setMagicPoints(mp);
                super.takeDamage(newdamage);

                // questions: how to fix zonbie test and whhy not pass tests*/

            // mage takes full damage
            super.takeDamage(newdamage);
        }
    }
}