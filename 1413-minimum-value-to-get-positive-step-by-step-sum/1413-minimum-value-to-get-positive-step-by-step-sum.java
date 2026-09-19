class Solution {
    public int minStartValue(int[] nums) {
        int x = 1;
        boolean found = false;
        while(found == false){
            int sum = x;
            boolean valid = true;
            for(int i = 0; i<nums.length; i++){
                sum += nums[i];
                if(sum < 1){
                    valid = false;
                    break;
                }
            }
            if(valid){
                found = true;
                return x;
            }
            x++;
        }
        return 0;
    }
}