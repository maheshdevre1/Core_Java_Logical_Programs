package AllDSA;
//Given an array prices[] of non-negative integers, representing the prices of the stocks 
//on different days, find the maximum profit possible by buying and selling the stocks on different 
//days when at most one transaction is allowed. Here one transaction means 1 buy + 1 Sell. 
//If it is not possible to make a profit then return 0.
//Note: Stock must be bought before being sold.
//Examples:
//Input: prices[] = [7, 10, 1, 3, 6, 9, 2]
//Output: 8
//Explanation: Buy for price 1 and sell for price 9. 
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/

public class Prob6 {
	public static void main(String[] args) {
		int arr[] = {7, 10, 1, 3, 6, 9, 2};
		int maxProfit = 0;
	    for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
			  int profit = arr[j]-arr[i];
			  if(profit>maxProfit) {
				  maxProfit=profit;
			  }
				
			}
		}
		System.out.println("maxProfit ==> "+ maxProfit);
	}

}



//public class Test {
//	public static void main(String[] args) {
//		int nums[] = { 7, 6, 4, 3, 1 };
//		Test t = new Test();
//		int profit = t.maxProfit(nums);
//		System.out.println(profit);
//
//	}
//
//	public int maxProfit(int[] prices) {
//		int maxProfit = 0;
//		for (int i = 0; i < prices.length; i++) {
//			int profit = 0;
//			for (int j = i + 1; j < prices.length; j++) {
//				profit = prices[j] - prices[i];
//				if (profit > maxProfit) {
//					maxProfit = profit;
//				}
//			}
//
//		}
//
//		return maxProfit;
//	}
//
//}
