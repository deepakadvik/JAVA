//Fuction Basics (M3)
import java.util.Scanner;

public class Functions3 {
    public static int calculateSum(int num1, int num2) { //Parameter or Formal parameter
        int Sum = num1 + num2;
        return Sum;
    }
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int Sum = calculateSum(a,b); //Arguments or Actual Parameter
        System.out.println("Sum is: " +Sum);
        sc.close();
    }
}