//Binary Search
public class Arrays7 {
    public static int BinarySearch(int number[], int Key){
        int Start = 0, end = number.length - 1;
        while (Start <= end) { //Condition is couse if start is greater then end then its Invalid Condition.
            int mid = (Start + end) / 2;
            if(number[mid] == Key) {
                return mid;
            }
            if(number[mid] > Key) { // left
                end = mid - 1;
            }
            else {
                Start = mid + 1; // Right
            }
        }
        return -1;

    }
    public static void main(String args []) {
        int number[] = {1, 2, 4, 8, 10, 14, 16};
        int Key = 16;
        System.out.println(BinarySearch(number, Key));
    }
}
// Time Complexity: O(log n)
// Time Complexity of Linear Search O(n) > Binary Search O(log n)
