//Print HALF-PYRAMID pattern
import java.util.Scanner;

public class Patterns2 {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of line");
        int n = sc.nextInt();
        for(int line = 1; line <= n; line++) {
            for(int Num =1; Num <= line; Num++) {
                System.out.print(Num);
            }
            System.out.println();
        }
        sc.close();
    }
}