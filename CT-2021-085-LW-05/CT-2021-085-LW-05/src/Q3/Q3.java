package Q3;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter an integer:");
        int n= scanner.nextInt();

        System.out.println("**********MULTIPLICATION TABLE OF "+n+"*************");
        for(int i=1; i<11; i++){
            System.out.println(n+"*"+i+"="+(i*n));
        }
    }
}
