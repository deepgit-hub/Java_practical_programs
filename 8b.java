import java.lang.System;
import java.util.Scanner;
class 8b
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = scan.nextLine();
        char[] ch = str.toCharArray();
        System.out.print("Enter the Position you want : ");
        int pos = scan.nextInt();
        if(pos>=0 && pos<ch.length)
        {
            System.out.print("The Character @ "+pos+" is "+ch[pos]);
        }
        else
        {
            System.out.print("Invalid character entered!!!");
        }
    }
}
