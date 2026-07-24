import java.util.Scanner;

public class PrimeNumber {
    public static Boolean PrimeNumber(int num) {
        if (num <= 1) { //                  Function to check prime or not
            return false;
        }
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        // Intilize Scanner class 

        System.out.println("Enter starting range:");        
        int start = sc.nextInt();

        System.out.println("Enter ending range:");
        int end = sc.nextInt();

        int count = 0;
        for (int i = start; i <= end; i++) {
            if (PrimeNumber(i)) {
                System.out.println(i);
                count++;
            }
        }

        System.out.println("Total number of prime numbers are " + count);
    }
}
