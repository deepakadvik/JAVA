//Print Sum of First n Natural number.
import java.util.*;

public class FlowControl3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value of n: ");
        int n = sc.nextInt();
        int Sum = 0;
        int Count = 1;
        while (n >= Count) {
            Sum += Count;
            Count++;
        }
        System.out.println(Sum);
        sc.close();
    }
}