class Solution {
    public int longestSubsequence(int[] nums) {
        int xor = 0;
        int count = 0;
        for(int i = 0; i<nums.length; i++){
            xor ^= nums[i];
            if(xor != 0){
                count++;
            }
        }
        if(count == 0){
            return 0;
        }
        else if(xor != 0){
            return nums.length;
        }
        else{
            return nums.length-1;
        }
    }
}