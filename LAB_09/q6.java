/*write a program in java to work on following functions in string “welcome to Java Programming” A.equals, 
==, compareto, equalsIgnoreCase, length. */


public class q6 {
    public static void main(String[] args) {
        String str = "welcome to Java Programming";
        String str2 = "Welcome to JAVA Programming";
        
        // Equals function
        System.out.println("Using equals function: " + str.equals(str2));
        
        // == operator
        String str3 = str;
        System.out.println("Using == operator: " + (str == str3));
        
        // compareTo function
        int result = str.compareTo(str2);
        System.out.println("Using compareTo function: " + result);
        
        // equalsIgnoreCase function
        System.out.println("Using equalsIgnoreCase function: " + str.equalsIgnoreCase(str2));
        
        // Length function
        System.out.println("Using length function: " + str.length());
    }
}
