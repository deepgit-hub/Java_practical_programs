import java.lang.System;
import java.util.Scanner;
class 6
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String line = scan.nextLine();
        int ch = line.length();
        int words = line.split(" ").length;
        int lines = 1;
        System.out.println("The Characters in the text : "+ch);
        System.out.println("The Words in the text : "+words);
        System.out.println("The Lines in the text : "+lines);
    }
}
