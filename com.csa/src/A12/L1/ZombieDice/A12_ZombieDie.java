package A12.L1.ZombieDice;

public class A12_ZombieDie {
    public static final int NOT_ROLLED = 0;
    public static final int RUNNER = 1;
    public static final int BRAIN = 2;
    public static final int SHOT = 3;
    public static final int RED = 1;
    public static final int GREEN = 2;
    public static final int YELLOW = 3;

    private int dieColor;
    private int value;

    // constructors
    ZombieDie(int dieColor) {
       this.dieColor = dieColor;
       die = 0;
    }

    // methods
    int getValue() {
        return value;
    }
    int getDieColor() {
        return dieColor;
    }
    void setDieColor(int dieColor) {
        this.dieColor = dieColor;
    }
    void setValue(int value) {
        this.value = value;
    }
    String toString() {
        if (dice != 0) {
            System.out.print(die.dieColor);
        }
        else {
            System.out.print(die.dieColor);
        }
    }

}
