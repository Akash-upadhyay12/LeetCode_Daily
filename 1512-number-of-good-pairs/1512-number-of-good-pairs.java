class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int x : nums){
            map.put(x, map.getOrDefault(x, 0) +1);
        }
        int count = 0;
        for(int x : map.keySet()){
            //int f = map.get(x);
            if(map.get(x) > 1){
                count += (map.get(x) *(map.get(x)-1)) / 2;
                
            }
        }
        return count;
        
        
    }
}