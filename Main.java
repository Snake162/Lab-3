package edu.cscc;

import java.util.Scanner;
import java.lang.Math;

// Michael Heironimus, 1/30/2020, the purpose of this program is to calculate the BMI given the height and weight of the user
public class Main {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double lbs, meters=0, kgs=0, bmi, feet;
        //changed to feet instead of inches because most people know their height in feet not inches
        String classification, MetricOrUS;
        System.out.println("Would you like to calculate your BMI(Body Mass Index) using the Metric System (kilograms and meters) or the US System (feet and pounds)?");
        //added an option to use either metric system or us system depending on whether the user likes one or the other.
        MetricOrUS = input.nextLine();
        while (!("metric".equalsIgnoreCase(MetricOrUS) || "us".equalsIgnoreCase(MetricOrUS) || "metric system".equalsIgnoreCase(MetricOrUS) || "us system".equalsIgnoreCase(MetricOrUS))) {
            // this makes sure the user can type any of these four choices regardless of upper or lower case.
            // if anything else is typed it loops
            System.out.println("Would you like to calculate your BMI (Body Mass Index) using Metric System (kilograms and meters) or the US System (feet and pounds)? (type 'Metric' or 'US'");
            MetricOrUS = input.nextLine();
        }
        if ("metric".equalsIgnoreCase(MetricOrUS) || "metric system".equalsIgnoreCase(MetricOrUS)) {
            //different outputs and equations are used for each system
            System.out.println("Please enter your weight (in kilograms): ");
            kgs = input.nextDouble();
            while (kgs<=0) {
                System.out.println("Please enter your weight (in kilograms) (greater than 0): ");
                kgs = input.nextDouble();
            }
            System.out.println("Please enter your height (in meters): ");
            meters = input.nextDouble();
            while (meters <= 0) {
                System.out.println("Please enter your height (in meters) (greater than 0): ");
                meters = input.nextDouble();
            }
        }
        if ("us".equalsIgnoreCase(MetricOrUS) || "us system".equalsIgnoreCase(MetricOrUS)) {
            System.out.println("Please enter your weight (in pounds): ");
            lbs = input.nextDouble();
            while (lbs <= 0) {
                System.out.println("Please enter your weight (in pounds) (greater than 0): ");
                lbs = input.nextDouble();
            }
            kgs = convertToKilograms(lbs);
            System.out.println("Please enter your height (in feet): ");
            feet = input.nextDouble();
            while (feet <= 0) {
                System.out.println("Please enter your height (in feet) (greater than 0): ");
                feet = input.nextDouble();
            }
            meters = convertToMeters(feet);
        }
        bmi = calcBMI(kgs,meters);
        classification = bmiClassification(bmi);
        System.out.println("Your BMI is " +bmi+ " and your BMI classification is " +classification);
    }

    public static double convertToKilograms(double lbs) {
        return (lbs/2.2046);
    }

    public static double convertToMeters (double feet) {
        return (feet * 12) / 39.37;
        //this could be simplified but would be slightly less accurate
    }

    public static double calcBMI (double kgs, double meters) {
        return (Math.round(kgs / (meters * meters) * 100.0) /100.0);
        //this makes the output of the BMI round to the hundredths place making the output look nicer to the user.
    }

    public static String bmiClassification (double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25.0) {
            return "Normal";
        } else if (bmi < 30.0) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}
