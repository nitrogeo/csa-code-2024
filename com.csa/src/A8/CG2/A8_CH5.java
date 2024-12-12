package A8.CG2;

// "similar" to A6-CH1-Summation and A8-CH1-Is Final Even

public class A8_CH5 {
    public static double evensTotal(double[] list) {
        double evenSum = 0;
        // iterate thru the list only stopping on even values to add to the sum
        for (int iter = 0; iter < list.length; iter+=2) {
            evenSum = evenSum + list[iter];
        }
        return evenSum;
    }
}
