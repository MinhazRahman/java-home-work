package loops;

/*
* Homework:
* 1.Students score, total possible score: Student Grade Calculator
* 45/100 -> You got a F (45%)
* A 90-100, B 80-89, C 70-79, 60-69,D  F 0-59
*
* 2. Write a logic that prints multiplication table of the user provided number up to ten.
*
* 3. Write a logic that checks if a number is a Prime number
*
* */

import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {

        //take user input
        Scanner input = new Scanner(System.in);

        //initialization
        int studentsScore = 0;
        int totalScore = 0;
        int scoreInPercentage = 0;
        char grade = 0;

        System.out.println("Please enter total possible score: ");
        totalScore = input.nextInt();

        System.out.println("Please enter the score of a student: ");
        studentsScore = input.nextInt();

        //calculate score in percentage
        scoreInPercentage = (studentsScore*100/totalScore);  //percent: 45*100/100 = 45%, 75%, 93%

        //calculate grade
        if (scoreInPercentage >= 0 && scoreInPercentage <= 59){

            grade = 'F';

        }
        else if (scoreInPercentage >= 60 && scoreInPercentage <= 69){

            grade = 'D';

        }
        else if (scoreInPercentage >= 70 && scoreInPercentage <= 79){

            grade = 'C';

        }
        else if (scoreInPercentage >= 80 && scoreInPercentage <= 89){

            grade = 'B';
        }
        else if (scoreInPercentage >= 90 && scoreInPercentage <= 100){

            grade = 'A';
        }
        else {

            grade = 0;
        }

        //version one
        if(grade != 0){

            System.out.println(studentsScore + "/" + totalScore + " --> " + "You got a " + grade + "(" + scoreInPercentage + "%)");
        }
        else {

            System.out.println("Not a valid grading system.");
        }

    }
}
