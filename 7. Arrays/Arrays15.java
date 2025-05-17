// (Trapping Rainwater)
// Given n Non-Negative Integers repregenting an eleation map, where the width of each bar is 1. 
// Compute how much water it can  trap after raining.
public class Arrays15 {
    public static int trappedRainWater(int height[]){
        int n = height.length;
        //Calculate Left Max Boundry - array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i=1; i<n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        //Calculate Right Max Boundry - array
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        int trappedWater = 0;
        for(int i=0; i<n; i++) {
            //Waterlevel = min(leftMax Bound, RightMax Bound)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            //trappedWater = waterLevel - barLevel
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
    }
    public static void main(String args []) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(trappedRainWater(height));
    }
    
}
//Time Complexity: O(n)
//Space Complexity: O(n)