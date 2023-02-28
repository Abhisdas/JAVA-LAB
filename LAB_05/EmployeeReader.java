/*3. Write a program in java to implement a class employeereader having data members name, employee_id, salary . Include default, parameterized
 and copy constructor to initialize data members of the class and also copy an employee information.A member function show() which is used
 to display all information about an employee. Use InputStreamReader and BufferedReader classes to take input values for the employee. */
 import java.io.BufferedReader;
 import java.io.IOException;
 import java.io.InputStreamReader;
 class EmployeeReader {
     private String name;
     private int employee_id;
     private double salary;
 
     public EmployeeReader() {
         name = "";
         employee_id = 0;
         salary = 0.0;
     }
 
     public EmployeeReader(String name, int employee_id, double salary) {
         this.name = name;
         this.employee_id = employee_id;
         this.salary = salary;
     }
 
     public EmployeeReader(EmployeeReader e) {
         name = e.name;
         employee_id = e.employee_id;
         salary = e.salary;
     }
 
     public void show() {
         System.out.println("Name: " + name);
         System.out.println("Employee ID: " + employee_id);
         System.out.println("Salary: " + salary);
     }
 
     public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
         System.out.println("Enter employee name: ");
         String name = br.readLine();
 
         System.out.println("Enter employee ID: ");
         int employee_id = Integer.parseInt(br.readLine());
 
         System.out.println("Enter employee salary: ");
         double salary = Double.parseDouble(br.readLine());
 
         EmployeeReader e1 = new EmployeeReader(name, employee_id, salary);
         EmployeeReader e2 = new EmployeeReader(e1);
 
         System.out.println("\nEmployee 1 Information:");
         e1.show();
 
         System.out.println("\nEmployee 2 Information (Copy of Employee 1):");
         e2.show();
 
         br.close();
     }
 }