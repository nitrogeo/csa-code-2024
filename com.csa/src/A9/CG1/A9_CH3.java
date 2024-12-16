package A9.CG1;

public class A9_CH3 {
    public String totalLength(String[] textArray) {
        int sum = 0;
            for (int iter = 0; iter < textArray.length; iter+=3) { // iterates thru each element and adds its length to sum
                sum += textArray[iter].length();
            }
        return Integer.toString(sum);
    }
}
