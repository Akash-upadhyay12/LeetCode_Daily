class Solution {
    public int sumFourDivisors(int[] nums) {
        int sum = 0;
        for(int i = 0; i<nums.length; i++){
            int count = 0;
            int temp = nums[i];
            int stemp = 0;
            boolean found = false;
            int j = 1;
            while(found == false){
                if(temp % j == 0){
                    count++;
                    stemp += j;
                }
                if(count>4 || j == temp){
                    found = true;
                    break; 
                }
                j++;
            }
            if(count==4){
                sum += stemp;
            }
        }
        return sum;
        
    }
}