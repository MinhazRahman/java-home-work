package finance;

public class Bank {
    public static void main(String[] args) {

        //Execute code
        Customer customer = new Customer("John", "Doe");
        customer.createUserID("usr");
        customer.selectPassword("password");
        customer.addAccount(500);
        customer.withdrawMoney(600);
        customer.displayBalance();

        Customer customer2 = new Customer("Foo", "Bar");
        customer2.addAccount(200);

        Customer customer3 = new Customer("Kobe", "Bryant");
        customer3.addAccount(200);

        Account.deleteAccount(customer2);
        customer2.getAccount().displayAccountDetails();
    }
}

