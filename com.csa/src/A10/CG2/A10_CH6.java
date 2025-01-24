package A10.CG2;
/*
1. iter thru all 8 possible directions and see if theres one there.
2. if so, add to kingsum (like a king in chess) and add to kingiter
3. avg kingsum by kingiter and make that the next index in kingarray

make var that checks if set to 0; if true, dont avg it
*/

public class A10_CH6 {
    public static int[][] averageCells(int[][] data) {
        int kingsum = 0; // total of that column to avg
        int kingiter = 0; // number of rows added together (in order to avg them)
        int[][] kingarray = new int [data.length][data[0].length];

        int rplus = 0;
        boolean rplus0 = false;
        int rmin = 0;
        boolean rmin0 = false;
        //
        int cplus;
        boolean cplus0 = false;
        int cmin;
        boolean cmin0 = false;

        int dul;
        boolean dul0 = false;
        //
        int dur;
        boolean dur0 = false;
        //
        int ddl;
        boolean ddl0 = false;
        //
        int ddr;
        boolean ddr0 = false;

        // pick an element...
        // r and c is current iter to check 8 adjacent ones of
        for (int c = 0; c < data[0].length; c++) { // finds column
            int r;
            for (r = 0; r < data.length; r++) { // finds row
                kingsum = 0;
                kingiter = 0;
                // ************************* HORIZONTAL *****************************
                // this saves the adjacent ROW values
                // rplus ********************
                //
                //
                // r c
                kingsum = data[r][c];
                kingiter++;
                // r-1 c-1
                if(r-1>=0&&c-1>=0)
                {
                    kingsum = data[r-1][c-1];
                    kingiter++;
                }
                // r-1 c
                if(r-1>=0)
                {
                    kingsum = data[r-1][c];
                    kingiter++;
                }
                // r-1 c
                if(r-1>=0&& c+1<data[0].length)
                {
                    kingsum = data[r-1][c+1];
                    kingiter++;
                }
                if (r != 0) { // if the row isnt 0 then set cmin to r + 1
                    if (r == data.length - 1){ // if r + 1 would be OutOfBounds then do rplus0,,, if current row is last row then do rplus0

                        rplus0 = true;
                    }
                    else rplus = data[r + 1][c];
                }
                else { // else set rmin to 0
                    rplus = data[r][c];
                    rplus0 = true;
                }

                // rmin ********************
                if (r != 0) { // if the row isnt 0 then set cmin to r - 1
                    rmin = data[r - 1][c];
                }
                else { // else set rmin to 0
                    rmin = data[r][c];
                    rmin0 = true;
                }

                // this saves the adjacent COLUMN values ********************************
                // cplus ********************
                if (c != 0) { // if the col isnt 0 then set cmin to r + 1
                    if (c == data[0].length - 1){ // if c + 1 would be OutOfBounds then do rplus0,,, if current row is last row then do rplus0
                        cplus = data[r][c];
                        cplus0 = true;
                    }
                    else cplus =  data[r][c + 1];
                }
                else { // else set cplus to 0
                    cplus = data[r][c];
                    cplus0 = true;
                }
                // cmin ********************
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
                /* d = diagonal
                u = up; d = down
                l = left, r = right */
                /* int dul;
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
                // check if either are 0
                if ((c != 0) && (r != 0)) { // if the column isnt 0 then set diag to c - 1
                    dul = data[r - 1][c - 1];
                }
                else { // else set diag to 0
                    dul = data[r][c];
                    dul0 = true;
                }
                // dur ******************************************************
                // check if r is 0 and c is max
                if (c != 0) { // if the column isnt 0 then set diag to c - 1
                    if (r != 0) { // if the row isnt 0 then set cmin to r + 1
                        if (c == data[0].length - 1){ // if r + 1 would be OutOfBounds then do rplus0,,, if current row is last row then do rplus0
                            /*^^^ if c isnt 0 and r isnt 0 then ^^^ check if the r is the last r*/
                            dur = data[r][c];
                            dur0 = true;
                        }
                        else dur = data[r - 1][c + 1];
                    }
                    else { // if r = 0
                        dur = data[r][c];
                        dur0 = true;
                    }
                }
                else { // else set diag to 0,,, if c = 0
                    dur = data[r][c];
                    dur0 = true;
                }
                // ddl ******************************************************
                // check if r is max and c is 0
                if (c != 0) { // if the column isnt 0 then set diag to c - 1
                    if (r != 0) { // if the row isnt 0 then set cmin to r + 1
                        if (r == data.length - 1){ // if r + 1 would be OutOfBounds then do rplus0,,, if current row is last row then do rplus0
                            /*^^^ if c isnt 0 and r isnt 0 then ^^^ check if the r is the last r*/
                            ddl = data[r][c];
                            ddl0 = true;
                        }
                        else ddl = data[r + 1][c - 1];
                    }
                    else { // if r = 0
                        ddl = data[r][c];
                        ddl0 = true;
                    }
                }
                else { // else set diag to 0,,, if c = 0
                    ddl = data[r][c];
                    ddl0 = true;
                }
                // ddr ******************************************************
                // check if either are max
                if (c != 0) { // if the column isnt 0 then set diag to c - 1
                    if (c == data[0].length - 1){ // if r + 1 would be OutOfBounds then do rplus0,,, if current row is last row then do rplus0
                        /*^^^ if c isnt 0 and r isnt 0 then ^^^ check if the r is the last r*/
                        ddr = data[r][c];
                        ddr0 = true;
                    }
                    else if (r != 0) {
                        if (r == data.length - 1){ // if r + 1 would be OutOfBounds then do rplus0,,, if current row is last row then do rplus0
                            /*^^^ if c isnt 0 and r isnt 0 then ^^^ check if the r is the last r*/
                            ddr = data[r][c];
                            ddr0 = true;
                        }
                        else ddr = data[r + 1][c + 1];
                    }
                    else { // quit, 0bool
                        ddr = data[r][c];
                        ddr0 = true;
                    }
                }
                else { // else set diag to 0,,, quit 0 bool
                    ddr = data[r][c];
                    ddr0 = true;
                }
                // ************************* END SAVING VALUES *****************************

                // now iter thru all elements and check if 1 "square" away from te current iter...
                // ...
                /* actually,,, nvm. iter thru all adjacent values saved from the variables above and
                check if each one's 0 bool is true. if so, dont avg it. if its false, avg it and put the avg in
                the current indx of int[] kingarray.
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
                    if (!rplus0) {
                        kingsum += rplus;
                        kingiter++;
                    }
                    // rmin0 always false
                    if (!rmin0) {
                        kingsum += rmin;
                        kingiter++;
                    }
                    if (!cplus0) {
                        kingsum += cplus;
                        kingiter++;
                    }
                    // cmin0 always false
                    if (!cmin0) {
                        kingsum += cmin;
                        kingiter++;
                    }
                    //
                    if (!dul0) {
                        kingsum += dul;
                        kingiter++;
                    }
                    if (!dur0) {
                        kingsum += dur;
                        kingiter++;
                    }
                    if (!ddl0) {
                        kingsum += ddl;
                        kingiter++;
                    }
                    if (!ddr0) {
                        kingsum += ddr;
                        kingiter++;
                    }
                    kingsum += data[r][c];
                }
                if (kingiter > 0) {
                    kingarray[r][c] = kingsum / kingiter;
                }
                else {
                    kingarray[r][c] = data[r][c];
                }
            }
        }
        return kingarray;
    }
}