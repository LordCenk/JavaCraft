//Given a positive integer N. Find the total count of set bits for all positive integers from 1 to N (both inclusive).
//For negative integer the output must be zero.
import java.util.Scanner;

public class TotalSetBits {

    // Function to count set bits from 1 to N
    public static int countTotalSetBits(int N) {

        // For negative numbers return 0
        if (N < 0) {
            return 0;
        }

        int totalCount = 0;

        // Traverse from 1 to N
        for (int i = 1; i <= N; i++) {

            int num = i;

            // Count set bits in current number
            while (num > 0) {

                // Check last bit
                totalCount += (num & 1);

                // Right shift
                num = num >> 1;
            }
        }

        return totalCount;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of N: ");
        int N = sc.nextInt();

        int result = countTotalSetBits(N);

        System.out.println("Total set bits from 1 to " + N + " = " + result);

        sc.close();
    }
}
