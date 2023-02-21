/*WAP in java to add and subtract two times (hours,minutes & seconds) using functions with proper
conditions of 24 hour format and display the result.*/

import java.util.*;

public class timeadddiff {
    public static void addTime(int h1, int m1, int s1, int h2, int m2, int s2) {
        int Seconds = (s1 + s2) % 60;
        int carrySeconds = (s1 + s2) / 60;
        int Minutes = (m1 + m2 + carrySeconds) % 60;
        int carryMinutes = (m1 + m2 + carrySeconds) / 60;
        int Hours = (h1 + h2 + carryMinutes) % 24;
        System.out.println("Result of addition: " + Hours + " hours " + Minutes + " minutes " + Seconds + " seconds");
    }
    public static void subtractTime(int h1, int m1, int s1, int h2, int m2, int s2) {
        int Seconds = (s1 - s2) % 60;
        int borrowSeconds = (s1 - s2 < 0) ? 1 : 0;
        int Minutes = (m1 - m2 - borrowSeconds) % 60;
        int borrowMinutes = (m1 - m2 - borrowSeconds < 0) ? 1 : 0;
        int Hours = (h1 - h2 - borrowMinutes) % 24;
        System.out.println("Result of subtraction: " + Hours + " hours " + Minutes + " minutes " + Seconds + " seconds");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first time (hours minutes seconds):");
        int h1 = scanner.nextInt();
        int m1 = scanner.nextInt();
        int s1 = scanner.nextInt();

        System.out.println("Enter second time (hours minutes seconds):");
        int h2 = scanner.nextInt();
        int m2 = scanner.nextInt();
        int s2 = scanner.nextInt();

        if (h1 >= 0 && h1 < 24 && h2 >= 0 && h2 < 24 && m1 >= 0 && m1 < 60 && m2 >= 0 && m2 < 60 && s1 >= 0 && s1 < 60 && s2 >= 0 && s2 < 60) {
            addTime(h1, m1, s1, h2, m2, s2);
            subtractTime(h1, m1, s1, h2, m2, s2);
        } else {
            System.out.println("Invalid input. Please enter valid time values in 24 hour format.");
        }

        scanner.close();
    }
}