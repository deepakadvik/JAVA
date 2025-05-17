import java.util.Scanner;

public class Arrays1 {
    public static void main(String args []) {
        int Marks[] = new int[10];
        Scanner sc = new Scanner(System.in);
        // int Phy = sc.nextInt();
        Marks[0] = sc.nextInt();//Math
        Marks[1] = sc.nextInt();//Phy
        Marks[2] = sc.nextInt();//Che
        System.out.println("Math: " + Marks[0]);
        System.out.println("Phy: " + Marks[1]);
        System.out.println("Che: " + Marks[2]);
        int Percentage = (Marks[0] + Marks[1] + Marks[2]) / 3;
        System.out.println("Percentage is : " + Percentage);
        sc.close();
        }
}
