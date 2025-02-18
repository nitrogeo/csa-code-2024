package A11.CG1;

import java.util.ArrayList;

// make right ans and replace the indx with the right ans
/*
iter thru array
make current index tester
iter thru variable and if iter is capital add it to saver
make saver the current text iteration
*/

public class A11_CH3 {
    public static void capitals(ArrayList<String> text) {
        String stringtesta = "";
        String stringsaver = "";
        String caps = "QWERTYUIOPASDFGHJKLZXCVBNM";
        for (int iter = 0; iter < text.size(); iter++) {
            stringtesta = text.get(iter);

            for (int iter1 = 0; iter1 < stringtesta.length(); iter1++) {
                if (caps.contains("" + stringtesta.charAt(iter1))) {
                    stringsaver+=stringtesta.charAt(iter1);
                }
            }
            text.set(iter, stringsaver);
            stringsaver = "";
        }
    }
}
