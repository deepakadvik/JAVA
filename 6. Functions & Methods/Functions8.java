//Bionomial Coefficient
import java.util.Scanner;

public class Functions8 {
    public static int Factorial(int n) {
        int Fact = 1;
        for(int i=1; i<=n; i++) {
            Fact = Fact * i;
        }
        return Fact;
    }
    public static int BioCoeff(int n, int r) {
        int nFact = Factorial(n);
        int rFact = Factorial(r);
        int nMinusrFact = Factorial(n-r);
        int BioCoeff =  nFact / (rFact * nMinusrFact);
        return BioCoeff;
    }
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number, n");
        int n = sc.nextInt();
        System.out.println("Enter the Number, r");
        int r = sc.nextInt();
        int Ans = BioCoeff(n, r);
        System.out.println(Ans);
        sc.close();
    }
}
