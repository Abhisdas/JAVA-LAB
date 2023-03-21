/*
 2.) Write a program in java to create a package called SWAP having a class Demo with functions Swapping_numbers()
which swaps two numbers of different data types like int, char, float, double etc. Write appropriate functions
to swap using function overloading concept. Now create another package called Main which contains Test class
with main function. Create object of Demo class and call all the functions to swap various data types. 
*/

package SWAP;

public class Demo {
    public void Swapping_numbers(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Swapped integers: " + a + " " + b);
    }

    public void Swapping_numbers(char a, char b) {
        char temp = a;
        a = b;
        b = temp;
        System.out.println("Swapped characters: " + a + " " + b);
    }

    public void Swapping_numbers(float a, float b) {
        float temp = a;
        a = b;
        b = temp;
        System.out.println("Swapped floats: " + a + " " + b);
    }

    public void Swapping_numbers(double a, double b) {
        double temp = a;
        a = b;
        b = temp;
        System.out.println("Swapped doubles: " + a + " " + b);
    }
}
