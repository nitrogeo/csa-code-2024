import java.util.Scanner;

public class date011325 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: \n");
        int num = scan.nextInt();
        System.out.println(factorialPrint(num));
    }
    public static String factorialPrint(int num) {
        String factnum = "";
        for (int iter = num; iter >= 1; iter--) {
            if (iter != 1) {
                factnum += iter + " * ";
            }
            else {
                factnum += iter;
            }
        }
        return factnum;
    }

} // yoo that was actually fun
