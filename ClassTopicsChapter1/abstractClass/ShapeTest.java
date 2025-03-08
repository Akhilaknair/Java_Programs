package abstractClass;

abstract class Shapes {
       int dim;
       Shapes(int dim)
       {
            this.dim=dim;
       }
       public abstract void cal_peri();
       public abstract void calc_area();
}

class Square extends  Shapes{

           Square(int dim)
           {
               super(dim);
           }
          
           public void cal_peri()
           {
               System.out.println("perimeter Square : " + (4*dim));
           }

           public void calc_area()
           {
            System.out.println("Area Square: " + (dim*dim));
           }
}



class Circle extends  Shapes{
   
    Circle(int dim)
    {
        super(dim);
    }
   
    public void cal_peri()
    {
        System.out.println("perimeter Circle: " + (2*3.14*dim));
    }

    public void calc_area()
    {
     System.out.println("Area Circle: " + (3.14*dim*dim));
    }
}


public class ShapeTest
{
    public static void main(String[] args) {
        
          Square s=new Square(4);
          Circle c=new Circle(4);

         s.cal_peri();
         s.calc_area();
         c.cal_peri();
         c.calc_area();
    }
}