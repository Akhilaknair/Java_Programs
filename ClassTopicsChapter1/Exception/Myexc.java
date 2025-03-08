package Exception;
import java.util.*;
class Illegalname extends Exception{
    Illegalname()
    {
        System.out.println("illegal name");
    }
}
public class Myexc {  
    String name ;
    Scanner sc=new Scanner(System.in);
    void accept()
    {
        System.out.println("enter name");
        try{
                name=sc.next();
                if(name.length()<4)
                {
                     Illegalname n=new Illegalname();
                     throw n;
                }
        }
        catch(Illegalname n){
            System.out.println("exception :: "+ n);
            accept();

        }
    }
    public static void main(String[] args) {
           Myexc m=new Myexc();
           m.accept();
    }
}
