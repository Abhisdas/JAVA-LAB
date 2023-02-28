/*1. Write a program in java to create a class Complex having data members real and imaginary and perform following operations using
constructors with objects as arguments.
A. Add two complex numbers
B. Subtract two complex numbers.*/

import java.util.*;
class ComplexConstructor {
    private int real;
    private int imaginary;

    public ComplexConstructor(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexConstructor(ComplexConstructor c) {
        real = c.real;
        imaginary = c.imaginary;
    }

    public void add(ComplexConstructor c1, ComplexConstructor c2) {
        real = c1.real + c2.real;
        imaginary = c1.imaginary + c2.imaginary;
    }

    public void subtract(ComplexConstructor c1, ComplexConstructor c2) {
        real = c1.real - c2.real;
        imaginary = c1.imaginary - c2.imaginary;
    }

    public void display() {
        System.out.println(real + " + " + imaginary + "i");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the real and imaginary parts of complex number 1: ");
        int real1 = sc.nextInt();
        int imaginary1 = sc.nextInt();

        System.out.println("Enter the real and imaginary parts of complex number 2: ");
        int real2 = sc.nextInt();
        int imaginary2 = sc.nextInt();

        ComplexConstructor c1 = new ComplexConstructor(real1, imaginary1);
        ComplexConstructor c2 = new ComplexConstructor(real2, imaginary2);

        ComplexConstructor c3 = new ComplexConstructor(c1);
        c3.add(c1, c2);
        System.out.print("Addition: ");
        c3.display();

        ComplexConstructor c4 = new ComplexConstructor(c2);
        c4.subtract(c1, c2);
        System.out.print("Subtraction: ");
        c4.display();

        sc.close();
    }
}