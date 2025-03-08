package overriding;
import java.util.*;

class Person
{
    String name;
    String gender;
    String address;
    int contact;
    Scanner sc=new Scanner(System.in);
   
    public void accept()
    {
        System.out.println("enter name : ");
         name= sc.next();
         System.out.println("enter gender : ");
         gender= sc.next();
         System.out.println("enter address : ");
         address= sc.next();
         System.out.println("enter contact : ");
         contact= sc.nextInt();
    }

    // overriding method can increase access of overridn method but cant decrease
   public void display()  // it can also be made protected also 
    {
        System.out.println("name : "+name);
        System.out.println("gender : "+gender);
        System.out.println("address : "+address);
        System.out.println("contact : "+contact);
        
    }
}

class Employe extends Person
{      
      int eid;
      //override method have same name ,return type 
    public  void accept()
      {
        super.accept();
        System.out.println("Enter empid " );
        eid=sc.nextInt();
        
      }
      //override method have same name ,return type 
    
      // overriding method can increase access of overridn method but cant decrease
      
    public  void display() // public because it is higher than protected specifier in base class person 
      {
        super.display();
        System.out.println("empid " +eid);

      }
}

public class EmployeClass {
    public static void main(String[] args) {
       Employe e=new Employe();
        e.accept();
        e.display();
}
}
