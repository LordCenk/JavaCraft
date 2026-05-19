//Write a Java Program to find two elements in the Array such that difference between them is largest.
import java.util.Scanner;

public class LargestDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int min = arr[0];
        int max = arr[0];

        // Find minimum and maximum element
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int difference = max - min;

        System.out.println("Elements with largest difference: " 
                           + max + " and " + min);

        System.out.println("Largest difference: " + difference);
    }
}
