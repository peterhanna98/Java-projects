import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Creating a new scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter one character (only one): ");
        String letter = input.nextLine().toUpperCase();

        // Checking if the user enter one character
        if (letter.length() != 1){
            System.out.println("You must enter only one character");
            System.exit(1);
        }

        // Displaying the number for the character that was entered
        char ch = Character.toUpperCase(letter.charAt(0));

        if (ch == 'A' || ch == 'B' || ch == 'C'){
            System.out.println("The number is " + 2);

        } else if (ch == 'D' || ch == 'E' || ch == 'F') {
            System.out.println("The number is " + 3);
        } else if (ch == 'G' || ch == 'H' || ch == 'I') {
            System.out.println("The number is " + 4);
        } else if (ch == 'J' || ch == 'K' || ch == 'L') {
            System.out.println("The number is " + 5);
        } else if (ch == 'M' || ch == 'N' || ch == 'O') {
            System.out.println("The number is " + 6);
        } else if (ch == 'P' || ch == 'Q' || ch == 'R' || ch == 'S') {
            System.out.println("The number is " + 7);
        } else if (ch == 'T' || ch == 'U' || ch == 'V') {
            System.out.println("The number is " + 8);
        } else if (ch == 'W' || ch == 'X' || ch == 'Y' || ch == 'Z') {
            System.out.println("The number is " + 9);
        } else {
            System.out.println(ch + " is an invalid input");
        }

    }
}