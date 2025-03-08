import java.util.Scanner;

public class Array_valuesExists {
      public static void main(String[] args) {
              
               int [] arr={1,7,8,3,4,55,23,44,76,100};
               Scanner sc=new Scanner(System.in);
          
            System.out.println("Enter a val from user : ");
            int val=sc.nextInt();
            boolean flag=false;
          
            for(int i=0;i<arr.length;i++)
            {
                if(arr[i]==val)
                {
                    System.out.println("val found at index " +i +" and val is "+arr[i]);
                    flag=true;
                }
            }
            if(flag==false)
            {
                System.out.println("No such val found !");
            }
                  
      }
}
