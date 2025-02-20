package A11.CG2;

/*
inverse of ch5 (remove shared) combined with ch6 (merge)

ch5:
iter forward thru list1
if list2 contains current iter
save it to a var,,, marking it as a target
then iter-- to recalc the position (to not skip #s)

iter backwards thru list2
if target found add to arraylist

iter backwards thru list1
if target found add to arraylist

// done 12:28pm 2.20.2025!!! literally fixed list1b.add(list1.get(iter1)); and removed iter-- from ch5!!!
*/

import java.util.ArrayList;

public class A11_CH7 {
    public static ArrayList<Integer> intersect(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> list1b = new ArrayList<Integer>();
        ArrayList<Integer> list2b = new ArrayList<Integer>();
        ArrayList<Integer> match3 = new ArrayList<Integer>();

        // ch5
        // iters trhu list1
        for (int iter = 0; iter < list1.size(); iter++) {
            // if list2 contains current list1 value, make it a target and recalc pos
            if (list2.contains(list1.get(iter))) {
                int target = list1.get(iter);
                // iter backwards thru list2.
                // if the current value is the current target, add it to list 2b
                for (int iter1 = list2.size() - 1; iter1 >= 0; iter1--) {
                    if (list2.get(iter1) == target) {
                        list2b.add(list2.get(iter1));
                    }
                }
                // same but list1
                for (int iter1 = list1.size() - 1; iter1 >= 0; iter1--) {
                    if (list1.get(iter1) == target) {
                        list1b.add(list1.get(iter1));
                    }
                }
            }
        }

        // ch6
        // iter thru list1b. if match3 doesnt alr have its
        // current iter index value, add it to match3.
        // same for list2b.
        for (int iter = 0; iter < list1b.size(); iter++) {
            if (!match3.contains(list1b.get(iter))) {
                match3.add(list1b.get(iter));
            }
        }
        for (int iter = 0; iter < list2b.size(); iter++) {
            if (!match3.contains(list2b.get(iter))) {
                match3.add(list2b.get(iter));
            }
        }
        return match3;
    }
}
