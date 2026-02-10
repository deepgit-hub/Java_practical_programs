import java.util.Scanner;
import java.lang.System;
class 9b {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter main string: ");
        String mainStr = sc.nextLine();
        System.out.print("Enter substring to search: ");
        String subStr = sc.nextLine();
        if(mainStr.contains(subStr)) {
            System.out.println("Substring found.");
        } else {
            System.out.println("Substring not found.");
        }
    }
}
