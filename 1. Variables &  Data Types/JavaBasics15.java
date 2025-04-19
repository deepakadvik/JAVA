//Type Pramotion in Java
import java.util.*;

public class JavaBasics15 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // byte b = 5;
        // b = b * 2;
        //possible lossy conversion from int to byte
        byte b = 5;
        b = (byte) (b * 2);
        System.out.println(b);
        sc.close();
    }
}