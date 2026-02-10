import java.util.Scanner;

class 10a{
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scan.nextLine();
        StringBuffer sb = new StringBuffer(str);
        System.out.println("Length of the string: " + sb.length());
    }
}
