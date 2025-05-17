//Linear Search

// public class Revision {
//     public static int linearSearch(int number[], int key) {
//         for(int i = 0; i < number.length; i++) {
//             if(number[i] == key){
//                 return i;
//             }
//         }
//         return -1;
//     }
//     public static void main(String args[]) {
//         int number[] = {2, 4, 6, 8, 10, 12, 14, 16};
//         int key = 10;
//         int index = linearSearch(number, key);
//         if(index == -1) {
//             System.out.println("Key not Found");
//         }
//         else {
//             System.out.println("Key is at index: " + index);
//         }
//     }
// }









//Linear Search(Using String)

// public class Revision {
//     public static int linearSearch(String foods[], String item) {
//         for(int i = 0; i < foods.length; i++) {
//             if(foods[i] == item){
//                 return i;
//             }
//         }
//         return -1;
//     }
//     public static void main(String args[]) {
//         String foods[] = {"Dal", "Chaval", "Butter Roti", "Paneer", "Bhujia", "Pickled Onions"};
//         String item = "Pickled Onions";
//         int index = linearSearch(foods, item);
//         if(index == -1) {
//             System.out.println("Key not Found");
//         }
//         else {
//             System.out.println("Key is at index: " + index);
//         }
//     }
// }







// Largest or  Smallest Element in an Array.

// public class Revision {
//     public static int largestNumber(int numbers[]) {
//         int largest = Integer.MIN_VALUE;
//         int smallest = Integer.MAX_VALUE;
//         for(int i = 0; i < numbers.length; i++) {
//             if(numbers[i] > largest) {
//                 largest = numbers[i];
//             }
//             if(numbers[i] < smallest) {
//                 smallest = numbers[i];
//             }
//         }
//         System.out.println("Smallest number is: " + smallest);
//         return largest;
//     }
//     public static void main(String args[]) {
//         int numbers[] = {2, 4, 6, 8, 10, 1000, 12, 14, 16, 18, 20};
//         System.out.println("Largest number is " + largestNumber(numbers));

//     }
// }







// Binary Search

// public class Revision{
//     public static int binarySearch(int numbers[], int key) {
//         int start = 0;
//         int end = numbers.length-1;
//         while(start <= end) { //Condition is couse if start is greater then end then its Invalid Condition.
//             int mid = (start + end) / 2;
//             if (numbers[mid] == key) {
//                 return mid;
//             }
//             else {
//                 if(numbers[mid] > key) { //Left
//                     end = mid - 1;
//                 }
//                 else { //Right
//                     start = mid + 1;
//                 }
//             }
//         }
//         return -1;
//     }
//     public static void main (String args[]) {
//         int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};//Array must be SORTED
//         int key = 12;
//         System.out.println("Index for key is: " + binarySearch(numbers, key));
//     }
// }






// Reverse an Array.

// public class Revision{
//     public static void reverse(int numbers[]) {
//         int first = 0;
//         int last = numbers.length-1;
//         while(first < last) {
//             //Code of Swap
//             int temp = numbers[last];
//             numbers[last] = numbers[first];
//             numbers[first] = temp;

//             first++;
//             last--;
//         }
//     }
//     public static void main (String args[]) {
//         int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
//         reverse(numbers);
//         for(int i = 0; i < numbers.length; i++) {
//             System.out.print(numbers[i]+ " ");
//         }
//         System.out.println();
//     }
// }






//Pairs in Array.

// public class Revision{
//     public static void printPairs(int numbers[]) {
//         for(int i = 0; i<numbers.length; i++) {
//             for(int j = i+1; j<numbers.length; j++){
//                 System.out.print("(" + numbers[i] + "," + numbers[j] + ") ");
//             }
//             System.out.println();
//         }
//     }
   
//     public static void main (String args[]) {
//         int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
//         printPairs(numbers);
//     }
// }






//Print Subarrays
public class Revision{

    public static void printSubArrays(int numbers[]) {
        for(int i = 0; i<numbers.length; i++) {
            for(int j = i; j<numbers.length; j++){
                for(int k = i; k<=j; k++) {
                    System.out.print(numbers[k]+ " ");
                }
                System.out.println();
        }
        System.out.println();
    }
}
   
    public static void main (String args[]) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
        printSubArrays(numbers);
    }
}
