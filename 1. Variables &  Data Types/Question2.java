// Question2: In a program, input: the side of a square.
// You have to output the area of the square.
// (Hint : area of a square is (side * side))

import java.util.*;

public class Question2 {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        float side = sc.nextFloat();
        float Area = side * side;
        System.out.println("Area is:" + Area);
        sc.close();
    }
}
