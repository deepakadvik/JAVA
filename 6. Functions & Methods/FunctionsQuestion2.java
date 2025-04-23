//Question2: Write a method named isEven that accepts an intargument.
//The method should return true if the argument is even, or false otherwise.
//Also write a program to test your method.

import java.util.Scanner;

public class FunctionsQuestion2 {
    public static boolean isEven(int num) {
        boolean its = true;
        if(num % 2 == 0) {
            its = true;
        }
        else {
            its = false;
        }
        return its;
    }
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean its = isEven(num);
        System.out.println(its);
        sc.close();
    }
}
