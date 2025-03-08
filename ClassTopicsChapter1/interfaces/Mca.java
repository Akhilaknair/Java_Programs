//import java.util.*;

package interfaces;

interface fest
{
    static final String d;
    void celebrity();
    void starnight();
   
}
public class Mca implements fest{
          
    public void celebrity()
    {
           System.out.println("mca celeb");
    }

    public void starnight()
    {
        System.out.println("mca starrynight");
    }

    public static void main(String[] args) {
        Mca m=new Mca();
        m.celebrity();
        m.starnight();
    }
}

 class Mba implements fest{
          
    public void celebrity()
    {
           System.out.println("mba celeb");
    }
    public void starnight()
    {
        System.out.println("mba starrynight");
    }
    public static void main(String[] args) {
        Mba o=new Mba();
        o.celebrity();
        o.starnight();
    }
}
