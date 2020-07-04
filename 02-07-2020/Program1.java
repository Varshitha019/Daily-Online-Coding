1.Write a program that will read a sequence of positive real numbers entered by the user and will print the same numbers in sorted order from smallest to largest.
The user will input a zero to mark the end of the input. Assume that at most 100 positive numbers will be entered.
Code:-
import java.util.Scanner;

public class Main {

	public static void main(String[] args) 

    {

        int number;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number you want to check:");

        number = scan.nextInt();

        scan.close();

        if(number > 0)

        {

            System.out.println(number+" is positive number");

        }

        else if(number < 0)

        {

            System.out.println(number+" is negative number");

        }

        else

        {

            System.out.println(number+" is neither positive nor negative");

        }

    }
}
