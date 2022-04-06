package leetcode.easy.arrays;

public class BestTimeToBuyAndSellStocks {

    public static int maxProfit(int[] prices) {
        int max = 0;
        int min = Integer.MAX_VALUE;
        for(int price: prices){
           min = Math.min(min, price);
           max = Math.max(max, price - min);
        }
        return max;
    }

    public static void main(String[] args) {

        int[] stocks = {1, 2, 3, 4};
        System.out.println(maxProfit(stocks));
    }
}
