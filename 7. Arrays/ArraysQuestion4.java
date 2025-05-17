// Question 4: Given n non-negative integers representing an elevation map where the width of each bar is 1
// compute how much water it can trap after raining.

public class ArraysQuestion4 {
    public static int trappedWater(int height[]) {
        int trappedWater = 0;
        int n = height.length;
        //Compute Left Max Boundry(Using Array)
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }
        //Compute Right Max Boundry(Using Array)
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i = n -2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }
        //Loop
        for(int i = 0; i < height.length; i++) {
            //waterLevel = min(leftMax bound, rightMax bound)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
             //trappedWater = waterLevel - barLevel
             trappedWater += waterLevel - height[i];
        }
        return trappedWater;
    }
    public static void main(String args[]) {
        // int height[] = {0, 1, 0,  2, 1, 0, 1, 3, 2, 1, 2, 1};
        int height[] = {4, 2, 0, 3, 2, 5};
        System.out.println(trappedWater(height));
    } 
}
//Time Complexity: O(n);
//Space Complexity: O(n);