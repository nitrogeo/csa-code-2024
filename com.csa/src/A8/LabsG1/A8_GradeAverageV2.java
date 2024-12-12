package A8.LabsG1;

import java.util.Scanner;

/* pseudocode

***************** note: array[var] gets the index val. var gets char val. i think *****************

in psvm
get number of grades from user (get array size)
get grades from user AND plug grades into array

in GRLET
get array from psvm
1. averaging:***********
iterate thru adding up vals in array with for loop
div vals by grade array size to get AVG VAR
2. avg-letter convert.************
get letter from avg - ez

in AVG
get array from psvm
iterate thru adding up vals in array with for loop
div vals by grade array size to get AVG VAR

letter is retrieved from psvm and output
*/

public class A8_GradeAverageV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many grades does the student have?\n");
        int poolSize = scan.nextInt();
        // char[] grades = gradinator.toCharArray();
        double[] grades = new double[poolSize];

        for (int iter = 0; iter < poolSize; iter++) {
            System.out.printf("Enter grade " + (iter + 1) + ":\n");
            grades[iter] = scan.nextDouble();
        }
        // double[] values = scan.toArray();
        double average = average(grades);
        char letter = gradeLetter(grades);

        System.out.printf("\nThe student's average is %.2f.\n", average);
        System.out.printf("The student's grade letter is a(n) %c.\n", letter);
    }

    public static char gradeLetter(double[] grades) {
        // averaging
        double sum = 0;
        for(double x: grades) {
            sum += x;
        }
        double avg = sum / grades.length;

        { // grade calcs
            if (avg >= 90) {
                return 'A';
            }
            if (avg >= 80 && avg < 90) {
                return 'B';
            }
            if (avg >= 75 && avg < 80) {
                return 'C';
            }
            if (avg >= 70 && avg < 75) {
                return 'D';
            }
            if (avg < 70) {
                return 'F';
            }
        }
        return 0;

    }

    public static double average(double[] grades) {
        /* for (int iter = 0; iter < grades.length; iter++) {
            if (grades[iter] == 'T') {
                return iter;
            }
        } */
        double sum = 0;
        for(double x: grades) {
            sum += x;
        }

        return sum / grades.length;
    }
}
