package A10.L1;
import java.sql.SQLOutput;
import java.util.Scanner;

public class A10_MazeMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        A10_Maze maze = new A10_Maze();
        boolean moveCheck = false;
        if (maze.getMoveCount() == 0) {
            System.out.println(maze.toString());
        }
        while (!maze.won()){ // while game still going
            System.out.println("\nEnter move (W - up, A - left, S - Down, D - Right):\n");
            char sentmove = scan.next().charAt(0);
            moveCheck = maze.move(sentmove);

            // if move invalid
            if (!moveCheck) {
                System.out.println("Invalid move");
                continue;
            }
            // if valid print the current maze
            else {
                System.out.println(maze.toString());
            }
        }
        if (maze.won()) {
            System.out.println("\nCongratulations you solved the maze in " + maze.getMoveCount() + " moves!");
        }
    }
}
