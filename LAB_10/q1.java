import java.io.*;

public class q1 {

    public static void main(String[] args) {
        
   
        String fileName = "biodata.txt";
        String biodata = "Name: Abhishek Kr. Das\nAge: 20\nOccupation: Student";
        
      
        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            byte[] data = biodata.getBytes();
            fos.write(data);
            System.out.println("Biodata written to file in byte form.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to file in byte form.");
            e.printStackTrace();
        }
        
       
        try (FileInputStream fis = new FileInputStream(fileName)) {
            int content;
            StringBuilder sb = new StringBuilder();
            while ((content = fis.read()) != -1) {
                sb.append((char) content);
            }
            System.out.println("Biodata read from file in byte form:\n" + sb.toString());
        } catch (IOException e) {
            System.out.println("An error occurred while reading from file in byte form.");
            e.printStackTrace();
        }
        
       
        try (FileWriter fw = new FileWriter(fileName)) {
            fw.write(biodata);
            System.out.println("Biodata written to file in character form.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to file in character form.");
            e.printStackTrace();
        }
        
       
        try (FileReader fr = new FileReader(fileName)) {
            int content;
            StringBuilder sb = new StringBuilder();
            while ((content = fr.read()) != -1) {
                sb.append((char) content);
            }
            System.out.println("Biodata read from file in character form:\n" + sb.toString());
        } catch (IOException e) {
            System.out.println("An error occurred while reading from file in character form.");
            e.printStackTrace();
        }
    }
}
