class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==1){
            return false;
        }
        if(nums.length==2){
            return true;
        }
        for(int i = 1; i<nums.length-1; i++){
            if(nums[i] == nums[i-1] && nums[i] == nums[i+1]){
                return false;
            }
        }
        return true;
        
        
    }
}