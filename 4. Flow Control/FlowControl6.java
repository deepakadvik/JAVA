//Do While loop + Break Keyword.
//Keep entering number till user enter a multiple of 10.
import java.util.*;

public class FlowControl6 {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter Your Number: ");
            int number = sc.nextInt();
            if(number % 10 == 0) {
                break;
            }
            System.out.println(number);
        } while(true);
        sc.close();
    }
}