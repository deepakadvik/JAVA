public class Functions14 {
    public static void DecToBin(int Divident) {
        int myNum = Divident;
        int BinNum = 0;
        int Pow = 0;
        while(Divident > 0) {
            int Reminder;
            Reminder = Divident % 2;
            BinNum = BinNum + (Reminder * (int)Math.pow(10, Pow));
            Pow++;
            Divident = Divident / 2;
        }
        System.out.println("Binary of " + myNum + " is " + BinNum);
    }
    public static void main(String args []) {
        DecToBin(255);
    }
}
