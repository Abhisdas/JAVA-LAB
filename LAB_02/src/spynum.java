//Write a program in java to find given number is a spy number or not.

import java.util.Scanner;

public class spynum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();
        sc.close();

        int sum = 0;
        int product = 1;
        int temp = num;

        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }

        if (sum == product) {
            System.out.println(num + " is a spy number");
        } else {
            System.out.println(num + " is not a spy number");
        }
    }
}
