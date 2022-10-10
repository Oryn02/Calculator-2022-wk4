package ie.atu.week4Calc22;
import java.util.Scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Calc22
{
    public static void main(String[] args) {
        System.out.println("Please enter your number: ");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        System.out.println("PLease enter your second number: ");
        int SecondNumber = inputs.nextInt();
        Scanner input = new Scanner(System.in);

        int total = firstNumber - SecondNumber;
        System.out.println("The total is " + total);
    }

}
