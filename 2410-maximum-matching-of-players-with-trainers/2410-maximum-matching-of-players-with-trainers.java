class Solution {
    public int matchPlayersAndTrainers(int[] arr, int[] nums) {
        Arrays.sort(nums);
        Arrays.sort(arr);
        int count = 0;
        int i = 0;
        int j = 0;
        while(i<arr.length && j<nums.length){
            if(arr[i]<=nums[j]){
                count++;
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        return count;
        
        
    }
}