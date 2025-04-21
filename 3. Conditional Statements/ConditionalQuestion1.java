//Question1: Write a Java program to get a number from the user and print whether it is
//positive or negative.

import java.util.*;

public class ConditionalQuestion1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int number = sc.nextInt();
        if(number > 0) {
            System.out.println("Positive Number");
        }
        else if(number == 0) {
            System.out.println("Neutral Number");
        }
        else {
            System.out.println("Negative Number");
        }
        sc.close();
    }
}
