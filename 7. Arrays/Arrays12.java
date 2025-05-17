// Max SubArray Sum - M1(Brute Force)

// public class Arrays12 {
//     public static void maxSubArray(int number[]){
//         int currSum = 0;
//         int maxSum = Integer.MIN_VALUE;
//         for(int i = 0; i < number.length; i++) {
//             for(int j = i; j < number.length; j++) {
//                 currSum = 0;
//                 for(int k =i; k <= j; k++) {
//                     //SubArray Sum
//                     currSum = currSum + number[k];
//                 }
//                 System.out.print(currSum + " ");
//                 if(maxSum < currSum) {
//                     maxSum = currSum;
//                 }
//             }
//             System.out.println();
//         }
//         System.out.println("Max Sum = " + maxSum);
//     }
//     public static void main(String args []) {
//         int number[] = {1, -2, 6, -1, 3};
//         maxSubArray(number);

//     }
// }

public class Arrays12 {
    public static void maxSubArraysSum(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < numbers.length; i++) {
            for(int j = i; j < numbers.length; j++) {
                currSum = 0;
                for(int k = i; k <= j; k++ ) {
                    currSum += numbers[k];
                }
                System.out.println(currSum);
                if(maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Maximum Sum is: "+ maxSum);
    }
    public static void main(String args[]) {
        int numbers[] = {1, -2, 6, -1, 3};
        maxSubArraysSum(numbers);
    }
}

//Time Complexity : O(n^3)