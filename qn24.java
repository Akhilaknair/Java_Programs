import java.util.Scanner;

public class qn24 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        
        System.out.println("Enter 10 integer values:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Value " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < 10; i++) {
                    if(numbers[i]%2==0)
                    {
                        System.err.println("even");
                    }
                    else{
                        System.err.println("odd");
                    }
        }

}
}