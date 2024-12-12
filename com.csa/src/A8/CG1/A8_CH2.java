package A8.CG1;


public class A8_CH2 {
    public static void swap(int[] list, int index1, int index2) {
        int swap1 = list[index1];
        int swap2= list[index2];
        list[index1] = swap2;
        list[index2] = swap1;
    }
}