class Solution {
    public long largestPerimeter(int[] nums){
        Arrays.sort(nums);
        long sum = nums[0] + nums[1];
        long max = -1;
        for(int i = 2; i<nums.length; i++){
            if(sum > nums[i]){
                sum += nums[i];
                max = Math.max(max, sum);   
            }
            else{
                sum += nums[i];
            }
        }
        return max;
    }
}