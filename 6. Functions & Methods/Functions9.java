// Function Overloading using Parameter
public class Functions9 {
    //Function to calc Sum of 2 Number.
    public static int Sum(int a, int b) {
        return a + b;
    }
    //Function to calc Sum of 3 Number.
    public static int Sum(int a, int b, int c) {
        return a + b + c;
    }
    public static void main (String args []) {
        System.out.println(Sum(4, 7));
        System.out.println(Sum (3, 6, 2));
    }
}
