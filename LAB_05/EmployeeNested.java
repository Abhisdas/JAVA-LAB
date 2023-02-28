/* 4. Write a program in java to class Employee having private data members ID, company_name and salary.Create a nested class called
programmer which have get_Emp_details() which access private data members of Employee class and get employee details and display_Emp_details()
 function to display employee details.Take appropriate member functions if required and work on the following.
A. Inner class
B. Static Nested class
C. Method local inner class
D. Annonymous inner class. */


class EmployeeNested {
    private int ID;
    private String company_name;
    private double salary;

    public EmployeeNested(int ID, String company_name, double salary) {
        this.ID = ID;
        this.company_name = company_name;
        this.salary = salary;
    }

    class Programmer {
        public void get_Emp_details() {
            System.out.println("Employee ID: " + ID);
            System.out.println("Company Name: " + company_name);
            System.out.println("Salary: " + salary);
        }

        public void display_Emp_details() {
            System.out.println("Employee Details:");
            get_Emp_details();
        }
    }
    static class Manager {
        public void display_Emp_details(EmployeeNested e) {
            System.out.println("Employee Details:");
            System.out.println("Employee ID: " + e.ID);
            System.out.println("Company Name: " + e.company_name);
            System.out.println("Salary: " + e.salary);
        }
    }
    public void display_Emp_details_Lambda() {
        class DisplayEmpDetails {
            public void display(EmployeeNested e) {
                System.out.println("Employee Details:");
                System.out.println("Employee ID: " + e.ID);
                System.out.println("Company Name: " + e.company_name);
                System.out.println("Salary: " + e.salary);
            }
        }

        DisplayEmpDetails displayEmpDetails = new DisplayEmpDetails();
        displayEmpDetails.display(this);
    }
    public void display_Emp_details_Anonymous() {
        Programmer p = new Programmer() {
            public void display_Emp_details() {
                System.out.println("Employee Details:");
                get_Emp_details();
            }
        };

        p.display_Emp_details();
    }

    public static void main(String[] args) {
        EmployeeNested e1 = new EmployeeNested(101, "ABC Company", 50000.0);
        EmployeeNested.Programmer p1 = e1.new Programmer();
        p1.display_Emp_details();

        EmployeeNested.Manager m = new EmployeeNested.Manager();
        m.display_Emp_details(e1);

        e1.display_Emp_details_Lambda();

        e1.display_Emp_details_Anonymous();
    }
}