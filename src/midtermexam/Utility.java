package midtermexam;

/*
* Java midterm questions:
1.
Create a method to return missing smallest positive integer (greater than 0) from given array.
Example:
	For array : [1,3,5,4,2,7]
	Method should return : 6
	For array : [-1, -3, 4, 2]
	Method should return : 1
	For array : [0, 5, -1, 1, 2, 4, 5, 3, 7, 1, 2]
	Method should return : 6
2.
Write a Java program to remove a specific element from an array.
Original array: [32, 14, 24, 98, 24, 56, 148, 24, 78, 24]
New Array: [32, 14, 98, 56, 148, 78]

3.
Scenario: Traffic ticketing system
   1. Speed Limit = 70
   2. Every 5 miles over the speed limit will add 1 point
   3. Use Math.floor(1.4)to round the speed to downward value
   4. If user reaches 12 points then license is suspended
	Example:
	userspeed=78(70-75->1point)
    userspeed=88(70-75->1point,75-80->1point,80-85->1point ; total 3 points)
* */

import java.util.Arrays;

public class Utility {

    /* 1. returns missing smallest positive integer (greater than 0) from a given array */
    public static int findMissingSmallestInteger(int[] arr){
        //the smallest positive integer (greater than 0)
        int n = 1;
        //find the largest number in the array
        int max = arr[0];
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
            //search for i
            if(!search(arr, i)){
                return i;
            }
        }
        return n;
    }

    //a is an array and x is the value we are searching for
    public static boolean search(int[] a, int x) {
        //iterate over the array and search for x
        for(int i=0; i< a.length; i++) {

            if(x == a[i]) {
                return true; //found
            }
        }
        return false; //not found
    }

    /* 2. Write a Java program to remove a specific element from an array */
    public static int[] removeElement(int[] arr, int element){

        //n is the number of times the element is found in the original array
        int n = 0;
        boolean found = false;

        //find the element in the original array
        for (int i = 0; i < arr.length; i++){

            if(element == arr[i]){
                n++;
                found = true;
            }
        }

        //if element is not found in the original array
        if(!found){

            return arr;
        }

        //create a new array that will hold all the elements but the removed ones
        int[] newArray = new int[arr.length - n];
        int j = 0;

        for (int i = 0; i < arr.length; i++){

            if(element != arr[i]){

                newArray[j] = arr[i];
                j++;
            }
        }

        return newArray;
    }

    /* 3. Scenario: Traffic ticketing system */
    public static int trafficTicketingSystem(int userSpeed){

        //initialization
        int speedLimit = 70;
        int point = 0;
        int suspensionPoint = 12;

        //difference in speed
        int difference = userSpeed - speedLimit;

        //when difference in speed is less than 5
        if(difference < 5){

            return point;
        }

        //count the violation points
        int i = 5;
        while (i <= difference){

            point++;
            i += 5;
        }

        //If user reaches up to suspensionPoint
        if(point >= suspensionPoint){

            System.out.println("The license is suspended.");
            return point;
        }
        return point;
    }
}
