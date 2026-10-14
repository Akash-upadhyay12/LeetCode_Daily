
class Solution {
    public int[] findArray(int[] arr) {
        int[] nums = new int[arr.length];
        nums[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            nums[i] = arr[i - 1] ^ arr[i];
        }

        return nums;
    }
}
