package A13;

public class Maze {
    public static boolean isSolvable (char[][] maze, boolean[][] beenThere, int column, int row) {
        /*
        check all directions
        - check for confines of array
        - check for walls
        - check for beenthere

        check if a spot can end up being true (no wall and in bounds)
        */

        // element checks
        // if out of bounds
        if (row < 0 || column < 0 || row >= maze.length || column >= maze[0].length) {
            return false;
        }
        // if element is win OR youve been there, dont go
        if (maze[row][column] == 'W' || beenThere[row][column]) {
            return false;
        }
        // if end
        if (maze[row][column] == 'E') {
            return true;
        }
        beenThere[row][column] = true;

        // direction checks
        // right
        if(isSolvable(maze, beenThere, column + 1, row)) {
            return true;
        }
        // left
        else if(isSolvable(maze, beenThere, column - 1, row)) {
            return true;
        }
        // up
        else if(isSolvable(maze, beenThere, column, row - 1)) {
            return true;
        }
        // down
        else if(isSolvable(maze, beenThere, column, row + 1)) {
            return true;
        }
        return false;
    }
}
