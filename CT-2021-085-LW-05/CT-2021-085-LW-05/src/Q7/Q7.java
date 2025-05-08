package Q7;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        System.out.print("Word to replace: ");
        String word = scanner.nextLine();

        System.out.print("Replacement word: ");
        String replace = scanner.nextLine();

        String[] parts = sentence.split("\\b");
        StringBuilder result = new StringBuilder();

        for (String part : parts) {
            if (part.equalsIgnoreCase(word)) {
                result.append(replace);
            } else {
                result.append(part);
            }
        }

        System.out.println("Updated sentence: " + result.toString());
    }
}
