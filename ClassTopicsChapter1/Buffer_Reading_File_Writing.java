import java.io.*;
class Buffer_Reading_File_Writing {
  FileInputStream in; 
  File f1;
  FileOutputStream out; 
  BufferedReader inp;

  Buffer_Reading_File_Writing() throws IOException {
    f1 = new File("My_file.doc");
    out = new FileOutputStream(f1, false);
    in = new FileInputStream(f1);
    inp = new BufferedReader(new InputStreamReader(System.in));
  }
  void write_file() throws IOException {
    System.out.println("Please enter contents for file");
    String d = inp.readLine();
    System.out.println("File contents are:");
    System.out.println(d);
    byte c[] = d.getBytes();
    for (int i = 0; i < c.length; i++) {
      out.write(c[i]);
    }
    System.out.println(" data is written in file ");
    out.close();
  }
  void read_file() throws IOException {
    int t_bytes = in.available();
    // in.skip(5);
    for (int i = 0; i < t_bytes; i++) {
      char d = (char) in.read();
      System.out.print(d);
    }
    System.out.println("*****");
    byte b[] = new byte[50];
    System.out.println(" ");
    System.out.println("end of file");
    in.close();
  }
  public static void main(String args[]) throws IOException {
    Buffer_Reading_File_Writing f1 = new Buffer_Reading_File_Writing();
    System.out.println("writing files through file Input stream class");
    f1.write_file();
    System.out.println(" ");
    System.out.println("Reading files through file Output stream class");
    f1.read_file();}
}