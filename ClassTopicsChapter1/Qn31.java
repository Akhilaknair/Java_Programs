import java.util.Scanner;
public class Qn31 {
    
           public static void  calavg(int... num)//passed is vararg array
           {
               if(num.length==0)System.out.println("Empty !");
              
               else 
               {
                int sum=0;
                for(int v:num)
                {
                    sum+=v;
                }
                int avg=sum/num.length;
                System.out.println("avg :: "+avg);
               }
           }




           public static void main(String[] args) {

                   int num[]=new int[args.length];
                   for(int i=0;i<args.length;i++)
                   {
                    num[i]=Integer.parseInt(args[i]);//parse it 
                   }
                   calavg(num);
            
           }
    }

 



