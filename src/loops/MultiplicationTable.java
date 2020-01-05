package loops;

/*
* Homework
*
*  2. Write a logic that prints multiplication table of the user provided number up to ten.
*
* */

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

        //take user input
        Scanner input = new Scanner(System.in);

        //initialization
        int number = 0;
        int n = 0;

        System.out.println("Multiplication table of(Please enter a number): ");
        number = input.nextInt();

        System.out.println("Up to (Please enter a number): ");
        n = input.nextInt();

        //print the multiplication table
        System.out.println(number + "'Times Table up to " + n + ":");

        for (int i = 0; i <= n; i++){

            System.out.println(number + " x " + i + " = " + number*i);
        }
    }
}
