//Pairs in an Array
public class Arrays9 {
    public static void pairAnArray(int array[]) {
        int totalPairs = 0;
        for(int i = 0; i < array.length; i++) {

            for(int j = i + 1; j < array.length; j++) {
                System.out.print( "(" + array[i] + "," + array[j] + ") " );
                totalPairs++;
            }
            System.out.println();
        }
        System.out.println("Total pairs: " + totalPairs);
    }
    public static void main(String args[]) {
        int array[] = {2, 4, 6, 8, 10, 12, 14};
        pairAnArray(array);
        }
    }
    //Time Complexity: O(n^2)