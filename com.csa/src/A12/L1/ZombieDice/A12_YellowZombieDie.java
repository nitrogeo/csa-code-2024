package A12.L1.ZombieDice;

public class A12_YellowZombieDie {
    // constructors
    A12_YellowZombieDie() {
        super.YELLOW;
    }

    // methods
    void roll() {
        Arraylist<Integer> dice  = [1, 1, 2, 2, 3, 3];
        int result = (int)(Math.random() * dice.size());
        return result;
    }
}
