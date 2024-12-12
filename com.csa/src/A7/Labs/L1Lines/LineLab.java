package A7.Labs.L1Lines;

import javax.sound.sampled.Line;
import java.util.Scanner;

public class LineLab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter point one...");
        System.out.println("Enter the x value:");
        double x1 = scan.nextDouble();
        System.out.println("Enter the y value:");
        double y1 = scan.nextDouble();
        System.out.print("\n");

        System.out.println("Enter point two...");
        System.out.println("Enter the x value:");
        double x2 = scan.nextDouble();
        System.out.println("Enter the y value:");
        double y2 = scan.nextDouble();
        System.out.print("\n");

        MyPoint p1 = new MyPoint(x1,y1);
        MyPoint p2 = new MyPoint(x2,y2);
        MyLine line = new MyLine(p1,p2);
        int sel = 0;
        while (sel >= 0 && sel < 5) {
            System.out.println("-Main Menu-\n1. Replace Line\n2. Change Point 1\n3. Change Point 2\n4. View line Information\n5. Exit\nEnter selection:\n");
            sel = scan.nextInt();
            if (sel == 1) {
                System.out.println("Enter point one...");
                System.out.println("Enter the x value:");
                x1 = scan.nextDouble();
                System.out.println("Enter the y value:");
                y1 = scan.nextDouble();
                System.out.print("\n");

                System.out.println("Enter point two...");
                System.out.println("Enter the x value:");
                x2 = scan.nextDouble();
                System.out.println("Enter the y value:");
                y2 = scan.nextDouble();
                System.out.print("\n");

                p1 = new MyPoint(x1,y1);
                p2 = new MyPoint(x2,y2);
                line = new MyLine(p1,p2);
                continue;
            }
            if (sel == 2) {
                System.out.println("Enter the new point one...");
                System.out.println("Enter the x value:");
                x1 = scan.nextDouble();
                System.out.println("Enter the y value:");
                y1 = scan.nextDouble();
                System.out.print("\n");

                p1 = new MyPoint(x1,y1);
                p2 = new MyPoint(x2,y2);
                line = new MyLine(p1,p2);
                continue;
            }
            if (sel == 3) {
                System.out.println("Enter the new point two...");
                System.out.println("Enter the x value:");
                x2 = scan.nextDouble();
                System.out.println("Enter the y value:");
                y2 = scan.nextDouble();
                System.out.print("\n");

                p1 = new MyPoint(x1,y1);
                p2 = new MyPoint(x2,y2);
                line = new MyLine(p1,p2);
                continue;
            }
            if (sel == 4) {
                System.out.print("Line Data:\n" + line);
                continue;
            }
            if (sel == 5) {
                System.out.print("Goodbye.");
                break;
            }
        }


    }
}

