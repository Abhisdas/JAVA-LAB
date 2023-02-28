/*7. A plastic manufacturer sells plastic in different shapes like Two_D sheet and Three_D box. The cost of sheet is Rs 40/ per square ft.
and the cost of box is Rs 60/ per cubic ft. Implement it in Java to calculate the cost of plastic as per the dimensions given by the user
where Three_D inherits from Two_D. */

import java.util.*;
class Two_D {
    protected double length, breadth;
    public Two_D(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public double getArea() {
        return length * breadth;
    }
}

class Three_D extends Two_D {
    protected double height;

    public Three_D(double length, double breadth, double height) {
        super(length, breadth);
        this.height = height;
    }

    public double getVolume() {
        return length * breadth * height;
    }

    public double getCost() {
        return 60 * getVolume();
    }
}

public class plastic{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double length, breadth, height;
        System.out.print("Enter the length of the plastic shape: ");
        length = scanner.nextDouble();
        System.out.print("Enter the breadth of the plastic shape: ");
        breadth = scanner.nextDouble();
        System.out.print("Enter the height of the plastic shape: ");
        height = scanner.nextDouble();
        scanner.close();
        Two_D shape2D = new Two_D(length, breadth);
        Three_D shape3D = new Three_D(length, breadth, height);
        double cost2D = 40 * shape2D.getArea();
        double cost3D = shape3D.getCost();
        System.out.println("Cost of the 2D sheet: Rs " + cost2D);
        System.out.println("Cost of the 3D box: Rs " + cost3D);
    }
}