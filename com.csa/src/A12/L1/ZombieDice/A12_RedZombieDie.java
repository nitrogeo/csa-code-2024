package A12.L1.ZombieDice;

public class A12_RedZombieDie extends A12_ZombieDie {
    // constructors
    public A12_RedZombieDie() {
        super(RED);
    }

    // methods
    public void roll() {
        // these could be the numbers OR the names
        int[] dice = new int[]{RUNNER, RUNNER, SHOT, SHOT, SHOT, BRAIN};
        setValue(dice[(int)(Math.random() * dice.length)]);
    }
}
