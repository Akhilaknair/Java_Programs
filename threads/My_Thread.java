import java.util.*;
class My_Thread extends Thread
{
    My_Thread()
    {
         start();
    }
    public void run()
    {
         System.out.println("Thread are working!");
    }
    public static void main(String[] args)
    {
        
       
      
        for(int i=1;i<=5;i++)
        {
             My_Thread thread = new My_Thread(); // Create a new child thread
            thread.start(); // Start the child thread
            for(int j=1;j<10;j++)
            {
                System.out.println(i+" * "+j+" = "+(i*j));
            }
         
            System.out.println("*******************");
        }
      
    }
}