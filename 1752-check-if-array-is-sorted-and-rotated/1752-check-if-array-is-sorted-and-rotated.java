class Solution {
    public boolean check(int[] nums) {
        int min = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) { 
                min = i;
                break;
            }
        }
        
        reverse(nums, 0, min - 1);
        reverse(nums, min, nums.length - 1);
        reverse(nums, 0, nums.length - 1);

        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] > nums[i + 1]){
                return false;
            }
        }
        return true;
    }

    public void reverse(int[] nums, int i, int j){
        while(i < j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}
