package Day1;

import java.util.Random;
public class BMICalculator {
 static String getBmiStatus(double bmi) {
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
 static void printWellnessReport(double[] heights, double[] weights) {
 System.out.println("====================================================");
 System.out.printf("%-10s %-15s %-15s %-10s %-15s%n",
 "Person", "Height (m)", "Weight (kg)", "BMI", "Status");
 System.out.println("====================================================");
 for (int i = 0; i < heights.length; i++) {
 double bmi = weights[i] / (heights[i] * heights[i]);
 String status = getBmiStatus(bmi);
 System.out.printf("%-10d %-15.2f %-15.2f %-10.2f %-15s%n",
 i + 1,
 heights[i],
 weights[i],
 bmi,
 status);
 }
 System.out.println("====================================================");
 }
 public static void main(String[] args) {
 int numberOfPeople = 10;
 double[] heights = new double[numberOfPeople];
 double[] weights = new double[numberOfPeople];
 Random random = new Random();
 for (int i = 0; i < numberOfPeople; i++) {
 // Random height between 1.50m and 2.00m
 heights[i] = 1.50 + (1.00 * random.nextDouble() / 2);
 // Random weight between 50kg and 100kg
 weights[i] = 50 + random.nextDouble() * 50;
 }
 printWellnessReport(heights, weights);
 }
}