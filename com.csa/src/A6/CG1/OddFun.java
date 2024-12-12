package A6.CG1;

public class OddFun {
    public static int oddTotal(int end) {
        int summation = 0; // decrease b until its a and save each number it comes acorss inclding a and b
        // OR the inverse from prepinsta - add 1 to a until its b and add it to the sum periodically
        for (int inc = 1; inc <= end; inc += 2) {
                summation = summation + inc;
        }
        return summation;
    }
}
