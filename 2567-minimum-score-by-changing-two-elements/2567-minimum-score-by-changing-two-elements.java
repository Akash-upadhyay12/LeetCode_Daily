class Solution {
    public int minimizeSum(int[] nums) {
        if(nums.length == 3){
            return 0;
        }
        Arrays.sort(nums);
        int a = Math.abs(nums[nums.length-1] - nums[2]);
        int b = Math.abs(nums[nums.length-2] - nums[1]);
        int c = Math.abs(nums[nums.length-3] - nums[0]);
        return Math.min(a, Math.min(b, c));
        
    }
}