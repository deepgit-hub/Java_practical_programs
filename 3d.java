import java.util.Scanner;

class 3d
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
    }
}
