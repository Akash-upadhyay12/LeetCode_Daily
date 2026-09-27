class Solution {
    public int[] rearrangeArray(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        int[] ans = new int[nums.length];
        int k = 0;
        while (map.size() != 0) {
            HashSet<Integer> set = new HashSet<>();
            for (int x : map.keySet()) {
                set.add(x);
            }
            ArrayList<Integer> list = new ArrayList<>(set);
            Collections.sort(list);
            for (int x : list) {
                ans[k] = x;
                k++;
                map.put(x, map.get(x) - 1);
                if (map.get(x) == 0) {
                    map.remove(x);
                }
            }
        }
        return ans;
    }
}