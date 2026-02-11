import java.util.Scanner;
import java.lang.System;
class 3b
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = scan.nextInt();
        for(int i = 1; i <= rows; i++)
        {
            for(int j = i; j < rows; j++)
            {
                System.out.print(" ");
            }
            for(int k = 1; k <= (2*i - 1); k++)
            {
                System.out.print("*");
            }

            System.out.println();
        }
        for(int i = rows - 1; i >= 1; i--)
          {
            for(int j = rows; j > i; j--)
            {
                System.out.print(" ");
            }
            for(int k = 1; k <= (2*i - 1); k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
