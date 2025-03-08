 public class PatternArr {
    public static void main(String[] args) {
       
        int[] upperPart = {1, 3, 5, 7};  
        int[] lowerPart = {5, 3, 1};    

     
        for (int i = 0; i < upperPart.length; i++) {
       
            for (int j = 0; j < upperPart[i]; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }

       
        for (int i = 0; i < lowerPart.length; i++) {
           
            for (int j = 0; j < lowerPart[i]; j++) {
                System.out.print("*");
            }
          
            System.out.println();
        }
    }
}
 
