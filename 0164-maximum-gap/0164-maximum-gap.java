class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        if(nums.length<=1){
            return 0;
        }
        int max = 0;
        for(int i = 1; i<nums.length; i++){
                int ans = nums[i]-nums[i-1];
                max = Math.max(max, ans);
        }
        return max;
        
    }
}