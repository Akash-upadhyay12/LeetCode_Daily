class Solution {
    public boolean validMountainArray(int[] nums) {
        if(nums.length<=2){
            return false;
        }
        int max = nums[0];
        int idx = 0;
        for(int i = 1; i<nums.length; i++){
            if(nums[i]>max){
                max = nums[i];
                idx = i;
            }
        }
        if(idx == nums.length-1 || idx == 0){
            return false;
        }
        boolean inc = true;
        for(int i =0; i<idx; i++){
            if(nums[i]>=nums[i+1]){
                inc = false;
            }
        }
        boolean dec = true;
        for(int i = idx; i<nums.length-1; i++){
            if(nums[i]<=nums[i+1]){
                dec = false;
            }
        }
        if(inc == false || dec == false){
            return false;
        }
        else{
            return true;
        }
        
    }
}