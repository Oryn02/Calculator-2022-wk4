package ie.atu.week4Calc22;
import java.util.Scanner;

public class Calc22
{
    public static void main(String[] args)
    {
        subtract();
    }

    //This method takes 2 values away from each other
    public static void subtract()
    {
        System.out.println("Please enter your number: ");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        System.out.println("PLease enter your second number: ");
        int SecondNumber = inputs.nextInt();

        int total = firstNumber - SecondNumber;
        System.out.println("The total is " + total);
    }
}
