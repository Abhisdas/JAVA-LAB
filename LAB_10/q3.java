import java.io.*;

public class q3 {
    public static void main(String[] args) {
        String filePath = "input.txt";
        String tempFilePath = "temp.txt";
        File inputFile = new File(filePath);
        File tempFile = new File(tempFilePath);
        
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {
            
            String line;
            while ((line = reader.readLine()) != null) {
                String convertedLine = convertLine(line);
                writer.write(convertedLine);
                writer.newLine();
            }
            
        } catch (IOException e) {
            System.out.println("An error occurred while reading or writing files.");
            e.printStackTrace();
        }
        
      
        inputFile.delete();
        tempFile.renameTo(inputFile);
    }
    
    private static String convertLine(String line) {
        StringBuilder sb = new StringBuilder();
        for (char c : line.toCharArray()) {
            if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                sb.append(Character.toUpperCase(c));
            } else if (isVowel(c)) {
                sb.append('@');
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
    
    private static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
