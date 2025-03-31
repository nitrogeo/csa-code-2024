package A12.L1.ZombieDice;

public class A12_YellowZombieDie extends A12_ZombieDie {
    // constructors
    public A12_YellowZombieDie() {
        super(YELLOW);
    }

    // methods
    public void roll() {
        int[] dice = new int[]{1, 1, 2, 2, 2, 3};
        setValue(dice[(int)(Math.random() * dice.length)]);
    }
}
