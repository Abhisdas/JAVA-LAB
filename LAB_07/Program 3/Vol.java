/*
 Write a program to create an abstract class Volume having an abstract method 
 find_volume(). Derive four class Sphere, Cylinder, Cuboid, Cone from Volume 
 class with find_volume() functions implementation. Now override the find_Volume() 
 functions through abstract class reference variable. 
*/



abstract class Volume {
    abstract void find_volume();
}

class Sphere extends Volume {
    double radius;

    Sphere(double r) {
        radius = r;
    }

    void find_volume() {
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        System.out.println("Volume of Sphere: " + volume);
    }
}

class Cylinder extends Volume {
    double radius, height;

    Cylinder(double r, double h) {
        radius = r;
        height = h;
    }

    void find_volume() {
        double volume = Math.PI * Math.pow(radius, 2) * height;
        System.out.println("Volume of Cylinder: " + volume);
    }
}

class Cuboid extends Volume {
    double length, breadth, height;

    Cuboid(double l, double b, double h) {
        length = l;
        breadth = b;
        height = h;
    }

    void find_volume() {
        double volume = length * breadth * height;
        System.out.println("Volume of Cuboid: " + volume);
    }
}

class Cone extends Volume {
    double radius, height;

    Cone(double r, double h) {
        radius = r;
        height = h;
    }

    void find_volume() {
        double volume = (1.0 / 3.0) * Math.PI * Math.pow(radius, 2) * height;
        System.out.println("Volume of Cone: " + volume);
    }
}

public class Vol {
    public static void main(String[] args) {
        Volume v;

        v = new Sphere(5);
        v.find_volume();

        v = new Cylinder(4, 6);
        v.find_volume();

        v = new Cuboid(3, 4, 5);
        v.find_volume();

        v = new Cone(2, 8);
        v.find_volume();
    }
}
