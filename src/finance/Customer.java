package finance;

import java.time.LocalDate;

public class Customer {

    //instance data
    private String firstName;
    private String lastName;
    private Account account;
    private String userID;
    private String password;
    private String[] userIDs = {"foo", "bar", "endGame", "GOT"};

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /* create a valid user id */
    public void createUserID(String userID){

        boolean isFound = false;
        final int USER_ID_LENGTH = 3;

        if(userID == null || userID == ""){

            System.out.println("User Id can't be Null or Empty!!");
            return;
        }

        if (userID.length() < USER_ID_LENGTH){

            System.out.println("User ID should be minimum " + USER_ID_LENGTH +" characters long!!");
            return;
        }

        //check if the userID is in the userIDs list
        for(String takenID: userIDs){

            if(userID.equalsIgnoreCase(takenID)){
                isFound = true;
            }
        }

        if(isFound){

            System.out.println("User ID is already taken!!");
            return;
        }

        //set the user id
        this.userID = userID;
    }

    /* select a valid password */
    public void selectPassword(String password){

        final int PASSWORD_LENGTH = 8;
        String alphanumericPattern = "^[a-zA-Z0-9]*$";

        if(password == null || password == ""){

            System.out.println("Password can't be Null or Empty!!");
            return;
        }

        if(password.length() < PASSWORD_LENGTH){

            System.out.println("Password should be minimum " + PASSWORD_LENGTH +" characters long!!");
        }

        if (!password.matches(alphanumericPattern)){

            System.out.println("Password must contain only alphanumeric characters!!");
            return;
        }

        //set the password
        this.password = password;
    }

    /* get customer account */
    public Account getAccount(){

        return account;
    }

    /* add customer account */
    public void addAccount(double initialBalance) {
        account = new Account();
        account.setAccountId(Account.getNextId());
        Account.saveAccountId(account.getAccountId());
        account.setAccountCreationDate(LocalDate.now());
        account.deposit(initialBalance);
        customerDetails();
    }

    /* withdraw money from account */
    public double withdrawMoney(double amount){

       double cash =  account.withdraw(amount);

       return cash;
    }

    /* display account balance */
    public void displayBalance(){

        System.out.println("Your current balance is: $" + account.getBalance());
    }

    /* show customer details */
    private void customerDetails() {
        account.displayAccountDetails();
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
    }
}