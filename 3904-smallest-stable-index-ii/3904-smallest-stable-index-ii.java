class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int[] arr1 = new int[nums.length];
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
            arr1[i] = max;
        }
        int[] arr2 = new int[nums.length];
        int min = nums[nums.length - 1];
        for (int i = nums.length - 1; i >= 0; i--) {
            min = Math.min(min, nums[i]);
            arr2[i] = min;
        }
        int i = 0;
        while (i < nums.length) {
            if (arr1[i] - arr2[i] <= k) {
                return i;
            }
            i++;
        }
        return -1;
    }
}