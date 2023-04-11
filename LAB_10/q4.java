import java.io.*;

public class q4 {
    public static void main(String[] args) {
        String filePath = "qsn4.txt";
        File file = new File(filePath);
        
        int numWords = 0;
        int numChars = 0;
        int numSentences = 0;
        
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
             
                numChars += line.length();
                
           
                String[] words = line.split("\\s+");
                numWords += words.length;
                
               
                String[] sentences = line.split("[.!?]+");
                numSentences += sentences.length;
            }
            
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
        
        System.out.println("Number of words: " + numWords);
        System.out.println("Number of characters: " + numChars);
        System.out.println("Number of sentences: " + numSentences);
    }
}
