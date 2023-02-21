/* Write a program in java to create a class Distance having feet and inches as data members and
        perform following operations with funcitons
        A. Add two distances
        B. Subtract two distances*/
      
        import java.util.*;
        
        public class AddsubTwoDistance {
            private int feet;
            private int inches;
            public AddsubTwoDistance(int feet, int inches) {
                this.feet = feet;
                this.inches = inches;
            }
            public AddsubTwoDistance add(AddsubTwoDistance d) {
                int totalInches = this.feet * 12 + this.inches + d.feet * 12 + d.inches;
                int totalFeet = totalInches / 12;
                int remainingInches = totalInches % 12;
                return new AddsubTwoDistance(totalFeet, remainingInches);
            }
            public AddsubTwoDistance subtract(AddsubTwoDistance d) {
                int thisTotalInches = this.feet * 12 + this.inches;
                int dTotalInches = d.feet * 12 + d.inches;
                int totalInches = thisTotalInches - dTotalInches;
                if (totalInches < 0) {
                    totalInches = -totalInches;
                }
                int totalFeet = totalInches / 12;
                int remainingInches = totalInches % 12;
                return new AddsubTwoDistance(totalFeet, remainingInches);
            }
            public void display() {
                System.out.println(feet + " feet " + inches + " inches");
            }
        
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
        
                System.out.println("Enter first distance (feet inches):");
                int feet1 = scanner.nextInt();
                int inches1 = scanner.nextInt();
                AddsubTwoDistance d1 = new AddsubTwoDistance(feet1, inches1);
        
                System.out.println("Enter second distance (feet inches):");
                int feet2 = scanner.nextInt();
                int inches2 = scanner.nextInt();
                AddsubTwoDistance d2 = new AddsubTwoDistance(feet2, inches2);
        
                System.out.print("Sum of distances: ");
                AddsubTwoDistance d3 = d1.add(d2);
                d3.display();
        
                System.out.print("Difference of distances: ");
                AddsubTwoDistance d4 = d1.subtract(d2);
                d4.display();
        
                scanner.close();
            }
        }