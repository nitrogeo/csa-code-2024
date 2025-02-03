package A10.L1;

import A7.Labs.L2Dessert.IceCreamShop;

import java.util.Scanner;

public class A10_TicTacToe {
    public static boolean winCondit = false;
    public static int rmove;
    public static int cmove;
    public static char[][] board;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        A10_Maze maze = new A10_Maze();

        while () {
            // print board
            while (!winCondit) {
                System.out.println("X enter the column for your move (0-2):");
                cmove = scan.nextInt();
                if ((cmove > -1) && (cmove < 3)) {
                    System.out.println("Invalid move, enter a new move.");
                    continue;
                }
                System.out.println("X enter the row for your move (0-2):");
                rmove = scan.nextInt();
                if ((cmove > -1) && (cmove < 3)) {
                    System.out.println("Invalid move, enter a new move.");
                    continue;
                }

                // if valid print the current maze
                else System.out.println(maze.toString());
            }
        }
    }
    public boolean isWinner (char[][] board, char player){
        // iter thru each collumn and see if x is horizontal or diagonal win condition
        /*
        add x pos (.legnth nums, not index nums) to string...
        if 123 or 321 then diagWin = true
        if 111 222 333 or an entire colum then horWin = true
        ...
        wait it should either:
        - check each row manually
        */
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {
                /
            }
        }
        return winCondit;
    }
    public boolean isCat (char[][] board){
        // iter thru each collumn and see if x OR o is horizontal or diagonal win
    }

}
