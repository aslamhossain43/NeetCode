package sliding_window;

/**
 * @Author Md. Aslam Hossain
 * @Date Sep 22, 2024
 */
public class BuyAndSell {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println("Max profit is: " + maxProfit(prices));
    }

    private static int maxProfit(int[] prices) {
        int left = 0;
        int right = 0;
        int maxProfit = 0;
        while (right < prices.length) {
            if (prices[left] < prices[right]) {
                maxProfit = Math.max(maxProfit, prices[right] - prices[left]);
            } else {
                left = right;
            }
            right++;
        }
        return maxProfit;
    }
}
