class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        for(int x : nums){
            min = Math.min(x, min);
            max = Math.max(x, max);
        }
        int ans = (max - k) - (min + k);
        if(ans < 0){
            return 0;
        }
        else{
            return ans;
        }
        
    }
}