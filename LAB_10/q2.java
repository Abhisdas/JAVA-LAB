import java.io.*;

public class q2 {

    public static void main(String[] args) {
        
       
        String file1Path = "file1.txt";
        String file2Path = "file2.txt";
        
    
        try (FileInputStream fis1 = new FileInputStream(file1Path);
             FileInputStream fis2 = new FileInputStream(file2Path)) {
            
            boolean areEqual = true;
            int b1, b2;
            while ((b1 = fis1.read()) != -1 && (b2 = fis2.read()) != -1) {
                if (b1 != b2) {
                    areEqual = false;
                    break;
                }
            }
            if (areEqual && fis1.read() == -1 && fis2.read() == -1) {
                System.out.println("Files are equal.");
            } else {
                System.out.println("Files are not equal.");
            }
            
        } catch (IOException e) {
            System.out.println("An error occurred while comparing files.");
            e.printStackTrace();
        }
    }
}
