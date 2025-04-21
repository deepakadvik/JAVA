//Print number from 1 to 10
import java.util.*;

public class FlowControl1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int Count = 1;
        while (Count <= 10) {
            System.out.print(Count);
            Count++;
        }
        sc.close();
    }
}
