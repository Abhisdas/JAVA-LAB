/* 5. WAP to count number of objects created in a program using static data member and constructor in
a class called ObjectCounter*/

public class Objectcounter {
    private static int count = 0;

    public Objectcounter() {
        ++count;
    }

    public static int getCount() {
        return count;
    }

    public static void main(String[] args) {
        Objectcounter obj1 = new Objectcounter();
        Objectcounter obj2 = new Objectcounter();
        Objectcounter obj3 = new Objectcounter();

        System.out.println("Number of objects created: " + Objectcounter.getCount());
    }
}
