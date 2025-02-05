package A10.L1;

import java.util.Scanner;

public class A10_TicTacToe {
    public static boolean winCondit = false;
    public static int rmove;
    public static int cmove;
    public static char[][] board = {{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}};
    public static String[][] outline = {{" |"," | ","| "},{"----","---","----"},{" |"," | ","| "},{"----","---","----"},{" |"," | ","| "}};
    public static int moveCt = 0;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        A10_Maze maze = new A10_Maze();

        while (!winCondit) {
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
                moveCt++;
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
        - check each row manually; i.e. check each possible win cond:
            - top row
            - mid row
            - bottom row
            - diagonal L to R
            - diagonal R to L
            - left col
            - mid col
            - right col
        */
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {
                // top row
                if ((board[0][0] == player)&&(board[0][1] == player)&&(board[0][2] == player)){
                    winCondit = true;
                }
                // mid row
                if ((board[1][0] == player)&&(board[1][1] == player)&&(board[1][2] == player)){
                    winCondit = true;
                }
                // bottom row
                if ((board[2][0] == player)&&(board[2][1] == player)&&(board[2][2] == player)){
                    winCondit = true;
                }

                // left col
                if ((board[0][0] == player)&&(board[1][0] == player)&&(board[2][0] == player)){
                    winCondit = true;
                }
                // mid col
                if ((board[0][1] == player)&&(board[1][1] == player)&&(board[2][1] == player)){
                    winCondit = true;
                }
                // right col
                if ((board[0][2] == player)&&(board[1][2] == player)&&(board[2][2] == player)){
                    winCondit = true;
                }

                // L to R diagonal
                if ((board[0][0] == player)&&(board[1][1] == player)&&(board[2][2] == player)){
                    winCondit = true;
                }
                // R to L diagonal
                if ((board[0][2] == player)&&(board[1][1] == player)&&(board[2][0] == player)){
                    winCondit = true;
                }
            }
        }
        return winCondit;
    }
    public boolean isCat (char[][] board){
        // if board full and no win
        if ((moveCt == 9) && !winCondit) {
            System.out.print("Cats game.");
            return true;
        }
        else return false;
    }
}
