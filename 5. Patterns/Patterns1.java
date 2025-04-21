//Print INVERTED-STAR pattern

import java.util.Scanner;

public class Patterns1 {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Line");
        int n = sc.nextInt();
        for(int line = 1; line <= n; line++) {
            //One line
            for(int star = 1; star <= n-line+1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}