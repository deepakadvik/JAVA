//Factorial of a Number, N
import java.util.Scanner;

public class Functions7 {
    public static int Factorial(int n) {
        int Fact = 1;
        for(int i=1; i<=n; i++) {
            Fact = Fact * i;
        }
        return Fact;
    }
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number, N");
        int n =  sc.nextInt();
        int Fact = Factorial(n);
        System.out.println("Factorial of " + n + " is " + Fact);
        sc.close();
    }
}
