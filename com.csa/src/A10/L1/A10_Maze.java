package A10.L1;

public class A10_Maze {
    char[][] maze;
    int playerColumn;
    int playerRow;
    int moveCount;

    String valid = "SE-";

    public A10_Maze() { // constructor
        maze = new char[][]
                {{'W','W','W','W','W','-'},
                        {'S','-','-','-','W','-'},
                        {'W','W','W','-','W','-'},
                        {'W','-','W','-','W','-'},
                        {'E','-','W','-','-','-'},
                        {'W','-','-','-','W','W'}};
        playerRow = maze[1][0];
        moveCount = 0;
    }
    public A10_Maze(char[][] load) { // constructor
        char[][] newarg = new char[load.length][load[0].length];
        maze = load;

        playerRow = maze[1][0];
        moveCount = 0;
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
    boolean move(char direction) {
        /*
        1. check what direction was given
        2. check if the move is possible (array)
        3. check if the move is valid (maze)
        */
        if (direction == 'W') { // up
            if (playerRow < maze.length) {
                if (valid.contains("" + maze[playerRow - 1][playerColumn])) {
                    playerRow = playerRow - 1;
                    moveCount++;
                    return true;
                }
            }
            else return false;
        }
        if (direction == 'A') { // left
            if (playerColumn < maze.length) {
                if (valid.contains("" + maze[playerRow][playerColumn - 1])) {
                    playerRow = playerColumn - 1;
                    moveCount++;
                    return true;
                }
            }
            else return false;
        }
        if (direction == 'S') { // down
            if (playerRow < maze.length) {
                if (valid.contains("" + maze[playerRow + 1][playerColumn])) {
                    playerRow = playerRow + 1;
                    moveCount++;
                    return true;
                }
            }
            else return false;
        }
        if (direction == 'D') { // right
            if (playerColumn < maze.length) {
                if (valid.contains("" + maze[playerRow][playerColumn + 1])) {
                    playerRow = playerColumn + 1;
                    moveCount++;
                    return true;
                }
            }
            else return false;
        }
        return false;
    }
    public String toString() {
        return String.format("(%5.2f): " + getItemName() + " - " + getFlavor() + " ice cream in a(n) " + getContainer() + " with " + getToppings() + ".",
                cost);
    }
}
