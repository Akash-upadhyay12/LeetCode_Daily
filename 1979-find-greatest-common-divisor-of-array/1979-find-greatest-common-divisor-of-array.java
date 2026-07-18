class Solution {
    public int findGCD(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]>max){
                max = Math.max(max, nums[i]);
            }
            if(nums[i]<min){
                min = Math.min(min, nums[i]);
            }
        }
        while(max !=  0){
            int temp = max;
            max = min % max;
            min = temp;
        }
        return min;
        
    }
}