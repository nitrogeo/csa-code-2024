package A14;

public class Searches {
    public static int linearSearch (int[] list, int value) {
        int found =-1;

        for (int iter = 0; iter < list.length; iter++) {
            if (list[iter] == value) {
                found = iter;
                break;
            }
        }
        return found;
    }
    public static int binarySearch (int[] list, int value) {
        int start = 0;
        int end = list[list.length-1];

        while (start <=end) {
            int check = (start + end) / 2;
            if (list[check] == value) {
                return check;
            }
            else if (list[check] > value) {
                end = check - 1;
            }
            else {
                start = check + 1;
            }
        }

        return -1;
    }
}
