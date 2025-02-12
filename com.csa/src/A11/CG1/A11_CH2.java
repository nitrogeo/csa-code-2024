package A11.CG1;

import java.util.ArrayList;

public class A11_CH2 {
    public static int average(ArrayList<Integer> numbers) {
        int t = 0;
        for (Integer x : numbers) {
            t += x;
        }
        t /= numbers.size();
        return t;
    }
}
