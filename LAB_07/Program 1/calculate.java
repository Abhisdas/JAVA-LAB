package Let_Me_Calculate;
import Calculator.CALC;

public class calculate {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Addition of " + a + " and " + b + " is: " + CALC.add(a, b));
        System.out.println("Subtraction of " + a + " and " + b + " is: " + CALC.subtract(a, b));
        System.out.println("Multiplication of " + a + " and " + b + " is: " + CALC.multiply(a, b));
        System.out.println("Division of " + a + " and " + b + " is: " + CALC.divide(a, b));
        System.out.println("Modulus of " + a + " and " + b + " is: " + CALC.mod(a, b));
    }
}
