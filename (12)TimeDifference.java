//Write a java program to write a function that is passed four integer inputs representing two different time periods (each expressed as a number of minutes and seconds).
//The function should calculate and return the differences between those two time periods expressed in hours.

import java.util.Scanner;

public class TimeDifference {

    // Function to calculate difference and return hours
    public static double calculateDifferenceInHours(int min1, int sec1,
                                                    int min2, int sec2) {

        // Convert both time periods into total seconds
        int totalSeconds1 = (min1 * 60) + sec1;
        int totalSeconds2 = (min2 * 60) + sec2;

        // Find absolute difference
        int differenceSeconds = Math.abs(totalSeconds1 - totalSeconds2);

        // Convert seconds into hours
        double hours = differenceSeconds / 3600.0;

        return hours;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input first time period
        System.out.print("Enter minutes for first time period: ");
        int min1 = sc.nextInt();

        System.out.print("Enter seconds for first time period: ");
        int sec1 = sc.nextInt();

        // Input second time period
        System.out.print("Enter minutes for second time period: ");
        int min2 = sc.nextInt();

        System.out.print("Enter seconds for second time period: ");
        int sec2 = sc.nextInt();

        // Call function
        double result = calculateDifferenceInHours(min1, sec1, min2, sec2);

        // Output result
        System.out.println("Difference in hours = " + result);

        sc.close();
    }
}
