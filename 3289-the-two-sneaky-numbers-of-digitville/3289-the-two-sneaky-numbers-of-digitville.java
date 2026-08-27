class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int x : nums){
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        int [] arr = new int[2];
        int i = 0;
        for(int x : map.keySet()){
            if(map.get(x) == 2){
                arr[i] = x;
                i++;
            }
        }
        return arr;
        
    }
}