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

    //1a). returns missing smallest positive integer (greater than 0) from given array.
    public static int findMissingSmallestInteger(int[] arr){

        //find the largest number in the array
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){

            if(arr[i] > max){

                max = arr[i];
            }
        }

        //create an array of length max + 1
        int[] num = new int[max + 1];

        //update the array num[0..max] at the corresponding index position
        //for each value of arr[0..arr.length - 1]
        for(int i = 0; i < arr.length; i++){

            if(arr[i] > 0){

                num[arr[i]]++;
            }
        }

        //find the missing element
        for (int j = 1; j < num.length; j++){

            if(num[j] == 0){

                return j;
            }
        }

        return -1;
    }

    //1b). returns missing smallest positive integer (greater than 0) from given array.
    public static int missingSmallestInteger(int[] arr){

        //find the largest number in the array
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){

            if(arr[i] > max){

                max = arr[i];
            }
        }

        //create an array of length max + 1
        boolean[] booleans = new boolean[max + 1];

        //update the array num[0..max] at the corresponding index position
        //for each value of arr[0..arr.length - 1]
        for(int i = 0; i < arr.length; i++){

            if(arr[i] > 0){

                booleans[arr[i]] = true;
            }
        }

        //find the missing element
        for (int j = 1; j < booleans.length; j++){

            if(!booleans[j]){

                return j;
            }
        }

        return -1;
    }

    //2. Write a Java program to remove a specific element from an array.
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

    //3. Scenario: Traffic ticketing system
    public static int trafficTicketingSystem(int userSpeed){

        //initialization
        int speedLimit = 70;
        int point = 0;
        int suspensionPoint = 12;

        //difference in speed
        int difference = userSpeed - speedLimit;

        //when difference in speed is less 5
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
