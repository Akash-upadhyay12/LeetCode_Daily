class Solution {
    public int maximumPrimeDifference(int[] nums){
        int min = -1;
        int max = -1;
        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            if (a <= 1) {
                continue; 
            }
            boolean isprime = true;
            for (int j = 2; j * j <= a; j++) {
                if (a % j == 0) {
                    isprime = false;
                    break;
                }
            }
            if (isprime) {
                if (min == -1) {
                    min = i;
                }
                max = i;
            }
        }
        if (min == -1 || min == max) {
            return 0;
        }
        return max - min;
    }
}
