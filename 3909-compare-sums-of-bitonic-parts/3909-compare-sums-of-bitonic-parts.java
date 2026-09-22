class Solution {
    public int compareBitonicSums(int[] nums) {
        int idx = 0;
        long max = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                idx = i;
            }
        }
        long sum1 = 0;
        for (int i = 0; i <= idx; i++) {
            sum1 += nums[i];
        }
        long sum2 = 0;
        for (int i = idx; i < nums.length; i++) {
            sum2 += nums[i];
        }
        if (sum1 > sum2) {
            return 0;
        }
        if (sum2 > sum1) {
            return 1;
        } else {
            return -1;
        }
    }
}