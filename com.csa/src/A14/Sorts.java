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
            // swap values at minIndex and a
            int swapiter = iter;
            int swapmin = minIndex;

            iter = swapmin;
            minIndex = swapiter;
        }
        return list;
    }
    public static int[] insertionSort (int[] list) {
        for (int iter = 1; iter < list.length; iter++) {
            int temp = list[iter];
            int j = iter;
            while (j > 0 && list[j - 1] > temp) {
                list[j] = list[j - 1];
                j = j - 1;
                list[j] = temp;
            }
        }
        return list;
    }
}
