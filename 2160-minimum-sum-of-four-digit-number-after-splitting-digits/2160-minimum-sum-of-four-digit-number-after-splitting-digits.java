class Solution {
    public int minimumSum(int num) {
        int [] nums = new int[4];
        int i = 0;
        while(num>0){
            int digit = num % 10;
            nums[i]= digit;
            num /= 10;
            i++;
        }
        Arrays.sort(nums);
        int ans1 = nums[0]*10 + nums[nums.length-1];
        int ans2 = nums[1]*10 + nums[nums.length-2];
        return ans1+ ans2;

        
    }
}