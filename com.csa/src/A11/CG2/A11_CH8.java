package A11.CG2;

import java.util.ArrayList;
import java.awt.*;

public class A11_CH8 {
    /*
        iter thru data and check if x is neg and y is neg
        if so, passers++

        gets x and y of current iter bc current iter has both
    */

    // done 12:43 2.21.2025


    public static int quadrantCount(ArrayList<Point> data) {
        int passers = 0;
        for (int iter = 0; iter < data.size(); iter++) {
            if ((data.get(iter).getX() < 0) && data.get(iter).getY() < 0) {
                passers++;
            }
        }
        return passers;
    }
}
