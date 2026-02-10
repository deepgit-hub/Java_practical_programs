import java.lang.System;
import java.util.Scanner;
class 11
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a String to reverse it : ");
        String string = scan.nextLine();
        String rev ="";
        for(int i=(string.length())-1;i>=0;i--)
        {
            rev +=string.charAt(i);
        } 
        System.out.println("The Reversed String is : "+rev);
        if(string.equals(rev))
        {
            System.out.println("The Entered String is Palindrome!!!");
        }
        else
        {
            System.out.println("The Entered String is not Palindrome!!!");
        }
    }
}
