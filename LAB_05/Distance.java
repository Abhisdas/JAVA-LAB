/*2. Write a program in java to create a class Distance having feet and inches as data members and perform following operations
  A. Add two distances
  B. Subtract two distances.*/
   import java.util.*;
  class Distance {
      private int feet;
      private int inches;
  
      public Distance(int feet, int inches) {
          this.feet = feet;
          this.inches = inches;
      }
  
      public Distance(Distance d) {
          feet = d.feet;
          inches = d.inches;
      }
  
      public void add(Distance d) {
          feet += d.feet;
          inches += d.inches;
          if (inches >= 12) {
              feet += inches / 12;
              inches %= 12;
          }
      }
  
      public void subtract(Distance d) {
          feet -= d.feet;
          inches -= d.inches;
          if (inches < 0) {
              feet--;
              inches += 12;
          }
      }
  
      public void display() {
          System.out.println(feet + " feet " + inches + " inches");
      }
  
      public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
  
          System.out.println("Enter the distance 1 (feet inches): ");
          int feet1 = sc.nextInt();
          int inches1 = sc.nextInt();
  
          System.out.println("Enter the distance 2 (feet inches): ");
          int feet2 = sc.nextInt();
          int inches2 = sc.nextInt();
  
          Distance d1 = new Distance(feet1, inches1);
          Distance d2 = new Distance(feet2, inches2);
  
          Distance d3 = new Distance(d1);
          d3.add(d2);
          System.out.print("Addition: ");
          d3.display();
  
          Distance d4 = new Distance(d2);
          d4.subtract(d1);
          System.out.print("Subtraction: ");
          d4.display();
  
          sc.close();
      }
  }