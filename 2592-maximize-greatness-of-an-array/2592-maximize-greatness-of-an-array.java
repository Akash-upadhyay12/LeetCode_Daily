class Solution {
    public int maximizeGreatness(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        int i = 0;
        int j = 1;
        while(j<nums.length){
            if(nums[j]>nums[i]){
                count++;
                i++;
                j++;
            }
            else if(nums[j]== nums[i]){
                j++;
            }
        }
        return count;
        
    }
}