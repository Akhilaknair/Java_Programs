import java.util.Scanner;

class Table
{
  public static void main(String[] args)
{
   Scanner s=new Scanner(System.in);
   System.out.print("Enter a number of which u have to print table :: ");
   int num=s.nextInt();
    for(int i=0;i<=10;i++)
{
    System.out.println(num+"*"+i+"="+(num*i));
}

}

}