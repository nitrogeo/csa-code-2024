package A4.CG2;

public class Calculations {
    public static int minimum(int num1, int num2, int num3)
    {
        int mini = Math.min(Math.min(num1, num2), num3);
        return mini;
    }
}
