/*Write a program in java to define a class Shape which has data member “area” and a member function showArea(). Derive two classes
Circle and Rectangle from Shape class. Add appropriate data members and member functions to calculate and display the area of Circle
and Rectangle.*/

import java.util.*;
class Shape {
    protected double area;

    public void showArea() {
        System.out.println("The area is: " + area);
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        calculateArea();
    }

    private void calculateArea() {
        area = Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        calculateArea();
    }

    private void calculateArea() {
        area = length * width;
    }
}

public class shapes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        Circle circle = new Circle(radius);
        circle.showArea();

        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(length, width);
        rectangle.showArea();
        scanner.close();
    }
}