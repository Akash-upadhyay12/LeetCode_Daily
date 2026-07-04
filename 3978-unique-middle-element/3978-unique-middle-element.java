class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length/2;
        
        for(int x : nums){
            map.put(x, map.getOrDefault(x, 0)+1);
        }
        int mid = nums[n];
        for(int y : map.keySet()){
            if(map.get(y) == 1 && y == mid){
                return true;
            }
        }
        return false;
        
    }
}