//Ternary Operators
import java.util.*;

public class Conditional7 {
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        float Marks = sc.nextFloat();
        String reportcard = (Marks >=33) ? "Pass" : "Fail";
        System.out.println(reportcard);
        sc.close();
    }
}
