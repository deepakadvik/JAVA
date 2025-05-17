//Reverse an Array
public class Arrays8 {
    public static void ReverseArray(int Array[]) {
        int first = 0;
        int last = Array.length - 1;
        //Swap
        while (first < last) {
            int temp;
            temp = Array[first];
            Array[first] = Array[last];
            Array[last] = temp;
            first++;
            last--;
        }
    }
    public static void main(String args[]) {
        int Array[] = {1, 2, 3, 4, 5, 6, 7};
        ReverseArray(Array);
        for(int i = 0; i < Array.length; i++) {
            System.out.print(Array[i] + " ");
        }
        System.out.println();
    }
}
//Time Complexity : O(n)
//Space Complexity : O(1)
