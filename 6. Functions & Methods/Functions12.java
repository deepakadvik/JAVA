//Print all Prime in a Range.
import java.util.Scanner;

public class Functions12 {

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void PrimeInRange(int n) {
        for(int i = 2; i <= n; i++){
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();
        PrimeInRange(n);
        sc.close();
    }
}