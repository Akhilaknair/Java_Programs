import java.util.Scanner;

class Student {
    String name;
    int rollNo;

    public void acceptData(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
  
    public void displayData() {
        System.out.println("Name: " + name + ", Roll No: " + rollNo);
    }
}

public class qn16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student[] students = new Student[3];

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();  
            System.out.println("Enter details for Student " + (i + 1));     
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Roll Number: ");
            int rollNo = sc.nextInt();
            sc.nextLine();  

            students[i].acceptData(name, rollNo); 
        }

 
        System.out.println("\nStudent Details:");
        for (int i = 0; i < students.length; i++) {
            students[i].displayData();  
        }

        
    }
}

