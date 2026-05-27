//Write A Java Program to determine whether two matrices are equal
import java.util.Scanner;

public class MatrixEqual {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] a = new int[rows][cols];
        int[][] b = new int[rows][cols];

        // Input first matrix
        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        // Input second matrix
        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        boolean equal = true;

        // Compare matrices
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (a[i][j] != b[i][j]) {
                    equal = false;
                    break;
                }
            }
        }

        if (equal)
            System.out.println("Matrices are equal.");
        else
            System.out.println("Matrices are not equal.");

        sc.close();
    }
}
