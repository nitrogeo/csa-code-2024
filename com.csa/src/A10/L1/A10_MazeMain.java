package A10.L1;
import java.sql.SQLOutput;
import java.util.Scanner;

public class A10_MazeMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        A10_Maze maze = new A10_Maze();
        boolean moveCheck = false;
        System.out.println(maze.toString());
        while (!maze.won()){ // while game still going
            System.out.println("Enter move (W - up, A - left, S - Down, D - Right):");
            char sentmove = scan.next().charAt(0);
            moveCheck = maze.move(sentmove);

            if (!moveCheck) { // if move invalid
                System.out.println("Invalid move");
                continue;
            }
            // if valid print the current maze
            else {
                maze.move(sentmove);
                System.out.println(maze.toString());
            }
        }
        if (maze.won()) {
            System.out.println("Congratulations you solved the maze in " + maze.getMoveCount() + " moves!");
        }
    }
}
