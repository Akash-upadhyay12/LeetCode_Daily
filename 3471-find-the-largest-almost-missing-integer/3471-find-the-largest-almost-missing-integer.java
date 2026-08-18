class Solution {
    public int largestInteger(int[] nums, int k) {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        int i = 0;
        int max = -1;

        while(i <= nums.length - k) {
            HashMap<Integer, Integer> map2 = new HashMap<>();

            for(int l = i; l < i + k; l++) {
                map2.put(nums[l], map2.getOrDefault(nums[l], 0) + 1);
            }
            for(int x : map2.keySet()) {
                map1.put(x, map1.getOrDefault(x, 0) + 1);
                
            }
            i++;
        }

        for(int x : map1.keySet()) {
            if(map1.get(x) == 1) {
                if(x > max) {
                    max = x;
                }
            }
        }

        return max;
    }
}