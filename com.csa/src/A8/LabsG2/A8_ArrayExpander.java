package A8.LabsG2;

import java.util.Arrays;

public class A8_ArrayExpander { // contains attributes
    private int[] numbers;

    public A8_ArrayExpander() { // constructor
        numbers = null;
    }

    public void add(int value) { // insert in main +++ ADD w/ 1 VAR
        // Extends the size of numbers and adds value to its end.
        /*
        makes new array temp with a length numbers+1
        */
        if (numbers == null) {
            numbers = new int[1];
            numbers[0] = value; // tully: made an array big enough for 1 element but didnt put it in the array
        }
        else {
            int[] temp = new int[numbers.length + 1];
            for (int iter = 0; iter < numbers.length; iter++) {
                temp[temp.length-1] = numbers[iter];
            }
            numbers = temp;
        }
    }
    public void add(int index, int value) { // this method is INSERT in MAIN,,, ADD w/ 2 VARS
        int temp[];
        if (numbers == null && index == 0) { // s1
            temp = new int[1];
        }
        else { // s1
            temp = new int[numbers.length + 1];

        // method 2, steps 2+...:
        /*
        iterates thru numbers and copies
        "all elements at positions that are less than index from numbers into temp, without changing their indexes."
         AND saves the last iter to iterFinal
        */
            for (int iter = 0; iter < index; iter++) { // s2
                temp[iter] = numbers[iter];
                // iterFinal = iter;
            }

            temp[index] = value; // s3: Place value at index in temp.

            /* "Copy the remaining elements from numbers into temp, but place each element at the position one higher than where it was in numbers."
             */
            for (int iter = index; iter < numbers.length; iter++) { // s4
                temp[iter - 1] = numbers[iter];
            }
        }
        numbers = temp;
    }
    public int set(int index, int value) {
        int old = numbers[index]; // s1
        numbers[index] = value; // s2
        return old; // s3
    }
    public int remove(int index) {
        int old = numbers[index];
        if (numbers.length == 1) { // s2: "If numbers is length one, change numbers to null and go to step 6."...:
            numbers = null;
        }

        //s2: "Otherwise, create an int array that is one element shorter than the length of numbers. We will refer to the new array as temp."...:
        else {
            int temp[] = new int[numbers.length - 1];

            // s3: "Copy all elements at positions that are less than index from numbers into temp, without changing their indices."...:
            for (int iter = 0; iter < index; iter++) {
                temp[iter] = numbers[iter];
                // iterFinal = iter;
            }

            for (int iter = index + 1; iter < numbers.length; iter++) { // s4: "Copy the elements ... after index ... from numbers, into positions in temp that are one less than where they were in numbers."...:
                temp[iter - 1] = numbers[iter];
            }

            numbers = temp;
        }
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
        // numbers = new int[0];
        numbers = null;
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
