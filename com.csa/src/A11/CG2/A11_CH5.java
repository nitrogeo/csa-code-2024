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
public class A11_CH5 {
    public static void removeShared(ArrayList<Integer> list1, ArrayList<Integer> list2) {

        // iter thru list2 (toremove)...
        for (int iter1 = list2.size() - 1; iter1 >= 0; iter1--) {

            // iter thru list1 (numbrs)...
            for (int iter = list1.size() - 1; iter >= 0; iter--) {

                // if the current iter element is a target from toRemove...
                if (list1.get(iter) == list2.get(iter)) {
                    // terminate it!!!~
                    list1.remove(iter);
                    list2.remove(iter);
                }
            }
        }
    }
}
