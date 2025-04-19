//Type Pramotion in Java
import java.util.*;

public class JavaBasics14 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = 10;
        float b =20.25f;
        long c = 25;
        double d = 30;
        //int ans = a + b + c + d;
        //incompatible types: possible lossy conversion from double to int
        double ans = a + b + c + d;
        System.out.println(ans);
        sc.close();
    }
}
