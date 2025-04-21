// Check if number is Prime or not?
import java.util.*;

public class FlowControl9 {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();
        boolean isPrime = true;
        if(n == 2) {
            isPrime = true;
        }
        else {
            for(int i=2; i <= Math.sqrt(n); i++) {
                if(n % i == 0){
                    isPrime = false;
                }
            }
        }
        if(isPrime == false) {
            System.out.println(n + " is not a Prime Number");
        }
        else {
            System.out.println(n + " is Prime Number");
        }
        sc.close();
    }
}