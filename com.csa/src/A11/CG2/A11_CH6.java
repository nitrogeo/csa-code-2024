package A11.CG2;

import java.util.ArrayList;

/*
make new arraylist
iter thru list 1
check if alr in arraylist
if not add to arraylist
iter thru list 2
do same

done 12:36 pm 2.19.2025
*/

public class A11_CH6 {
    public static ArrayList<Integer> merge(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> match3 = new ArrayList<Integer>();

        for (int iter = 0; iter < list1.size(); iter++) {
            if (match3.contains(list1.get(iter))) {
                continue;
            } else {
                match3.add(list1.get(iter));
            }
        }
        for (int iter = 0; iter < list2.size(); iter++) {
            if (match3.contains(list2.get(iter))) {
                continue;
            } else {
                match3.add(list2.get(iter));
            }
        }
        return match3;
    }
}
