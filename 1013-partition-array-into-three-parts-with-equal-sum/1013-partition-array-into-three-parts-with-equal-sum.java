class Solution {
    public boolean canThreePartsEqualSum(int[] nums) {
        int ts = 0;
        for(int x : nums){
            ts += x;
        }
        if(ts % 3 != 0){
            return false;
        }
        int ls = ts / 3;
        int c = 0;
        int sum = 0;
        for(int i = 0; i<nums.length; i++){
            sum += nums[i];
            if(sum == ls){
                c++;
                sum = 0;
            }

        }
        if(c>=3) return true;
        else return false;


        

    }
}