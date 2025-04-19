//Type Conversion
import java.util.Scanner;

public class JavaBasics10 {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = 10;
        long b = a;
        float number = sc.nextInt();
        System.out.println(number);


        //destination type > source type
        // long a = 10;
        // int b = a; 
        System.out.println(b);
        sc.close();
    }
}
