import java.util.*;


 class Student {
    String fname;
    String lname;
    String quali;
    int percent;
    int totmarks;
    Scanner sc;
    
    public Student() {
        sc = new Scanner(System.in);
    }

    void accept()
    {
        System.out.println("Enter fname :: ");
       fname= sc.next();

       System.out.println("Enter lname :: ");
       lname= sc.next();

       System.out.println("Enter qualification :: ");
       quali= sc.next();

       System.out.println("Enter percentage :: ");
       percent= sc.nextInt();

       System.out.println("Enter totalmarks :: ");
       totmarks= sc.nextInt();
    }
 

  
}

public class AcceptDetails
{
    public static void main(String[] args) {
             Student s=new Student();
             s.accept();
    }
}
