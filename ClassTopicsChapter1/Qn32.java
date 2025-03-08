public class Qn32 {
   //instance var
    private int a=10;

     public void display()
     {
        int a=20;
        System.out.println("a as local var "+ a);
        System.out.println("a as instance var "+this.a);
     }
     public static void main(String[] args) {
          Qn32 q=new Qn32();
          q.display();
     }
}
