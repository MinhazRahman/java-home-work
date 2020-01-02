package conditional_statements;

/*
* 6. Create a supermarket item finder
	Take input from user and based on the input, you should display user which aisle has the item
    For example: user enter milk, you program should say aisle 8. If the item is not found,
    display a message saying "Out of stock "Please create program for below requirement
        Milk = Aisle Eight
        Eggs = Aisle Eight
        French Fries = Aisle seven
        Candy = Aisle Three
        Frozen Pizza = Aisle seven
        Donuts = Aisle Eight
        Diapers = Aisle One
        Apple = Aisle two
        Orange = Aisle two
* */

import java.util.Scanner;

public class SuperMarketItemFinder {

    public static void main(String[] args) {

        //take user input
        Scanner input = new Scanner(System.in);

        String item = null;

        System.out.println("Enter Item Name: ");
        item = input.nextLine().toUpperCase();

        //find item
        switch (item){

            case "DIAPERS":
                System.out.println(item + " is on Aisle One");
                break;

            case "APPLE":
            case "ORANGE":
                System.out.println(item + " is on Aisle Two");
                break;

            case "CANDY":
                System.out.println(item + " is on Aisle Three");
                break;

            case "FRENCH FRIES":
            case "FROZEN PIZZA":
                System.out.println(item + " is on Aisle Seven");
                break;

            case "MILK":
            case "EGGS":
            case "DONUTS":
                System.out.println(item + " is on Aisle Eight");
                break;

            default:
                System.out.println(item + " is Out of stock.");
        }

    }
}





























