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
        moveCount = 0;
    }
    public A10_Maze(char[][] load) { // constructor
        maze = new char[load.length][load[0].length];
        maze = load;

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
        if (maze[playerRow][playerColumn] == maze[4][0]) {
            return true;
        }
        else return false;
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
        if (direction == 'A') { // left
            if (playerColumn > 0) {
                if (valid.contains("" + maze[playerRow][playerColumn - 1])) {
                    playerRow = playerColumn - 1;
                    moveCount++;
                    return true;
                }
            }
            else return false;
        }
        if (direction == 'S') { // down
            if (playerRow < maze.length - 1) {
                if (valid.contains("" + maze[playerRow + 1][playerColumn])) {
                    playerRow = playerRow + 1;
                    moveCount++;
                    return true;
                }
            }
            else return false;
        }
        if (direction == 'D') { // right
            if (playerColumn < maze.length - 1) {
                if (valid.contains("" + maze[playerRow][playerColumn + 1])) {
                    playerRow = playerColumn + 1;
                    moveCount++;
                    return true;
                }
            }
            else return false;
        }

        else return false;
        return false;
    }
    public String toString() {
        // iter thru all indexes and add to mazePrint string. if its the last one in a row, add \n. if its the player positon, print x.
        for (int r = 0; r < maze.length; r++) {
            for (int c = 0; c < maze[0].length; c++) {
                // if last in row and player position
                if ((c == maze[r].length - 1) && (maze[playerRow][playerColumn] == maze[r][c])) {
                    mazePrint += "X\n";
                }
                // else if just last in row
                else if (c == maze[r].length - 1) {
                    mazePrint += maze[r][c] + "\n";
                }
                // else if just player position
                else if (maze[playerRow][playerColumn] == maze[r][c]) {
                    mazePrint += "X";
                }
                // else just add the current index val to mazeprint
                else mazePrint += maze[r][c];
            }
        }
        return mazePrint;
    }
}
