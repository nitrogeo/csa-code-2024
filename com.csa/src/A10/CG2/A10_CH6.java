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
                // ************************* HORIZONTAL *****************************
                // this saves the adjacent row values
                int rplus =  data[r + 1][c];
                int rmin;
                if (r != 0) { // if the row isnt 0 then set cmin to r - 1
                    rmin = data[r - 1][c];
                }
                else { // else set rmin to 0
                    rmin = data[r][c];
                }
                // this saves the adjacent column values
                int cplus =  data[r][c + 1];
                if (c != 0) { // if the column isnt 0 then set cmin to c - 1
                    int cmin = data[r][c - 1];
                }
                else { // else set cmin to 0
                    int cmin = data[r][c];
                }
                // that was horizontal,,, now check for diagonal...

                // ************************* DIAGONAL *****************************

                // this saves the diagonal column values
                /*
                d = diagonal
                u = up; d = down
                l = left, r = right
                */
                // dul ******************************************************
                if (c != 0) { // if the column isnt 0 then set cmin to c - 1
                    int dul = data[r - 1][c - 1];
                }
                else { // else set dplus to 0
                    int dul = data[r][c];
                }
                // dur ******************************************************
                if (c != 0) { // if the column isnt 0 then set cmin to c - 1
                    int dur = data[r - 1][c + 1];
                }
                else { // else set dplus to 0
                    int dur = data[r][c];
                }
                // ddl ******************************************************
                if (c != 0) { // if the column isnt 0 then set cmin to c - 1
                    int ddl = data[r + 1][c - 1];
                }
                else { // else set dplus to 0
                    int ddl = data[r][c];
                }
                // ddr ******************************************************
                if (c != 0) { // if the column isnt 0 then set cmin to c - 1
                    int ddr = data[r + 1][c + 1];
                }
                else { // else set dplus to 0
                    int ddr = data[r][c];
                }
                // ************************* END SAVING VALUES *****************************

                // now iter thru all elements and check if 1 "square" away from te current iter...

                // r1 and c1 are directional check iters
                for (int r1 = 0; r < data.length; r++) { // row to check
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
                }
            }
        }
        return same;
    }
}
