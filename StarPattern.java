public class StarPattern {
    public static void main(String[] args) {
          int numRows = 7;  
        char[][] stars = new char[numRows][];

        for (int i = 0; i < numRows; i++) {
            stars[i] = new char[i + 1];
            for (int j = 0; j <= i; j++) {
                stars[i][j] = '*'; 
            }
        }

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < stars[i].length; j++) {
                System.out.print(stars[i][j]); 
            }
            System.out.println(); 
        }
    }
}
