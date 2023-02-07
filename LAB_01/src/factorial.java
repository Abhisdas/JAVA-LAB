/*Write a program in java to find factorial of a number.*/

import java.util.*;
public class factorial
{
    public static void main(String[] args)
    {
        int i ,fact=1,num;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number:-");
        num= sc.nextInt();
        sc.close();
        for(i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        System.out.println("The Factorial of a number is :"+fact);
        
    }
}