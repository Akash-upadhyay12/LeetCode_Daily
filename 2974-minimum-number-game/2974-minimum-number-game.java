class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int [] arr = new int[nums.length];
        int k = 0;        
        for(int i = 0; i<nums.length-1; i+=2){
            
            arr[i+1] = nums[i];
            arr[i] = nums[i+1];

        }
        return arr;
        
        
    }
}