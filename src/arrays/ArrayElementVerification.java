package arrays;

/*
1)
String myStatement = "I am a good programmer";
Use string methods to do following tasks:
	Extract "Programmer" string from myStatement.
	Display the total number of words in the myStatement.
	replace all the 'r' characters with 'f' characters.
2)
Store your name in a string variable.
Calculate the length of your name, without using length() method of String class.
3)
String[] names = {"Mohammad" , "John", "Ferdous" , "Abul" , "Ratna" , "Mareeha" , "Ruslan" , "Himani"};
Verify if "JOHN" is present at index 1.
4)
Array:
Store first names of 5 of your friends/colleagues in an array, and display the following in console:
    1. Length of that array
    2. Print name written on 3rd position (hint: 2nd index)
    3. Name of each friend/colleague
    4. Does name on 2nd position, start with "A"
*/

public class ArrayElementVerification {

    public static void main(String[] args){

        //an array of names
        String[] names = {"Mohammad" , "John", "Ferdous" , "Abul" , "Ratna" , "Mareeha" , "Ruslan" , "Himani"};

        boolean isPresent = true;

        //verify
        isPresent = names[1].equals("JOHN");

        System.out.println("Is \"JOHN\" present at index 1: " + isPresent);

    }
}
