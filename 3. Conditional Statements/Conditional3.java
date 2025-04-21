// Print if a number is Even or Odd
import java.util.*;

public class Conditional3 {
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number % 2 == 0){
            System.out.println(number + " is Even Number");
        }
        else {
            System.out.println(number + " is ODD Number");
        }
        sc.close();
    }
}