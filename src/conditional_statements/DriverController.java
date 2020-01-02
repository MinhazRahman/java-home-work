package conditional_statements;

/*
2. Driver Controller
 * I want to be able to put car on P mode, D mode, N mode, R mode
 * If i am on P mode and parking type is parallel then i can park between two cars
 * If i am on D mode I can put drive type to Snow type, Sport Type or Regular type
 * If i am on N mode i can put car in car wash station
 * If i am on R mode I can only reverse the car and car will activate back camera
 * If mode is incorrect then print me invalid mode type, please check your car mode
* */

import java.util.Scanner;

public class DriverController {

    public static void main(String[] args) {

        //take user input
        Scanner input = new Scanner(System.in);

        //initialization
        String mode = null;
        String parkingType = null;
        String driveType = null;
        String carWash = null;
        boolean isReversed = false;

        System.out.println("Enter mode(P, D, N or R): ");
        mode = input.nextLine();

        if(mode.equalsIgnoreCase("P")){

            System.out.println("The car is on Parking mode.");
            System.out.println("Enter parking type (parallel or any other): ");
            parkingType = input.nextLine();

            if(parkingType.equalsIgnoreCase("parallel")){

                System.out.println("Park between two cars");
            }
            else {
                System.out.println("Can't park between two cars");
            }
        }
        else if(mode.equalsIgnoreCase("D")){

            System.out.println("The car is on Driving mode.");
            System.out.println("Enter drive type (snow, sport, regular or any other): ");
            driveType = input.nextLine();

            if(driveType.equalsIgnoreCase("Snow")){

                System.out.println("Drive type is set to sow");
            }
            else if(driveType.equalsIgnoreCase("Sport")){

                System.out.println("Drive type is set to sport");
            }
            else if(driveType.equalsIgnoreCase("Regular")){

                System.out.println("Drive type is set to regular");
            }
            else {

                System.out.println(driveType + " is not a valid driver type");
            }
        }
        else if(mode.equalsIgnoreCase("N")){

            System.out.println("The car is on Neutral mode.");
            System.out.println("Do you want to wash the car? (yes/no)");
            carWash = input.nextLine();

            if(carWash.equalsIgnoreCase("yes")){
                System.out.println("The car is in car wash station");
            }
            else {
                System.out.println("Alright, you can wash it later.");
            }

        }
        else if(mode.equalsIgnoreCase("R")){

            System.out.println("The car is on Reverse mode");

            System.out.println("Do you want to reverse the car? (true/false)");
            isReversed = input.nextBoolean();

            if (isReversed){

                System.out.println("The back camera is activated");
            }
            else {

                System.out.println("No, I don't want to reverse the car");
            }
        }
        else {

            System.out.println("Your mode " + mode.toUpperCase() + " is invalid");
            System.out.println("Please check your car mode");
        }
    }

}
