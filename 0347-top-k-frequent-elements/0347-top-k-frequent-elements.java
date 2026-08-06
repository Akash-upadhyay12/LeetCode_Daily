class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int x : nums){
            map.put(x, map.getOrDefault(x, 0) +1);
        }
        List<Integer> key = new ArrayList<>(map.keySet());
        key.sort((a,b) -> map.get(b)-map.get(a));
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i<k; i++){
            list.add(key.get(i));
        }
        int [] arr = new int[list.size()];
        int i = 0;
        for(int x : list){
            arr[i] = x;
            i++;
        }
        return arr;
    


        
    }
}