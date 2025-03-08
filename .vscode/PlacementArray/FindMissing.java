import java.util.*;
public class FindMissing {
    public static boolean isPresentInArray(int[] arr,int i)
    {
            for(int it:arr)
            {
                   if(it==i)return true;
            }
            return false;
    }
   public static void findMissNo(int []arr)
   {
          for(int i=1;i<=10;i++)
          {
            if(!isPresentInArray(arr,i))
               System.out.println("Missing : " +i);
          }

   }
    public static void main(String[] args) {
         int [] arr={1,2,4,5,6,7,8,9,10};
         findMissNo(arr);
    }
}
