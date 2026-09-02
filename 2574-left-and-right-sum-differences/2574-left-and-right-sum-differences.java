class Solution {
    public int[] leftRightDifference(int[] nums) {
        int sum = 0;
        for(int x : nums){
            sum += x;
        }
        int ls = nums[0];
        int rs = 0;
        int [] ans = new int[nums.length];
        ans[0] = sum - nums[0];
        for(int i = 1; i<nums.length; i++){
            int temp = ls + nums[i];
            rs = sum - temp;
            ans[i] = Math.abs(ls - rs);
            rs = sum - (ls + nums[i]);
            ls += nums[i];
        }
        return ans;
        
    }
}