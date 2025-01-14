package A9.CG1;

public class A9_CH1 {
    public static double largest(double[][] data) {
        double biggestbird = data[0][0];
        for (int iter = 0; iter < data.length; iter++) { // finds row
            for (int iter1 = 0; iter1 < data[0].length; iter1++) { // finds column
                if (data[iter][iter1] > biggestbird) {
                    biggestbird = data[iter][iter1];
                }
            }
        }
        return biggestbird;
    }
}
