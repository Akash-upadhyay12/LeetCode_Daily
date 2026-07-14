class Solution {
    public int deleteAndEarn(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int x : nums){
            max = Math.max(max, x);
        }
        int [] arr = new int[max+1];
        for(int num : nums){
            arr[num] += num;
        }
        int [] dp = new int[arr.length];
        dp[0] = arr[0];
        dp[1] = Math.max(dp[0], arr[1]);
        for(int i = 2; i<arr.length; i++){
            int ans1 = arr[i] + dp[i-2];
            int ans2 =  dp[i-1];
            dp[i] = Math.max(ans1, ans2);
        }
        return dp[dp.length-1];

        

        
    }
}