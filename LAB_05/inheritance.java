/* Illustrate the execution of constructors in multi-level inheritance with three Java classes 
–plate(length, width), box(length, width, height), wood box(length, width, height, thick). */

class Plate {
    double length, width;

    Plate(double length, double width) {
        this.length = length;
        this.width = width;
        System.out.println("Plate constructor called");
    }
}

class Box extends Plate {
    double height;

    Box(double length, double width, double height) {
        super(length, width);
        this.height = height;
        System.out.println("Box constructor called");
    }
}

class WoodBox extends Box {
    double thickness;

    WoodBox(double length, double width, double height, double thickness) {
        super(length, width, height);
        this.thickness = thickness;
        System.out.println("WoodBox constructor called");
    }
}

public class inheritance {
    public static void main(String[] args) {
        WoodBox wb = new WoodBox(10, 20, 30, 5);
        System.out.println("Dimensions of the WoodBox:");
        System.out.println("Length: " + wb.length);
        System.out.println("Width: " + wb.width);
        System.out.println("Height: " + wb.height);
        System.out.println("Thickness: " + wb.thickness);
    }
}
