package A6.CG1;

public class MathSum {
    public static int summation(int a, int b) {
        int summation = 0; // decrease b until its a and save each number it comes acorss inclding a and b
        // OR the inverse from prepinsta - add 1 to a until its b and add it to the sum periodically
        for (int inc = a; inc <= b; inc++) {
            summation = summation + inc;
        }
        return summation;
    }
}
