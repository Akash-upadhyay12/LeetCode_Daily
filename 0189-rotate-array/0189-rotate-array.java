class Solution {
    void rotate(int[] nums, int k, int i, int j) {
        if (i >= j) {
            return;
        }
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        rotate(nums, k, i + 1, j - 1);
    }
    void reverse1(int[] nums, int k, int a, int b) {
        if (a >= b) {
            return;
        }
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
        reverse1(nums, k, a + 1, b - 1);
    }
    void finalreverse(int[] nums, int k, int x, int y) {
        if (x >= y) {
            return;
        }
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
        finalreverse(nums, k, x + 1, y - 1);
    }
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        rotate(nums, k, 0, nums.length - 1);
        int b = k - 1;
        reverse1(nums, k, 0, b);
        int x = k;
        finalreverse(nums, k, x, nums.length - 1);
    }
}