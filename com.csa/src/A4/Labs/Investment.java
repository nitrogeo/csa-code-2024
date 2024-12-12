package A4.Labs;
import java.util.Scanner;
import java.lang.Math;

public class Investment {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in); // make a new Scanner called "keyboard"

        System.out.print("Enter the amount of money you are investing:\n");
        double investmentAmount = keyboard.nextDouble(); // The amount being invested
        System.out.print("Enter the annual interest rate on your investment:\n");
        double annualInterestRate = keyboard.nextDouble(); // The annual interest rate on the investment
        System.out.print("Enter the number of years that you are planning to invest for (whole number):\n\n");
        int years = keyboard.nextInt(); // The length of the investment

        // double monthlyInterestRate = annualInterestRate/1200;
        // double totalAfterInvestment = investmentAmount * (1 + Math.pow(monthlyInterestRate, (years*12)));
        double profit = totalInAccount(investmentAmount, annualInterestRate, years) - investmentAmount;

        System.out.printf("Investing $%.2f over %d years at an annual interest rate of %.2f%% you would earn $%.2f, giving you a total of $%.2f", investmentAmount, years, annualInterestRate, profit, totalInAccount(investmentAmount, annualInterestRate, years));
    }
    public static double totalInAccount (double investmentAmount, double annualInterestRate, int years)
    {
        double monthlyInterestRate = annualInterestRate / 1200;
        double totalInAccountdone = investmentAmount  * Math.pow(1 +monthlyInterestRate, years*12);
        return totalInAccountdone;
    }
}