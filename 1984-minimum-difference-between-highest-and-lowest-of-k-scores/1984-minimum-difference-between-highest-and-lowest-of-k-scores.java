class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int i = 0;
        int min  = Integer.MAX_VALUE;
        for(int j = k -1; j<nums.length; j++){
            int diff = nums[j]-nums[i];
            min = Math.min(min, diff);
            i++;
            
        }
        return min;
        
    }
}