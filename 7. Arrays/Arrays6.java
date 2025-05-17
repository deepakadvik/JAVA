//Find the Largest & Smallest Number in a given Array
public class Arrays6 {
    public static int LargestElement(int numbers[]) {
        int largest = Integer.MIN_VALUE; // -infinity
        int Smallest = Integer.MAX_VALUE; // +infinity

        for(int i = 0; i< numbers.length; i++) {
            if(largest < numbers[i]) {
                largest = numbers[i];
            }
            if(Smallest > numbers[i]) {
                Smallest = numbers[i];
            }
        }
        System.out.println("Smallest Value is : " + Smallest);
        return largest;
    }
    public static void main(String args []) {
        int numbers[] = {1, 2, 6, 13, 5};
        System.out.println("Largest Value is : " + LargestElement(numbers));
    }
}