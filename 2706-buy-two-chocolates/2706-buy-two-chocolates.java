class Solution {
    public int buyChoco(int[] nums, int money){
        if(nums.length == 1){
            return money;
        }
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
         if (nums[i] < min) {
            secondMin = min;
            min = nums[i];
            }
            else if (nums[i] < secondMin) {
            secondMin = nums[i];
            }
    }
        int ans = money - (min + secondMin);
        if(ans >= 0){
            return ans;
        }
        else{
            return money;
        }


        
    }
}