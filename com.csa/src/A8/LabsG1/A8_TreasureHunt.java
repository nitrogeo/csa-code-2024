package A8.LabsG1;

import java.util.Scanner;

/* pseudocode

***************** note: array[var] gets the index val. var gets char val. i think *****************

in psvm
get string from user
find length of string
convert string to char array

send char array to findtresure METHOD; ALL IT DOES is find the index of T

findtres: iterate thru each index of the char array.
when the index's value is T(REASURE), save the INDEX (not the value bc its T) to a variable

variable is retrieved from psvm and output
*/

public class A8_TreasureHunt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the treasure map ('N' - No treasure and 'T' - Treasure):\n\n");
        String str = scan.nextLine();
        char[] map = str.toCharArray();
        int tresRes = findTreasure(map);
        if (tresRes != -1) {
            System.out.print("The treasure can be found in location " + tresRes + ".");
        }
        else {
            System.out.println("There is no treasure on this treasure map.");
        }
    }
    public static int findTreasure(char[] map) {

        /* for (char x: map) {
            if (x == 'T') {
                return x;
            }
            else {
                break;
            }
        } */
        for (int iter = 0; iter < map.length; iter++) {
            if (map[iter] == 'T') {
                return iter;
            }
        }
        return -1;
    }
}
