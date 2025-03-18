package A12.CG1;

// finished 9:34pm 3.17

public class A12_Thief extends A12.CG1.A12_GameCharacter {
    // attributes
    public static int stealthPoints;
    public static int inventoryWeight;

    // constructors
    public A12_Thief(String characterName, int hitPoints, int stealthPoints, int inventoryWeight) {
        super(characterName, hitPoints, stealthPoints);

        this.stealthPoints = stealthPoints;
        this.inventoryWeight = inventoryWeight;
        setMagicPoints(0);
    }

    // methods
    public static int getStealthPoints() {
        return stealthPoints;
    }
    public static int getInventoryWeight() {
        return inventoryWeight;
    }
    void setStealthPoints(int stealthPoints) {
        this.stealthPoints = stealthPoints;
    }
    void setInventoryWeight(int inventoryWeight) {
        this.inventoryWeight = inventoryWeight;
    }
    public static int stealthAbility () {
        // niw = new inventoryWeight (after rounded + halved)
        // riw = NEWER inventoryWeight (rounded + halved AND 0 check)
        double niw = Math.floor(0.5 * inventoryWeight);
        double riw = 0;
        // minimum 0
        if ((0.5 * niw) < 0) {
            riw = 0;
        }
        // above 0
        else {
            riw = niw;
        }
        return (int) (stealthPoints - Math.max(0, riw));
    }
    @Override
    public void takeDamage(int damage) {
        int newdamage = damage;
        int save = stealthAbility();

        // at minimum 0
        if ((newdamage - save) < 0) {
            newdamage = 0;
        }
        // above 0
        else {
            newdamage -= save;
        }

        if (newdamage != 0) {
            super.takeDamage(newdamage);
            // i.e. `hp - newdamage;`
        }
    }
}
