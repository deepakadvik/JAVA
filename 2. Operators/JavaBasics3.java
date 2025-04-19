//Logical Operator
import java.util.Scanner;

public class JavaBasics3 {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        //Logical And(True when Both Operand True)
        System.out.println( (3>2) && (5>0) );
        System.out.println( (3>2) && (5<0) );
      //System.out.println( (3<2) && (5>0) );//Short Circuit
      //System.out.println( (3<2) && (5<0) );//Short Circuit
        //Logical OR(True when atleast one Operand True)
      //System.out.println( (3>2) || (5>0) );//Short Circuit
      //System.out.println( (3>2) || (5<0) );//Short Circuit
        System.out.println( (3<2) || (5>0) );
        System.out.println( (3<2) || (5<0) );
        //Logical Not
        System.out.println( !(3>2) );
        System.out.println( !(3<2) );
        sc.close();
    }
}
