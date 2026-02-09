import java.util.Scanner;

class 1a
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        String name = scan.nextLine();
        System.out.print("Enter Department Name: ");
        String dept = scan.nextLine();
        System.out.print("Enter College Name: ");
        String college = scan.nextLine();
        System.out.print("Enter Roll Number: ");
        int roll = scan.nextInt();
        System.out.println("Student Details");
        System.out.println("Name        : " + name);
        System.out.println("Department  : " + dept);
        System.out.println("College     : " + college);
        System.out.println("Roll Number : " + roll);
    }
}
