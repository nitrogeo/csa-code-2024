package A10.CG1;

public class A10_CH3 {
    public static int inRange(int[][] values, int goal, int tolerance) {
        int rangenum = 0;
        for (int iter = 0; iter < values.length; iter++) { // finds row
            for (int iter1 = 0; iter1 < values[0].length; iter1++) { // finds column
                // if the value is within the tolerance of the goal, then we good
                if ((goal + tolerance >= values[iter][iter1]) && (goal - tolerance <= values[iter][iter1])) {
                    rangenum++;
                }
            }
        }
        return rangenum;
    }
}
