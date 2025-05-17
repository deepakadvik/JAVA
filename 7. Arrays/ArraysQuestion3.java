// Question 3: You  are  given  an  array prices where prices[i] is  the  price  of  a  given  stock  on
// the ith day. Return the maximum profit you can achieve from this transaction.
// If you cannot achieve any profit, return 0.
public class ArraysQuestion3 {
    public static int buyAndSellStocks(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i = 0; i < prices.length; i++) {// Profit
            if(buyPrice < prices[i]) {
                int profit = prices[i] - buyPrice; // Today's Profit
                maxProfit = Math.max(maxProfit, profit);
            }
            else {
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String args[]) {
        int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println(buyAndSellStocks(prices));
    }
}