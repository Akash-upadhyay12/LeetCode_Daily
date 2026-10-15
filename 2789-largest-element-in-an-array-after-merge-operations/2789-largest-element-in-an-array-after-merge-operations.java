class Solution {
    public long maxArrayValue(int[] nums){
        if(nums.length == 1){
            return nums[0];
        }
        long pref = nums[nums.length-1];
        for(int i = nums.length-2; i>=0; i--){
            if(nums[i] <= pref){
                pref += nums[i];
            }
            else{
                pref = nums[i];
            }
        }
        return pref;
    }
}