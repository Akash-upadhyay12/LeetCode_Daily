class Solution {
    public int buyChoco(int[] nums, int money){
        if(nums.length == 1){
            return money;
        }
        Arrays.sort(nums);
        int ans = money - (nums[0] + nums[1]);
        if(ans >=0){
            return ans;
        }
        else{
            return money;
        }


        
    }
}