//Write a program in java to convert Number into words. 
import java.util.Scanner;

public class convertnumtoword {
    private static final String[] ONES = {
            "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
    };

    private static final String[] TENS = {
            "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
    };

    public static String convert(int num) {
        if (num < 0) {
            return "minus " + convert(-num);
        }
        if (num < 20) {
            return ONES[num];
        }
        if (num < 100) {
            return TENS[num / 10] + ((num % 10 != 0) ? " " : "") + ONES[num % 10];
        }
        if (num < 1000) {
            return ONES[num / 100] + " hundred" + ((num % 100 != 0) ? " and " : "") + convert(num % 100);
        }
        if (num < 1000000) {
            return convert(num / 1000) + " thousand " + ((num % 1000 != 0) ? "and " : "") + convert(num % 1000);
        }
        return convert(num / 1000000) + " million " + ((num % 1000000 != 0) ? "and " : "") + convert(num % 1000000);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();

        System.out.println("The number in words: " + convert(num));
    }
}
