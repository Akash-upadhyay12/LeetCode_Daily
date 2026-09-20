class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int x : nums){
            if(x % 2 == 0){
                map.put(x, map.getOrDefault(x, 0) + 1);
            }
        }
        int min = -1;
        int count = 0;
        for(int x : map.keySet()){
            if(map.get(x) > count){
                min = x;
                count = map.get(x);
            }
            else if(map.get(x) == count){
                min = Math.min(min, x);
            }
        }
        return min;
    }
}