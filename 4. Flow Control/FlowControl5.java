//Print Reverse of a Number.
import java.util.*;

public class FlowControl5 {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int number = sc.nextInt();
        int LastDigit;
        while (number > 0) {
            LastDigit = number % 10;
            System.out.print(LastDigit);
            number = number / 10;
        }
        sc.close();
    }
}