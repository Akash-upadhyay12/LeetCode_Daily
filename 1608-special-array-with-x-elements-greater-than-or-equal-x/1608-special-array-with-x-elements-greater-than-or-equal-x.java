class Solution {
    public int specialArray(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int x : nums){
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        int x = 1;
        int i = 0;
        while(i<nums.length){
            int count = 0;
            for(int key : map.keySet()){
                if(key >= x){
                    count += map.get(key);
                }
            }
            if(count == x){
                return x;
            }
            x++;
            i++;
        }
        return -1;
        
    }
}