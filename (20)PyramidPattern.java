//Write a java program to Print Pyramid Pattern in Java
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        for(int i = 1; i<= n; i++){
            //print spaces
            for(int j = 1; j<= n-1; j++){
                System.out.print(" ");
            }
            //print stars
            for(int j = 1; j <= (2 * i - 1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
