package A11.CG2;

import java.util.ArrayList;
/* th
START AT END OF list1
iter thru list2 (as toRemove from ch4)
iter1 thru list1

find all instances of the target before switching targets~
if ITER VALUE matches ITERone = therefore is a target...
... then REMOVE current ITER in toRemove
move to next toRemove iter and repeat
*/
// **********************************************
/*
tully method:*****
iter forward thru list1
if list2 contains current iter
save it to a var,,, marking it as a target
then iter-- to recalc the position (to not skip #s)

iter backwards thru list2
if target found remove it

iter backwards thru list1
if target found remove it
*/
public class A11_CH5 {
    /*public static void removeShared(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        boolean removed = false;
        // iter thru list2 (toremove)...
        for (int iter1 = list2.size() - 1; iter1 >= 0; iter1--) {

            // iter thru list1 (numbers)...
            for (int iter = list1.size() - 1; iter >= 0; iter--) {

                // if the current iter element is a target from toRemove...
                if (list1.get(iter) == list2.get(iter1)) {
                    // terminate it!!!~
                    list1.remove(iter);
                    removed = true;
                }
            }
            // after list1 all checked,,, if the value was found in list1 remove it from list 2
            if (removed) {
                list2.remove(iter1);
            }
        }
    }*/
    public static void removeShared(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for (int iter = 0; iter >= list1.size(); iter++) {
            if (list2.contains(list1.get(iter))) {
                int target = list1.get(iter);
                iter--;
                for (int iter1 = list1.size() - 1; iter1 >= 0; iter1--) {

                }
            }
        }
    }
}
