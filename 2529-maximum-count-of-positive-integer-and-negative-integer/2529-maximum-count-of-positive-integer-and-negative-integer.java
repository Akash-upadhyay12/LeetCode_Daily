class Solution {
    public int maximumCount(int[] nums) {
        int negative = 0;
        int positive = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]== 0){
                continue;
            }
            if(nums[i]<0){
                negative += 1;
            }
            else{
                positive +=1;
            }
        }
        return Math.max(negative, positive);
        
    }
}