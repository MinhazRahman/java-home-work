package midtermexam;

import java.util.Arrays;

public class UtilityMain {

    public static void main(String[] args) {

        int[] a = {32, 14, 24, 98, 24, 56, 148, 24, 78, 24, 78};

        int[] b = {1,3,5,4,2,7};

        int[] c =  {-1, -3, 4, 2};

        int[] d = {0, 5, -1, 1, 2, 4, 5, 3, 7, 1, 2};

        //1. Create a method to return missing smallest positive integer (greater than 0) from given array.
        int missingElement = Utility.findMissingSmallestInteger(d);
        System.out.println("Missing Element: " + missingElement);
        System.out.println("Missing Element: " + Utility.missingSmallestInteger(d));

        //2. remove a specific element from an array.
        int[] updatedArray = Utility.removeElement(a, 78);
        System.out.println("Updated Array: " + Arrays.toString(updatedArray));

        //3. Scenario: Traffic ticketing system
        int point = Utility.trafficTicketingSystem(90);
        System.out.println("Violation points: " + point);
    }
}
