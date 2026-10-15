class Solution {
    public int maxOperations(int[] nums){
        if(nums.length == 2){
            return 1;
        }
        int c = 1;
        int sum = nums[0] + nums[1];
        int i = 2;
        int j = 3;
        while(j<nums.length){
            int ans = nums[i] + nums[j];
            if(sum == ans){
                sum = ans;
                c++;
                i+=2;
                j+=2;
            }
            else{
                break;
            }
        }
        return c;
        
    }
}