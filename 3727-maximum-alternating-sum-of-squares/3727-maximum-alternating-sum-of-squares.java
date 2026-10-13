import java.util.Arrays;
class Solution {
    public long maxAlternatingSum(int[] nums) {
        int x = 0;
        for (int y : nums) {
            nums[x] = Math.abs(y);
            x++;
        }
        Arrays.sort(nums);
        int[] arr = new int[nums.length];
        int i = 0;
        int j = arr.length - 1;
        int p = 0;
        boolean turn = true;
        while (i <= j) {
            if (turn == true) {
                arr[p] = nums[j];
                turn = false;
                j--;
            } else {
                arr[p] = nums[i];
                turn = true;
                i++;
            }
            p++;
        }
        boolean tru = true;
        long sum = 0;
        for (int a : arr) {
            long square = (long) a * a;
            if (tru == true) {
                sum += square;
                tru = false;
            } else {
                sum -= square;
                tru = true;
            }
        }
        return sum;
    }
}