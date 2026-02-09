import java.lang.System;
import java.util.Scanner;
class SwapNumbers
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = scan.nextInt();
        System.out.print("Enter second number: ");
        int b = scan.nextInt();
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping:");
        System.out.println("First number = " + a);
        System.out.println("Second number = " + b);
    }
}
