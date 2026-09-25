class Solution {
    public int[] resultsArray(int[] nums, int k){
        int[] ans = new int[nums.length - k + 1];
        for(int i = 0; i <= nums.length - k; i++){
            int max = nums[i];
            int count = 1;
            for(int j = i + 1; j < i + k; j++){
                if(nums[j] - nums[j - 1] == 1){
                    count++;
                    max = Math.max(max, nums[j]);
                }
                else{
                    break;
                }
            }
            if(count == k){
                ans[i] = max;
            }
            else{
                ans[i] = -1;
            }
        }
        return ans;
    }
}