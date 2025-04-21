import java.util.*;

public class Conditional4 {
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age > 13 && age <18){
            System.out.println("Teenager");
        }
        else if(age >= 18) {
            System.out.println("Adult");
        }
        else {
            System.out.println("Child");
        }
        sc.close();
    }
}