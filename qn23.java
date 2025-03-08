import java.util.Scanner;

public class qn23 {
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

       
      

      
       int sum=0;
       int avg=0;
        for (int i=0;i<ascending.length;i++) {
              sum+=ascending[i];
        }
        avg=sum/10;
        System.out.println("Maximum :: " +ascending[ascending.length-1]);
        System.out.println("Minimum :: " +ascending[0]);
        System.out.println("Average :: " +avg);
       

    }
}
