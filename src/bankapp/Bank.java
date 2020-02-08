package bankapp;

public class Bank {
    public static void main(String[] args) {

        //Execute code
        Customer customer1 = new Customer("John", "Doe");
        customer1.createUserID("usr");
        customer1.selectPassword("password");
        customer1.openAccount(500);
        System.out.println("Account List: " + Account.getAccounts());

        Customer customer2 = new Customer("Michael", "Oscar");
        customer2.createUserID("user");
        customer2.selectPassword("userpassword");
        customer2.openAccount(600);
        System.out.println("Account List: " + Account.getAccounts());

        Account.deleteAccount(customer1.getAccount());
        System.out.println("Account List: " + Account.getAccounts());


    }
}

