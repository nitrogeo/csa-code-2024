package A14;

public class Sorts {
    public static int[] selectionSort (int[] list) {
        int minIndex = 0;
        int iter;
        int iter1;


        for (iter = 0; iter < list.length; iter++) {
            minIndex = iter;
                for (iter1 = iter + 1; iter1 < list.length; iter1++) {
                    if (list[iter1] < list[minIndex]) {
                        minIndex = iter1;

                    }
                }
            // swap values at minIndex and a
            int swapiter = list[iter];
            list[iter] = list[minIndex];
            list[minIndex] = swapiter;
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
