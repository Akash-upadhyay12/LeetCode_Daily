class Solution {
    public int maxAscendingSum(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int max = 0;
        int sum = 0;
        for(int i = 0; i<nums.length; i++){
            if(i+1 < nums.length){
                if(nums[i]<nums[i+1]){
                    sum += nums[i];
                }
                else{
                    sum += nums[i];
                    max = Math.max(sum, max);
                    sum = 0;
                }
            }
            else{
                sum += nums[i];
                max = Math.max(sum, max);

            }
            
        }
        return max;
        
    }
}