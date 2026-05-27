//Write a java Program  to copy all elements of one array into another array
import java.util.Scanner;

public class CopyArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        // Input elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        // Copy elements from arr1 to arr2
        for (int i = 0; i < n; i++) {
            arr2[i] = arr1[i];
        }

        // Display copied array
        System.out.println("Copied Array:");

        for (int i = 0; i < n; i++) {
            System.out.print(arr2[i] + " ");
        }

        sc.close();
    }
}
