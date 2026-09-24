class Solution {
    public int longestSubarray(int[] nums){
        int c = 1;
        int max = 1;
        for(int i = 2; i<nums.length; i++){
            if(nums[i-1] + nums[i-2] == nums[i]){
                c++;
            }
            else{
                c = 1;
            }
            max = Math.max(max, c);

        }
        return max+1;

    }
}