package conditional_statements;

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
        int[] ia = {2, 3, 4, 5, 6};

        //initialization
        int sum = 0, avg = 0, i = 0;

        //sum of array elements
        sum = ia[0] + ia[1] + ia[2] + ia[3] + ia[4];
        //average
        avg = sum/5;

        if(avg > 25){

            // Display Array from index 0 to last
            System.out.println("ia[0]: " + ia[0]);
            System.out.println("ia[1]: " + ia[1]);
            System.out.println("ia[2]: " + ia[2]);
            System.out.println("ia[3]: " + ia[3]);
            System.out.println("ia[4]: " + ia[4]);
        }
        else {

            // Display Array from index last to 0
            System.out.println("ia[4]: " + ia[4]);
            System.out.println("ia[3]: " + ia[3]);
            System.out.println("ia[2]: " + ia[2]);
            System.out.println("ia[1]: " + ia[1]);
            System.out.println("ia[0]: " + ia[0]);

        }



    }
}
