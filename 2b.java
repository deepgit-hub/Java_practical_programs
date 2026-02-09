import java.util.Scanner;
import java.lang.System;
class 2b
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = scan.nextInt();
        System.out.print("Enter second number: ");
        int b = scan.nextInt();
        System.out.print("Enter third number: ");
        int c = scan.nextInt();
        if(a >= b && a >= c)
        {
            System.out.println("Greatest number = " + a);
        }
        else if(b >= a && b >= c)
        {
            System.out.println("Greatest number = " + b);
        }
        else
        {
            System.out.println("Greatest number = " + c);
        }
    }
}
