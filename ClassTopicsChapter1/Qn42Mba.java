import java.util.*;
interface IPuni{

    public  void internals();
    public void external();
}


interface ForeignCollab
{
    
      void take_admsn();
      public void enrollResearch();
}


public class Qn42Mba implements IPuni,ForeignCollab
{
     public void internals()
     {
         System.out.println("Internals will be taken !");
     }

     public void external()
     {
        System.out.println("externals will be taken !");
     }
     public void take_admsn()
     {
        System.out.println("take admission !");
     }
     public void enrollResearch()
     {
        System.out.println("Enroll for research paper !");
     }
     public static void main(String[] args)
     {
         Qn42Mba m=new Qn42Mba();
         m.enrollResearch();
         m.external();
         m.internals();
         m.take_admsn();
     }
}