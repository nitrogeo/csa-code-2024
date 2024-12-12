package A8.CG2;

public class A8_CH6 {
    public static int[] sumArrays(int[] list1, int[] list2) {
        int[] summed = new int[list1.length];
        for (int iter = 0; iter < list1.length; iter++) {
            summed[iter] = list1[iter] + list2[iter];
        }
        return summed;
    }
}
