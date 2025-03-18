package A12.CG1;

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
    void drinkManaPotion(int gain) {
        int mp = getMagicPoints();
        mp += gain;
    }

    @Override
    public void takeDamage(int damage) {
        int newdamage = 0;
        int mp = getMagicPoints();
        int hp = getHitPoints();
        if (getMagicPoints() >= spellShieldCost) {
            // the damage is reduced by spellShieldAbsorbAmount (to a minimum 0)
            if ((damage - spellShieldAbsorbAmount) < 0) {
                newdamage = 0;
            }
            else {
                newdamage -= spellShieldAbsorbAmount;
            }

            if ((mp -= spellShieldCost) < 0) {
                super.takeDamage(newdamage);
            }
            else {
                mp -= spellShieldCost;
                super.takeDamage(newdamage);

                // questions: how to fix zonbie test and whhy not pass tests
            }
        }
    }
}