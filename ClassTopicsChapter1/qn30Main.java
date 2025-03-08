import java.util.*;
class Person
{
    String name;
    String gender;
    String address;
    int contact;
    Scanner sc=new Scanner(System.in);
    void accept()
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

    void display()
    {
        System.out.println("name : "+name);
        System.out.println("gender : "+gender);
        System.out.println("address : "+address);
        System.out.println("contact : "+contact);
        
    }
}

public class qn30Main {
      
    public static void main(String[] args) {
            Person p=new Person();
            p.accept();
            p.display();
    }
}
