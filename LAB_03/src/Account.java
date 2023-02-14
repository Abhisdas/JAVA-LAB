/* 4. WAP to create a class account having Data Members cust_id, cust_name, branch, balance. Member Functions get() to input
customer information ,display() to print customer account details, withdraw(int amt) to deduct amount from balance, deposit(int amt)
to deposit amount into customer account.*/
import java.lang.*;
import java.util.*;
public class Account {
    private int cust_id;
    private String cust_name;
    private String branch;
    private double balance;

    public void get(int id, String name, String b, double bal) {
        cust_id = id;
        cust_name = name;
        branch = b;
        balance = bal;
    }

    public void display() {
        System.out.println("Customer ID: " + cust_id);
        System.out.println("Name: " + cust_name);
        System.out.println("Branch: " + branch);
        System.out.println("Balance: " + balance);
    }

    public void withdraw(int amt) {
        if (balance >= amt) {
            balance -= amt;
            System.out.println("Withdrawal of " + amt + " successful.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void deposit(int amt) {
        balance += amt;
        System.out.println("Deposit of " + amt + " successful.");
    }
    public static void main(String args[])
    {
        Account acc1 = new Account();
        acc1.get(1067, "Himanshu", "east Branch", 90000.0);
        acc1.display();
        acc1.withdraw(12000);
        acc1.display();
        acc1.deposit(25000);
        acc1.display();

        Account acc2 = new Account();
        acc2.get(1068, "Abhishek", "North Branch", 68000.0);
        acc2.display();
        acc2.withdraw(89000);
        acc2.display();
        acc2.deposit(36000);
        acc2.display();

    }
}