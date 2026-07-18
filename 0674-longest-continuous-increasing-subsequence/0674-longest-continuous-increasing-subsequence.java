class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int count = 1;
        int max = 1;
        for(int i = 0; i<nums.length-1; i++){
            if(nums[i+1]>nums[i]){
                count++;
            } 
            else if(nums[i] == nums[i+1]){
                count = 1;;
            }
            else{
                count = 1;
            }
            max= Math.max(max, count);
        }
        return max;
    }
}