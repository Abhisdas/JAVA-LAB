/*Write a program in java to create a class Employee having data members empid, name, salary, company name as static data member
and members functions getEmpInfo()- to get employee information and displayEmpInfo()--to display employee information.*/
import java.lang.*;
import java.util.*;
class employee {
    int id;
    String name;
    double salary;
    String company;

    Scanner sc = new Scanner(System.in);

    void getemployeeinfo() {
        System.out.println("Enter id");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter name");
        name = sc.nextLine();
        System.out.println("Enter salary");
        salary = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter companyname");
        company = sc.nextLine();
    }

    void displayemployeeinfo() {
        System.out.println("id: " + id);
        System.out.println("Name: " + name);
        System.out.println("salary: " + salary);
        System.out.println("campanyname:"+ company );
    }

    public static void main(String[] args) {
        employee e1 = new employee();
        e1.getemployeeinfo();
        e1.displayemployeeinfo();
    }
}

