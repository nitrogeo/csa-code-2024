package A13;

public class Summation {
    /*
    start at a and add a-1 to a until a = b then add b and stop NO
    start at b and add b-1 until a = b then add a and stop - ye
    */
    public static int summation(int A, int B) {
        int result;
        if (A == B) {
            return A;
        }

        else {
            result = B + summation(A, B - 1);
            return result;
        }
    }
}
