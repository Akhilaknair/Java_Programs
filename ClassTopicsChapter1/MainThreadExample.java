class NumberThread extends Thread {
   NumberThread()
   {
      start();
   }
    public void run() {
        for (int i = 1; i <= 50; i++) {
            System.out.print(i + " ");
           
        }
    }
}

public class MainThreadExample {
    public static void main(String[] args) {
      
        NumberThread numberThread = new NumberThread();

        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.print(c + " ");
           
        }
 
    }
}

