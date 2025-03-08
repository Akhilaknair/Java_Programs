import java.util.Scanner;

class Student 
{
    String name;
    int rollno;

    public Student(String name,int rollno)
    {
        this.name=name;
        this.rollno=rollno;
    }
    
    public String getname()
    {
        return name;
    }

    public int getroll()
    {
        return rollno;
    }
}

public class Qn26 {
      
    Student[] s=new Student[3];
    Scanner sc=new Scanner(System.in);
   
    public void acceptdata()
    {
     for(int i=0;i<3;i++)
     {
        System.out.println("Enter name :: ");
        String name = sc.next();
        System.out.println("Enter roll no :: ");
        int rollno= sc.nextInt();
        s[i]=new Student(name, rollno);  //*** imp ***/
     }
    }


    public void displayStudent()
    {
        for(Student st : s)
        {
            System.out.println("Name :: "+st.getname() +", Roll :: "+st.getroll());
        }
    }

    public static void main(String[] args) {
           Qn26 o=new Qn26();
           o.acceptdata();
           o.displayStudent();
    }


}
