class Solution {
    public int minMovesToSeat(int[] nums, int[] arr) {
        Arrays.sort(nums);
        Arrays.sort(arr);
        int sum = 0;
        for(int i = 0; i<nums.length; i++){
            sum += Math.abs(nums[i]-arr[i]);

        }
        return sum;

        
    }
}