import java.lang.System;
import java.util.Scanner;
class employee
{
    String employee_name;
    int employee_salary;
    int employee_age;
    void getemployeedetails(String n,int s,int a)
    {
        employee_name = n;
        employee_salary = s;
        employee_age = a;
    }
    void displaydetails()
    {
        System.out.println("Employee Name : "+employee_name);
        System.out.println("Employee Salary : "+employee_salary);
        System.out.println("Employee Age : "+employee_age);
    }
}
class Programmer extends employee
{
    String language;
    void displaylang(String l)
    {
        language = l;
        System.out.print("Language Used : "+language);
    }
}
class 12a
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        Programmer p = new Programmer();
        System.out.print("Enter Employee name : ");
        String employee_name = scan.nextLine();
        System.out.print("Enter Employee age : ");
        int employee_age = scan.nextInt();
        System.out.print("Enter Employee salary : ");
        int employee_salary = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter the Language used : ");
        String language = scan.nextLine();
        p.getemployeedetails(employee_name,employee_salary,employee_age);
        p.displaydetails();
        p.displaylang(language);
    }
}
