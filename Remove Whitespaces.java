//11.	Write a Java program to remove all white spaces from a string in Java?
import java.util.Scanner;
public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String result = str.replaceAll("\\s", "");
        System.out.println("String after removing whitespaces:");
        System.out.println(result);
        sc.close();
    }
}
