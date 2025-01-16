package A10.CG2;

/*
1. iter thru set2 and check if each vale equals the same value from set1
*/

public class A10_CH5 {
    public static boolean equals(char[][] set1, char[][] set2) {
        boolean same = true;
        // if num of rows isnt equal, then return false
        if ((set1.length != set2.length) || (set2[0].length != set1[0].length)) same = false;
        else { // if # of rows same, continue
            // wont have staggered arrays, so checking for them isnt necessary
            // iter thru all rows and compare lengths (ha)
            for (int r = 0; r < set1.length; r++) { // finds row
                for (int c = 0; c < set1[0].length; c++) { // finds column
                    // if set 1 iter = set2 iter, then good
                    if (set1[r][c] != set2[r][c]) same = false;
                }
            }
        }
        return same;
    }
}
