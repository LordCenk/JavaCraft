// Write a Java program to swap two numbers without using a third variable in Java
public class SwapNumbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Before swap: a = " + a + ", b = " + b);

        // Step 1: a becomes 30 (10 + 20)
        a = a + b; 
        // Step 2: b becomes 10 (30 - 20)
        b = a - b; 
        // Step 3: a becomes 20 (30 - 10)
        a = a - b; 

        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}
