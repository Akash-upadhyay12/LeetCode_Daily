class Solution {
    public boolean isOneBitCharacter(int[] nums){
        if(nums[nums.length-1] != 0){
            return false;
        }
        int i = 0;
        while(i<nums.length-1){
            if(nums[i] == 1){
                i+=2;
            }
            else{
                i++;
            }
            
        }
        if(i == nums.length-1 && nums[i]==0){
                return true;
            }
        return false;



    }
}