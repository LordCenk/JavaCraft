//Write a Java Program to replace lower-case characters with upper-case and vice-versa
import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            // Convert lowercase to uppercase
            if (ch >= 'a' && ch <= 'z') {
                result += (char)(ch - 32);
            }

            // Convert uppercase to lowercase
            else if (ch >= 'A' && ch <= 'Z') {
                result += (char)(ch + 32);
            }

            // Keep other characters unchanged
            else {
                result += ch;
            }
        }

        System.out.println("After conversion: " + result);

        sc.close();
    }
}
