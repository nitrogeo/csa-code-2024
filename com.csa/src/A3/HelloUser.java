package A3;
import java.util.Scanner;

// tully showed class all this
public class HelloUser {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in); // make a new Scanner called "keyboard"

        System.out.print("Enter your name:\n\n");
        String name = scan.nextLine(); // name is a string variable

        System.out.println("Hello "+name+".");
    }
}
