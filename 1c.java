import java.lang.System;
import java.util.Scanner;
class 1c
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        if(num % 2 == 0)
        {
            System.out.println("The number is Even");
        }
        else
        {
            System.out.println("The number is Odd");
        }
    }
}
