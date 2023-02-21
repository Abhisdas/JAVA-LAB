//Write a Program in java to print the following patterns using for loops?
public class pattern_b {
    public static void main(String[] args) {
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= 4; j++) {
                if (j > i) {
                    System.out.print("*");
                } else {
                    System.out.print(j);
                }
            }
            for (int j = 4; j >= 1; j--) {
                if (j > i) {
                    System.out.print("*");
                } else {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}