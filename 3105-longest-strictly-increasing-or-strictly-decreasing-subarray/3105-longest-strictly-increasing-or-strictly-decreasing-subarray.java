class Solution {
    public int longestMonotonicSubarray(int[] nums) {
    // count1 for increasing order
    int count1 = 1;
    int count2 = 1;
    int max1 = 1;
    int max2 = 1;

    for(int i = 0; i<nums.length-1; i++){
        if(nums[i]<nums[i+1]){
            count1++;
            max1 = Math.max(max1, count1);
            count2 = 1;
        }
        else if(nums[i]>nums[i+1]){
            count2++;
            max2 = Math.max(max2, count2);
            count1 = 1;
        }
        else{
            count1= 1;
            count2 = 1;

        }

    }
    return Math.max(max1,max2);
        
    }
}