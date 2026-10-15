class Solution {
    public int maxOperations(int[] nums) {
        int sum= nums[0] + nums[1];
        int c = 1;
        for (int i = 2; i + 1 < nums.length; i += 2) {
            if (nums[i] + nums[i + 1] == sum) {
                c++;
            } else {
                break;
            }
        }

        return c;
    }
}