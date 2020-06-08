CSCI-2467 Lab 3 – Body Mass Index
Background
The Body Mass Index (BMI) is a calculation used to categorize whether a person’s weight is at a healthy weight for a given height. The formula is as follows:
	bmi = kilograms / (meters2)
	where kilograms = person’s weight in kilograms, meters = person’s height in meters
BMI is then categorized as follows:
Classification	BMI Range
Underweight	Less than 18.5
Normal	18.5 or more, but less than 25.0
Overweight	25.0 or more, but less than 30.0
Obese	30.0 or more

To convert inches to meters:
	meters = inches / 39.37
To convert pounds (lbs) to kilograms:
	kilograms = lbs / 2.2046
Assignment
Ask the user for their weight in pounds and height in inches. Compute their BMI and BMI classification and output the results.
The program must implement and use the following methods:
convertToKilograms – convert pounds to kilograms
convertToMeters – convert inches to meters
calcBMI – take weight in kilograms and height in meters and return the BMI
bmiClassification – take the value for the BMI and return a String with the BMI classification
 
Use the following code as a starting point for your assignment:
package edu.cscc;

import java.util.Scanner;

// TODO Student name, date, purpose
public class Main {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double lbs, inches, meters, kgs, bmi;
        String classification;

       // TODO add code here
    }

   // TODO add your methods here (make them static)
}

As always use the package name edu.cscc and include a comment with your name, the date, and the purpose of the program.
Example Output
Calculate BMI
Enter weight (lbs): 200
Enter height (inches): 72
Your BMI is 27.124767811523153
Your BMI classification is Overweight
