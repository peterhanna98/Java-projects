import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        // Create a scanner
        Scanner input = new Scanner(System.in);

        // Enter investment amount
        System.out.print("Enter Investment Amount:");
        double investmentAmount = input.nextDouble();

        //Enter monthly interest rate
        System.out.print("Enter Monthly Interest Rate:");
        double monthlyInterestRate = input.nextDouble();


        //Enter Number Of Years
        System.out.print("Enter Number of Years:");
        double numberOfYears = input.nextDouble();

        // Calculate future investment
        double futureInvestmentValue = investmentAmount * Math.pow(1+ monthlyInterestRate / 1200,numberOfYears * 12);

        // results for future investment
        System.out.println("Accumulated value is"+ " " + futureInvestmentValue);


    }
}