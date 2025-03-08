import java.util.Scanner;

class Pally
{
public static void main(String[] args)
{
  Scanner s=new Scanner(System.in);
  System.out.print("Enter a number : ");
  int num=s.nextInt();
int ori=num;
int rev=0;
  while(num>0)
{
int rem=num%10;
rev=(rev*10)+rem;
num=num/10;
}

if(rev==ori) System.out.print("Its a Pallindrome");
else  System.out.print("Its not a Pallindrome  ");
  
}
  
}
