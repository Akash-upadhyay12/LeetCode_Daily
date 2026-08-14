class Solution {
    public int maximizeExpressionOfThree(int[] nums) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]<min){
                min = nums[i];
            }
            if (nums[i] > first) {
            second = first;
            first = nums[i];
        } 
        else if (nums[i] > second) {
            second = nums[i];
        }
    }

        System.out.println(first);
        System.out.println(second);
        System.out.println(min);
        return first + second - min;

        
    }
}