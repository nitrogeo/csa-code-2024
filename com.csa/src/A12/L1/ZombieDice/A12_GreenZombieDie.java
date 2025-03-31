package A12.L1.ZombieDice;

public class A12_GreenZombieDie {
     // constructors
    A12_GreenZombieDie() {
        super.GREEN;
    }

    // methods
    void roll() {
        Arraylist<Integer> dice  = [1, 1, 2, 2, 2, 3];
        int result = (int)(Math.random() * dice.size());
        return result;
    }
}
