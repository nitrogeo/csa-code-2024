package A12.L1.ZombieDice;

public class A12_ZombieDiceBucket {
    // attributes
    private ArrayList<ZombieDie> bucket;

    // constructors
    ZombieDiceBucket() {
        new bucket;
        xyz
    }

    // methods
    void loadBucket() {
        bucket.clear();
        bucket.add(A12_GreenZombieDie, A12_GreenZombieDie, A12_GreenZombieDie, A12_GreenZombieDie, A12_GreenZombieDie, A12_GreenZombieDie, A12_YellowZombieDie, A12_YellowZombieDie, A12_YellowZombieDie, A12_YellowZombieDie,A12_RedZombieDie, A12_RedZombieDie, A12_RedZombieDie);
    }
    ZombieDie draw() {
        if (!bucket.isEmpty()) {
            int result = (int)(Math.random() * dice.size());
            return result;
        }
    }
}
