package loginvalidation;

/** Homework: Simple password validation for login system
 *
 * 1. Create a system that checks valid username and password
 *      And if they both are valid then only system displays homepage
 *      User can only try up to 5 times with invalid login details
 *      if it reaches 5 times then system should be locked for 10 min
 * 2. Fix existing bug from the system
 * 3. Write test cases to validate the scenario
 *
 * ************************
 *  Test Case Scenarios:
 *  1. valid username and password
 *  2. invalid username and password
 *  3. valid username and invalid password
 *  4. invalid username and valid password
 *  5. the range of characters for both username and password is more than the specified range
 *  6. verify the error message for invalid login
 *  7. verify the system is locked for maximum number of attempts
 *  8. verify home page for successful login
 *
 *  Boundary values:
 *  1. null username and password (username = null, password = null)
 *  2. empty username and password (username = "", password = "")
 *  3. both username and password are single spaces (username = " ", password = " ")
 *  4. both username and password contain special characters
 *
 */

import java.util.Scanner;

public class LoginValidation {

    public static void main(String[] args) throws InterruptedException {

        //instance of scanner
        Scanner scan = new Scanner(System.in);
        //maximum number of attempts
        int maxAttempt = 5;
        //no of attempts
        int attemptNo = 1;
        //attempts left
        int remainingAttempt = 0;
        boolean isMaxAttempt = false;

        //setting expected user name which is associated with user account details in database
        String expectedUserName = "user";
        //setting expected password which is associated with user account details in database
        String expectedPassword = "123";

        //Tell user to enter user name
        System.out.println("Please enter user name:");
        //takes input from console and storing the value into actualUserName variable
        String actualUserName = scan.nextLine().trim();

        //Tell user to enter password
        System.out.println("Please enter your password:");
        //takes input from console and storing the value into actualPassword variable
        String actualPassword = scan.nextLine().trim();

        //Creating while loop to give user max tries to enter valid password and username,
        // and log the user to system if correct username and password is entered
        while ((!actualUserName.equalsIgnoreCase(expectedUserName)) || (!actualPassword.equals(expectedPassword))){
            
            //show login error message
            System.out.println("Incorrect username or password.");

            // User can only try up to 5 times with invalid login details
            //if it reaches 5 times then system should be locked for 10 min
            if (attemptNo == maxAttempt) {

                isMaxAttempt = true;
                //attemptNo = 0;
                break;
            }

            //subtracting the count by iteration so user will have less tries (-1 every miss tries)
            remainingAttempt = maxAttempt - attemptNo;

            //console message to let user know how many more tries he has left with
            System.out.println("You have " + remainingAttempt + " more tries");

            //console message to user to enter valid username
            System.out.println("\nPlease enter the valid username: ");
            //let user to update the actualUserName value with new input from console
            actualUserName = scan.nextLine();

            //console message to user to enter valid password
            System.out.println("Please enter the valid password: ");
            //letting user to update the actualPassword value with new input from console
            actualPassword = scan.nextLine();

            //no of attempts
            attemptNo++;

        }

        //on homepage/account locked/something went wrong
        if(!isMaxAttempt){

            System.out.println("\nWelcome to the home page.");
        }
        else if(isMaxAttempt){

            System.out.println("\nSorry, your account will be locked for 10 min");
            System.out.print("Please Wait.....");
            System.out.println("\nStart Over");
        }
        else {

            System.out.println("Something wrong happened!!!!");
        }

    }
}

