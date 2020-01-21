package loops;
//package java.lang

/*
 * Homework:
 *
 * 3. Write a logic that checks if a number is a Prime number
 *
 * */

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        //take user input
        Scanner input = new Scanner(System.in);

        int number = 0;
        boolean isPrime = true;

        System.out.println("Please enter a number: " );
        number = input.nextInt();

        //when number is less than 2
        if(number < 2){

            isPrime = false;
        }
        else {

            isPrime = true;
        }

        //prime number or not
        for (int i = 2; i <= Math.sqrt(number); i++){

            if(number % i == 0){

                isPrime = false;
                break;
            }
        }

        //checking
        if(isPrime == true){

            System.out.println(number + " is a prime number.");
        }
        else {

            System.out.println(number + " is not a prime number.");
        }

    }
}
