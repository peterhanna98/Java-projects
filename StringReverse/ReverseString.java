import java.util.Scanner;

public class ReverseString{
    public static void main(String[] args) {
        
        // New Scanner 
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome To The Reversing String Program In Java.\n");

        System.out.print("Please enter a string: ");
        // Getting user input
        String userInput = scan.nextLine().trim();
        // If the input was an empty string the system will exit!
        if(userInput.isEmpty()){
            System.out.println("Error: Empty String!");
            System.exit(0);
        }
        // Creating a new String reverse that use Java methods to reverse the userInput 
        String reverse = new StringBuffer(userInput).reverse().toString();
        
        System.out.println("The reverse of the string you entered is: " + reverse);


        scan.close();
        
    }
}