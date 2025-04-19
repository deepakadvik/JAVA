//No Need to Type Cast when character-->number

import java.util.Scanner;

public class JavaBasics12 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char ch = '#';
        int number = ch;
        System.out.println(number);
        sc.close();
    }
}
