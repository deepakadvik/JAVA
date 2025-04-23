//Binary to Decimal
public class Functions13 {
    public static void BinToDec(int binNum){
        int pow = 0;
        int decNum = 0;
        int myNum = binNum;

        while(binNum > 0) {
            int LastDigit = binNum % 10;
            decNum = decNum + (LastDigit * (int) Math.pow(2, pow));
            pow++;
            binNum = binNum / 10;
        }
        System.out.println("Decimal of " + myNum + " is " + decNum);

    }
    public static void main(String args[]) {
        BinToDec(1010);
    }
}
