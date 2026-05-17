//10.	Write a Java program count the number of occurrences of a character in a string 
import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.print("Enter a character to count: ");
        char ch = sc.next().charAt(0);

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == ch) {
                count++;
            }
        }

    
        System.out.println("Number of occurrences of '" + ch + "' = " + count);

        sc.close();
    }
}
