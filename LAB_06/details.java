import java.util.*;
import java.lang.*;


class Detail {
    private String name;
    private String address;
    private String serviceNumber;

    public Detail(String name, String address, String serviceNumber) {
        this.name = name;
        this.address = address;
        this.serviceNumber = serviceNumber;
    }

    public void show() {
        System.out.println("Customer name: " + name);
        System.out.println("Customer address: " + address);
        System.out.println("Service number/meter number: " + serviceNumber);
    }
}

class PowerBill extends Detail {
    private int n;
    private double totalBill;

    public PowerBill(String name, String address, String serviceNumber, int n) {
        super(name, address, serviceNumber);
        this.n = n;
        this.totalBill = 0.0;
    }

    public void cal() {
        if (n >= 1 && n <= 50) {
            totalBill = n * 2.5;
        } else if (n >= 51 && n <= 100) {
            totalBill = 50 * 2.5 + (n - 50) * 5.0;
        } else if (n >= 101 && n <= 200) {
            totalBill = 50 * 2.5 + 50 * 5.0 + (n - 100) * 6.0;
        } else if (n > 200) {
            totalBill = 50 * 2.5 + 50 * 5.0 + 100 * 6.0 + (n - 200) * 7.5;
        }
    }

    public void show() {
        super.show();
        System.out.println("Number of units used: " + n);
        System.out.println("Amount to be paid: " + totalBill + " rupees");
    }
}

public class details {
    public static void main(String[] args) {
        PowerBill pb = new PowerBill("Abhishek Das", "Forbesganj Main St", "123456", 15400);
        pb.cal();
        pb.show();
    }
}