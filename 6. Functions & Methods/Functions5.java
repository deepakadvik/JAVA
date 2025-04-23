// Java Always Call by Value
// A copy of the value is passed
// Changes inside the method do not affect the original variable.
public class Functions5 {
    public static void Swap(int a, int b) {
        int temp;
        temp = a;
        a = b;
        b = temp;
    }
    public static void main (String args []) {
        int a = 5;
        int b = 10;
        Swap(a, b);
        System.out.println(a);
        System.out.println(b);
    }

}