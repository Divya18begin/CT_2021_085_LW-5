package Q6;

import java.util.Random;
import java.util.Scanner;

public class Q6_3 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNum = random.nextInt(100) + 1;

        Scanner input = new Scanner(System.in);
        int guess = 0;

        System.out.println("I've generated a number between 1 and 100.");
        System.out.println("Try to guess it!");

        while (guess != randomNum) {
            System.out.print("Enter your guess: ");
            guess = input.nextInt();

            int diff = Math.abs(randomNum - guess);

            if (guess == randomNum) {
                break;
            } else if (diff >= 20) {
                System.out.println(guess < randomNum ? "Too low!" : "Too high!");
            } else if (diff >= 10) {
                System.out.println(guess < randomNum ? "Low!" : "High!");
            } else if (diff >= 5) {
                System.out.println(guess < randomNum ? "Close, but low!" : "Close, but high!");
            } else {
                System.out.println(guess < randomNum ? "Very close, a bit low!" : "Very close, a bit high!");
            }
        }

        System.out.println("Correct! The number was " + randomNum);
    }
}
