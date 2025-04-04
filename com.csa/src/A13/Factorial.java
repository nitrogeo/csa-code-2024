package A13;

public class Factorial {
    /*
        start at a and add a-1 to a until a = b then add b and stop NO
        start at b and add b-1 until a = b then add a and stop - ye
        */
    public static long factorial(long num) {
        long result;
        if (num == 1) {
            return 1;
        }

        else {
            result = num * factorial(num - 1);
            return result;
        }
    }
}
