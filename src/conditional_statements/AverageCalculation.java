package conditional_statements;
import java.util.Arrays;

/*
5. Create an array of 5 int values. Calculate the average of those 5 values. [pls don't use for-loop]
If your average of stored numbers greater than 25
	Display Array from index 0 to last
Otherwise
	Display Array from index last to 0
* */

public class AverageCalculation {

    public static void main(String[] args) {

        //an array of five int values
        int[] ia = {2, 3, 4, 25, 60};

        //initialization
        int sum = 0, avg = 0;

        //number of elements in the array
        int n = ia.length - 1;
        //last index
        int j = n;

        //sum of array elements
        for(int i = 0; i < ia.length; i++){

            sum += ia[i];
        }

        //calculate average
        avg = sum/5;

        System.out.println("Average: " + avg);

        if(avg > 25){

            System.out.println("Display Array from index 0 to last: ");
            System.out.println(Arrays.toString(ia));
        }
        else {

            System.out.println( "Display Array from index last to 0: ");

            for(int i = 0; i < n/2; i++){
                //swap
                int temp = ia[i];
                ia[i] = ia[j];
                ia[j] = temp;

                j--;
            }

            System.out.println(Arrays.toString(ia));

        }



    }
}
