import java.util.*;
public class RevArr {
   void reversearr(int []arr)
    {
         int left=0;
         int right=arr.length-1;

         while(left<right)
         {
            int temp;
            temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;

            left++;
            right--;
         }
    }

    public static void main(String[] args) {
          int [] arr={1,2,8,9,4,5,6,3};
          RevArr r=new RevArr();
          r.reversearr(arr);
          for(int i=0;i<arr.length;i++)
          {
            System.out.print( arr[i]+" ");
          }
    }
}
