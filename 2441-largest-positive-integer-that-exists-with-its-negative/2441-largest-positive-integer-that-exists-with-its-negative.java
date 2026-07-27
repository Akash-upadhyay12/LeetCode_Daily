class Solution {
    public int findMaxK(int[] nums) {
        int max = -1;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i<nums.length; i++){
            if(set.contains(-1*nums[i])){
                max = Math.max(max, Math.abs(nums[i]));
                
            }
            set.add(nums[i]);
        }
        return max;
        
    }
}