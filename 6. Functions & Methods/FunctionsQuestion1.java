//Question 1 : Write a Java method to compute the averageof three numbers.

import java.util.Scanner;

public class FunctionsQuestion1 {
    public static void AvgOfThree(int num1, int num2, int num3) {
        int Average = (num1 + num2 + num3) / 3;
        System.out.println("Average of three Number is: " + Average);
    }
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        AvgOfThree(num1, num2, num3);
        sc.close();

    }
}
