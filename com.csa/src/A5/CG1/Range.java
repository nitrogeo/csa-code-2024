package A5.CG1;

public class Range {
    public static boolean inRange(int number1, int number2, int allowedRange)
    {
        boolean inRange = Math.abs(number1 - number2) <= allowedRange;
        return inRange;
    }
}
