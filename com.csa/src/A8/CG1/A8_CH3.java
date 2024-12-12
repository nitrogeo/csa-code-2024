package A8.CG1;

public class A8_CH3 {
    public static boolean contains(int[] nums, int value) {
        for (int x : nums) {
            if (x == value) {
                return true;
            }
            if (x > value) {
                return false;
            }
        }
        return false;
    }
}
