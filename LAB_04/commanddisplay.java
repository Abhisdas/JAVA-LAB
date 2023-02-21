/*1. Write a program in java to read any 5 names from command line arguments and display them.*/

public class commanddisplay{
    public static void main(String[] args)
    {
        if(args.length < 5) {
            System.out.println("Give 5 names as command line arguments");
            return;
        }
        System.out.println("The names are:-");
        for( int i = 0 ;i < 5 ; i++){
            System.out.println(args[i]);
    }
    }
}