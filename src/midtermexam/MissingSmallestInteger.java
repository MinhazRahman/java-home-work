package midtermexam;

public class MissingSmallestInteger {

    /* 1. returns missing smallest positive integer (greater than 0) from a given array */
    public static int findMissingSmallestInteger(int[] arr){
        //the smallest positive integer (greater than 0)
        int n = 1;
        boolean found = false;
        int max = arr[0];

        //find the largest number in the array
        for(int i = 0; i < arr.length; i++){

            if(arr[i] > max){

                max = arr[i];
            }
        }

        /*if the array contains all negative numbers then the max value will be < 0
        or if the max value is 0, that means if the max value <= 0
        then n = 1 will be the smallest positive integer (greater than 0) */
        if(max <= 0){

            return n;
        }

        /*If max is a positive number greater than 0, the missing smallest positive integer will be
        between 1 and max value */
        for(int i = 1; i <= max; i++){

            found = false;

            //search for i
            for(int j = 0; j < arr.length; j++){

                if(i == arr[j]){
                    found = true;
                    break;
                }
            }

            if (!found){

                return i;
            }
        }
        return n;
    }
}
