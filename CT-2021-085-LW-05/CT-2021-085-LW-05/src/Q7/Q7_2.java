package Q7;

import java.util.Scanner;

public class Q7_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        System.out.print("Word to replace: ");
        String oldWord = sc.nextLine();

        System.out.print("Replacement word: ");
        String newWord = sc.nextLine();

        String result = sentence.replace(oldWord, newWord);
        System.out.println("Updated sentence: " + result);
    }
}
