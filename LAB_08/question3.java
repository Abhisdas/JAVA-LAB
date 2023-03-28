import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
         
            int a = 10, b = 0;
            int result = a / b;
            System.out.println("Result: " + result);
            
           
            String str = null;
            System.out.println("Length of the string: " + str.length());

           
            int[] arr = {1, 2, 3};
            System.out.println("Element at index 3: " + arr[3]);

          
            String numStr = "abc";
            int num = Integer.parseInt(numStr);
            System.out.println("Number: " + num);
            
          
            throw new Exception("Custom Exception");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        
        sc.close();
    }
    
}
