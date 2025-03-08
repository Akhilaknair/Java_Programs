import java.io.*;

class File_Reading {
  
  FileInputStream in;
  File f1;
  File dir;

  File_Reading() throws IOException {
   
    dir = new File("C:\\Users\\Akhila\\Desktop\\JAVA_LAB_jims\\ClassTopicsChapter1");
   f1 = new File(dir, "file1.txt");
    in = new FileInputStream(f1);
   
    
  }

  void read_byte_data() throws IOException {
    int byteRead;
    System.out.println("Reading byte data from file:");
    while ((byteRead = in.read()) != -1) {
      System.out.print((char) byteRead); // Convert byte to char for readable output
    }
   
  }

  void read_char_data() throws IOException {
    FileReader fileReader = new FileReader(f1);
    BufferedReader bufferedReader = new BufferedReader(fileReader);
    System.out.println();
    System.out.println("Reading character data from file:");
    
    int charRead;
    
    while ((charRead = bufferedReader.read()) != -1) {
      System.out.print((char) charRead);  
    }
   
    
    
    bufferedReader.close();  
  }

  public static void main(String args[]) throws IOException {
    File_Reading fileHandler = new File_Reading(); 
    fileHandler.read_byte_data(); 
    fileHandler.read_char_data(); 
  }
}
