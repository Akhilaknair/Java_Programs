import java.util.Scanner;

class Fahrenheit
{
   public static void main(String[] args)
{
    Scanner s=new Scanner(System.in);
    System.out.print("Enter Temperature in Celsius :: ");
    float c_val=s.nextFloat();
    double f_val=( (c_val*9.0)/5.0 ) + 32.0;
    System.out.println(" Temperature in Fahrenheit :: " + f_val );
}
}