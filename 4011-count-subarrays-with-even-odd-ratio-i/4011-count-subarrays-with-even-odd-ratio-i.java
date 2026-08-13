class Solution {
    public int countRatioSubarrays(int[] nums, int a, int b) {
        int count = 0;
        for(int i = 0; i<nums.length; i++){
            int pc = 0;
            int oc = 0;
            for(int j = i; j<nums.length; j++){
                if(nums[j] % 2 == 0){
                    pc++;
                }
                else{
                    oc++;
                }
                if(pc * b <= oc * a){
                count++;
            }
            }
        }
        return count;
        
    }
}