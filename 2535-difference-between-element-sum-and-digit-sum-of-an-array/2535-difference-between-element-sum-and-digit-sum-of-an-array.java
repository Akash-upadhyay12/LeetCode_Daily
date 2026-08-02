class Solution {
    public int differenceOfSum(int[] nums) {
        int ts = 0;
        for(int x : nums){
            ts +=x;
        }
        int ds = 0;
        for(int i = 0; i<nums.length; i++){
            int x = nums[i];
            while(x >0){
                int digit = x % 10;
                ds += digit;
                x /= 10;
            }
        }
        return Math.abs(ts-ds);
        
    }
}