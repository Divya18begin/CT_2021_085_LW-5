package Q5;
//PALINDROME CHECKER FOR NUMBERS

import java.util.Scanner;

public class Q5_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int original = num;
        int reversed = 0;

        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        if (original == reversed) {
            System.out.println("It is a palindrome number.");
        } else {
            System.out.println("It is not a palindrome number.");
        }
    }
}
