//Linear Search
//Find the index of element in an given arrays(String of Array).
public class Arrays5 {
    public static int LinearSearch(String SummerMenu[], String Key) {
        for(int i = 0; i < SummerMenu.length; i++) {
            if(SummerMenu[i] == Key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        String SummerMenu[] = {"Dahi", "Icecream", "Colddrink", "Mattha"};
        String Key = "Mattha";
        int index = LinearSearch(SummerMenu, Key);
        if (index == -1) {
            System.out.println("Key is not Present");
        }
        else {
            System.out.println("Key is at index: " + index);
        }

    }
}
// Time Complexity : O(n)