package Q1;

public class Q1_2 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 10; i < 50; i++) {
            System.out.print(i + " ");
            count++;
            if (count == 10) {
                System.out.println();
                count = 0;
            }
        }
    }
    }

