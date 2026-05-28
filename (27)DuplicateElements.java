//Write a Java Program to print the duplicate elements of an array
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
        boolean found = false;
        System.out.println("Duplicate elements are:");
        for(int i = 0; i<n; i++){
            for (int j = i + 1; j < n; j++){
                if (arr[i] == arr[j]){
                    System.out.println(arr[i]);
                    found = true;
                    break;
                }
            }
        }
        if (!found){
            System.out.println("No duplicate elements found");
        }
        sc.close();
        sc.close();
    }
}
