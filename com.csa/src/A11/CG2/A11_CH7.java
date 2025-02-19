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
*/

import java.util.ArrayList;

public class A11_CH7 {
    public static ArrayList<Integer> intersect(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> list1b = new ArrayList<Integer>();
        ArrayList<Integer> list2b = new ArrayList<Integer>();
        ArrayList<Integer> match3 = new ArrayList<Integer>();

        // ch5
        for (int iter = 0; iter < list1.size(); iter++) {
            if (list2.contains(list1.get(iter))) {
                int target = list1.get(iter);
                iter--;
                for (int iter1 = list2.size() - 1; iter1 >= 0; iter1--) {
                    if (list2.get(iter1) == target) {
                        list2b.add(list2.get(iter1));
                    }
                }
                for (int iter1 = list1.size() - 1; iter1 >= 0; iter1--) {
                    if (list1.get(iter1) == target) {
                        list1b.add(list2.get(iter1));
                    }
                }
            }
        }

        // ch6
        for (int iter = 0; iter < list1b.size(); iter++) {
            if (match3.contains(list1b.get(iter))) {
                continue;
            } else {
                match3.add(list1b.get(iter));
            }
        }
        for (int iter = 0; iter < list2b.size(); iter++) {
            if (match3.contains(list2b.get(iter))) {
                continue;
            } else {
                match3.add(list2b.get(iter));
            }
        }
        return match3;
    }
}
