//Print the Largest among 3
import java.util.*;

public class Conditional6 {
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        if((A > B) && (A > C)) {
            System.out.println(A + " is Largest");
        }
        else if (B > C) {
            System.out.println(B + " is Largest");
        }
        else {
            System.out.println(C + " is Largest");
        }
        sc.close();
    }
}