/*Write a program in java to read any 5 integers from command line arguments and find largest amoung them and display it*/

public class commandlargest {
    public static void main(String[] args) {
        int largest = Integer.parseInt(args[0]);
        for (int i = 1; i < args.length; i++) {
            int current = Integer.parseInt(args[i]);
            if (current > largest) {
                largest = current;
            }
        }
        System.out.println("The largest integer is " + largest);
    }
}