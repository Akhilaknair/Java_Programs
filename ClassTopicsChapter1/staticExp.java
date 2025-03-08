class staticExp
{
        static void fn1()
        {
            System.out.println("helloStatic");
        }

        void fn2()
        {
            System.out.println("hello");
        }

        public static void main(String[] args) {
           //Static methods can be called without creating objects
           //Public methods must be called by creating objects
              staticExp se=new staticExp();
              se.fn2() ;
              fn1();

        }
}