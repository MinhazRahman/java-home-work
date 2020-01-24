package midtermexam;

import java.util.Arrays;

public class UtilityMain {

    public static void main(String[] args) {

        int[] a = {32, 14, 24, 98, 24, 56, 148, 24, 78, 24, 78};

        int[] b = {1,3,5,4,2,7};

        //1. Create a method to return missing smallest positive integer (greater than 0) from given array.
        int missingElement = Utility.findMissingSmallestInteger(b);
        System.out.println("Missing Element: " + missingElement);

        //2. remove a specific element from an array.
        int[] updatedArray = Utility.removeElement(a, 78);
        System.out.println("Updated Array: " + Arrays.toString(updatedArray));

        //3. Scenario: Traffic ticketing system
        int point = Utility.trafficTicketingSystem(90);
        System.out.println("Violation points: " + point);
    }
}
