//Given an integer array nums, return true if any value appears at least twice in the array,
//and return false if every element is distinct.

//Example 1:
//Input: nums = [1, 2, 3, 1]
//Output: true

//Example 2:
//Input: nums = [1, 2, 3, 4]
//Output: false

//Example 3:
//Input: nums = [1, 1, 1, 3, 3, 4, 3, 2, 4, 2]
//Output: true

//Constraints:
// 1 <= nums.lengtth <= 10^5
// -10^9 <= nums[i] <= 10^9
public class ArraysQuestion1 {
    public static boolean containDuplicate(int input[]) {
        for(int i = 0; i < input.length; i++) {
            for(int j = i+1; j < input.length; j++) {
                if(input[i] == input [j]) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[]) {
        int input[] = {1, 2, 3, 4};
        // int input[] = {1, 2, 3, 4};
        // int input[] = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2}
        System.out.println(containDuplicate(input));
    }
}

//Time Complexity: O(n^2)
