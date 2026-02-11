import java.util.Scanner;
import java.lang.System;
class 3e
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = scan.nextInt();
        int num = 1;  
        for(int i = 1; i <= rows; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print(num + " ");
                num++; 
            }
            System.out.println();
        }
    }
}
