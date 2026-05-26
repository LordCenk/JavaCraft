//Write a Java Program to convert Number to Word
import java.util.Scanner;

public class NumberToWord {

    static String[] ones = {
        "", "One", "Two", "Three", "Four", "Five",
        "Six", "Seven", "Eight", "Nine", "Ten",
        "Eleven", "Twelve", "Thirteen", "Fourteen",
        "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
    };

    static String[] tens = {
        "", "", "Twenty", "Thirty", "Forty",
        "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };

    public static String convert(int n) {

        if (n == 0)
            return "Zero";

        if (n < 20)
            return ones[n];

        if (n < 100)
            return tens[n / 10] + " " + ones[n % 10];

        if (n < 1000)
            return ones[n / 100] + " Hundred " + convert(n % 100);

        if (n < 100000)
            return convert(n / 1000) + " Thousand " + convert(n % 1000);

        if (n < 10000000)
            return convert(n / 100000) + " Lakh " + convert(n % 100000);

        return convert(n / 10000000) + " Crore " + convert(n % 10000000);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("In words: " + convert(num));

        sc.close();
    }
}
