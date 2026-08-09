class Solution {
    public double minPrice(int[] nums, int[] disc) {
        Arrays.sort(nums);
        Arrays.sort(disc);
        double sum = 0;
        int i = nums.length-1;
        int j = disc.length-1;
        while(i>=0 && j>=0){
            sum += nums[i]*(100-disc[j])/100.0;
            i--;
            j--;
        }
        while(i>=0){
            sum += nums[i];
            i--;
        }
        return sum;
        
        
    }
}