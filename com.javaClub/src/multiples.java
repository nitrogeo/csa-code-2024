import java.util.Scanner;

public class multiples {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = keyboard.nextInt();
        System.out.print("Enter the multiples you would like to see for the number: ");
        int multiples = keyboard.nextInt();
        System.out.println("The first multiples of " + number + " are: ");

    }
}
