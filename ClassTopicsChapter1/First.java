import java.util.*;
public class First
{

   int a=3;
  

  static void hello()
   {
     System.out.println("hello");
   }
     void welcome()
     {
          System.out.println("hello");
          System.out.println("hello2");
     }

    public static void main(String[] args)
{
     First f=new First();
     f.a=56;//update val
     System.out.println(f.a);


  //   If you create multiple objects of one class, you can change the attribute values in one object,
   //   without affecting the attribute values in the other:

   //create another object
      First f2 = new First();
      f2.a=12;
      System.out.println(f2.a);
      System.out.println(f.a);


       hello();//static class can be accessed  directly
       //welcome();//give error becuase welcome is a non static class
        f.welcome();



}

}