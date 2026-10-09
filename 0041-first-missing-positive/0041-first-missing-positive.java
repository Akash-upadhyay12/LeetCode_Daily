class Solution {
    public int firstMissingPositive(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int x : nums){
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        int x = 1;
        while(true){
            if(!map.containsKey(x)){
                return x;
            }
            x+=1;
        }
        
    }
}