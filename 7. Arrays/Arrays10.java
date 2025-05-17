//Print Subarrays (a continuous part of array)
// public class Arrays10 {
//     public static void printSubArray(int number[]) {
//         for(int i = 0; i < number.length; i++) {
//             for(int j = i; j < number.length; j++) {
//                 for(int k = i; k <= j; k++) { //Subarrays
//                     System.out.print(number[k] + " ");
//                 }
//                 System.out.println();
//             }
//             System.out.println();
//         }
        
//     }
//     public static void main(String args[]) {
//         int number[] = {2, 4, 6, 8, 10, 12};
//         printSubArray(number);
//     }
// }
// // Time Complexity: O(n^3)

public class Arrays10 {
    public static void printSubArrays(int numbers[]) {
        for(int i = 0; i < numbers.length; i++) {
            for(int j = i; j < numbers.length; j++) {
                for(int k = i; k <= j; k++ ) {
                    System.out.print(numbers[k]+ " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        int numbers[] = {1, 2, 4, 8, 16};
        printSubArrays(numbers);
    }
}