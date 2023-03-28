import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            
            int result = 10 / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        }

        try {
           
            String str = null;
            System.out.println("Length of the string: " + str.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        }

        try {
         
            int[] arr = {1, 2, 3};
            System.out.println("Element at index 3: " + arr[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        }

        try {
          
            System.out.print("Enter a number: ");
            String numStr = sc.nextLine();
            int num = Integer.parseInt(numStr);
            System.out.println("Number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e.getMessage());
        }

        sc.close();
    }
}
