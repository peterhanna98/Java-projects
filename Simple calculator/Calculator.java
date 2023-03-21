import java.util.Scanner;
import java.util.InputMismatchException;

public class Calculator {
    public static void main(String[] args) {

        System.out.println("\nWelcom to Java calculator");
        System.out.println("*************************");
         
        Scanner scan = new Scanner(System.in);

        try {
            while (true){
                System.out.print("\nEnter first integers: ");
                int num1 = scan.nextInt();
                System.out.print("\nEnter second integers: ");
                int num2 = scan.nextInt();
                System.out.print("\nEnter numerator: ");
                double numerator = scan.nextDouble();
                System.out.print("\nEnter denominator, the number can't be zero: ");
                double denominator = scan.nextDouble();

               while (denominator == 0){
                    System.out.print("\nNUMBER CAN'T BE ZERO, PLEASE ENTER A NUMBER: ");
                    denominator = scan.nextDouble();
                } 
               
                System.out.println("\nThe sum of: " + num1 + " + " + num2 + " = " + sumNum(num1, num2));
                System.out.println("\nThe subtract of: " + num1 + " - " + num2 + " = " + subtNum(num1, num2));
                System.out.println("\nThe multiple of: " + num1 + " * " + num2 + " = " + multNum(num1, num2));
                System.out.println("\nThe divided of: " + numerator + " / " + denominator + " = " + dividNum(numerator, denominator));
        
                
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Program terminated.");
        } finally {
            scan.close();
        } 
        

    }

    public static int sumNum(int a,int b){
        return a + b;
    }

    public static int subtNum(int a, int b){
        return a - b;
    }

    public static int multNum(int a, int b){
        return a * b;
    }

    public static double dividNum (double a, double b){
        return a / b; 
    }
    
}
