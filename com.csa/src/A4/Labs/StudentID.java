package A4.Labs;
import java.util.Scanner;

public class StudentID {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in); // make a new Scanner called "keyboard"

        System.out.print("Enter your first name:\n");
        String firstName = keyboard.nextLine();
        System.out.print("Enter your last name:\n");
        String lastName = keyboard.nextLine();
        System.out.print("Enter your grade level:\n");
        int grade = keyboard.nextInt();
        System.out.print("Enter your id:\n\n");
        long idNumber = keyboard.nextLong();

        String username = studentID(firstName, lastName, grade, idNumber);
        System.out.println("The text for your student ID is: \n" + username);
    }

    public static String studentID(String firstName, String lastName, int grade, long idNumber)
    {
        return "(" + lastName + ", " + firstName + ") " + idNumber + "/" + grade;
    }
}

