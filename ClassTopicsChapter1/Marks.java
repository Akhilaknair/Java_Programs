import java.util.Scanner;
public class Marks {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter the student's marks out of 100: ");
      int marks = scanner.nextInt();
      char grade;
      if (marks >= 80 && marks <= 100) {
          grade = 'A';
      } else if (marks >= 60 && marks < 80) {
          grade = 'B';
      } else if (marks >= 40 && marks < 60) {
          grade = 'C';
      } else if (marks >= 0 && marks < 40) {
          grade = 'F';
      } else {
          System.out.println("Invalid marks entered!");
          return; 
      }
      System.out.println("The student's grade is: " + grade);
  }
}
