import java.util.Scanner;

public class OddEven{
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        // Using boolean isRunning to true to keep the program running.
        boolean isRunning = true;
        // using while with isRunning to keep the program running 
        while (isRunning){

            System.out.print("Please enter number or 'q' to exit: ");
            // Storing the input into String value
            String input = scan.next();
            // if input is 'q' update the isRunning value to false to exit the program 
            if (input.equalsIgnoreCase("q")){
                isRunning = false;
                // if not equal to false the program will keep running 
            } else {
                // using the try/catch to catch invalid inputs 
                try{
                    // storing the number in int/ and changing the string input into Int type
                    int num = Integer.parseInt(input);
                    if (num % 2 == 0){
                        System.out.println(num + " is Even");
                    } else {
                        System.out.println(num + " is Odd");
                    }
                } catch (NumberFormatException e){
                    System.out.println("Invalid input. Please enter a number or 'q' to exit.");
                }
            }
            
        }
        scan.close();
    }

   
}