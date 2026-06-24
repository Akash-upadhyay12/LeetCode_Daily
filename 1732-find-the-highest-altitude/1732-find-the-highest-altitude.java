class Solution {
    public int largestAltitude(int[] nums) {
        int c= 0;
        int max = 0;
        for(int i = 0; i<nums.length; i++){
            c += nums[i];
            max = Math.max(max, c);

        }
        return max;
        
    }
}