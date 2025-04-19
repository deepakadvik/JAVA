//Assignment Operator
import java.util.Scanner;

public class JavaBasics4 {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int A = 10;
        // A = A + 5;
        A += 5; //Faster Execution

        int B = 10;
        // B = B - 5;
        B -= 5; //Faster Execution

        int C = 10;
        // C = C * 5;
        C *= 5; //Faster Execution

        int D = 10;
        // D = D / 5;
        D /= 5; //Faster Execution
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(D);
        sc.close();
    }
}
