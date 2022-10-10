package ie.atu.week4Calc22;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Calc22
{
    public static void main(String[] args)
    {
        add();
    }

    //This method takes in a value and adds
    public static void add()
    {
        System.out.println("please enter first number");
        Scanner input = new Scanner(System.in);
        int firstNumber = input.nextInt();

        System.out.println("Please enter second number :");
        int secondNumber = input.nextInt();

        int total = firstNumber + secondNumber;
        System.out.println("The total is " + total);
    }
}
