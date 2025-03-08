import java.util.Scanner;

public class FiboSeries {

    
    public static void printFibonacci(int terms) {
        int first = 0, second = 1;

      
        if (terms >= 1) {
            System.out.print(first + " ");
        }
        if (terms >= 2) {
            System.out.print(second + " ");
        }

      
        for (int i = 3; i <= terms; i++) {
            int next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the number of terms for the Fibonacci series: ");
        int terms = scanner.nextInt();

        System.out.print("Fibonacci series up to " + terms + " terms: ");
        printFibonacci(terms);

        
    }
}

