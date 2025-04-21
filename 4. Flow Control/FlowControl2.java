//Print number from 1 to n.
import java.util.*;

public class FlowControl2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value of n: ");
        int n = sc.nextInt();
        int Count = 1;
        while (Count <= n) {
            System.out.print(Count + " ");
            Count++;
        }
        sc.close();
    }
}
