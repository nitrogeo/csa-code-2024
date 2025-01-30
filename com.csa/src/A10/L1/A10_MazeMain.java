package A10.L1;
import java.util.Scanner;

public class A10_MazeMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        A10_Maze maze = new A10_Maze();
        boolean moveCheck = false;
        do {
            System.out.println("Enter move (W - up, A - left, S - Down, D - Right):");
            char move = scan.next().charAt(0);
            moveCheck = maze.move(move);

            if (!moveCheck) { // if move invalid
                System.out.println("Invalid move");
            }
            // if valid print the current maze
            else System.out.println(maze.toString());

        } while (!maze.won());
    }
}
