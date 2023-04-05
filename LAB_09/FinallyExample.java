public class FinallyExample {

    public static void main(String[] args) {
      try {
       
        System.out.println("Condition 1: No exception is thrown");
      } catch (Exception e) {
        System.out.println("Exception occurred: " + e.getMessage());
      } finally {
        System.out.println("Finally block executed");
      }
  
      try {
        
        System.out.println("Condition 2: An exception is thrown and caught");
        int a = 10 / 0; 
      } catch (ArithmeticException e) {
        System.out.println("Exception occurred: " + e.getMessage());
      } finally {
        System.out.println("Finally block executed");
      }
  
      try {
      
        System.out.println("Condition 3: An exception is thrown and not caught");
        int[] arr = new int[5];
        arr[10] = 10; 
      } catch (ArithmeticException e) {
        System.out.println("Exception occurred: " + e.getMessage());
      } finally {
        System.out.println("Finally block executed");
      }
    }
  }
  