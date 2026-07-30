class Solution {
    public int firstUniqueFreq(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int x: nums){
            map.put(x, map.getOrDefault(x, 0) +1);
        }
        HashMap<Integer, Integer> map2 = new HashMap<>();
        for(int x : map.keySet()){
            int y =map.get(x);
            map2.put(y, map2.getOrDefault(y, 0) +1);
        }
       for(int x : nums){
        int y = map.get(x);
        if(map2.get(y) == 1){
            return x;
        }
       }
       return -1;
        
    }
}