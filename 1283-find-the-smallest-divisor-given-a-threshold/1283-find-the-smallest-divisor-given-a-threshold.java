class Solution {
    public int smallestDivisor(int[] nums, int t){
        int max = 0;
        for(int x : nums){
            max = Math.max(max, x);
        }
        int cur = -1;
        int i = 1;
        int j = max;
        
        while(i<=j){
            int m = i + (j - i)/2;
            int sum = 0;
            for(int k = 0; k<nums.length; k++){
                sum += (nums[k] + m - 1) / m;
            }
            if(sum<=t){
                cur = m;
                j = m - 1;
            }
            else if(sum > t){
                i = m + 1;
            }
        }
        return cur;
        
    }
}