1.	 // Write a Java program to reverse a string in Java
  public class ManualReverse {
    public static void main(String[] args) {
        String str = "Java Programming";
        String reversed = "";
   
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i); // Get character at index i
        }
        
        System.out.println("Reversed: " + reversed);
    }
}
