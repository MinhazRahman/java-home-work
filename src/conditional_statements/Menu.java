package conditional_statements;

/*
1. Menu:
  boolean isGuestOneVegan = true;
  boolean isGuestTwoVegan = true;

  Are both vegan? only offer up vegan dishes.
  At least one vegan? make sure offer up some vegan options.
  Else, offer anything on the menu
* */

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        //take user input
        Scanner input = new Scanner(System.in);

        boolean isGuestOneVegan = false;
        boolean isGuestTwoVegan = false;

        System.out.println("***Please enter true or false**");
        System.out.println("Is Guest One Vegan: ");
        isGuestOneVegan = input.nextBoolean();

        System.out.println("Is Guest Two Vegan: ");
        isGuestTwoVegan = input.nextBoolean();


        //offer menu
        if(isGuestOneVegan && isGuestTwoVegan){ //both vegan

            System.out.println("Vegetable soup");
        }
        else if (isGuestOneVegan || isGuestTwoVegan){  //at least on vegan

            System.out.println("Vegetarian House");
        }
        else {      //none is vegan

            System.out.println("Non vegan dishes");
        }

    }
}
