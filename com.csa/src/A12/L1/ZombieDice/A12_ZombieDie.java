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
    public A12_ZombieDie(int dieColor) {
       this.dieColor = dieColor;
       value = NOT_ROLLED;
    }

    // methods
    public int getValue() {
        return value;
    }
    public int getDieColor() {
        return dieColor;
    }
    public void setDieColor(int dieColor) {
        this.dieColor = dieColor;
    }
    public void setValue(int value) {
        this.value = value;
    }
    public String toString() {
        if (value != NOT_ROLLED) {
            System.out.print("");
        }
        else {
            System.out.print(value.dieColor);
        }
    }

}
