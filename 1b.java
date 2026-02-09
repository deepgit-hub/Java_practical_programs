import java.lang.System;
import java.util.Scanner;

class 1b
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scan.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scan.nextInt();
        System.out.println("\nAddition = " + (num1 + num2));
        System.out.println("Subtraction = " + (num1 - num2));
        System.out.println("Multiplication = " + (num1 * num2));
        System.out.println("Division = " + (num1 / num2));
        System.out.println("Modulus = " + (num1 % num2));
        System.out.print("\nEnter a number to find square: ");
        int squareNum = scan.nextInt();
        System.out.println("Square = " + (squareNum * squareNum));
    }
}
