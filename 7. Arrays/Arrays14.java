// Max SubArray Sum (Kadane's Algorithm)
// Logic Behind:
// +ve + +ve --> +ve (Fair)
// VeryBig+ve + -ve --> VeryBig+ve (Fair)
// +ve + VrySmall-ve --> VerySmall-ve (Unfair) "So assign ZERO"
public class Arrays14 {
    public static void Kadane(int number[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for(int i = 0; i < number.length; i++) {
            cs = cs + number[i];
            if(cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("Maximum Sub Array Sum = " + ms);
    }
    public static void main(String args []) {
        int number[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        Kadane(number);
    }
}
//Time Complexity: O(n)
