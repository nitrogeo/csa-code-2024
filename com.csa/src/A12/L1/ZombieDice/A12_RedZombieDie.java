package A12.L1.ZombieDice;

public class A12_RedZombieDie extends A12_ZombieDie {
    // constructors
    public A12_RedZombieDie() {
        super(GREEN);
    }

    // methods
    public void roll() {
        // these could be the numbers OR the names
        int[] dice = new int[]{1, 1, 2, 2, 2, 3};
        setValue(dice[(int)(Math.random() * dice.length)]);
    }
}
