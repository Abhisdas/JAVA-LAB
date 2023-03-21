/*
 WAP in java to create a Package Calculator in which a class CALC having various 
 functions like add, subtract, multiplication, division, mod operations are 
 performed. Now create another package called Let_Me_Calculate having a class 
 called Calculate with main function. Create an object of CALC and call all the 
 functions of the Calculator.
*/


package Calculator;

public class CALC {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static int mod(int a, int b) {
        return a % b;
    }
}
