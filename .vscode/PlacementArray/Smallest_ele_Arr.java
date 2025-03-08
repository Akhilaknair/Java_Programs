import java.util.Scanner;

public class Smallest_ele_Arr {

        public static int small_ele(int []arr)
        {
            int smallest=arr[0];
            for(int i=1;i<arr.length;i++)
            {
                if(arr[i]<smallest)
                {
                    smallest=arr[i];
                }
            }
            return smallest;
        }

        public static void main(String[] args) {
            int []arr= new int[6];
            for(int i=0;i<6;i++)
            {
                Scanner sc=new Scanner(System.in);
                arr[i]=sc.nextInt();
              
            }
            
            System.out.println("Smallest element : " + small_ele(arr));
        }
}
