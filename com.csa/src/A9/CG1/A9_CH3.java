package A9.CG1;

public class A9_CH3 {
    public int totalLength(String[] textArray) {
        int sum = 0;
        for (int iter = 0; iter < textArray.length; iter++) { // iterates thru each element and adds its length to sum
            sum += textArray[iter].length();
        }
        return sum;
    }
}
