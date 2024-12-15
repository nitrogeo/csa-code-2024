package A8.LabsG2;

/*
"similar" to mathmenu fr
 */

import java.util.Scanner;

public class A8_ExpanderMain {
    A8_ArrayExpander numbers = new A8_ArrayExpander();
    public static void main(String[] args) {
        printMenu(); // if less than 1 or greter than 4
        A8_ArrayExpander array = new A8_ArrayExpander();
        Scanner keyboard = new Scanner(System.in); // make a new Scanner called "keyboard"
        int sel = keyboard.nextInt();
        while (sel != 8) {
            if (sel == 1) { // Displays the values in the list
                System.out.println(array + "\n");

                printMenu();
                sel = keyboard.nextInt();
            }
            if (sel == 2) { // Displays the number of items in the list
                System.out.println("The list has " + array.size() + " elements.\n");

                printMenu();
                sel = keyboard.nextInt();
            }
            if (sel == 3) { // Gathers a value from the user and adds it to the end of the list
                System.out.println("Enter a value to add:\n");
                int val = keyboard.nextInt();
                array.add(val);

                printMenu();
                sel = keyboard.nextInt();
            }
            if (sel == 4) { // Gathers a value to add to the list and the index that it should be placed
                System.out.println("Enter a value to add:");
                int val = keyboard.nextInt();
                System.out.println("Enter an index:\n");
                int indx = keyboard.nextInt();
                array.add(indx, val);

                printMenu();
                sel = keyboard.nextInt();
            }
            if (sel == 5) { // Gathers a value and the index that is being changed. Next, it will display the value that was replaced in the list.
                System.out.println("Enter the new value:");
                int val = keyboard.nextInt();
                System.out.println("Enter an index:");
                int indx = keyboard.nextInt();
                int old = array.set(indx, val);
                System.out.println(old + " was replaced.\n");

                printMenu();
                sel = keyboard.nextInt();
            }
            if (sel == 6) { // Asks the user for an index and removes the value at that index
                System.out.println("Enter an index:");
                int indx = keyboard.nextInt();
                int old = array.remove(indx);
                System.out.println(old + " was removed.\n");

                printMenu();
                sel = keyboard.nextInt();
            }
            if (sel == 7) {
                array.clear();
                System.out.println("The list has been cleared.\n");

                printMenu();
                sel = keyboard.nextInt();
            }
        }
        if (sel == 8) {
            System.out.println("Goodbye.");
        }
    }
    public static void printMenu() {
        String var = ("-Menu-\n1. Print\n2. Size\n3. Add\n4. Insert\n5. Set\n6. Remove\n7. Clear\n8. Exit\nEnter selection:\n");
        System.out.println(var);
    }
}

