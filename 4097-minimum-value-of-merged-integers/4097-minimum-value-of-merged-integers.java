class Solution {
    public int minMergedInteger(int[] nums){
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<nums.length; i+=2){
            int x = nums[i];
            int y = nums[i+1];
            int z = Integer.parseInt("" + x + y);
            min = Math.min(min, z);
        }
        return min;
        
    }
}