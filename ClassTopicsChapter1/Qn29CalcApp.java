import java.util.*;
class calc
{
    int num1;
    int num2;
    calc(int num1,int num2)
    {
        this.num1=num1;
        this.num2=num2;
    }

    public int add()
    {
        return num1+num2;
    }
    public int subtr()
    {
        return num1-num2;
    }

    public int mult()
    {
        return num1*num2;
    }

    public String div()
    {
        if(num2==0) return "division by zero not possible";
        return String.valueOf(num1/num2);
    }

    public int modulo()
    {
        return num1%num2;
    }

}


public class Qn29CalcApp {
   public static void main(String []args)
   {

    
    Scanner sc=new Scanner(System.in);
      System.out.println( "enter number 1 : ");
       int n1=sc.nextInt();
       System.out.println( "enter number 2 : ");
       int n2=sc.nextInt();


       calc c=new calc(n1,n2);

        System.out.println("div :: "+c.div()); 
        System.out.println("subtraction :: "+c.subtr());
        System.out.println("Product :: "+c.mult());
        System.out.println("Modulo :: "+c.modulo());
        System.out.println("Addition :: "+c.add());

   }
}
