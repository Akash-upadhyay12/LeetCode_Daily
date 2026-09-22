class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length/2;
        
        for(int x : nums){
            map.put(x, map.getOrDefault(x, 0)+1);
        }
        if(map.get(nums[nums.length/2]) == 1){
            return true;
        }
        else{
            return false;
        }
        
    }
}