//Question2: Finish the following codes so that it prints You have a fever 
//if your temperature is above 100 otherwise prints You don't have a fever

import java.util.*;

public class ConditionalQuestion2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your temprature");
        float temprature = sc.nextFloat();
        if(temprature >=100) {
            System.out.println("You have a Fever");
        }
        else {
            System.out.println("You don't have a Fever");
        }
        sc.close();
    }
}
