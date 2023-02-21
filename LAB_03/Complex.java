/*Write a program in java to create class complex having Data Members real, imaginary and Member Functons.
get() to get data of complex class from user , dislpay() to display complex numbers, add(complex c1, complex c2) to add two object
 of complex class, subtract(complex c1,complex c2) to subtract two object of complex class.*/
 
 import java.util.*;
 public class Complex {
     private double real;
     private double imaginary;
 
     public void get() {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter the real part: ");
         real = input.nextDouble();
         System.out.print("Enter the imaginary part: ");
         imaginary = input.nextDouble();
         input.close();
        
     }
 
     public void display() {
         System.out.println(real + " + " + imaginary + "i");
     }
 
     public static Complex add(Complex c1, Complex c2) {
         Complex sum = new Complex();
         sum.real = c1.real + c2.real;
         sum.imaginary = c1.imaginary + c2.imaginary;
         return sum;
     }
 
     public static Complex subtract(Complex c1, Complex c2) {
         Complex diff = new Complex();
         diff.real = c1.real - c2.real;
         diff.imaginary = c1.imaginary - c2.imaginary;
         return diff;
         
     }
 
     public static void main(String[] args) {
         Complex c1 = new Complex();
         Complex c2 = new Complex();
 
         System.out.println("Enter the first complex number:");
         c1.get();
 
         System.out.println("Enter the second complex number:");
         c2.get();
         
 
         System.out.print("The sum of the two complex numbers is: ");
         Complex sum = Complex.add(c1, c2);
         sum.display();
 
         System.out.print("The difference of the two complex numbers is: ");
         Complex diff = Complex.subtract(c1, c2);
         diff.display();
         
     }
     
 }