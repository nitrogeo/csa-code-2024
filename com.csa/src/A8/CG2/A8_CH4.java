package A8.CG2;

/* pseudocode

***************** note: array[var] gets the index val. var gets char val. *****************

make a new array called coj and make its length the total of list1 and 2's lengths

iterate thru list 1 and list 2 making list 1's [0] coj's [0] and so on:
iterperm is the iter list1 ends on
list2 needs to add onto that: start at iterPerm for coj and at iter=0 for list2
make the number after iterperm be list2's 1st number

*/

public class A8_CH4 {
    public static double[] join(double[] list1, double[] list2) {
        double[] coj = new double[list1.length + list2.length];
        // int max1 = list1.length;
        int iterPerm = 0;
        int iterPermPlus = 0;
        int iterPerm2x = 0;
        // iterate thru list1 and make coj = list1
        for (int iter = 0; iter < list1.length; iter++) {
            coj[iter] = list1[iter];
            iterPerm = iter;
        }
        // iterate thru list2 and put the values ON TOP OF the list1 copy in coj ; i.e. ON TOP OF iterPerm
        // a var should save (iterPerm + 1) to start the iteration and then increase +1 after to keep coj 1 step ahead (lol nikoavocado) of list2
        // list2's iter should start at 0 and inc +1 every time to stay 1 step behind (lol) coj
        iterPermPlus = iterPerm + 1;
        for (int iter = 0; iterPermPlus <= (list2.length + iterPerm); iterPermPlus++, iter++) {
            coj[iterPermPlus] = list2[iter];
        }
        return coj;
    }
}
