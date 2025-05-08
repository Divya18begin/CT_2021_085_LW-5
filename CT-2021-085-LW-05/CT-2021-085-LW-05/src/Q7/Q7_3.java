package Q7;

import java.util.Scanner;

public class Q7_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        System.out.print("Word to replace: ");
        String oldWord = scanner.nextLine();

        System.out.print("Replacement word: ");
        String newWord = scanner.nextLine();

        String result = sentence.replaceAll("(?i)\\b" + oldWord + "\\b", newWord);
        System.out.println("Updated sentence: " + result);
    }
}
