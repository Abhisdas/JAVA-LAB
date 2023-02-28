/*Write a program in java to count number of objects created from a class using concept of constructors
 and static data members.*/

class Counter {
    private static int count = 0;

    public Counter() {
        count++;
    }

    public static int getCount() {
        return count;
    }
}

public class Countnum {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        System.out.println("Number of objects created: " + Counter.getCount());
    }
}