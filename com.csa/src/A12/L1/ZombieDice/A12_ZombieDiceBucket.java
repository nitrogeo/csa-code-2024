package A12.L1.ZombieDice;

import java.util.ArrayList;

public class A12_ZombieDiceBucket {
    // attributes
    private ArrayList<A12_ZombieDie> bucket;

    // constructors
    public A12_ZombieDiceBucket() {
        bucket = new ArrayList<A12_ZombieDie>();
        loadBucket();
    }

    // methods
    public void loadBucket() {
        bucket.clear();
        bucket.add(new A12_GreenZombieDie());
        bucket.add(new A12_GreenZombieDie());
        bucket.add(new A12_GreenZombieDie());
        bucket.add(new A12_GreenZombieDie());
        bucket.add(new A12_GreenZombieDie());
        bucket.add(new A12_GreenZombieDie());

        bucket.add(new A12_YellowZombieDie());
        bucket.add(new A12_YellowZombieDie());
        bucket.add(new A12_YellowZombieDie());
        bucket.add(new A12_YellowZombieDie());

        bucket.add(new A12_RedZombieDie());
        bucket.add(new A12_RedZombieDie());
        bucket.add(new A12_RedZombieDie());
    }
    public A12_ZombieDie draw() {
        if (!bucket.isEmpty()) {
            return bucket.remove((int) (int)(Math.random() * bucket.size()));
        }
        else {
            return null;
        }
    }

}
