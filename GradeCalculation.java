/*
* GradeCalculation.java
* Author: Wesley Wittekiend
* Submission Date: 9/25/16
*
* Purpose: Calculates the grade you need for a specific final grade in a class
*
* Statement of Academic Honesty:
*
* The following code represents my own work. I have neither
* received nor given inappropriate assistance. I have not copied
* or modified code from any source other than the course webpage
* or the course textbook. I recognize that any unauthorized
* assistance or plagiarism will be handled in accordance with
* the University of Georgia's Academic Honesty Policy and the
* policies of this course. I recognize that my work is based
* on an assignment created by the Department of Computer
* Science at the University of Georgia. Any publishing
* or posting of source code for this project is strictly
* prohibited unless you have written consent from the Department
* of Computer Science at the University of Georgia.
*/

import java.util.Scanner;
public class GradeCalculation {
	
public static void main(String[] args) {
	
	Scanner keyboard =  new Scanner(System.in);
	
	System.out.println("A \t 90 - 100");
	System.out.println("B \t 80 - 89");
	System.out.println("C \t 70 - 79");
	System.out.println("D \t 60 - 69");
	System.out.println("F \t below 60");
	System.out.print("What letter grade do you want to achieve for the course? ");
	
	String desiredGrade = keyboard.next();
	desiredGrade = desiredGrade.toUpperCase();
	if (desiredGrade.equalsIgnoreCase("A") || desiredGrade.equalsIgnoreCase("B") || desiredGrade.equalsIgnoreCase("C") || desiredGrade.equalsIgnoreCase("D") || desiredGrade.equalsIgnoreCase("F"))
	{	
	}
	else
	{
		System.out.println("ERROR: Input is not letter grade. Exiting Program...");
		System.exit(0);
	}
	
	int desiredGradeVal; 
	
	switch (desiredGrade)
	{
	case "A":
		desiredGradeVal = 90;
		break;
	case "B":
		desiredGradeVal = 80;
		break;
	case "C":
		desiredGradeVal = 70;
		break;
	case "D":
		desiredGradeVal = 60;
		break;
	default:
		desiredGradeVal = 0;
		break;	
	}
	
	System.out.println("Enter Percentage Weights: ");
	
	System.out.print("Exam 1: \t");
	double weightExam1 = keyboard.nextInt();
	
	System.out.print("Exam 2: \t");
	double weightExam2 = keyboard.nextInt();
	
	System.out.print("Final Exam: \t");
	double weightFinalExam = keyboard.nextInt();
	
	System.out.print("Labs: \t\t");
	double weightLabs = keyboard.nextInt();
	
	System.out.print("Projects: \t");
	double weightProjects = keyboard.nextInt();
	
	System.out.print("Attendance: \t");
	double weightAttendance = keyboard.nextInt();
	
	System.out.print("Quizzes:\t");
	double weightQuizzes = keyboard.nextInt();
	
	double totalKnownGradeWeight = weightExam1 + weightExam2 + weightFinalExam + weightLabs + weightQuizzes + weightProjects + weightAttendance;
	
	if (totalKnownGradeWeight != 100)
		{
		System.out.println("Weights don’t add up to 100, program exiting…");
		System.exit(0);
		}		
	
	int scoreExam1, scoreExam2, scoreFinalExam, scoreLabs, scoreQuizzes, scoreProjects, scoreAttendance;
	
	System.out.println("Enter your scores out of 100:");
	
	//exam 1
	System.out.print("Do you know your Exam 1 score? ");
	String knowExam1 = keyboard.next();
	if (knowExam1.equalsIgnoreCase("yes") || knowExam1.equalsIgnoreCase("y") )
	{
		System.out.print("Score received on exam 1: ");
		scoreExam1 = keyboard.nextInt();	
	}
	else
	{
		scoreExam1 = 0;
		weightExam1 = 0;
	}
	
	//exam 2
	System.out.print("Do you know your Exam 2 score? ");
	String knowExam2 = keyboard.next();
	if (knowExam2.equalsIgnoreCase("yes") || knowExam2.equalsIgnoreCase("y") )
	{
		System.out.print("Score received on exam 2: ");
		scoreExam2 = keyboard.nextInt();	
	}
	else
	{
		scoreExam2 = 0;
		weightExam2 = 0;
	}
	
	//final exam
	System.out.print("Do you know your Final Exam score? ");
	String knowFinalExam = keyboard.next();
	if (knowFinalExam.equalsIgnoreCase("yes") || knowFinalExam.equalsIgnoreCase("y") )
	{
		System.out.print("Score received on final exam: ");
		scoreFinalExam = keyboard.nextInt();	
	}
	else
	{
		scoreFinalExam = 0;
		weightFinalExam = 0;
	}
	
	//labs
	System.out.print("Do you know your lab average? ");
	String knowLabs = keyboard.next();
	if (knowLabs.equalsIgnoreCase("yes") || knowLabs.equalsIgnoreCase("y") )
	{
		System.out.print("Average Lab Grade: ");
		scoreLabs = keyboard.nextInt();	
	}
	else
	{
		scoreLabs = 0;
		weightLabs = 0;
	}
	
	//projects
	System.out.print("Do you know your project average? ");
	String knowProjects = keyboard.next();
	if (knowProjects.equalsIgnoreCase("yes") || knowProjects.equalsIgnoreCase("y") )
	{
		System.out.print("Average Project Grade: ");
		scoreProjects = keyboard.nextInt();	
	}
	else
	{
		scoreProjects = 0;
		weightProjects = 0;
	}	
	
	//quizzes
	System.out.print("Do you know your quiz average? ");
	String knowQuizzes = keyboard.next();
	if (knowQuizzes.equalsIgnoreCase("yes") || knowQuizzes.equalsIgnoreCase("y") )
	{
		System.out.print("Average Quiz Grade: ");
		scoreQuizzes = keyboard.nextInt();	
	}
	else
	{
		scoreQuizzes = 0;
		weightQuizzes = 0;
	}	
	
	//attendance
	System.out.print("Do you know your attendance average? ");
	String knowAttendance = keyboard.next();
	if (knowAttendance.equalsIgnoreCase("yes") || knowAttendance.equalsIgnoreCase("y") )
	{
		System.out.print("Average Attendance Grade: ");
		scoreAttendance = keyboard.nextInt();	
	}
	else
	{
		scoreAttendance = 0;
		weightAttendance = 0;
	}	
	
	
	totalKnownGradeWeight = weightExam1 + weightExam2 + weightFinalExam + weightLabs + weightQuizzes + weightProjects + weightAttendance;

	
	double currentScore = (scoreExam1*weightExam1 + scoreExam2*weightExam2 + scoreFinalExam*weightFinalExam + scoreLabs*weightLabs + scoreQuizzes*weightQuizzes + scoreProjects*weightProjects + scoreAttendance*weightAttendance)/totalKnownGradeWeight;
			
	System.out.println("Current Grade Score: " + currentScore);	

	String currentLetterGrade;
	
	if (currentScore >=90)
		currentLetterGrade = "A";
	else if (currentScore >=80)
		currentLetterGrade = "B";
	else if (currentScore >=70)
		currentLetterGrade = "C";
	else if (currentScore >=60)
		currentLetterGrade = "D";
	else
		currentLetterGrade = "F";
	System.out.println("Your current letter grade is a " + currentLetterGrade);	
	
	
	if (totalKnownGradeWeight == 100.00)
	{
		if (currentScore >= desiredGradeVal)
		{
			System.out.println("Congradulations! You recieved the " + desiredGrade + " that you wanted!");
		}
		else
		{
			System.out.println("Sorry! You did not recieve the" + desiredGrade + "that you wanted.");
		}
	}
	else
	{
		double avgToFinalLetterGrade = (100*desiredGradeVal - (scoreExam1*weightExam1 + scoreExam2*weightExam2 + scoreFinalExam*weightFinalExam + scoreLabs*weightLabs + scoreQuizzes*weightQuizzes + scoreProjects*weightProjects + scoreAttendance*weightAttendance))/(100-totalKnownGradeWeight);
		System.out.println("You have to score an average greater than or equal to " + avgToFinalLetterGrade + " in the remaining grade items to receive an "+ desiredGrade +" in the course");
	}
	
	}
}
