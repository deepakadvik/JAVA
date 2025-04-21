//Display all numbers entered by user except multiple of 10.
import java.util.*;

public class FlowControl8 {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Enter the Number");
            int number = sc.nextInt();
            if(number % 10 == 0){
                continue;
            }
            System.out.println(number);
            sc.close();
        }
    }
}