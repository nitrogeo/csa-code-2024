package A10.CG2;
/*
1. iter thru all 8 possible directions and see if theres one there.
2. if so, add to kingsum (like a king in chess) and add to kingiter
3. avg kingsum by kingiter and make that the next index in kingarray
*/

public class A10_CH6 {
    public static boolean averageCells(int[][] data) {
        int kingsum = 0;
        int kingiter = 0;
        int[][] kingarray;

        // pick an element...
        // r and c is current iter to check 8 adjacent ones of
        for (int r = 0; r < data.length; r++) { // finds row
            for (int c = 0; c < data[0].length; c++) { // finds column
                // now iter thru all elements and check if 1 "square" away from te current iter...

                // r1 and c1 are similarity check iters
                for (int r1 = 0; r < data.length; r++) { // finds row
                    for (int c1 = 0; c < data[0].length; c++) { // finds column
                        // if in same row, then check if ((column indx +1 or -1) = current element indx)
                        if (data[r1] == data[r]) {

                        }
                        // if in diff row, then check if ((row ndx +1 or -1) = current element indx)
                        else {

                        }
                    }
                }
            }
        }

        // if num of rows isnt equal, then return false
        if ((set1.length != set2.length) || (set2[0].length != set1[0].length)) same = false;
        else { // if # of rows same, continue
            // wont have staggered arrays, so checking for them isnt necessary
            // iter thru all rows and compare lengths (ha)

        }

        return same;
    }
}
