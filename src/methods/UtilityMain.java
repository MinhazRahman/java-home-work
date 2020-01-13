package methods;

import java.util.Arrays;

public class UtilityMain {

    public static void main(String[] args) {

        //instance of Utility
        Utility utility = new Utility();

        //initialization
        String str = "This is a string.";
        int[] arr = {25, 15, 3, 2, 40};
        double[] sMarks = {90, 89, 91, 67, 87, 88, 93, 90, 100, 81, 54};
        String [] sNames = {"Happy", "Peace" , "Jesse", "Kaitlin" , "Amir", "Donald", "Steven", "Vicky", "Hannah" , "David", "Gia"};

        //1. reverse a string
        System.out.println(utility.reverseString(str));

        //2. reverse an array
        System.out.println(Arrays.toString(utility.reverseArray(arr)));

        //3. sum of array elements
        System.out.println(utility.sumOf(arr));

        //5. find the average of a given array
        System.out.println(utility.findAverageOf(arr));

        //6. find maximum
        System.out.println(utility.maximum(arr));

        //7. find minimum
        System.out.println(utility.minimum(arr));

        //8.find abbreviation
        System.out.println(utility.abbreviationOf("Good Morning New York"));

        //9. fibonacci series
        System.out.println("Fibonacci series: ");
        utility.fibonacci(5, 8, 6);

        //10. Maximum marks getter
        System.out.println(utility.maximumMarksGetter(sMarks, sNames));

        //11. Add numbers from 0 to given number(n)
        System.out.println(utility.addUpTo(5));
    }
}
