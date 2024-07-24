package Top_Interview_150.BestTimeToBuyAndSellStock;

class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int start_price = prices[0];

        for (int price: prices) {
            if (price > start_price){
                if (price - start_price > profit)
                    profit = price - start_price;
            } else
                start_price = price;
        }

        return profit;

    }
}
