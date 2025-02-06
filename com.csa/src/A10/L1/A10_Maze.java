package A10.L1;

public class A10_Maze {
    public static char[][] maze;
    public static int playerColumn;
    public static int playerRow;
    public static int moveCount;

    public static String valid = "SE-";
    public static String mazePrint = "";

    public A10_Maze() { // constructor
        maze = new char[][]
               {{'W','W','W','W','W','-'},
                {'S','-','-','-','W','-'},
                {'W','W','W','-','W','-'},
                {'W','-','W','-','W','-'},
                {'E','-','W','-','-','-'},
                {'W','-','-','-','W','W'}};
        playerRow = 1;
        playerColumn = 0;
        moveCount = 0;
    }
    public A10_Maze(char[][] load) { // constructor
        maze = new char[load.length][load[0].length];
        for (int r = 0; r < load.length; r++) {
            for (int c = 0; c < load[0].length; c++) {
                maze[r][c] = load[r][c];
            }
        }

        // make for loop to find where start is
        for (int r = 0; r < maze.length; r++) {
            for (int c = 0; c < maze[0].length; c++) {
                if ('S' == maze[r][c]) {
                    playerRow = r;
                    playerColumn = c;
                }
            }
        }
    }

    // methods below
    public boolean won () {
        int endRow = 0;
        int endCol = 0;
        for (int r = 0; r < maze.length; r++) {
            for (int c = 0; c < maze[0].length; c++) {
                if ('E' == maze[r][c]) {
                    endRow = r;
                    endCol = c;
                }
            }
        }
        return (playerRow == endRow) && (playerColumn == endCol);
    }
    public int getMoveCount() {
        return moveCount;
    }
    public int getPlayerRow() {
        return playerRow;
    }
    public int getPlayerColumn() {
        return playerColumn;
    }
    public boolean move(char direction) {
        /*
        1. check what direction was given
        2. check if the move is possible (array)
        3. check if the move is valid (maze)
        */
        int newRow = playerRow;
        int newCol = playerColumn;
        if (direction == 'W') { // up
            if (playerRow > 0) {
                if (valid.contains("" + maze[playerRow - 1][playerColumn])) {
                    playerRow = playerRow - 1;
                    moveCount++;
                    return true;
                }
            }
            else return false;
        }
        else if (direction == 'A') { // left
            if (playerColumn > 0) {
                if (valid.contains("" + maze[playerRow][playerColumn - 1])) {
                    playerColumn = playerColumn - 1;
                    moveCount++;
                    return true;
                }
            }
            else return false;
        }
        else if (direction == 'S') { // down
            if (playerRow < maze.length - 1) {
                if (valid.contains("" + maze[playerRow + 1][playerColumn])) {
                    playerRow = playerRow + 1;
                    moveCount++;
                    return true;
                }
            }
            else return false;
        }
        else if (direction == 'D') { // right
            if (playerColumn < maze[0].length - 1) {
                if (valid.contains("" + maze[playerRow][playerColumn + 1])) {
                    playerColumn = playerColumn + 1;
                    moveCount++;
                    return true;
                }
            }
            else return false;
        }

        else return false; // invalid input
        return false;
    }
    public String toString() {
        // iter thru all indexes and add to mazePrint string. if its the last one in a row, add \n. if its the player positon, print x.
        mazePrint = "";
        for (int r = 0; r < maze.length; r++) {
            for (int c = 0; c < maze[0].length; c++) {
                // if player position
                if ((playerRow == r) && (playerColumn == c)) {
                    mazePrint += "X";
                }
                // else just add the current index val to mazeprint
                else mazePrint += maze[r][c];
            }
            if (r < maze.length - 1) {
                mazePrint += "\n";
            }
        }
        return mazePrint;
    }
}
