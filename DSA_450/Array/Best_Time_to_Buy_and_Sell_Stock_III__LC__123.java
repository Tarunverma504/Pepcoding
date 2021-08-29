package DSA_450.Array;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mind_Coder
 */
/*
You are given an array prices where prices[i] is the price of a given stock on the ith day.

Find the maximum profit you can achieve. You may complete at most two transactions.

Note: You may not engage in multiple transactions simultaneously (i.e., you must sell the stock before you buy again).

 

Example 1:

Input: prices = [3,3,5,0,0,3,1,4]
Output: 6
Explanation: Buy on day 4 (price = 0) and sell on day 6 (price = 3), profit = 3-0 = 3.
Then buy on day 7 (price = 1) and sell on day 8 (price = 4), profit = 4-1 = 3.
Example 2:

Input: prices = [1,2,3,4,5]
Output: 4
Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
Note that you cannot buy on day 1, buy on day 2 and sell them later, as you are engaging multiple transactions at the same time. You must sell before buying again.
Example 3:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transaction is done, i.e. max profit = 0.
Example 4:

Input: prices = [1]
Output: 0
 
*/
import java.util.*;
public class Best_Time_to_Buy_and_Sell_Stock_III__LC__123 {
    public static void main(String arg[]){
        /*
        https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iii/
        */
    }
         // buy1 - Money lent to buy 1 stock
    // profit1 - Profit after selling
    // the 1st stock buyed.
    // buy2 - Money lent to buy 2 stocks
    // including profit of selling 1st stock
    // profit2 - Profit after selling 2 stocks
    class Solution {
        public int maxProfit(int[] prices) {
            int profit1=0;
            int profit2=0;
            int buy1=Integer.MAX_VALUE;
            int buy2=Integer.MAX_VALUE;

            for(int i=0;i<prices.length;i++){
                buy1=Math.min(buy1,prices[i]);
                profit1=Math.max(profit1,prices[i]-buy1);
                buy2=Math.min(buy2,prices[i]-profit1);
                profit2=Math.max(profit2,prices[i]-buy2);
            }
            return profit2;
        }
    }
}
