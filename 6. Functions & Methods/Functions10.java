//Function Overloading using Data Types
public class Functions10 {
    //Function to calc Sum of 2 integer Number.
    public static int Sum(int a, int b) {
        return a + b;
    }
    //Function to calc Sum of 2 float Number.
    public static float Sum(float a, float b) {
        return a + b;
    }
    public static void main (String args []) {
        System.out.println(Sum(4, 7));
        System.out.println(Sum(4.2f, 6.8f));
    }
}
