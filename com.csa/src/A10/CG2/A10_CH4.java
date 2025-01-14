package A10.CG2;

/*
1. pick a column and start on 1st row
2. iter thru all rows adding the value in that row to curcol
3. when end of rows make coltol [iter] = curcol and reset curcol to 0
4. return coltol
*/

public class A10_CH4 {
    public static int[] columnTotals(int[][] data) {
        int[] coltol = new int [data.length]; // variable for largest value
        int curcol = 0;
        int r;
        int c;
        for (c = 0; c < data[0].length; c++) { // finds column = iter
            for (r = c; r < data.length; r++) { // finds row = iter1
                curcol += data[r][c];
            } // when reach last row...
            coltol[c] = curcol;
            curcol = 0;
        }
        return coltol;
    }
}
