//Write a Java Program that reads an array of integers and outputs the maximum product of two adjacent elements in the given array of numbers.
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int maxProduct = arr[0]*arr[1];
        for(int i = 0;i < n - 1; i++){
            int product = arr[i]*arr[i+1];
            if (product > maxProduct)
                maxProduct = product;
        }
        System.out.println("Maximum Product = " + maxProduct);
        sc.close();
    }
    
}
