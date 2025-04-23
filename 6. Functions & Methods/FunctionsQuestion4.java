//Question 4. Write a Java method to compute the sum of the digits in an integer.

import java.util.Scanner;

public class FunctionsQuestion4 {
    public static void SumOfDigits(int n) {
        int num = n;
        int Sum = 0;
        int LastDigit;
        while(n > 0) {
            LastDigit= n % 10;
            Sum = Sum + LastDigit;
            n = n / 10;
        }
        System.out.println("Sum of " + num + " is " + Sum);
    }
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        SumOfDigits(n);
        sc.close();
    }
}
