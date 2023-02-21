/* Write a program in java to create a class Employee having data members empid, name, salary, company name as static data member
and members functions getEmpInfo()- to get employee information and displayEmpInfo()--to display employee information.*/
import java.lang.*;
import java.util.*;

public class Objectcounter{
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