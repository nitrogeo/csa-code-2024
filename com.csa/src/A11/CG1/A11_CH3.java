package A11.CG1;

import java.util.ArrayList;

// make right ans and replace the indx with the right ans
/*
iter thru array
make current index crashtest
iter thru variable and if iter is capital add it to crashsave
*/

public class A11_CH3 {
    public static void capitals(ArrayList<String> text) {
        String crashtest = "";
        String crashsave = "";
        String caps = "QWERTYUIOPASDFGHJKLZXCVBNM";
        for (int iter = 0; iter < text.size(); iter++) {
            crashtest = text.get(iter);

            for (int iter1 = 0; iter1 < crashtest.length(); iter1++) {
                if (caps.contains("" + crashtest.charAt(iter1))) {
                    crashsave+=crashsave.charAt(iter1);
                }
            }
        }
    }
}
