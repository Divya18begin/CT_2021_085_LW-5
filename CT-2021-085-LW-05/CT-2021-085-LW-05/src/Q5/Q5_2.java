package Q5;

import java.util.Scanner;

public class Q5_2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a word or phrase or number or other sequence characters:");
        String input=scanner.nextLine().replaceAll("[^a-zA-Z0-9]","").toLowerCase();

        boolean isPalindrome = true;
        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
        System.out.println(isPalindrome ? "It is a palindrome." : "It is not a palindrome.");
    }
}
