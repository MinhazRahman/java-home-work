package bankapp;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.Objects;

public class Account implements Comparable<Account>{

    //reference of DateTimeFormatter
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

    //class data
    private static int NEXT_ID = 1;
    public static final int ROUTING_NUMBER = 12345;
    private static LinkedList<Account> accounts = new LinkedList<>();


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

    /* add account id to the ACCOUNT_IDS list*/
    public static void saveAccount(Account accountToBeSaved){

        if (accountToBeSaved == null){

            System.out.println("Account can't be Null!!");
            return;
        }

        //add account to the ACCOUNTS list
        accounts.add(accountToBeSaved);
    }

    /* remove account id from the ACCOUNT_IDS list */
    public static void deleteAccount(Account accountToBeDeleted){

        if (accountToBeDeleted == null){

            System.out.println("Account id can't be Null or Empty!!");
            return;
        }

        //remove from ACCOUNT_IDS list
        for(Account currentAccount: accounts){

            if(currentAccount.compareTo(accountToBeDeleted) == 0){

                int index = accounts.indexOf(currentAccount);
                accounts.remove(index);
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

    public static LinkedList<Account> getAccounts() {
        return accounts;
    }

    @Override
    public String toString() {

        return "{" +
                "accountId: '" + accountId + '\'' +
                ", balance: $" + balance +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return accountId.equals(account.accountId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId);
    }

    @Override
    public int compareTo(Account account) {

        return this.accountId.compareTo(account.accountId);
    }
}