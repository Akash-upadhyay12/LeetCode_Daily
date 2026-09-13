class Solution {
    public int countStudents(int[] nums, int[] arr) {
        int i = 0;
        int j = 0;
        int count = 0;
        int c2 = 0;

        while(i < nums.length && j < arr.length) {
            if(nums[i] == arr[j]) {
                i++;
                j++;
                c2++;
                count = 0;
            }
            else {
                if(count == nums.length - i) {
                    break;
                }
                int last = nums[nums.length - 1];
                for(int k = nums.length - 1; k > i; k--) {
                    nums[k] = nums[k - 1];
                }
                nums[i] = last;
                count++;
            }
        }
        return nums.length - c2;
    }
}