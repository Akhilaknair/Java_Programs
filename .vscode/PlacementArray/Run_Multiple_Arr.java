public class Run_Multiple_Arr {
  
    public static void runAlterArr(int[]arr1 ,int[]arr2)
    {
        int n=arr1.length;
        System.out.println("Alter array :: ");
          for(int i=0;i<n;i++)
          {
             System.out.print(arr1[i] + " " +arr2[i] + " ");
          }
    }

       public static void main(String[] args) 
       {
              
        int []arr1={1,4,6,7,9,2};
        int []arr2={-1,-4,-6,-7,-9,-2};
        runAlterArr(arr1,arr2);

       }
}
