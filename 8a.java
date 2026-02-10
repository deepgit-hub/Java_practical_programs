import java.lang.System;
import java.util.Scanner;
class 8a
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = scan.nextLine();
        char[] ch = str.toCharArray();
        int len =0;
        for(int i=0;i<ch.length;i++)
        {
            len++;
        } 
        System.out.print("The Total Length of the String is : "+len);
    }
}
