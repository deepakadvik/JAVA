//Question4: Write a Java program that takes a year from the user and print
//whether that year is a leap year or not.
import java.util.*;

public class ConditionalQuestion4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year");
        int year = sc.nextInt();
        if(year % 100 == 0) {
            if(year % 400 == 0) {
                System.out.println("It's a Leap Year");
            }
            else {
                System.out.println("No! It's not a Leap Year");
            }
        }
        else{
            if(year % 4 == 0){
                System.out.println("It's a Leap Year");
            }
            else {
                System.out.println("No! It's not a Leap Year");
            }
        }
        sc.close();
        }
    }
