package A11.CG1;

import java.util.ArrayList;
/* th
START AT END OF NUMBERS
iter thru numbers
iter1 thru toRemove
if ITER VALUE matches ITERone = therefore is a target...
... then REMOVE current ITER in toRemove
move to next toRemove iter and repeat

SCRATCH THAT outer forloop is toRemove
inner forloop is for numbers
this version finds all instances of the target before switching targets!~
YES IT WORKED 10:13 pm 2.14.2025
*/
public class A11_CH4 {
    public static void removeInts(ArrayList<Integer> numbers, int[] toRemove) {

        // iter thru toRemove...
        for (int iter1 = 0; iter1 < toRemove.length; iter1++) {

            // iter thru numbers...
            for (int iter = numbers.size() - 1; iter >= 0; iter--) {

                // if the current iter element is a target from toRemove...
                if (numbers.get(iter) == toRemove[iter1]) {
                    // terminate it!!!~
                    numbers.remove(iter);
                }
            }
        }
    }
}
