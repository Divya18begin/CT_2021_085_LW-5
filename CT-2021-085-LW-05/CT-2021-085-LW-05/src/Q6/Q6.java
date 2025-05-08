package Q6;

import java.util.Random;
import java.util.Scanner;

public class Q6 {
        public static void main(String[] args) {
            Random random = new Random();
            int randomNum = random.nextInt(100) + 1;
            Scanner input = new Scanner(System.in);
            int guess = 0;

            System.out.println("\uD83C\uDFAF A number between 1 and 100 has been chosen!");
            System.out.println("\uD83E\uDD14 Can you guess it?");

            while (guess != randomNum) {
                System.out.print("Your guess: ");
                guess = input.nextInt();
                int diff = Math.abs(guess - randomNum);

                if (guess == randomNum) {
                    break;
                } else if (diff >= 20) {
                    System.out.println(guess < randomNum ? "\uD83D\uDCC9 Way too low!" : "\uD83D\uDCC8 Way too high!");
                } else if (diff >= 10) {
                    System.out.println(guess < randomNum ? "\uFE0FA bit low!" : "\uFE0F A bit high!");
                } else if (diff >= 5) {
                    System.out.println(guess < randomNum ? "\uD83D\uDE2C Close, try higher!" : " \uD83D\uDE2CClose, try lower!");
                } else {
                    System.out.println(guess < randomNum ? "\uD83D\uDD25 Very close! Just a little higher!" : " \uD83D\uDD25Very close! Just a little lower!");
                }
            }

            System.out.println("\uD83C\uDF89 Correct! The number was " + randomNum);
        }
    }


