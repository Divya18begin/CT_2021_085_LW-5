package Q7;

import java.util.Scanner;

public class Q7_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get inputs
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        System.out.print("Word to replace: ");
        String target = scanner.nextLine();

        System.out.print("Replacement word: ");
        String replacement = scanner.nextLine();

        // Split sentence into words
        String[] words = sentence.split(" ");
        StringBuilder newSentence = new StringBuilder();

        boolean foundCaseInsensitive = false;
        boolean foundExactMatch = false;

        for (String word : words) {
            if (word.equals(target)) {
                // Case-sensitive match
                newSentence.append(replacement).append(" ");
                foundExactMatch = true;
            } else {
                // Check if the word matches ignoring case
                if (word.equalsIgnoreCase(target)) {
                    foundCaseInsensitive = true;
                }
                newSentence.append(word).append(" ");
            }
        }

        System.out.println("\nUpdated sentence: " + newSentence.toString().trim());

        if (!foundExactMatch && foundCaseInsensitive) {
            System.out.println("The word exists with a different case (e.g., '" + target + "' vs '"
                    + capitalizeDifferent(target, sentence) + "') but was not replaced due to case sensitivity.");
        } else if (!foundExactMatch) {
            System.out.println("No exact match of the word '" + target + "' found.");
        }
    }

    // Helper method to find a mismatched case version
    private static String capitalizeDifferent(String target, String sentence) {
        for (String word : sentence.split(" ")) {
            if (word.equalsIgnoreCase(target) && !word.equals(target)) {
                return word;
            }
        }
        return target;
    }
}
