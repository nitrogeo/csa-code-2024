package A12.CG1;

public class Mage extends A12_GameCharacter {
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
    Mage(String characterName, int hitPoints, int magicPoints, int spellShieldCost, int spellShieldAbsorbAmount) {
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
        getMagicPoints() += gain;
    }

    @Override
    public void takeDamage(int damage) {
        if (magicPoints >= spellShieldCost) {
            // the damage is reduced by spellShieldAbsorbAmount (to a minimum 0)
            if (damage - spellShieldAbsorbAmount < 0) {
                damage = 0;
            }
            else {
                damage -= spellShieldAbsorbAmount;
            }

            magicPoints - spellShieldCost;
            super.takeDamage(damage);
        }
    }
}