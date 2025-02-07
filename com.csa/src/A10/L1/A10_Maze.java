package A10.L1;

public class A10_Maze {
    private char[][] maze;
    private int playerColumn;
    private int playerRow;
    private int moveCount;

    public String valid = "SE-";
    public String mazePrint = "";

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
        return maze[playerRow][playerColumn] == 'E';
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
            newRow--;
        }
        else if (direction == 'A') { // left
            newCol--;
        }
        else if (direction == 'S') { // down
            newRow++;
        }
        else if (direction == 'D') { // right
            newCol++;
        }
        else return false; // move doesnt exist, wrong letter

        if ((newRow >= 0) && (newCol >= 0) && (newRow < maze.length) && (newCol < maze[0].length)) {
            if (valid.contains("" + maze[newRow][newCol])) {
                playerRow = newRow;
                playerColumn = newCol;
                moveCount++;
                return true;
            }
        }
        return false; // move cant exist, wrong direction
    }
    public String toString() {
        // iter thru all indexes and add to mazePrint string. if its the last one in a row, add \n. if its the player positon, print x.
        mazePrint = "\n";
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
        mazePrint += "\n";
        return mazePrint;
    }
}
