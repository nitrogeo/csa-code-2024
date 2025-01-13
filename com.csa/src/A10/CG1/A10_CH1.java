package A10.CG1;

public class A10_CH1 {
    public static double largest(double[][] data) {
        double biggestbird = 0;
        for (double[] datum : data) { // finds row
            for (int iter1 = 0; iter1 < data[0].length; iter1++) { // finds column
                if (datum[iter1] > biggestbird) {
                    biggestbird = datum[iter1];
                }
            }
        }
        return biggestbird;
    }
}