//Write a Java program to find the total number of characters, number and percentage of uppercase letters, lowercase letters, digits and other symbols.
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();
        int upper = 0, lower = 0, digit = 0, symbol = 0;
        for(char ch : str.toCharArray()){
            if (Character.isUpperCase(ch))
                upper++;
            else if(Character.isLowerCase(ch))
                lower++;
            else if (Character.isDigit(ch))
                digit++;
            else
                symbol++;
        }
        int total = str.length();
        System.out.println("Total Characters: " + total);
        System.out.printf("Uppercase: %d (%.2f%%)%n", upper, upper * 100.0 / total);
        System.out.printf("Lowercase: %d (%.2f%%)%n", lower, lower * 100.0 / total);
        System.out.printf("Digits: %d (%.2f%%)%n", digit, digit * 100.0 / total);
        System.out.printf("Symbols: %d (%.2f%%)%n", symbol, symbol * 100.0 / total);
    }
}
