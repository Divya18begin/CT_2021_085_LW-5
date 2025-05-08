package Q5;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter a word or phrase or number or other sequence characters:");
        String input=scanner.nextLine().replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        //This removes everything that is not a letter or digit (i.e., spaces, punctuation, special characters).

        String reversed="";
        for(int i=input.length()-1; i>=0; i--){
            reversed += input.charAt(i);
        }
        if (input.equals(reversed)) {
            System.out.println("It is a palindrome.");
        } else {
            System.out.println("It is not a palindrome.");
        }//Compares the **original cleaned input** with the **reversed string**-----`.equals()` checks if they are **exactly the same**.
    }
}
