//Write a java program to reverse a string and check if it is palindrome or not
import java.util.Scanner;
public class PalindromeCheck {
    public static String reverseString(String str){
        String reversed = "";
        for(int i = str.length()-1; i >= 0; i--){
            reversed = reversed + str.charAt(i);
        }
        return reversed;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String original = sc.nextLine();
        String reversed = reverseString(original);
        System.out.println("Reversed String: " + reversed);
        if(original.equalsIgnoreCase(reversed)){
            System.out.println("The string is a Palindrome.");
        } else {
            System.out.println("The string is NOT a palindrome");
        }
        sc.close();
    }
}
