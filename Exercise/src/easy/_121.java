package easy;

/**
 * 121. 买卖股票的最佳时机
 * 简单
 * <p>
 * 给定一个数组 prices ，它的第 i 个元素 prices[i] 表示一支给定股票第 i 天的价格。
 * <p>
 * 你只能选择 某一天 买入这只股票，并选择在 未来的某一个不同的日子 卖出该股票。设计一个算法来计算你所能获取的最大利润。
 * <p>
 * 返回你可以从这笔交易中获取的最大利润。如果你不能获取任何利润，返回 0 。
 */
public class _121 {
    public int maxProfit(int[] prices) {
        int pointer = 0;
        int reward = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            pointer = prices[i];
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] - pointer > reward) {
                    reward = prices[j] - pointer;
                } else if (pointer - prices[j] >= 0) {
                    break;
                }
            }
        }
        return reward;
    }
}
