package A3;
import java.util.Scanner;

public class MixedNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // make a new Scanner called "keyboard"
        int numerator;
        int denominator;

        System.out.print("Enter the numerator of the fraction:\n");
        numerator = scan.nextInt();
        System.out.print("Enter the denominator of the fraction:\n\n");
        denominator = scan.nextInt();

        int wholeNum = numerator/denominator;
        int mixedDenom = numerator%denominator;

        System.out.println("The mixed number derived from the fraction " + numerator + "/" + denominator + " is " + wholeNum + " " + mixedDenom + "/" + denominator + ".");
    }

}
