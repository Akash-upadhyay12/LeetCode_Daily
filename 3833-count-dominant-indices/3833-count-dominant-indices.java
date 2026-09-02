class Solution {
    public int dominantIndices(int[] nums) {
        int sum = 0;
        for(int x : nums){
            sum += x;
        }
        int count =0;
        for(int i = 0; i<nums.length; i++){
            sum -= nums[i];
            if(sum>0){
                float ans = sum / (nums.length - i - 1);
                if(ans < nums[i]){
                    count++;
                }
            }
        }
        return count;
    }
}