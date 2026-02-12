import java.lang.System;
import java.util.Scanner;
class person
{
    String gender;
    String country;
    void getdetais(String g,String c)
    {
        gender= g;
        country = c;
    }
    void display_person()
    {
        System.out.println("Country of this person is : "+country);
        System.out.println("Gender of this person is : "+gender);
    }
}
class student extends person
{
    String college_name;
    void getdetais(String c){
        college_name = c;
    }
    void display_student()
    {
        System.out.println("The College Student studying is : "+college_name);
    }
}
class ugstudent extends student
{
    int course_duration;
    void getdetais(int c_d)
    {
        course_duration = c_d;
    }
    void display_ugstudent()
    {
        System.out.println("The Course duration of the Student is : "+course_duration);
    }
}
class 12b
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter country of a person : ");
        String country = scan.nextLine();
        System.out.print("Enter Gender of a Person : ");
        String gender = scan.nextLine();
        System.out.print("Enter the name of the college student studing : ");
        String college_name = scan.nextLine();
        System.out.print("Enter the course duration (in years): ");
        int course_duration = scan.nextInt();
        ugstudent ug = new ugstudent();
        ug.getdetais(gender,country);
        ug.getdetais(college_name);
        ug.getdetais(course_duration);
        System.out.println("---Student Details---");
        ug.display_person();
        ug.display_student();
        ug.display_ugstudent();
    }
}
