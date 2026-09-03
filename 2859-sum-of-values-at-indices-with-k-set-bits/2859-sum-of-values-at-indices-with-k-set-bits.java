class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            int count = 0;
            int temp = i;
            while (temp > 0) {
                int digit = temp % 2;
                if (digit == 1) {
                    count++;
                }
                temp /= 2;
            }
            if (count == k) {
                sum += nums.get(i);
            }
        }
        return sum;
    }
}