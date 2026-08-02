class Solution {
    public int[] applyOperations(int[] nums) {
        for(int i = 0; i<nums.length-1; i++){
            if(nums[i] != nums[i+1]){
                continue;
            }
            else{
                int x = nums[i]*2;
                nums[i] = x;
                nums[i+1] = 0;
            }

        }
        int i = 0;
        int j = 0;
        while(j<nums.length){
            if(nums[j] != 0){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++;
                j++;
            }
            else{
                j++;
            }
            

        }
        return nums;
        
    }
}