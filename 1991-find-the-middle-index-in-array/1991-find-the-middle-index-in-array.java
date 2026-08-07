class Solution {
    public int findMiddleIndex(int[] nums) {
        int ts = 0;
        for(int x : nums){
            ts += x;
        }
        int rs = 0;
        int ls = 0;
        for(int i = 0; i<nums.length; i++){
            rs = ts-(ls+nums[i]);
            if(rs == ls){
                return i;
            }
            else{
                ls += nums[i];
            }
        }
        return -1;
        
    }
}