public class RepeatArr {


  
    public static void hasDupli(int []arr)
    {
        boolean flag=false;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.println("Duplicate is :: "+arr[i]);
                    flag=true;
                }
            }
        }
        if(flag==false)
        {
            System.out.println("No duplicates !");
        }
      
    }
    public static void main(String[] args) {
        int []arr={1,2,3,4,0,5,6,9,2};
       
       hasDupli(arr);
    }
}

class IndexRepeated extends RepeatArr
{
   
    public static int idRepeated(int [] arr)
    {
        //hasDupli(arr);
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])return j;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int []arr={1,2,2,3,4};
        if(idRepeated(arr)==-1)System.out.println("No Repeated index");
        System.out.println(idRepeated(arr));
    }
}

class PrintUniqArrElem extends RepeatArr
{
  
 
    public static void Printuniq(int []arr)
    {
       
        boolean found=false;
      
        for(int i=0;i<arr.length;i++)
        {
           boolean isuni=true;

            //for checking repeaters
            for(int j=0;j<arr.length;j++ )
            {
                 if((i!=j) && (arr[i]==arr[j]))
                 {
                      isuni=false;
                      break;
                 }
            }

            if(isuni==true){
                found=true;
                System.out.println("Uniq val " +arr[i]);
            }

        }

        if(found==false)System.out.println("No uniq elements !");
    }



     public static void main(String[] args)
     {
        int []arr={1,2,5,4,3,6,1,2,3,6};
        Printuniq(arr);
     }


}