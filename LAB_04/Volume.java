/*4. Write a program in java to perform following operations using function overloading concept
A. Volume Of Sphere
B. Volume Of Prism
C. Volume Of Cylinder
D. Volume Of Cone
E. Volume Of Cuboid*/

import java.util.*;

public class Volume {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the shape to calculate volume for (sphere, prism, cylinder, cone): ");
        String shape = input.nextLine().toLowerCase();

        if (shape.equals("sphere")) {
            System.out.print("Enter the radius of the sphere: ");
            double radius = input.nextDouble();
            double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
            System.out.printf("The volume of the sphere is %.2f\n", volume);
        } else if (shape.equals("prism")) {
            System.out.print("Enter the length of the rectangular prism: ");
            double length = input.nextDouble();
            System.out.print("Enter the width of the rectangular prism: ");
            double width = input.nextDouble();
            System.out.print("Enter the height of the rectangular prism: ");
            double height = input.nextDouble();
            double volume = length * width * height;
            System.out.printf("The volume of the rectangular prism is %.2f\n", volume);
        } else if (shape.equals("cylinder")) {
            System.out.print("Enter the radius of the cylinder: ");
            double radius = input.nextDouble();
            System.out.print("Enter the height of the cylinder: ");
            double height = input.nextDouble();
            double volume = Math.PI * Math.pow(radius, 2) * height;
            System.out.printf("The volume of the cylinder is %.2f\n", volume);
        } else if (shape.equals("cone")) {
            System.out.print("Enter the radius of the cone: ");
            double radius = input.nextDouble();
            System.out.print("Enter the height of the cone: ");
            double height = input.nextDouble();
            double baseArea = Math.PI * Math.pow(radius, 2);
            double volume = (1.0 / 3.0) * baseArea * height;
            System.out.printf("The volume of the cone is %.2f\n", volume);
        } else {
            System.out.println("Invalid shape.");
            input.close();
        }
    }
}