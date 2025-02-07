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
            {{6,6,6,6,6,6},
            {6,6,6,6,6,6},
            {6,6,6,6,6,6},
            {6,6,6,6,6,6},
            {6,6,6,6,6,6},
            {6,6,6,6,6,6}};;
    private String[][] outline =
           {{"| "," | "," | "," | "," | "," | "," | "," |"},
            {"| "," | "," | "," | "," | "," | "," | "," |"},
            {"| "," | "," | "," | "," | "," | "," | "," |"},
            {"| "," | "," | "," | "," | "," | "," | "," |"},
            {"| "," | "," | "," | "," | "," | "," | "," |"},
            {"| "," | "," | "," | "," | "," | "," | "," |"},
            {"| "," | "," | "," | "," | "," | "," | "," |"}};

    // constructors
    A10_ConnectFour() {

    }

    // methods below
    /*boolean dropPiece (int column, int player) {
        // iters thru the col starting at the bottom and checks if space taken.
        // if not, place player token.
        for (int c = 0; c < board[0].length; c++) {
            for (int r = 0; r < board.length; r++) {

            }
        }
    }
    int status() {
        return 1;
    }
    boolean columnFull(int column) {
        return false;
    }
    int[][] getBoard() {

    }*/
    void draw() {
        // double for to print bar then decides the cell
        for (int c = 0; c < board[0].length; c++) {
            for (int r = 0; r < board.length; r++) {
                
            }
        }
    }
}
