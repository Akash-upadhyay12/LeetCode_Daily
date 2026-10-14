class Solution {
    public int minOperations(int[] nums){
        int c = 0;
        for(int i = 1; i<nums.length; i++){
            if(nums[i]>nums[i-1]){
                continue;
            }
            else{
                int inc = nums[i-1]+1;
                int ans1 = inc - nums[i];
                c += ans1;
                nums[i] = inc;
            }
        }
        return c;
    }
}