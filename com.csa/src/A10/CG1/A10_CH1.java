package A10.CG1;

public class A10_CH1 {
    public static double largest(double[][] data) {
        double biggestbird = -69696969; // variable for largest value
        for (int iter = 0; iter < data.length; iter++) { // finds row
            for (int iter1 = 0; iter1 < data[0].length; iter1++) { // finds column
                if (data[iter][iter1] > biggestbird) { // if the current value is bigger than current largest value...
                    biggestbird = data[iter][iter1]; // ... then make it the biggestbird.
                }
            }
        }
        return biggestbird;
    }
}