abstract class IP{

   public abstract void performanceeval();
   public abstract void Assignment();

   //contract methods :: defined classes in abstract class
   public void internal_exam()
   {
       System.out.println("internals will be in next month !");
   }
   
   public void external_exam()
   {
    System.out.println("Externals in december !");
   }
}


class Jims extends IP
{
     public void Assignment()
     {
         System.out.println("Assignments uploaded !");
     }
     public void performanceeval()
     {
           System.out.println("Performance will be evaluated !! ");
     }
     public void Talent_hunt()
     {
        System.out.println("There will be a talent hunt show next week !");
     }

     public static void main(String[] args) {
        Jims j=new Jims();
        j.Talent_hunt();
        j.Assignment();
        j.performanceeval();

        j.external_exam();
        j.internal_exam();
     }
}