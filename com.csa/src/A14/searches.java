package A14;

public class searches {
    public static int linearSearch (int[] list, int value) {
        int iter = 0;
        int minIndex = iter;
        for (iter = 0; iter < list.length; iter++) {
            for (int b = iter + 1; iter < list.length; iter++) {
                if (list[iter] < list[minIndex]);
                minIndex = b;
            }
        }
        // swap values at minIndex and a
        int swapiter = iter;
        int swapmin = minIndex;

        iter = swapmin;
        minIndex = swapiter;
    }
    public static int binarySearch (int[] list, int value) {

    }
}
