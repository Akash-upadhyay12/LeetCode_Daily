class Solution {
    public int minMirrorPairDistance(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                min = Math.min(min, i - map.get(nums[i]));
            }
            int temp = nums[i];
            int rev = 0;
            while(temp > 0) {
                int digit = temp % 10;
                rev = rev * 10 + digit;
                temp /= 10;
            }
            map.put(rev, i);
        }
        if(min == Integer.MAX_VALUE) {
            return -1;
        }
        return min;
    }
}