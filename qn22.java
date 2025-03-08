import java.util.Scanner;

public class qn22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        
        System.out.println("Enter 10 integer values:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Value " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        
        int[] ascending = numbers;
        
        for (int i = 0; i < ascending.length - 1; i++) {
            for (int j = i + 1; j < ascending.length; j++) {
                if (ascending[i] > ascending[j]) {
                    int temp = ascending[i];
                    ascending[i] = ascending[j];
                    ascending[j] = temp;
                }
            }
        }

       
      

      
        System.out.println("Array in Ascending Order: ");
        for (int i=0;i<ascending.length;i++) {
            System.out.print(ascending[i]+ " ");
        }
        System.out.println();

        System.out.println("Array in Descending Order: ");
        for (int i=ascending.length-1;i>=0;i--) {
            System.out.print(ascending[i]+ " ");
        }
       

    }
}
