package A10.CG2;
/*
1. iter thru all 8 possible directions and see if theres one there.
2. if so, add to kingsum (like a king in chess) and add to kingiter
3. avg kingsum by kingiter and make that the next index in kingarray

make var that checks if set to 0; if true, dont avg it
*/

public class A10_CH6 {
    public static int[] averageCells(int[][] data) {
        int kingsum = 0; // total of that column to avg
        int kingiter = 0; // number of rows added together (in order to avg them)
        int[] kingarray = new int[data[0][0]];

        boolean rplus0;
        int rmin;
        boolean rmin0;
        //
        boolean cplus0;
        int cmin;
        boolean cmin0;

        int dul;
        boolean dul0;
        //
        int dur;
        boolean dur0;
        //
        int ddl;
        boolean ddl0;
        //
        int ddr;
        boolean ddr0;

        // pick an element...
        // r and c is current iter to check 8 adjacent ones of
        for (int c = 0; c < data[0].length; c++) { // finds column
            for (int r = 0; r < data.length; r++) { // finds row
                // ************************* HORIZONTAL *****************************
                // this saves the adjacent ROW values
                int rplus =  data[r + 1][c];
                // boolean rplus0;
                // int rmin;
                // boolean rmin0;
                if (r != 0) { // if the row isnt 0 then set cmin to r - 1
                    rmin = data[r - 1][c];
                }
                else { // else set rmin to 0
                    rmin = data[r][c];
                    rmin0 = true;
                }
                // this saves the adjacent COLUMN values
                int cplus =  data[r][c + 1];
                // boolean cplus0;
                // int cmin;
                // boolean cmin0;
                if (c != 0) { // if the column isnt 0 then set cmin to c - 1
                    cmin = data[r][c - 1];
                }
                else { // else set cmin to 0
                    cmin = data[r][c];
                    cmin0 = true;
                }
                // that was horizontal,,, now check for diagonal...

                // ************************* DIAGONAL *****************************

                // this saves the diagonal column values
                /*
                d = diagonal
                u = up; d = down
                l = left, r = right
                */
                /*
                int dul;
                boolean dul0;
                //
                int dur;
                boolean dur0;
                //
                int ddl;
                boolean ddl0;
                //
                int ddr;
                boolean ddr0;
                */

                // dul ******************************************************
                if (c != 0) { // if the column isnt 0 then set cmin to c - 1
                    dul = data[r - 1][c - 1];
                }
                else { // else set dplus to 0
                    dul = data[r][c];
                    dul0 = true;
                }
                // dur ******************************************************
                if (c != 0) { // if the column isnt 0 then set cmin to c - 1
                    dur = data[r - 1][c + 1];
                }
                else { // else set dplus to 0
                    dur = data[r][c];
                    dur0 = true;
                }
                // ddl ******************************************************
                if (c != 0) { // if the column isnt 0 then set cmin to c - 1
                    ddl = data[r + 1][c - 1];
                }
                else { // else set dplus to 0
                    ddl = data[r][c];
                    ddl0 = true;
                }
                // ddr ******************************************************
                if (c != 0) { // if the column isnt 0 then set cmin to c - 1
                    ddr = data[r + 1][c + 1];
                }
                else { // else set dplus to 0
                    ddr = data[r][c];
                    ddr0 = true;
                }
                // ************************* END SAVING VALUES *****************************

                // now iter thru all elements and check if 1 "square" away from te current iter...
                // ...
                /* actually,,, nvm. iter thru all adjacent values saved from the variables above and
                check if each one's 0 bool is true. if so, dont avg it. if its false, avg it and put the avg in
                the current indx of int[][] kingarray.
                 */

                // r1 and c1 are directional check iters
                /* for (int r1 = 0; r < data.length; r++) { // row to check
                    for (int c1 = 0; c < data[0].length; c++) { // column to check
                        if (data[r1] == data[r]) { // if in same row, ...
                            // ...then check if ((column indx +1 or -1) = current element indx)...
                            if ((data[r1][c1] == rplus) || (data[r1][c1] == rmin)) {

                            }
                        }
                        else { // else, if in diff row, then check if ((column indx +1 or -1) = current element indx)
                            break;
                        }
                    }
                }*/
                {
                    if (rplus0 = false) {
                        kingsum += rplus;
                        kingiter++;
                    }
                    if (rmin0 = false) {
                        kingsum += rmin;
                        kingiter++;
                    }
                    if (cplus0 = false) {
                        kingsum += rmin;
                        kingiter++;
                    }
                    if (cmin0 = false) {
                        kingsum += rmin;
                        kingiter++;
                    }
                    //
                    if (dul0 = false) {
                        kingsum += rmin;
                        kingiter++;
                    }
                    if (dur0 = false) {
                        kingsum += rmin;
                        kingiter++;
                    }
                    if (ddl0 = false) {
                        kingsum += rmin;
                        kingiter++;
                    }
                    if (ddr0 = false) {
                        kingsum += rmin;
                        kingiter++;
                    }
                }
                kingarray[c] = kingsum / kingiter;
            }
        }
        return kingarray;
    }
}
