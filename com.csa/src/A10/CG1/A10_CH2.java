package A10.CG1;

public class A10_CH2 {
    public static int positiveCount(int[][] data) {
        int posnum = 0;
        for (int iter = 0; iter < data.length; iter++) { // finds row
            for (int iter1 = 0; iter1 < data[0].length; iter1++) { // finds column
                if (data[iter][iter1] > 0) {
                    posnum++;
                }
            }
        }
        return posnum;
    }
}
