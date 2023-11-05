package leetcode.Easy;

public class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {

        int[] prices = {2,4,1};

        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {

        int lowest = prices[0];
        int profit = 0;

        for (int i = 0; i < prices.length; i++) {

            if (lowest < prices[i]) {
                if (profit < prices[i] - lowest){
                    profit = prices[i] -lowest;
                }
            }  else {
                lowest = prices[i];
            }

        }

        return profit;
    }

}
