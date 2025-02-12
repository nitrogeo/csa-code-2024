package A11.CG1;

import java.util.ArrayList;

public class A11_CH1 {
    public static int totals(ArrayList<Integer> numbers) {
        int t = 0;
        for (Integer x : numbers) {
            t += x;
        }
        return t;
    }
}

