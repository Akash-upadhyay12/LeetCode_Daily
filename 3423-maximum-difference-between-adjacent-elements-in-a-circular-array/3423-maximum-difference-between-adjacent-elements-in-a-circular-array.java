class Solution {
    public int maxAdjacentDistance(int[] nums) {
        if(nums.length == 2){
            if(nums[0]>nums[1]){
                return nums[0] - nums[1];
            }
            else if(nums[1] > nums[0]){
                return nums[1] - nums[0];
            }
            else{
                return 0;
            }
        }
        int ans1 = nums[0]-nums[nums.length-1];
        int ans2 = nums[nums.length-1] - nums[0];
        int max = Math.max(ans1, ans2);
        for(int i = 1; i<nums.length-1; i++){
            int ans3 = 0;
            int ans4 = 0;
            if(nums[i]>nums[i-1]){
                ans3 = nums[i] - nums[i-1];
                
            }
            if(nums[i-1]>nums[i]){
                ans3 = nums[i-1] - nums[i];
            }
            if(nums[i]>nums[i+1]){
                ans4 = nums[i] - nums[i+1];
                
            }
            if(nums[i+1]>nums[i]){
                ans4 = nums[i+1] - nums[i];
            }
            max = Math.max(max, Math.max(ans3, ans4));
        }
        return max;

        
    }
}