package Q6;

import java.util.Random;
import java.util.Scanner;

public class Q6_2 {
    public static void main(String[] args) {

        Random random = new Random();
        int randomNum = random.nextInt(100) + 1;
        Scanner input = new Scanner(System.in);
       int guess = 0;
        int attempts = 0;

        System.out.println("Number between 1-100 selected. Try to guess it!");

        while (guess != randomNum) {
            System.out.print("Guess: ");
            guess = input.nextInt();
            attempts++;

            int diff = Math.abs(guess - randomNum);

            if (guess == randomNum) {
                break;
            } else if (diff > 20) {
                System.out.println(guess < randomNum ? "Too low!" : "Too high!");
            } else if (diff > 10) {
                System.out.println(guess < randomNum ? "Low!" : "High!");
            } else if (diff > 5) {
                System.out.println(guess < randomNum ? "Almost there! Low!" : "Almost there! High!");
            } else {
                System.out.println(guess < randomNum ? "Very close, bit low!" : "Very close, bit high!");
            }
        }

        System.out.println("Correct! The number was " + randomNum);
        System.out.println("You took " + attempts + " guesses.");

        // Give a fun ranking
        if (attempts <= 3) {
            System.out.println("🥇 Genius Guesser!");
        } else if (attempts <= 6) {
            System.out.println("🥈 Smart Player!");
        } else {
            System.out.println("🥉 You got there! Keep practicing.");
        }


    }

}
