class Solution {
    public int maxProfit(int[] prices) {
        int max = 0 , buy = Integer.MAX_VALUE;
        int prof = 0;
        for(int i = 0; i<prices.length; i++){
            if(buy>prices[i]){
                buy = prices[i];
            }
            prof = prices[i] - buy;
            max = Math.max(prof , max);
        }
        return max;
    }
}
