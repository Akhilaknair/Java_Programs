
import java.util.Scanner;

public class Fibonacci {

    
    public static boolean isPerfectSquare(int num) {
        int sqrt = (int) Math.sqrt(num);
        return sqrt * sqrt == num;
    }

    
    public static boolean isFibonacci(int n) {
       
        return isPerfectSquare(5 * n * n + 4) || isPerfectSquare(5 * n * n - 4);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

       
        if (isFibonacci(num)) {
            System.out.println(num + " is part of the Fibonacci series.");
        } else {
            System.out.println(num + " is NOT part of the Fibonacci series.");
        }

        scanner.close();
    }
}
