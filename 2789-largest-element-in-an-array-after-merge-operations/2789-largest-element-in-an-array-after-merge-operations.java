class Solution {
    public long maxArrayValue(int[] nums) {
        long[] arr = new long[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
        }
        if (arr.length == 1) {
            return arr[0];
        }
        for (int i = arr.length - 1; i > 0; i--) {
            long pref = arr[i - 1];
            if (pref <= arr[i]) {
                arr[i - 1] = arr[i - 1] + arr[i];
            }
        }
        return arr[0];
    }
}