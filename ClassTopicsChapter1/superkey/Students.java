package superkey;
import java.util.*;
public class Students {
    String fname;
    String lname;
    String quali;
    int percent;
    int totmarks;
     Scanner sc=new Scanner(System.in);
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
    void display()
    {
        System.out.println("First name : " + fname);
        System.out.println("Last name : " + lname);
        System.out.println("Qualification : " + quali);
        System.out.println("percenatge : " + percent);
        System.out.println("TotalMarks : " + totmarks);

    }
}


class Mca extends Students{

    String stream;
    int duration;

    void accept()
    {
        super.accept();//student class
        stream="science";
        System.out.println("enter duration : ");

        duration=sc.nextInt();
        System.out.println("Duration is " +duration);

    }
    void display()
    {
        super.display();// of student class
        System.out.println("Duration is " +duration);
        System.out.println("stream :: " + stream);
    }

    public static void main(String[] args)
    {
        Mca m=new Mca();
        m.accept();
        m.display();
    }
    

}
