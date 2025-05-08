package Q2;
import java.util.Scanner;

public class Q2_2 {
    public static int countDigit(int number){
        if(number==0){
            return 1;
        }
        int count=0;
        while(number>0){
            number/=10;
            count++;
        }
        return count;
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
