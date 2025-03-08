class CommandLineArg
{
     public static void main(String args[])
{
       if(args.length >0)
      {
          for(int i=0;i<args.length;i++)
          System.out.println("Command-line"+(i+1) +": " + args[i]);
      }
  else 
   {
        System.out.println("No Command line arguments");
   }

}

}
