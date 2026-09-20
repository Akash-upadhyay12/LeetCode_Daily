class Solution {
    public int[] numberOfPairs(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int x : nums){
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        int total = 0;
        int left = 0;
        for(int x : map.keySet()){
            int ans = map.get(x);
            total += ans/2;
            left += ans % 2;
        }
        return new int[] {total, left};

        
    }
}