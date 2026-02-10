import java.lang.System;
import java.util.Scanner;
class 8c
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter First String : ");
        String str1 = scan.nextLine();
        System.out.print("Enter Second String : ");
        String str2 = scan.nextLine();
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        char[] result = new char[ch1.length+ch2.length];
        int i;
        for(i=0;i<ch1.length;i++)
        {
            result[i] = ch1[i];
        }
        for(int j=0;j<ch2.length;j++)
        {
            result[i+j] = ch2[j];
        }
        System.out.print("After Concatentation : ");
        for(int a=0;a<result.length;a++)
        {
            System.out.print(result[a]);
        }
    }
}
