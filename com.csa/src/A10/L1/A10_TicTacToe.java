package A10.L1;

import java.util.Scanner;

public class A10_TicTacToe {
    public static int rmove;
    public static int cmove;
    public static char[][] board = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
    public static String[][] outline = {{" | ", " | "}, {"-----------"}, {" | ", " | "}, {"-----------"}, {" | ", " | "}};
    public static int moveCt = 0;
    public static boolean playtime = true;

    public static char player = 'X';
    // public static String boardPrint = outline[0][0] + board[0][0] + outline[0][1] + board[0][1] + outline[0][2] + "\n" + board[1][0] + outline[1][0] + board[1][1] + outline[1][1] + board[1][2] + "\n" + board[2][0] + outline[2][0] + board[2][1] + outline[2][1] + board[2][2];

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println(
                " " + board[0][0] + outline[0][0] + board[0][1] + outline[0][1] + board[0][2] + "\n" +
                        outline[1][0] + "\n" +
                        " " + board[1][0] + outline[2][0] + board[1][1] + outline[2][1] + board[1][2] + "\n" +
                        outline[3][0] + "\n" +
                        " " + board[2][0] + outline[2][0] + board[2][1] + outline[2][1] + board[2][2]);
        /*{
            char[][] test1 = {{'O', 'X', 'O'}, {'X', 'O', 'O'}, {'X', 'X', 'X'}};
            boolean finish = isCat(test1);
            System.out.println(finish);
        }*/

        while (playtime) { // while game going on
            if (player == 'X') {
                // X col
                System.out.println("X enter the column for your move (0-2):");
                cmove = scan.nextInt();
                // if invalid
                if ((rmove < -1) || (rmove > 3)) {
                    System.out.println("Invalid move, enter a new move.");
                    continue;
                }
                // X row
                System.out.println("X enter the row for your move (0-2):");
                rmove = scan.nextInt();
                if (board[rmove][cmove] == 'O') {
                    System.out.println("Invalid move, enter a new move.");
                    continue;
                }
                if ((rmove > -1) && (rmove < 3) && (board[rmove][cmove] == ' ')) {
                    board[rmove][cmove] = player;
                }
                else {
                    System.out.println("Invalid move, enter a new move.");
                    continue;
                }

                moveCt++;
                // if valid print the current maze
                System.out.println(
                        board[0][0] + outline[0][0] + board[0][1] + outline[0][1] + board[0][2] + "\n" +
                                outline[1][0] + "\n" +
                                board[1][0] + outline[2][0] + board[1][1] + outline[2][1] + board[1][2] + "\n" +
                                outline[3][0] + "\n" +
                                board[2][0] + outline[2][0] + board[2][1] + outline[2][1] + board[2][2]);
            }
            if (isWinner(board, player)) {
                System.out.println(player + " WINS!");
                playtime = false;
            }
            if (isCat(board)) {
                System.out.println("Cats game.");
            }
            if (player == 'X') {
                player = 'O';
            }
            if (player == 'O') {
                // O col
                System.out.println("O enter the column for your move (0-2):");
                cmove = scan.nextInt();
                // if invalid
                if ((cmove < -1) || (cmove > 3)) {
                    System.out.println("Invalid move, enter a new move.");
                    continue;
                }
                // O row
                System.out.println("O enter the row for your move (0-2):");
                rmove = scan.nextInt();
                if (board[rmove][cmove] == 'X') {
                    System.out.println("Invalid move, enter a new move.");
                    continue;
                }
                if ((rmove > -1) && (rmove < 3) && (board[rmove][cmove] == ' ')) {
                    board[rmove][cmove] = player;
                }
                else {
                    System.out.println("Invalid move, enter a new move.");
                    continue;
                }

                moveCt++;
                // if valid print the current maze
                System.out.println(
                        board[0][0] + outline[0][0] + board[0][1] + outline[0][1] + board[0][2] + "\n" +
                        outline[1][0] + "\n" +
                        board[1][0] + outline[2][0] + board[1][1] + outline[2][1] + board[1][2] + "\n" +
                        outline[3][0] + "\n" +
                        board[2][0] + outline[2][0] + board[2][1] + outline[2][1] + board[2][2]);
            }
            if (isWinner(board, player)) {
                System.out.println(player + " WINS!");
                playtime = false;
            }
            if (isCat(board)) {
                System.out.println("Cats game.");
            }
            if (player == 'O') {
                player = 'X';
            }
        }
    }
    public static boolean isWinner (char[][] board, char player){
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
                if ((board[0][0] == player) && (board[0][1] == player) && (board[0][2] == player)) {
                    playtime = false;
                    return true;
                }
                // mid row
                if ((board[1][0] == player) && (board[1][1] == player) && (board[1][2] == player)) {
                    playtime = false;
                    return true;
                }
                // bottom row
                if ((board[2][0] == player) && (board[2][1] == player) && (board[2][2] == player)) {
                    playtime = false;
                    return true;
                }

                // left col
                if ((board[0][0] == player) && (board[1][0] == player) && (board[2][0] == player)) {
                    playtime = false;
                    return true;
                }
                // mid col
                if ((board[0][1] == player) && (board[1][1] == player) && (board[2][1] == player)) {
                    playtime = false;
                    return true;
                }
                // right col
                if ((board[0][2] == player) && (board[1][2] == player) && (board[2][2] == player)) {
                    playtime = false;
                    return true;
                }

                // L to R diagonal
                if ((board[0][0] == player) && (board[1][1] == player) && (board[2][2] == player)) {
                    playtime = false;
                    return true;
                }
                // R to L diagonal
                if ((board[0][2] == player) && (board[1][1] == player) && (board[2][0] == player)) {
                    playtime = false;
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean isCat (char[][] board){
        // if board full and no win
        /*if ((moveCt >= 9) && !isWinner(board, player)) {
            playtime = false;
            return true;
        }
*/
        // if all spaces full and no one won, its a cat.
        int fulls = 0;
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {
                 if (board[r][c] != ' ') {
                     fulls++;
                }
            }
        }
        if ((fulls == 9) && !(isWinner(board, 'X') || (isWinner(board, 'O')))) {
            playtime = false;
            return true;
        }
        return false;
    }
}


