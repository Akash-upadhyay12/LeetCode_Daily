class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        int i =0;
        int j = nums.length-1;
        while(i<j){
            if(nums[j]+nums[i] == 0){
                return nums[j];
            }
            else if(nums[j]+nums[i]>0){
                j--;
            }
            else{
                i++;
            }
            
        }
        return -1;
        
    }
}