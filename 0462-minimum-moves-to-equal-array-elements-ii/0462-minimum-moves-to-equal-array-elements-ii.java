class Solution {
    public int minMoves2(int[] nums){
        if(nums.length == 1){
            return 0;
        }
        if(nums.length == 2){
            return Math.abs(nums[0] - nums[1]);
        }
        int diff = Integer.MAX_VALUE;
        Arrays.sort(nums);
        int sum = 0;
        int a = nums.length/2;
        int fans =  nums[a];
        for(int x : nums){
            sum += Math.abs(fans - x);
        }
        return sum;
    }
}