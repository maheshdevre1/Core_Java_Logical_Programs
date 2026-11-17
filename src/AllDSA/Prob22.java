package AllDSA;
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/
//Input: prices = [7,1,5,3,6,4]
//Output: 7
//Input: prices = [1,2,3,4,5]
//Output: 4
//Input: prices = [7,6,4,3,1]
//Output: 0

public class Prob22 {
	public int maxProfit(int[] prices) {
		int totalProfit = 0;

		for (int i = 1; i < prices.length; i++) {
			if (prices[i] > prices[i - 1]) {
				totalProfit = totalProfit + (prices[i] - prices[i - 1]);

			}

		}

		return totalProfit;
	}

	public static void main(String[] args) {
		int prices[] = {1,2,3,4,5};
		Prob22 p = new Prob22();
		int totalProfit = p.maxProfit(prices);
		System.out.println(totalProfit);

	}

}
