class Solution {
    public int coinChange(int[] nums, int amount) {
        int [] dp = new int [amount+1];
        dp[0] = 0;
        for(int i = 1; i<=amount; i++){
            dp[i] = amount+1;
            for(int x : nums){
                
                if(i>=x){
                    dp[i] = Math.min(dp[i], dp[i-x] +1);
                }
            }
           
        
        }
        if(dp[amount] == amount+1){
            return -1;
        }
        else{
            return dp[amount];
        }
        
        
    }
}