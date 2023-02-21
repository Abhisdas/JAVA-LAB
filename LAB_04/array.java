/* 3. Write a program to perform following operations on an array
   A. Find the pair of numbers in array whose consecutive numbers subtraction is equal
    to zero.*/
   
    import java.util.*;
    public class array {
    
        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the number of element you want to insert :");
            int j = sc.nextInt();
            int number[]= new int[j];
            for(int i=0;i<j;i++) {
                number[i]=sc.nextInt();
            }
            
            for(int i=0;i<number.length-1;i++)
            {
                if((number[i]-number[i+1])==0)
                    System.out.println("the pair which statisfy the given condition:("+number[i]+","+number[i+1]+")");
        
                }
        sc.close();
            }
    }