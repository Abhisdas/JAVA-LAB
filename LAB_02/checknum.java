//Write a Program in java to check given number is Armstrong or palindrome.

import java.util.Scanner;

public class checknum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();

        int originalNum = num;
        int result = 0;
        int digits = 0;

        while (originalNum != 0) {
            originalNum /= 10;
            ++digits;
        }

        originalNum = num;
        while (originalNum != 0) {
            int remainder = originalNum % 10;
            result += Math.pow(remainder, digits);
            originalNum /= 10;
        }

        if (result == num) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }

        int reverse = 0;
        int n = num;
        while (n != 0) {
            int lastDigit = n % 10;
            reverse = reverse * 10 + lastDigit;
            n /= 10;
        }

        if (reverse == num) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }
    }
}
