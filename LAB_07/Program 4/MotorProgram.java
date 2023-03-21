/*Define an interface Motor with a data member –capacity and two methods such
as run() and consume(). Define a Java class, Washing machine which implements this
interface and implement the code to check the value of the interface data member and
functions with any message in them through an object of the class.*/
interface Motor {
    int capacity = 10; // interface data member

    void run(); // interface method
    void consume(); // interface method
}

class WashingMachine implements Motor {
    public void run() {
        System.out.println("Washing machine is running.");
    }

    public void consume() {
        System.out.println("Washing machine is consuming " + capacity + " units of electricity.");
    }
}

public class MotorProgram {
    public static void main(String[] args) {
        WashingMachine washingMachine = new WashingMachine();

        washingMachine.run(); // Output: Washing machine is running.
        washingMachine.consume(); // Output: Washing machine is consuming 10 units of electricity.
    }
}
