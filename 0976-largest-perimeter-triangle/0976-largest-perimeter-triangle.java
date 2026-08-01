class Solution {
    public int largestPerimeter(int[] nums) {
        int ans = 0;
        Arrays.sort(nums);
        for(int i = 2; i<nums.length; i++){
            if(nums[i-1] + nums[i-2] > nums[i]){
                ans = nums[i]+nums[i-1] + nums[i-2];
            }
        }
        return ans;
        
    }
}