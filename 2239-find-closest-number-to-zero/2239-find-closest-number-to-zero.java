class Solution {
    public int findClosestNumber(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int x : nums){
            min = Math.min(min, Math.abs(x)); 
        }
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]<0){
                if(Math.abs(nums[i]+min)== 0){
                    max = Math.max(max, nums[i]);
                }
            }
            else if(nums[i]>0){
                if(Math.abs(nums[i]-min)== 0){
                    max = Math.max(max, nums[i]);
                }
            }
            else{
                return 0;
            }
            
            
        }
        return max;
    }
}