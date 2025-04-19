import java.util.*;

public class JavaBasics9 {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        float radius = sc.nextFloat();
        float Pi = 3.14f;
        float Area = Pi*radius*radius;
        System.out.println(Area);
        sc.close();
    } 
}
