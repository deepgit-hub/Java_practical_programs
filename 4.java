import java.lang.System;
import java.util.Scanner;
class 4
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an Integer : ");
        int n = scan.nextInt();
        int count_prime = 0;
        for(int i=2;i<=n;i++)
        {
            int count =0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    count++;
                }
            }
            if(count==2)
            {
                count_prime++;
                System.out.print(i+" ");
            }
        }
        System.out.print("The Total Prime numbers are : "+count_prime);
    }
}
