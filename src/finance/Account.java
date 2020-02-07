package finance;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class Account {

    //reference of DateTimeFormatter
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

    //class data
    private static int NEXT_ID = 1;
    public static final int ROUTING_NUMBER = 12345;
    public static String[] ACCOUNT_IDS = new String[10];

    //instance data
    private double balance;
    private String accountId;
    private LocalDate accountCreationDate;

    /* deposit money */
    public void deposit(double amount) {

        balance = balance + amount;
    }

    /* withdraw money*/
    public double withdraw(double amount) {

        if(amount > balance){

            System.out.println("You can't withdraw more than what you have in the account!!");
            return 0;
        }

        //new balance, after withdrawing money
        balance = balance - amount;

        return amount;
    }

    /* add account id to the ACCOUNT_IDS[] array*/
    public static void saveAccountId(String accountId){

        if (accountId == null || accountId == ""){

            System.out.println("Account id can't be Null or Empty!!");
            return;
        }

        //add id to the ACCOUNT_IDS[] array
        for(int i = 0; i < ACCOUNT_IDS.length; i++){

            if(ACCOUNT_IDS[i] == null){

                ACCOUNT_IDS[i] = accountId;
                return;
            }
        }
    }

    /* remove account id from the ACCOUNT_IDS[] array */
    public static void deleteAccount(Customer customer){

        //get customer account id
        String accountId = customer.getAccount().getAccountId();

        if (accountId == null || accountId == ""){

            System.out.println("Account id can't be Null or Empty!!");
            return;
        }

        //remove from ACCOUNT_IDS[]
        for(int i = 0; i < ACCOUNT_IDS.length; i++){

            if(ACCOUNT_IDS[i].equals(accountId)){

                ACCOUNT_IDS[i] = null;
                return;
            }
        }
    }
    public void displayAccountDetails() {
        System.out.println("\n****** Account Information*****");
        System.out.println("ID: " + accountId);
        System.out.println("Balance: $" + balance);
        System.out.println("Routing Number: " + ROUTING_NUMBER);
        System.out.println("Account Creation Date: " + dateTimeFormatter.format(accountCreationDate));
        System.out.println("Account Ids: " + Arrays.toString(ACCOUNT_IDS));
    }

    public double getBalance(){

        return balance;
    }

    public String getAccountId(){

        return accountId;
    }
    public void setAccountId(String accountId) {

        this.accountId = accountId;
    }
    public static String getNextId() {

        return "ACCT# " + Account.NEXT_ID++;
    }

    public LocalDate getAccountCreationDate() {

        return accountCreationDate;
    }

    public void setAccountCreationDate(LocalDate accountCreationDate) {

        this.accountCreationDate = accountCreationDate;
    }
}