class Solution {
    public int duplicateNumbersXOR(int[] nums){
        int ans = 0;
        int [] freq = new int[51];
        for(int i = 0; i<nums.length; i++){
            freq[nums[i]]++;
            if(freq[nums[i]] == 2){
                ans ^= nums[i];
            }
        }
        return ans;
        
    }
}