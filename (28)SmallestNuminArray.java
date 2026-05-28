//Write a Java Program to Find Smallest Number in an array
import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int smallest = arr[0];
        for (int i = 1; i < n; i++){
            if (arr[i] < smallest){
                smallest = arr[i];
            }
        }
        System.out.println("Smallest element is: " + smallest);
        sc.close();
    }
}
