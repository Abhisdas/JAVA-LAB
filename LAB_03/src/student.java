/*Write a program in java to create a class Student having data members rollno, name, fees, branch, section,university and members
functions getStudentInfo()- to get student information and displayStudentInfo()--to display student information*/
import java.lang.*;
import java.util.*;
class Student {
    int rollno;
    String name;
    double fees;
    String branch;
    int section;
    String university;
    Scanner sc = new Scanner(System.in);

    void getStudentInfo() {
        System.out.println("Enter Roll no.");
        rollno = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter name");
        name = sc.nextLine();
        System.out.println("Enter fees");
        fees = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter branch");
        branch = sc.nextLine();
        System.out.println("Enter section");
        section = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter university");
        university = sc.nextLine();
    }
    void displayStudentInfo() {
        System.out.println("Roll No: " + rollno);
        System.out.println("Name: " + name);
        System.out.println("Fees: " + fees);
        System.out.println("Branch: " + branch);
        System.out.println("Section: " + section);
        System.out.println("University: " + university);
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.getStudentInfo();
        s1.displayStudentInfo();
    }
}