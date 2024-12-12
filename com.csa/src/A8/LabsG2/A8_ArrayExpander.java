package A8.LabsG2;

import java.util.Arrays;

public class A8_ArrayExpander { // contains attributes
    public int[] numbers = null;

    public A8_ArrayExpander() { // constructor
        numbers = null;
    }

    public void add(int value) {
        /*
        makes new array temp with a length numbers+1
        */
        if (numbers == null) {
            numbers = new int[1];
        }
        else {
            int iterFinal= 0;
            int[] temp = new int[numbers.length + 1];
            for (int iter = 0; iter < numbers.length; iter++) {
                temp[iter] = numbers[iter];
                iterFinal = iter;
            }
            temp[iterFinal] = value;
            numbers = temp;
        }
    }
    public void add(int index, int value) {
        int temp[];
        int iterFinal= 0;
        if (numbers == null && index == 0) {
            temp = new int[1];
            numbers = temp;
            int remain = numbers.length;
        }
        else {
            temp = new int[numbers.length + 1];
        }
        int remain = numbers.length;
        // method 2, steps 2+
        for (int iter = 0; iter < index; iter++, remain--) { // s2
            temp[iter] = numbers[iter];
            iterFinal = iter;
        }
        temp[index] = value; // s3
        for (int iter = iterFinal; iter < numbers.length; iter++) { // s4
            temp[iter] = numbers[iter];
        }
        numbers = temp;
    }
    public int set(int index, int value) {
        int old = numbers[index];
        numbers[index] = value;
        return old;
    }
    public int remove(int index) {
        int old = numbers[index];
        int iterFinal = 0;
        int temp[];
        int remain = numbers.length;
        if (numbers.length == 1) { // s2
            numbers = null;
            return old;
        }
        else { //s2
            temp = new int[numbers.length - 1];
        }
        for (int iter = 0; iter < index; iter++, remain--) { // s3
            temp[iter] = numbers[iter];
            iterFinal = iter;
        }
        for (int iter = iterFinal; iter < numbers.length; iter++) { // s4
            temp[iter-1] = numbers[iter];
        }
        numbers = temp;
        return old;
    }
    public int get(int index) {
        return numbers[index];
    }
    public int size() {
        if (numbers == null) {
            return 0;
        }
        else {
            return numbers.length;
        }
    }
    public void clear() {
        numbers = new int[0];
    }
    public String toString() {
        if (numbers == null) {
            return "[]";
        }
        else {
            String str = (""); // this "converts" numbers into str by placing each numbers val into numbers as a String
            int iter = 0;
            for (iter = 0; iter < numbers.length - 1; iter++) { // s3
                str += numbers[iter] + ", ";
            }
            str += numbers[iter];
            // System.out.println("[" + Arrays.toString(numbers) + "]");
            return "[" + str + "]";
        }
        // else String str = Arrays.toString(numbers);
    }
}
