class Solution {
    public int findFinalValue(int[] nums, int x) {
        Arrays.sort(nums);
        int a = x;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]  == a){
                a *= 2;
            }
        }
        return a;

        
        
    }
}