class Solution {
    public int countPartitions(int[] nums) {
        int count =0;
        int s = 0;
        for(int x : nums){
            s+=x;
        }
        int s2 = nums[0];
        for(int i= 0; i<nums.length-1; i++){
            s -= nums[i];
            if((s-s2)% 2 == 0){
                count++;
            }
            s2+=nums[i+1];
            
        }
        return count;
        
    }
}