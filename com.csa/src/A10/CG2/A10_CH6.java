package A10.CG2;
/*
1. iter thru all 8 possible directions and see if theres one there.
2. if so, add to kingsum (like a king in chess) and add to kingiter
3. avg kingsum by kingiter and make that the next index in kingarray

make var that checks if set to 0; if true, dont avg it
*/

// this code never worked; keep in mind when reusing

public class A10_CH6 {
    public static int[][] averageCells(int[][] data) {
        int kingsum = 0; // total of that column to avg
        int kingiter = 0; // number of rows added together (in order to avg them)
        int[][] kingarray = new int [data.length][data[0].length];

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


            }
        }
        return kingarray;
    }
}