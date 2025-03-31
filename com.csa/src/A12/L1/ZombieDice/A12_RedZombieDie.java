package A12.L1.ZombieDice;

public class A12_RedZombieDie extends A12_ZombieDie {
    // constructors
    A12_RedZombieDie() {
        super.RED;
    }

    // methods
    void roll() {
        Arraylist<Integer> dice  = [1, 1, 2, 3, 3, 3];
        int result = (int)(Math.random() * dice.size());
        return result;
    }
}
