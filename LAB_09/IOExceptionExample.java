import java.io.*;

public class IOExceptionExample {

  public static void main(String[] args) {
    try {
      readFile("nonexistentfile.txt");
    } catch (IOException e) {
      System.out.println("An error occurred: " + e.getMessage());
    }
  }

  public static void readFile(String filename) throws IOException {
    try {
      FileInputStream file = new FileInputStream(filename);
      
      file.close();
    } catch (FileNotFoundException e) {
      
      throw new IOException("File not found", e);
    }
  }
}
