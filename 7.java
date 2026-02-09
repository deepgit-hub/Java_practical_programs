import java.util.Scanner;
import java.util.Random;

class 7
  {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Enter lower limit: ");
        int lower = scan.nextInt();
        System.out.print("Enter upper limit: ");
        int upper = scan.nextInt();
        int number = rand.nextInt(upper - lower + 1) + lower;
        System.out.println("Generated number: " + number);
        if(number >= lower && number <= lower + (upper - lower)/3)
        {
            System.out.println("The number is in the lower range.");
        }
        else if(number <= lower + 2*(upper - lower)/3)
        {
            System.out.println("The number is in the middle range.");
        }
        else
        {
            System.out.println("The number is in the higher range.");
        }
    }
}
