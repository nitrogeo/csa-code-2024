package A14;

public class Sorts {
    public static int[] selectionSort (int[] list) {
        int iter = 0;
        int minIndex = iter;
        for (iter = 0; iter < list.length; iter++) {
            for (int b = iter + 1; iter < list.length; iter++) {
                if (list[iter] < list[minIndex]) {
                    minIndex = b;
                }
            }
        }
        // swap values at minIndex and a
        int swapiter = iter;
        int swapmin = minIndex;

        iter = swapmin;
        minIndex = swapiter;
    }
    public static int insertionSort (int[] list) {
        for (iter = 1; iter < list.length; iter++) {
            temp = data[iter];
            j = i
            while j > 0 && data[j - 1] > temp
            data[j] = data[j - 1]
            j = j - 1
            data[j] = temp
        }
    }
}
