class Solution {
    public int maxProfit(int[] prices) {
      /*  if(prices.length == 0){return 0;}
         int[] dp = new int[prices.length];
        dp[0] = 0;
       int si = 0;
        for(int i=1;i<dp.length;i++){
            if(prices[i]<prices[si]){si = i;}
            if(prices[i]<prices[i-1]){
                dp[i] = dp[i-1];
            }
            else{
                if(dp[i-1] == 0){
                    dp[i] = prices[i]-prices[i-1];
                    
                }
                else{
                    dp[i] = Math.max(dp[i-1],Math.max(prices[i]-prices[i-1],prices[i]-prices[si]));
                }
            }
        }
        return dp[dp.length-1];*/
        //-- two pointer approach this need not to be compulsorily a dp problem
        /*int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice)
                minprice = prices[i];
            else if (prices[i] - minprice > maxprofit)
                maxprofit = prices[i] - minprice;
        }
        return maxprofit;*/
        //-- another approach is using kadanes of difference
        int maxCur = 0, maxSoFar = 0;
        for(int i = 1; i < prices.length; i++) {
            maxCur = Math.max(0, maxCur += prices[i] - prices[i-1]);
            maxSoFar = Math.max(maxCur, maxSoFar);
        }
        return maxSoFar;
    }
}
