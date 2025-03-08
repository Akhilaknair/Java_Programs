package Exception;
import java.util.*;
class Illegalage extends Exception{
    Illegalage()
    {
        System.out.println("illegal age");
    }
}
public class MyExc2 {  
    int age ;
    Scanner sc=new Scanner(System.in);
    void accept()
    {
        System.out.println("enter age");
        try{
                age=sc.nextInt();
                if(age<18 || age >30)
                {
                     Illegalage n=new Illegalage();
                     throw n;
                }
        }
        catch(Illegalage n){
            System.out.println("exception :: "+ n);
            accept();

        }
    }
    public static void main(String[] args) {
           MyExc2 m=new MyExc2();
           m.accept();
    }
}
