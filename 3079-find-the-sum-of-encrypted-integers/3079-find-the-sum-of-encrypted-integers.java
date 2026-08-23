class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum = 0;
        for(int i = 0; i<nums.length; i++){
            int max = 0;
            int  count = 0;
            if(nums[i] <= 9){
                sum += nums[i];
            }
            else{
                int x = nums[i];
                while(x > 0){
                    int digit = x % 10;
                    max = Math.max(max, digit);
                    count++;
                    x /= 10;
                }
                for(int k = 0; k<count; k++){
                    sum += max *(int)Math.pow(10, k);
                }
            }

            
        }
        return sum;
        
    }
}