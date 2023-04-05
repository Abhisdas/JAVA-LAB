import java.util.Scanner;

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        try {
            if (number < 0) {
                throw new NegativeNumberException("Given number is less than zero");
            }
            else {
                System.out.println("Given positive number: " + number);
            }
        }
        catch (NegativeNumberException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
