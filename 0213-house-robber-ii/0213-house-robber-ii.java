class Solution {
    public int rob(int[] nums) {
        if(nums.length ==1){
            return nums[nums.length-1];
        }
        if(nums.length == 2){
            return Math.max(nums[nums.length-1], nums[nums.length-2]);
        }
        int [] dp1 = new int[nums.length];
        dp1[0] = nums[0];
        dp1[1] = Math.max(dp1[0], nums[1]);
        for(int i = 2; i<nums.length-1; i++){
            int ans1  = nums[i] + dp1[i-2];
            int ans2 = dp1[i-1];
            dp1[i] = Math.max(ans1, ans2);
        }
        int [] dp2 = new int[nums.length];
        dp2[1] = nums[1];
        dp2[2] = Math.max(dp2[1], nums[2]);
        for(int i = 3; i<nums.length; i++){
            int ans1  = nums[i] + dp2[i-2];
            int ans2 = dp2[i-1];
            dp2[i] = Math.max(ans1, ans2);
        }
        return Math.max(dp1[dp1.length-2], dp2[dp2.length-1]);

    
        
    }
}