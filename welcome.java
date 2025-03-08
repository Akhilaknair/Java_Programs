public class welcome
{
   public static void main(String args[])
{
    System.out.println("welcome !");
  
}
}


/////class 2 

 class Second
{
   public static void main(String args[])
{
    System.out.println("Hello from CLASS2");
    main();
}

  public static void main()
{
    System.out.println("WELCOME from class2!");
}

}





//In Java, we can define multiple classes in a single source file, but only one of these classes can be public, and the file name must match the name of //the public class
//Only one public class is allowed per Java file, and the filename must match the public class name. Thus, you would need to split these into separate //files if both are public.

////class 3
 class Three
{
   public static void main(String args[])
{
    System.out.println("Hello from CLASS2");
    main();
}

  public static void main()
{
    System.out.println("WELCOME from class2!");
}

}