class Solution {
    public long minimalKSum(int[] nums, int k) {
        Arrays.sort(nums);
        int c = 0;
        long sum = 0;
        if (nums[0] > 1) {
            int ans = 1;
            while (c < k && ans < nums[0]) {
                sum += ans;
                ans++;
                c++;
            }
        }
        for (int i = 1; i < nums.length && c < k; i++) {
            int diff = nums[i] - nums[i - 1];
            int ans = nums[i - 1] + 1;
            if (diff > 1) {
                while (c < k && ans < nums[i]) {
                    sum += ans;
                    ans++;
                    c++;
                }
            }
        }
        int ans = nums[nums.length - 1] + 1;
        while (c < k) {
            sum += ans;
            ans++;
            c++;
        }
        return sum;
    }
}