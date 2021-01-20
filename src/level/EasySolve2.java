package level;


//买股票的最佳时机2
public class EasySolve2 {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int operationCount = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] - prices[i - 1] > 0) {

                profit += prices[i] - prices[i - 1];
                operationCount++;
            }
        }
        System.out.println("最大利润:" + profit);
        System.out.println("操作次数:" + operationCount);
        return profit;
    }
}
