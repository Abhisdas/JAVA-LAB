import java.util.Scanner;

public class question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
           
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
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        sc.close();
    }
}
