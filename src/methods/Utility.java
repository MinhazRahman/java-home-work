package methods;

/* Create methods to :
 *     1. Reverse a string
 *         Eg: Input to method : Sample //1.eamplS 2. elmpaS 3. elpmaS
 *               Output/Return from method : elpmaS
 *
 *     2. Reverse an array (fyi: length of input array can vary)
 *         Eg: Input to method : [25, 15, 3, 2, 40] or [20, 10, 44]
 *               Output/Return from method : [40, 2, 3, 15, 25] or [44, 10, 20]
 *
 *     3. Add all numbers in a given array (fyi: length of input array can vary)
 *         Eg: Input to method : [20, 10, 40, 44]
 *               Output/Return from method : 114
 *
 *     4. Sort an array
 *         Eg: Input to method : [20, 10, 40, 44]
 *               Output/Return from method : [10, 20, 40, 44]
 *
 *     5. Find Average of a given array
 *         Eg: Input to method : [20, 10, 40, 44]
 *               Output/Return from method : 28.5
 *
 *     6. Find maximum number in given array
 *         Eg: Input to method : [20, 10, 40, 44, 32]
 *               Output/Return from method : 44
 *
 *     7. Find minimum number in given array
 *         Eg: Input to method : [20, 10, 40, 44]
 *               Output/Return from method : 10
 *
 *     8. Create abbreviation for any string
 *         Eg: Input to method : Outfit of the day ( or Good morning or Happy new year)
 *               Output/Return from method : OOTD ( or GM or HMY)
 *
 *     9. Create fibonacci series for given start number and given length of series
 *         Eg: Input to method : start = 1 , totalNumInSeries = 6
 *               Output/Return from method : [1, 1, 2, 3, 5, 8, 13]
 *
 *     10. Given two arrays, one contains total marks of 11 students of a class; second array contains their names in same order as marks-array.
 *     double[] sMarks = {90, 89, 91, 67, 87, 88, 93, 90, 100, 81, 54};
 *     String [] sNames = {"Happy", "Peace" , "Jesse", "Kaitlin" , "Amir", "Donald", "Steven", "Vicky", "Hannah" , "David", "Gia"};
 *     Create a method which takes both array as parameters, and returns name of student who scored maximum marks in the class.
 *     For above example : method should return "Hannah"
 *
 *     11. Create a method to add numbers from 0 to given number, and return the result
 *     Example : addUpTo(5)  -> method should return 15 (bcz, 0+1+2+3+4+5 = 15)
 *     Parameter can be negative or positive
 *
 * Extra Credit:
 *      11. What if there are more than one students who get the highest marks
 */
public class Utility {

    //constructor
    public Utility(){

    }

    /* 1. reverse a given string */
    public String reverseString(String myString){

        //myString = "Sample";
        //create an empty string
        String reversedString = "";

        //get the string length
        int stringLength = myString.length();

        //put all the characters of string in reverse order into reversedString
        for (int i = stringLength - 1; i >= 0; i--){

            reversedString += myString.charAt(i); // reversedString = reversedString + myString.charAt(i)
        }

        System.out.println(reversedString);

        //return the reversed string
        return reversedString;
    }

    /* 2. reverse an array*/
    public int[] reverseArray(int[] myArray){

        //get the array length
        int arrayLength = myArray.length;

        //index of the last array element
        int lastIndex = arrayLength - 1;

        //create a new array
        int[] reversedArray = new int[arrayLength];

        //iterate over myArray[0...n-1], n is number of elements, in reverse direction,[n-1...0] and
        //put all the elements into reversedArray[0..n-1]
        for (int i = 0; i < arrayLength; i++){

            reversedArray[i] = myArray[lastIndex - i];
        }

        return reversedArray;
    }

    /* 3. Add all numbers in a given array*/
    public int sumOf(int[] myArray){

        //get the array length
        int arrayLength = myArray.length;

        //initialize
        int sum = 0;

        //iterate over myArray[0...n-1], n is number of elements, to add all the numbers
        for (int i = 0; i < arrayLength; i++){

            sum += myArray[i];
        }

        return sum;
    }

    /* 4. Sort an array using insertion sort algorithm */
    public int[] sort(int[] a) {

        //number of elements in the array
        int n = a.length;

        //a[0...j] is the sorted portion, a[i...n-1] is the unsorted portion,
        //key is the target value we want to insert into the sorted portion
        int i, j, key;

        //iterate over the array
        for(i = 1; i< n; i++) {

            //on each iteration get the target value from the unsorted portion as key
            key = a[i];
            j = i-1;

            //move the larger values to the right
            while(j>= 0 && a[j]>key) {

                //move the larger element to the right
                a[j+1] = a[j];

                //move down the sorted portion by decreasing j
                --j;
            }

            //insert the key at the right position
            a[j+1] = key;

        }

        return a;
    }

    /* 5. Find average of a given array*/
    public double findAverageOf(int[] myArray){

        int sum = 0;
        double average = 0;

        //calculate sum
        for (int i = 0; i < myArray.length; i++){

            sum += myArray[i];
        }

        //calculate average
        average = sum/myArray.length;

        return average;
    }

    /* 6. Find maximum of a given array*/
    public int maximum(int[] myArray){

        //consider the first element as maximum
        int max = myArray[0];

        //find the maximum value
        for (int i = 1; i < myArray.length; i++){

            if(myArray[i] > max){

                max = myArray[i];
            }
        }

        return max;
    }

    /* 7. Find minimum of given array*/
    public int minimum(int[] myArray){

        //consider the first element as minimum
        int min = myArray[0];

        for (int i = 1; i < myArray.length; i++){

            if(myArray[i] < min){

                min = myArray[i];
            }
        }

        return min;
    }

    /* 8. Abbreviation of a given string */
    public String abbreviationOf(String myString){

        //split the string into array of strings
        String[] words = myString.split(" ");

        //length of the array
        int len = words.length;

        //create an empty string
        String abbreviation = "";

        //extract the first character of each element and put it into string abbreviation
        for (int i = 0; i < words.length; i++){

            abbreviation += words[i].charAt(0);
        }

        return abbreviation.toUpperCase();
    }

    /* 9. Fibonacci series, a and b are first two starting numbers in the series
    and n is the total numbers in the series*/
    public void fibonacci(int a, int b, int n){

        int c = 0;

        System.out.print(a + " " + b + " ");

        for (int i = 0; i < n - 2; i++){

            c = a + b;
            a = b;
            b = c;

            System.out.print(c + " ");
        }

        System.out.println();
    }

    /* 10. Maximum marks getter*/
    public String maximumMarksGetter(double[] marks, String[] names){

        //find maximum marks
        double max = marks[0];
        int index = 0;
        String maxMarksGetter = null;

        for (int i = 1; i < marks.length; i++){

            if(marks[i] > max){

                max = marks[i];
                index = i;
            }
        }

        //student who gets highest marks
        maxMarksGetter = names[index];

        return maxMarksGetter;
    }

    /* 11. Create a method to add numbers from 0 to given number(n), and return the result */
    public int addUpTo(int n){

        //initialization
        int sum = 0;
        //add numbers from 0 to n
        for (int i = 1; i <= n; i++){

            sum += i;
        }

        return sum;
    }

}
