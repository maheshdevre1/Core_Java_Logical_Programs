package AllDSA;

public class Prob29 {
	
	public int mincostTickets(int[] days, int[] costs) {
	    int[] dp = new int[366];
	    int travelIndex = 0;
	    for (int day = 1; day <= 365; day++) {
	        // Not a travel day
	        if (travelIndex >= days.length || day != days[travelIndex]) {
	            dp[day] = dp[day - 1];
	        } 
	        else {
	            // 1-day ticket
	            int oneDay = dp[day - 1] + costs[0];
	            // 7-day ticket
	            int sevenDay;
	            if (day - 7 < 0) {
	                sevenDay = costs[1];
	            } else {
	                sevenDay = dp[day - 7] + costs[1];
	            }
	            // 30-day ticket
	            int thirtyDay;
	            if (day - 30 < 0) {
	                thirtyDay = costs[2];
	            } else {
	                thirtyDay = dp[day - 30] + costs[2];
	            }
	            // Find minimum without Math.min()
	            int minimum = oneDay;
	            if (sevenDay < minimum) {
	                minimum = sevenDay;
	            }
	            if (thirtyDay < minimum) {
	                minimum = thirtyDay;
	            }
	            dp[day] = minimum;
	            travelIndex++;
	        }
	    }
	    return dp[365];
	}
	
	
	public static void main(String[] args) {
		int days[] = {1,4,6,7,8,20};
		int costs[] = {2,7,15};
		Prob29 p = new Prob29();
		int cost = p.mincostTickets(days, costs);
		System.out.println(cost);
	}

}
