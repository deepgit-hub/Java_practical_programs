import java.util.Scanner;
import java.lang.System;
class 10c{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        StringBuffer sb = new StringBuffer(str);
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();
        sb.delete(start, end);
        System.out.println("String after deletion: " + sb);
    }
}
