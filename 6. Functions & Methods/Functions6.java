//Product of Two Numbers
import java.util.*;

public class Functions6 {
    public static int Prod(int num1, int num2){
        int Prod = num1 * num2;
        return Prod;
    }
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of a");
        int a = sc.nextInt();
        System.out.println("Enter Value of b");
        int b = sc.nextInt();
        int Mul = Prod(a,b);
        System.out.println("a * b = " + Mul);
        sc.close();
    }
}