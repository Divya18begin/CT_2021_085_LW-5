package Q2;

import java.util.Scanner;

public class Q2 {
    public static int countDigit(int number){
        return String.valueOf(number).length();
        //to convert integer to string and getting the length
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        while(true){
            System.out.println("Enter an integer(Negative to stop):");
            int input= scanner.nextInt();

            if(input<0){
                System.out.println("Negative number is entered so, programme is terminated");
                break;
            }

            System.out.println("Number of digits :"+countDigit(input));
        }

    }
}
