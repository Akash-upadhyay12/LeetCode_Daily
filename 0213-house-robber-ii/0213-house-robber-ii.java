class Solution {
    public int rob(int[] arr) {
        if(arr.length ==1){
            return arr[arr.length-1];
        }
        if(arr.length == 2){
            return Math.max(arr[arr.length-1], arr[arr.length-2]);
        }
         int[] dp = new int[arr.length];
         int [] dp1 = new int[arr.length];
        dp[0] =arr[0];
        dp[1] = Math.max(dp[0],arr[1]);
        for(int i =2; i<arr.length-1; i++){
            int ans = arr[i] + dp[i-2];
            int ans2 = dp[i-1];
            dp[i] = Math.max(ans,ans2);
        }
        dp1[1] =arr[1];
        dp1[2] = Math.max(dp1[1],arr[2]);
        for(int i =3; i<arr.length; i++){
            int ans = arr[i] + dp[i-2];
            int ans2 = dp1[i-1];
            dp1[i] = Math.max(ans,ans2);
        }
        return Math.max(dp[dp.length-2],dp1[dp1.length-1]);
        
    }
}