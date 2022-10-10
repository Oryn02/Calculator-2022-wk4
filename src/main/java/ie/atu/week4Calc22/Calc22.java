package ie.atu.week4Calc22;

import java.util.Scanner;

public class Calc22
{
    public static void main(String[] args) {
        add();

    }
    public static void add()
    {
        System.out.println("Please enter first number");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        System.out.println("Please enter second number");
        int secondNumber = inputs.nextInt();

        int total = firstNumber * secondNumber;
        System.out.println("The total is: " + total);
    }
}
