//Fuction Basics
import java.util.Scanner;

public class Functions1 {
    public static void calculateSum(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int Sum = a + b;
        System.out.println(Sum);
        sc.close();
    }
    public static void main(String args []) {
        calculateSum();
    }
}
