// Print All Subarrays Sum

public class Arrays11 {
    public static void printSubArray(int number[]) {
        for(int i = 0; i < number.length; i++) {
            int sum = 0;
            for(int j = i; j < number.length; j++) {
                sum = sum + number[j];
                System.out.println("Sum of subArray for index " + i + " to " + j +" = " + sum);
                System.out.println();
            }
        }
        
    }
    public static void main(String args[]) {
        int number[] = {2, 4, 6, 8, 10, 12};
        printSubArray(number);
    }
}
// Time Complexity: O(n^2)
