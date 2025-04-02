package A12.L1.ZombieDice;

public class A12_GreenZombieDie extends A12_ZombieDie {
    // constructors
    public A12_GreenZombieDie() {
        super(GREEN);
    }

    // methods
    public void roll() {
        int[] dice = new int[]{RUNNER, RUNNER, BRAIN, BRAIN, BRAIN, SHOT};
        setValue(dice[(int)(Math.random() * dice.length)]);
    }
}
