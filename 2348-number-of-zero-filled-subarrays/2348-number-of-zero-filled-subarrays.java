class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long c = 0;
        long sum = 0;
        for(int x : nums){
            if(x == 0){
                c++;
                sum += c;
            }
            else{
                c = 0;
            }

        }
        return sum;
        
    }
}
