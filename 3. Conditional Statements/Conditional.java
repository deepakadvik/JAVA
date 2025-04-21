import java.util.*;

public class Conditional {
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age >= 18) {
            System.out.println("Adult : Drive, Vote");
        }
        else {
            System.out.println("Not Adult : Cann't Drive, Vote");
        }
        sc.close();
    }
}
