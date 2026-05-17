// 4.	Write a Java program to check if the given number is a prime number
import java.util.Scanner;

public class DynamicPrimeCheck {
    public static void main(String[] args) {
        // Correct Scanner initialization using System.in
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer to check if it's prime: ");
        
        if (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            
            if (isPrime(num)) {
                System.out.println("Result: " + num + " is a prime number.");
            } else {
                System.out.println("Result: " + num + " is NOT a prime number.");
            }
        } else {
            System.out.println("Error: Invalid input. Please enter a whole number.");
        }
        
        scanner.close();
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
