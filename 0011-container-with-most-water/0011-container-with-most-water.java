class Solution {
    public int maxArea(int[] nums){
        int i = 0;
        int j = nums.length-1;
        int max = Integer.MIN_VALUE;
        while(i<j){
            int minheight = Math.min(nums[i], nums[j]);
            int diff = j - i;
            int ans = minheight * diff;
            max = Math.max(max, ans);
            if(nums[i]<nums[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return max;
        
    }
}