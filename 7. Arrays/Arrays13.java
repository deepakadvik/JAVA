// Max SubArray Sum - 1(Prefix Sum)

public class Arrays13 {
    public static void maxSubArray(int number[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int [number.length];

        // Calculate Prefix Array
        prefix[0] = number[0];
        for(int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i-1] + number[i];
        }

        for(int i = 0; i < number.length; i++) {
            int start = i;
            for(int j = i; j < number.length; j++) {
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
                if(maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max Sum is: "+ maxSum);
    }
    public static void main(String args []) {
        int number[] = {1, -2, 6, -1, 3};
        maxSubArray(number);
    }
}

//Time Complexity: O(n^3)