class Solution {
    public int minCostClimbingStairs(int[] nums) {
        if(nums.length==2){
            return Math.min(nums[0], nums[1]);
        }
        int [] dp = new int[nums.length];
        dp[0]= nums[0];
        dp[1] = nums[1];
        for(int i = 2; i<nums.length; i++){
            int ans = nums[i] + dp[i-2];
            int ans2 = nums[i] + dp[i-1];
            dp[i] = Math.min(ans, ans2);
        }
        return Math.min(dp[dp.length-1], dp[dp.length-2]);

        
    }
}