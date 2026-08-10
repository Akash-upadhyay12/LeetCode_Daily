class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int x: nums){
            map.put(x, map.getOrDefault(x, 0) +1);
        }
        ArrayList<Integer> list = new ArrayList<>(map.keySet());
        list.sort((a, b) -> map.get(b) - map.get(a));
        ArrayList<Integer> cur = new ArrayList<>();
        for(int i = 0; i<k; i++){
            cur.add(list.get(i));
        }
        int i = 0;
        int [] ans = new int[cur.size()];
        for(int x : cur){
            ans[i] = x;
            i++;
        }
        return ans;
        
    }
}