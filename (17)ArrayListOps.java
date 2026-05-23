//Write a Java Program to iterate Array List using for-loop, while-loop, and advance for-loop.
import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Mango");

        // For Loop
        System.out.println("Using for-loop:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // While Loop
        System.out.println("\nUsing while-loop:");
        int i = 0;
        while (i < list.size()) {
            System.out.println(list.get(i));
            i++;
        }

        // Enhanced For Loop
        System.out.println("\nUsing enhanced for-loop:");
        for (String fruit : list) {
            System.out.println(fruit);
        }
    }
}
