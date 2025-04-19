//Arithmatic Operator
//Binary Operator
import java.util.Scanner;

public class JavaBasics {
    public static void main (String args []) {
        Scanner sc = new Scanner(System.in);
        int A = 10;
        int B = 5;
        System.out.println("add = " + (A+B));
        System.out.println("sub = " + (A-B));
        System.out.println("mul = " + (A*B));
        System.out.println("div = " + (A/B));
        System.out.println("modulo = " +(A%B));
        sc.close();
    }
}