import java.util.*;

class InvalidEmail extends Exception {
    InvalidEmail() {
        System.out.println("Inavlid mail id");
    }
}
public class qn25 {
    String fname;
    String lname;
    String quali;
    int percent;
    int totmarks;
    String email;
    Scanner sc = new Scanner(System.in);

    void accept() {
        System.out.println("Enter first name: ");
        fname = sc.next();
        System.out.println("Enter last name: ");
        lname = sc.next();
        System.out.println("Enter qualification: ");
        quali = sc.next();
        System.out.println("Enter percentage: ");
        percent = sc.nextInt();
        System.out.println("Enter total marks: ");
        totmarks = sc.nextInt();

        while (true) {
            System.out.println("Enter Email ID: ");
            email = sc.next();
            try {
                if (email == null || email.indexOf('@') == -1) {
                    InvalidEmail m = new InvalidEmail();
                    throw m;
                }
                break;
            } catch (InvalidEmail e) {
                System.out.println("Exception:" + e);
            }
        }
    }

    void display() {
        System.out.println("First name: " + fname);
        System.out.println("Last name: " + lname);
        System.out.println("Qualification: " + quali);
        System.out.println("Percentage: " + percent);
        System.out.println("Total Marks: " + totmarks);
        System.out.println("Email ID: " + email); 
    }
}

class Mca extends qn25 {
    String stream;
    int duration;

    void accept() {
        super.accept();
        stream = "Computers";
        System.out.println("Enter duration: ");
        duration = sc.nextInt();
    }

    void display_data() {
        display();
        System.out.println("Duration: " + duration);
        System.out.println("Stream: " + stream);
    }

    public static void main(String[] args) {
        Mca m = new Mca();
        m.accept();
        m.display_data();
    }
}
class Mba extends qn25 {
    String stream;
    int duration;

    void accept() {
        super.accept();
        stream = "Commerce"; 
        System.out.println("Enter duration: ");
        duration = sc.nextInt();
    }

    void display_data() {
        display();
        System.out.println("Duration: " + duration);
        System.out.println("Stream: " + stream);
    }

    public static void main(String[] args) {
        Mba m = new Mba();
        m.accept();
        m.display_data();
    }
}