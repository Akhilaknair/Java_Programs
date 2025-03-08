import java.util.ArrayList;

public class Array_with_no_duplicates {

     public static int[] FindUniq(int []arr)
     {
        ArrayList<Integer> list=new ArrayList<>();

        for(int i=0;i<arr.length;i++)
        {
            if(!list.contains(arr[i]))
            {
                list.add(arr[i]);
            }
        }
        int[] uniqarr=new int[list.size()];
        for(int i=0;i<list.size();i++)
        {
             uniqarr[i] =list.get(i);
        }
        return uniqarr ;
     }

    public static void main(String[] args) {
          
        int []arr={1,3,4,5,6,9,2,3,3,6};
        //get new uniqarr
            int[] uniqarr=FindUniq(arr);
           
            for(int i=0;i<uniqarr.length;i++)
            {
                System.out.print(uniqarr[i]+" ");
            }
            
            

    }
}
