import java.util.*;
public class StudentDetail 
{
 
 
  int perc;
  int marks;
  String fname;
  String lname;
  String qname;

  Scanner s =new Scanner(System.in);
   void accept()
   {
  
      System.out.println("Enter FirstName");
     fname=s.next();
      System.out.println("Enter LastName");
      lname=s.next();
       System.out.println("Enter Qualification");
      qname=s.next();
try{

   System.out.println("Enter Percentage");
    perc=s.nextInt();  

    if(perc <0 || perc>100)
    {
      InvalidPercentage p=new InvalidPercentage();
      throw p;

    }
}
catch(InvalidPercentage e)  
{
     System.out.println("again enter details!");
     accept();
}
    

  System.out.println("Enter Marks");
     marks=s.nextInt();
   
    }

    void display()
    {
      System.out.println("FirstName :: "+fname);
      System.out.println("Lastname :: "+ lname);
      System.out.println("Qualification :: "+qname);
      System.out.println("Percentage :: "+perc);
      System.out.println("Marks :: "+marks);
    }
   
public static void main(String[] args)  {
   
     StudentDetail s=new StudentDetail();
    
     s.accept();
      s.display();
}
    
}



class InvalidPercentage extends Exception{
         
   InvalidPercentage()
   {
      System.out.println("Illegal percentage!");
   }

}