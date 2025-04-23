//Question3: Write a Java program to check if a number is a palindrome in Java?
// (121 is a palindrome, 321 is not) A number is called a palindrome if the number is 
// equal to the reverse of a number e.g. 121 is a palindrome because the reverse of 121
// is 121 itself. On the other hand, 321 is not a palindrome because the reverse of 321
// is 123, which is not equal to 321.

import java.util.Scanner;

public class FunctionsQuestion3 {
    public static int Reverse(int num) {
        int LastDigit;
        int Reverse = 0;
        while (num > 0) {
            LastDigit = num % 10;
            Reverse = Reverse * 10 + LastDigit;
            num = num / 10;
        }
        return Reverse;
    }
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = sc.nextInt();
        int IsItPalindrome = Reverse(num);
        if(IsItPalindrome == num) {
            System.out.println("Given Number " + num + " is Palindrom");
        }
        else {
            System.out.println("Given Number " + num + " is Not Palindrom");
        }
        sc.close();
    }
}
