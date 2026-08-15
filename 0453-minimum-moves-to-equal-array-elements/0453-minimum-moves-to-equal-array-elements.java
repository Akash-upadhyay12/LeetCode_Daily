class Solution {
    public int minMoves(int[] nums) {
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for(int x : nums){
            min = Math.min(min, x);
        }
        for(int i = 0; i<nums.length; i++){
            sum += min - nums[i];
        }
        return Math.abs(sum);
        
    }
}