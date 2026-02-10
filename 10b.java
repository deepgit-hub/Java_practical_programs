import java.util.Scanner;
import java.lang.System;
class 10b{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        StringBuffer sb = new StringBuffer(str);

        sb.reverse();

        System.out.println("Reversed string: " + sb);
    }
}
