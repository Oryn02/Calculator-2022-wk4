package ie.atu.week4Calc22;

import java.util.Scanner;

public class Calc22
{
    public static void main(String[] args) 
    {
      add();
      multiply();
    }
    
    //This method takes in a value and multiplies
    public static void multiply()
    {
        System.out.println("Please enter first number");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        System.out.println("Please enter second number");
        int secondNumber = inputs.nextInt();

        int total = firstNumber * secondNumber;
        System.out.println("The total is: " + total);
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
