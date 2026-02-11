import java.lang.System;
import java.util.Scanner;
class 5
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number of rows for First Matrix : ");
        int r1 = scan.nextInt();
        System.out.print("Enter Number of columns for First Matrix : ");
        int c1 = scan.nextInt();
        System.out.println();
        System.out.print("Enter Number of rows for Second Matrix : ");
        int r2 = scan.nextInt();
        System.out.print("Enter Number of columns for Second Matrix : ");
        int c2 = scan.nextInt();
        System.out.println();
        if (c1!=r2)
        {
            System.out.print("Matrix Multiplication is not possible!!!");
            return;
        }
        int[][] A = new int[r1][c1];
        int[][] B = new int[r2][c2];
        int[][] result = new int[r1][c2]; 
        System.out.println();
        System.out.println("First matrix");
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                System.out.print("Enter Element for row "+(i+1)+" and column "+(j+1));
                A[i][j] = scan.nextInt();
            }
        }
        System.out.println();
        System.out.println("Second matrix");
        for(int i=0;i<r2;i++)
        {
            for(int j=0;j<c2;j++)
            {
                System.out.print("Enter Element for row "+(i+1)+" and column "+(j+1));
                B[i][j] = scan.nextInt();
            }
        }
        System.out.println();
        System.out.println("The Elements in First Matrix ");
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("The Elements in Second Matrix ");
        for(int i=0;i<r2;i++)
        {
            for(int j=0;j<c2;j++)
            {
                System.out.print(B[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c2;j++)
            {
                for(int k=0;k<c1;k++)
                {
                    result[i][j] += A[i][k]*B[k][j];
                }
            }
        }
        System.out.println();
        System.out.println("The Result Matrix ");
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c2;j++)
            {
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }

    }
}
