import java.util.Scanner;

class 3
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = scan.nextInt();
        int num = 1;   // starting number
        for(int i = 1; i <= rows; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print(num + " ");
                num++;   // increase number each time
            }
            System.out.println();
        }
    }
}
