class Solution {
    public int minCostClimbingStairs(int[] arr) {
        int [] dp = new int[arr.length];
        dp[0] = arr[0];
        dp[1]= arr[1];
        for(int i = 2; i<arr.length; i++){
            dp[i] = Math.min(arr[i]+dp[i-1],arr[i]+dp[i-2]);
 
            
        }
        return Math.min(dp[dp.length-2], dp[dp.length-1]);
       
    }
}