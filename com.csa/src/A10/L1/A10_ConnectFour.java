package A10.L1;

public class A10_ConnectFour {
    // attributes
    public static final int PLAYING = 0;
    public static final int RED_WINS = 1;
    public static final int BLACK_WINS = 2;
    public static final int DRAW = 3;
    public static final int RED = 4;
    public static final int BLACK = 5;
    public static final int EMPTY = 6;

    private int[][] board =
            {{0,0,0,0,0,0},
            {0,0,0,0,0,0},
            {0,0,0,0,0,0},
            {0,0,0,0,0,0},
            {0,0,0,0,0,0},
            {0,0,0,0,0,0}};
    private String[][] outline =
           {{"| "," | "," | "," | "," | "," | "," | "," |"},
            {"| "," | "," | "," | "," | "," | "," | "," |"},
            {"| "," | "," | "," | "," | "," | "," | "," |"},
            {"| "," | "," | "," | "," | "," | "," | "," |"},
            {"| "," | "," | "," | "," | "," | "," | "," |"},
            {"| "," | "," | "," | "," | "," | "," | "," |"},
            {"| "," | "," | "," | "," | "," | "," | "," |"},
            {"-------------------------------------------"}};

    // constructors
    void A16_ConnectFour() {
        int[][] board =
               {{6,6,6,6,6,6},
                {6,6,6,6,6,6},
                {6,6,6,6,6,6},
                {6,6,6,6,6,6},
                {6,6,6,6,6,6},
                {6,6,6,6,6,6}};
    }

    // methods below
    boolean dropPiece (int column, int player) {
        // iters thru the col starting at the bottom and checks if space empty.
        // if so, place plaer token.
        // ...
        // when a
        for (int r = 0; r < board.length; r++) {
            if (board[r][column] == 6) {
                board[r][column] = player;
            }
        }
        return false;
    }
    int status() {
        int fulls = 0;
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {
                if (board[r][c] != 6) {
                    fulls++;
                }
            }
        }

        for(int r=0; r<6;r++) {
            for(int c=0; c<=3; c++) {
                if(board[r][c] == RED && board[r][c+1] == RED
                    && board[r][c+2] == RED && board[r][c+3] == RED)
                        return RED_WINS;
                else if(board[r][c] == BLACK && board[r][c+1] == BLACK
                    && board[r][c+2] == BLACK && board[r][c+3] == BLACK)
                        return BLACK_WINS;
            }
        }

        if (fulls == 42) {
            return 3;
        }
        return 0;
    }

    // iter thru every row of the given col. for every full cell, add to fulls. when done, if every row is filled (fulls = 6), then return true (col is full)
    boolean columnFull(int column) {
        int fulls = 0;
        for (int r = 0; r < board.length; r++) {
            if (board[r][column] != 6) {
                fulls++;
            }
        }
        if (fulls == 6) {
            return true;
        }
        else return false;
    }

    int[][] getBoard() {
        int[][] gotBoard =
               {{board[0][0], board[0][1], board[0][2], board[0][3], board[0][4], board[0][5]},
                {board[1][0], board[1][1], board[1][2], board[1][3], board[1][4], board[1][5]},
                {board[2][0], board[2][1], board[2][2], board[2][3], board[2][4], board[2][5]},
                {board[3][0], board[3][1], board[3][2], board[3][3], board[3][4], board[3][5]},
                {board[4][0], board[4][1], board[4][2], board[4][3], board[4][4], board[4][5]},
                {board[5][0], board[5][1], board[5][2], board[5][3], board[5][4], board[5][5]}};
        return gotBoard;
    }
    void draw() {
        // double for to print bar then decides the cell
        String[][] drawnBoard =
               {{board[0][0] + outline[0][0] + board[0][1] + outline[0][1] + board[0][2] + outline[0][2] + board[0][3] + outline[0][3] + board[0][4] + outline[0][4] + board[0][5]},
                {board[1][0] + outline[0][0] + board[1][1] + outline[0][1] + board[1][2] + outline[0][2] + board[1][3] + outline[0][3] + board[1][4] + outline[0][4] + board[1][5]},
                {board[2][0] + outline[0][0] + board[2][1] + outline[0][1] + board[2][2] + outline[0][2] + board[2][3] + outline[0][3] + board[2][4] + outline[0][4] + board[2][5]},
                {board[3][0] + outline[0][0] + board[3][1] + outline[0][1] + board[3][2] + outline[0][2] + board[3][3] + outline[0][3] + board[3][4] + outline[0][4] + board[3][5]},
                {board[4][0] + outline[0][0] + board[4][1] + outline[0][1] + board[4][2] + outline[0][2] + board[4][3] + outline[0][3] + board[4][4] + outline[0][4] + board[4][5]},
                {board[5][0] + outline[0][0] + board[5][1] + outline[0][1] + board[5][2] + outline[0][2] + board[5][3] + outline[0][3] + board[5][4] + outline[0][4] + board[5][5]},
                {outline[7][0]}};
        for (int c = 0; c < board[0].length; c++) {
            for (int r = 0; r < board.length; r++) {
                
            }
        }
    }
}
