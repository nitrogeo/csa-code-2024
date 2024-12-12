package A6.CG1;

public class Merge {
    public static int digitsTotal(int num) {
        int summation = 0;
        int process = 0;
        do {
            process = num % 10;
            summation += process;
            num /= 10;
        } while (num > 0);
        return summation;
    }
}
