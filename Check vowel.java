// 3.	 Write a Java program to check if a vowel is present in a string
public class VowelCheckRegex {
    public static void main(String[] args) {
        String input = "Hello World";
        
        // Check if the string contains a, e, i, o, or u (case-insensitive)
        boolean hasVowel = input.matches(".*[aeiouAEIOU].*");
        
        System.out.println("Contains vowel? " + hasVowel);
    }
}
