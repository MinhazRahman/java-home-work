package conditional_statements;

/*
4. Store your name in a variable.
if your name length comes out greater than 8
	Display your name after replacing all 'a' to 'A' from your name.
Otherwise
	Display your name in uppercase.
* */

import java.util.Scanner;

public class DisplayName {

    public static void main(String[] args) {

        //take user input
        Scanner input = new Scanner(System.in);

        String myName = null;
        int lengthOfMyName = 0;

        System.out.println("Enter your name: ");
        myName = input.nextLine();
        lengthOfMyName = myName.length();

        if(lengthOfMyName > 8){

            myName = myName.replace('a', 'A');
            System.out.println("My name is: " + myName);
        }
        else {

            myName = myName.toUpperCase();
            System.out.println("My name is: " + myName);
        }
    }
}
