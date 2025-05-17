//Buy and Sell Stocks
//You are given an Array prices where prices[i] is a the price of given stock on the ith day.
//You want to maximize your profit by choosing a single day to buy one stock and choosing a
//different day in the future to sell that stock Return the maximum profit you can achieve
//from this transaction. If you can not achieveany profit Return 0.
public class Arrays16 {
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

//Time Complexity: O(n)