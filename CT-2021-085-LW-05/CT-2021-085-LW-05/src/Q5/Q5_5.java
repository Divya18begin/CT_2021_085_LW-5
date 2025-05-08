package Q5;

import java.util.Scanner;

public class Q5_5 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter input: ");
            String str = sc.nextLine().replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

            StringBuilder sb = new StringBuilder(str);
            System.out.println(str.equals(sb.reverse().toString()) ? "It is a palindrome." : "It is not a palindrome.");
        }
    }

