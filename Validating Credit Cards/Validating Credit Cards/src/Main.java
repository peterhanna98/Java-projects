import java.util.Scanner;
public class Main {
    // Main Method
    public static void main(String[] args) {

        //Create new scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter Card Number
        System.out.print("Enter a credit card number as a long integer ");
        long cardNum = input.nextLong();
        System.out.println(cardNum + " is " + (checkIfCardValid(cardNum) ? "valid" : "invalid"));

    }

    // Returning true if the card number is valid
    public static boolean checkIfCardValid(long cardNum) {
        return (theSize(cardNum) >= 13 && theSize(cardNum) <= 16) && (match(cardNum, 4)
                || match(cardNum, 5) || match(cardNum, 37) || match(cardNum, 6))
                && ((sumEven(cardNum) + sumOdd(cardNum)) % 10 == 0);

    }
    // Doubling every second digit from right to left
    public static int sumEven(long cardNum) {

        int sum = 0;
        String num = cardNum + "";
        for (int i = theSize(cardNum) - 2; i >= 0; i -= 2)
            sum += getDigit(Integer.parseInt(num.charAt(i) + "") * 2);
        return sum;
    }
    // Return the card number if it is a single digit. or the sum of the two digits
    public static int getDigit(int cardNum) {
        if (cardNum < 9)
            return cardNum;
        return cardNum / 10 + cardNum % 10;
    }
    // Return the sum of odd digits from right to left
    public static int sumOdd(long cardNum) {
        int sum = 0;
        String num = cardNum + "";
        for (int i = theSize(cardNum) - 1; i >= 0; i -= 2)
            sum += Integer.parseInt(num.charAt(i) + "");
        return sum;
    }
    // Return true if the digit d is a prefix for cardNum
    public static boolean match(long cardNum, int d) {
        return getPreFix(cardNum, theSize(d)) == d;
    }
    // Return the number of digits in d
    public static int theSize(long d) {
        String num = d + "";
        return num.length();
    }

    // Return the first k number of digits from cardNum.
    // If the number of digits in cardNum is less than k, return Card number.
    public static long getPreFix(long cardNum, int k) {
        if (theSize(cardNum) > k) {
            String num = cardNum + "";
            return Long.parseLong(num.substring(0, k));

        }
        return cardNum;
    }
}